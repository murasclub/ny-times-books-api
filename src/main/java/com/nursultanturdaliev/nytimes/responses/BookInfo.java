package com.nursultanturdaliev.nytimes.responses;

import com.nursultanturdaliev.nytimes.entity.BestsellerList;
import com.nursultanturdaliev.nytimes.entity.Book;

public class BookInfo {
    private String list_name;
    private Book book_details;

    public BookInfo(BestsellerList bestsellerList, Book book) {
        list_name = bestsellerList.getList_name();
        this.book_details = book;
    }

    public String getList_name() {
        return list_name;
    }

    public void setList_name(String list_name) {
        this.list_name = list_name;
    }

    public Book getBook_details() {
        return book_details;
    }

    public void setBook_details(Book book_details) {
        this.book_details = book_details;
    }
}
