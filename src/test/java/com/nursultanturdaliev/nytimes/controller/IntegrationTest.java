package com.nursultanturdaliev.nytimes.controller;

import com.nursultanturdaliev.nytimes.responses.BestSellerListResponse;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testLists() throws NullPointerException {
        ResponseEntity<BestSellerListResponse> response = testRestTemplate
                .withBasicAuth("username", "password")
                .getForEntity("/svc/books/v3/lists.json", BestSellerListResponse.class);

        Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        Assertions.assertThat(response.getBody().copyright).isEqualTo("Copyright (c) 2019 The New York Times Company.  All Rights Reserved.");
        Assertions.assertThat(response.getBody().results).isNotEmpty();
    }
}
