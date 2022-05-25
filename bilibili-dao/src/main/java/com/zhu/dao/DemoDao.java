package com.zhu.dao;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoDao {

    /**
     * 查询名字
     *
     * @param id 主键
     * @return 名字
     */
    public String query(Long id);

}
