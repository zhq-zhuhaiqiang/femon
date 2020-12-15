package com.tecsun.jpadata.jpaDao;

import com.tecsun.entity.SignDetail;

import java.util.List;

public interface SignDetailRepository {
    public SignDetail save(SignDetail signDetail);

    public List<SignDetail> all();
}
