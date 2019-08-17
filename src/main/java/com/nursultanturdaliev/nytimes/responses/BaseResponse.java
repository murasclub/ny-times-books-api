package com.nursultanturdaliev.nytimes.responses;

import org.springframework.http.HttpStatus;

abstract public class BaseResponse {
    public HttpStatus status;
    public final String copyright = "Copyright (c) 2019 The New York Times Company.  All Rights Reserved.";
}
