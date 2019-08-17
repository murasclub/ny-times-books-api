package com.nursultanturdaliev.nytimes.book;

import com.nursultanturdaliev.nytimes.entity.BestSellerList;
import com.nursultanturdaliev.nytimes.repository.BestSellerListRepository;
import com.nursultanturdaliev.nytimes.responses.NamesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ListsController {

    @Autowired
    BestSellerListRepository bestSellerListRepository;

    @RequestMapping(value = "/svc/books/v3/lists/names.json", method = GET)
    public NamesResponse names() {

        Iterable<BestSellerList> bestSellerListList = bestSellerListRepository.findAll();

        List<BestSellerList> bestSellerLists = new LinkedList<>();
        bestSellerListList.forEach(bestSellerLists::add);

        return new NamesResponse(HttpStatus.OK, bestSellerLists);
    }
}
