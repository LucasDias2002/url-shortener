package com.lucasdias.url_shortener.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CreateUrlRequest(

        @NotBlank(message = "URL is required")
        String originalUrl

) {}