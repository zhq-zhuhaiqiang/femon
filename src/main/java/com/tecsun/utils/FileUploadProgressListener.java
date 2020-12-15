package com.tecsun.utils;

import com.tecsun.entity.ProgressEntity;
import org.apache.commons.fileupload.ProgressListener;

import javax.servlet.http.HttpSession;
//@Component
public class FileUploadProgressListener implements ProgressListener {
    private HttpSession session;

    public void setSession(HttpSession session){
        this.session=session;
        //保存上传状态
        ProgressEntity progressEntity = new ProgressEntity();
        session.setAttribute("progressEntity", progressEntity);
    }

    @Override
    public void update(long bytesRead, long contentLength, int items) {
        ProgressEntity progressEntity = (ProgressEntity) session.getAttribute("progressEntity");
        //已读取数据长度
        progressEntity.setBytesRead(bytesRead);
        //文件总长度
        progressEntity.setContentLength(contentLength);
        //正在保存第几个文件
        progressEntity.setItems(items);
    }
}
