package com.lucasdias.url_shortener.Mapper;

import com.lucasdias.url_shortener.dto.UrlDto;
import com.lucasdias.url_shortener.entity.Url;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UrlMapper {
    UrlDto toDto(Url url);
    Url toEntity(UrlDto dto);
    List<UrlDto> toDtos(List<Url> all);
}
