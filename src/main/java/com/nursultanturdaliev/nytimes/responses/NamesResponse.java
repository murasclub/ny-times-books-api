package com.nursultanturdaliev.nytimes.responses;

import com.nursultanturdaliev.nytimes.entity.BestsellerList;
import org.springframework.http.HttpStatus;

import java.util.List;

public class NamesResponse extends BaseResponse {

    public List<BestsellerList> results;

    public NamesResponse(HttpStatus status, List<BestsellerList> results) {
        this.status = status;
        this.results = results;
    }
}
