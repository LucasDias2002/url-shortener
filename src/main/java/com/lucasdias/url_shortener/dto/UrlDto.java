package com.lucasdias.url_shortener.dto;

public record UrlDto(
        String urlOriginal,
        String shortCode,
        String shortUrl
) {}
