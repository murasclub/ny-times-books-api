package com.nursultanturdaliev.nytimes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OverviewController {

    @RequestMapping("svc/books/v3/lists/names.json")
    public Overview names()
    {
        return new Overview();
    }
}
