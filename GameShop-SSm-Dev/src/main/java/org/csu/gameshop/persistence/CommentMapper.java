package org.csu.gameshop.persistence;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.csu.gameshop.entity.Comment;

import java.util.List;

public interface CommentMapper extends BaseMapper<Comment> {
    // 自定义查询方法
    @Select("SELECT * FROM comment WHERE product_id = #{productId}")
    List<Comment> selectByProductId(@Param("productId") Integer productId);
}
