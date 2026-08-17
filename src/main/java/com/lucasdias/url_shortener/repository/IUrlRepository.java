package com.lucasdias.url_shortener.repository;

import com.lucasdias.url_shortener.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUrlRepository extends JpaRepository<Url, Long> {
    Url findByShortCode(String shortCode);
}
