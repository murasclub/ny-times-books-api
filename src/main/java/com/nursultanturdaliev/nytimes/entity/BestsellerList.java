package com.nursultanturdaliev.nytimes.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(exclude = "books")

@Entity
public class BestsellerList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String list_name;
    private String display_name;
    private String list_name_encoded;
    private Date oldest_published_date;
    private Date newest_published_date;
    private String updated;

    @OneToMany(mappedBy = "bestsellerList", cascade = CascadeType.ALL)
    public List<Book> books = new ArrayList<>();

    public String getList_name() {
        return list_name;
    }

    public void setList_name(String list_name) {
        this.list_name = list_name;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getList_name_encoded() {
        return list_name_encoded;
    }

    public void setList_name_encoded(String list_name_encoded) {
        this.list_name_encoded = list_name_encoded;
    }

    public Date getOldest_published_date() {
        return oldest_published_date;
    }

    public void setOldest_published_date(Date oldest_published_date) {
        this.oldest_published_date = oldest_published_date;
    }

    public Date getNewest_published_date() {
        return newest_published_date;
    }

    public void setNewest_published_date(Date newest_published_date) {
        this.newest_published_date = newest_published_date;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}
