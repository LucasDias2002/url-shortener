package com.lucasdias.url_shortener.service;

import com.lucasdias.url_shortener.Mapper.UrlMapper;
import com.lucasdias.url_shortener.dto.CreateUrlRequest;
import com.lucasdias.url_shortener.dto.UrlDto;
import com.lucasdias.url_shortener.entity.Url;
import com.lucasdias.url_shortener.repository.IUrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlService {

    @Autowired
    private IUrlRepository urlRepository;

    @Autowired
    private UrlMapper mapper;

    public List<UrlDto> getAll(){
        var all = urlRepository.findAll();
        return mapper.toDtos(all);
    }

    public UrlDto findByShortCode(String shortCode){
        var entity = urlRepository.findByShortCode(shortCode);
        return mapper.toDto(entity);
    }

    public UrlDto shortUrl (CreateUrlRequest createUrlRequest){
        return new UrlDto("", "", "");
    }
}
