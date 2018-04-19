package com.joe.qiao.model.entity;

import com.joe.qiao.model.AutoIdEntityObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Joe Qiao
 * @Date 18/04/2018.
 */
@Entity
@Table(name = "bf_butterfly")
public class Butterfly extends AutoIdEntityObject{
    @Column(name="name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
