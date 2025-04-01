package org.csu.gameshop.entity;

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
    private Integer userid;
    private String  username;
    private Integer productid;
    private LocalDateTime createTime;

}
