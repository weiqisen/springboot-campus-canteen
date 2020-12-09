package cn.sise.dao;

import cn.sise.pojo.Db;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper

public interface DbMapper {
    void setDb(Db db);

    List<Db> list();

    void delDb(int id);

    Db get(int id);

}
