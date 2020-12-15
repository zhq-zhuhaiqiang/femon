/**
 * wai InterfaceController.java com.wai.controller
 */
package com.tecsun.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.tecsun.entity.User;
import com.tecsun.entity.UserExportEntity;
import com.tecsun.entity.UserImportEntity;
import com.tecsun.jpadata.impl.JpaProxyUserRepository;
import com.tecsun.utils.ModelExcelListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

/**
 * @author 一剑 2015年12月29日 下午5:23:22
 */
@Controller
public class AboutController {
    @Autowired
    private JpaProxyUserRepository repository;

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public ModelAndView createService(Model model) {
        return new ModelAndView("/about");
    }
    @RequestMapping(value = "/")
    public ModelAndView index(Model model) {
        ModelAndView modelAndView = new ModelAndView("/index");
        return modelAndView;
    }
    @RequestMapping(value = "/preImportExcel")
    public ModelAndView preImportExcel(Model model) {
        ModelAndView modelAndView = new ModelAndView("/importExcel");
        return modelAndView;
    }
    @RequestMapping(value = "/uploadExcel")
    @ResponseBody
    public Map<String, Object> importExcel(@RequestParam("reportFile") MultipartFile file) throws Exception{
        Map<String, Object> ret = new HashMap<String, Object>();
        List<UserImportEntity> list;
        List<User> saveList=new ArrayList<>();
        try {
            list = EasyExcel.read(file.getInputStream(),UserImportEntity.class,new ModelExcelListener()).sheet().doReadSync();
            list.stream().forEach(o->{
                User user=o.toUser();
                user.setCreateTime(new Date());
                saveList.add(user);
            });
            repository.saveList(saveList);

        } catch (IOException e) {
            ret.put("success", false);
            ret.put("message", e.getMessage());
           throw  e;
        }
        ret.put("success", true);

        return ret;
    }
    @RequestMapping(value = "/preUserInfos")
    public ModelAndView prequeryuserInfos(Model model) throws Exception{
        ModelAndView modelAndView = new ModelAndView("/userInfos");
//        List<User> all = repository.all();
//        model.addAttribute("serviceList", all);
        return modelAndView;
    }
    @RequestMapping(value = "/queryUserInfos" ,method=RequestMethod.GET)
    @ResponseBody
    public List<User> queryuserInfos(@RequestParam("name") String name,@RequestParam("idNum") String idNum) throws Exception{

        List<User> all = repository.query(name.replace("\t",""),idNum);

        return all;
    }
    @RequestMapping("/download")
    public void download(HttpServletResponse response) throws IOException {

        ExcelWriter writer = null;
        OutputStream outputStream = response.getOutputStream();
        try {
            //添加响应头信息
            response.setHeader("Content-disposition", "attachment; filename=" + "用户表"+System.currentTimeMillis()+".xls");
            response.setContentType("application/msexcel;charset=UTF-8");//设置类型
            response.setHeader("Pragma", "No-cache");//设置头
            response.setHeader("Cache-Control", "no-cache");//设置头
            response.setDateHeader("Expires", 0);//设置日期头

            //实例化 ExcelWriter
            writer = new ExcelWriter(outputStream, ExcelTypeEnum.XLS, true);

            //实例化表单
            Sheet sheet = new Sheet(1, 0, UserExportEntity.class);
            sheet.setSheetName("目录");

            //获取数据
            List<User> all = repository.all();
            List<UserExportEntity> exportlist=new ArrayList<>();
            all.stream().forEach(o->{
                UserExportEntity userExportEntity= new UserExportEntity(o);
                exportlist.add(userExportEntity);
            });

            //输出
            writer.write(exportlist, sheet);
            writer.finish();
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                response.getOutputStream().close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
