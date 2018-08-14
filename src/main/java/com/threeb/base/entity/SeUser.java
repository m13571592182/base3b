package com.threeb.base.entity;


/**
 * @ClassName user
 * @Description TODO
 * @Author Raine
 * @Date 2018年8月14日14:28:04
 * @Version 1.0
 */
public class SeUser {
    private Integer id;
    private String name;


    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
