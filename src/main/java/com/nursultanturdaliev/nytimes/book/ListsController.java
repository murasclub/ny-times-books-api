package com.nursultanturdaliev.nytimes.book;

import com.nursultanturdaliev.nytimes.entity.BestsellerList;
import com.nursultanturdaliev.nytimes.entity.Book;
import com.nursultanturdaliev.nytimes.repository.BestSellerListRepository;
import com.nursultanturdaliev.nytimes.repository.BookRepository;
import com.nursultanturdaliev.nytimes.responses.BestSellerListResponse;
import com.nursultanturdaliev.nytimes.responses.BookInfo;
import com.nursultanturdaliev.nytimes.responses.NamesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ListsController {

    @Autowired
    private
    BestSellerListRepository bestSellerListRepository;

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/svc/books/v3/lists/names.json", method = GET)
    public NamesResponse names() {

        Iterable<BestsellerList> bestSellerListList = bestSellerListRepository.findAll();

        List<BestsellerList> bestSellerLists = new LinkedList<>();
        bestSellerListList.forEach(bestSellerLists::add);

        return new NamesResponse(HttpStatus.OK, bestSellerLists);
    }

    @RequestMapping(value = "/svc/books/v3/lists.json")
    public BestSellerListResponse lists(String list) {

        BestsellerList bestsellerList = bestSellerListRepository.findById(1).get();

        Book book = bookRepository.findById(1).get();

        List<BookInfo> bookInfos = new LinkedList<>();

        bookInfos.add(new BookInfo(bestsellerList,book));

        return new BestSellerListResponse(HttpStatus.OK, bookInfos);
    }
}
