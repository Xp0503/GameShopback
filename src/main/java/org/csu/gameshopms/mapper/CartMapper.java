package org.csu.gameshopms.mapper;

import org.apache.ibatis.annotations.Delete;

public interface CartMapper {
    @Delete("DELETE FROM cart WHERE user_id = #{userId}")
    void deleteByUserId(int id);
}
