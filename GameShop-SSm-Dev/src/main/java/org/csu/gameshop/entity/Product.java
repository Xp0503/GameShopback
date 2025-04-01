package org.csu.gameshop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName("item")
public class Product {
    @TableId(value="id",type = IdType.AUTO)
    private int id;
    private String name;
    private String category;
    private String type;
    private String picture;
    private String description;
    private double price;
    private int storage;
    @TableField(exist = false)  // 重要！标记为非数据库字段
    private List<Comment> comments;
    @Override
    public String toString() {
        return "Product {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", price=" + String.format("¥%.2f", price) + // 格式化为货币
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public void setComments(List<Comment> comments) {this.comments = comments;}
    public String getPicture() {
        return picture;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory(){
        return category;
    }

    public List<Comment> getComments() { return comments;}

}
