package com.lucasdias.url_shortener.controller;

import com.lucasdias.url_shortener.dto.CreateUrlRequest;
import com.lucasdias.url_shortener.dto.UrlDto;
import com.lucasdias.url_shortener.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/urls")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @GetMapping
    public ResponseEntity<List<UrlDto>> getAll(){
        var all = urlService.getAll();
        return ResponseEntity.ok(all);
    }

    @PostMapping
    public ResponseEntity shortUrl(@RequestBody CreateUrlRequest createUrlRequest) {
        var shortUrl = urlService.shortUrl(createUrlRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(shortUrl);
    }
}
