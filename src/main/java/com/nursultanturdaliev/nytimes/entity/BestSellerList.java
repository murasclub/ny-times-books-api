package com.nursultanturdaliev.nytimes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BestSellerList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String list_name;

    public String getList_name() {
        return list_name;
    }

    public void setList_name(String list_name) {
        this.list_name = list_name;
    }
}
