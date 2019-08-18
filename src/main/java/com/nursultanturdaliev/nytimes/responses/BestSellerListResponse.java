package com.nursultanturdaliev.nytimes.responses;

import com.nursultanturdaliev.nytimes.entity.Book;
import org.springframework.http.HttpStatus;

import java.util.List;

public class BestSellerListResponse extends BaseResponse {

    public List<BookInfo> results;

    public BestSellerListResponse(HttpStatus httpStatus, List<BookInfo> bookInfos) {
        this.status = httpStatus;
        this.results = bookInfos;
    }
}
