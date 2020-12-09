package cn.sise.dao;

import cn.sise.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper

public interface CommentMapper {
    void insert(Comment comment);

    List<Comment> listAll();

    List<Comment> listByPass();

    List<Comment> listByWaitPass();

    void setPass(int id);
}
