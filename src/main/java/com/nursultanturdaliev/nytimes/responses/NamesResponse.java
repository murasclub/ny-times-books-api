package com.nursultanturdaliev.nytimes.responses;

import com.nursultanturdaliev.nytimes.entity.BestsellerList;
import org.springframework.http.HttpStatus;

import java.util.List;

public class NamesResponse {
    public HttpStatus status;
    public final String copyright = "Copyright (c) 2019 The New York Times Company.  All Rights Reserved.";

    public List<BestsellerList> results;

    public NamesResponse(HttpStatus status, List<BestsellerList> results) {
        this.status = status;
        this.results = results;
    }
}
