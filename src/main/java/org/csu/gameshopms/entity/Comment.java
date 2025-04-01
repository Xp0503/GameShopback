package org.csu.gameshopms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("comment")
public class Comment {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String content;
    private Integer user_id;
    private Integer product_id;
    private Integer like;
    private LocalDateTime create_time;

}
