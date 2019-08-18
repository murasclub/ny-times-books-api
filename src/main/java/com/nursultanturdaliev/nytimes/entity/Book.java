package com.nursultanturdaliev.nytimes.entity;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;
    private String description;
    private String contributor;
    private String author;
    private String contributor_note;
    private String publisher;
    private Integer price;
    private Integer bestseller_list_id;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    private BestsellerList bestsellerList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContributor_note() {
        return contributor_note;
    }

    public void setContributor_note(String contributor_note) {
        this.contributor_note = contributor_note;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getBestseller_list_id() {
        return bestseller_list_id;
    }

    public void setBestseller_list_id(Integer bestseller_list_id) {
        this.bestseller_list_id = bestseller_list_id;
    }
}
