package com.curso.projeto2.mapper;

import java.util.List;

import com.curso.projeto2.domain.Post;
import com.curso.projeto2.dto.PostDTO;

public class PostMapper {

    public static PostDTO toDTO(Post entity) {
        return new PostDTO(
                entity.getId(),
                entity.getDate(),
                entity.getTitle(),
                entity.getBody(),
                UserMapper.toDTO(entity.getAuthor()),
                entity.getComments());
    }

    public static Post toEntity(PostDTO dto) {
        return new Post(
                dto.id(),
                dto.date(),
                dto.title(),
                dto.body(),
                UserMapper.toEntity(dto.author()),
                dto.comments());
    }

    public static List<PostDTO> toDTOList(List<Post> entityList) {
        return entityList.stream().map(PostMapper::toDTO).toList();
    }

    public static List<Post> toEntityList(List<PostDTO> dtoList) {
        return dtoList.stream().map(PostMapper::toEntity).toList();
    }
}