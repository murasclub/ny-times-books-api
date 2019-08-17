package com.nursultanturdaliev.nytimes.responses;

import org.springframework.http.HttpStatus;

public class BestSellerListResponse extends BaseResponse {

    public BestSellerListResponse(HttpStatus httpStatus) {
        this.status = httpStatus;
    }
}
