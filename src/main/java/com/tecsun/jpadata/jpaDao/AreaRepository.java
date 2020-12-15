package com.tecsun.jpadata.jpaDao;

import com.tecsun.entity.Area;

import java.util.List;

public interface AreaRepository {
    public Area save(Area area);

    public List<Area> all();
}
