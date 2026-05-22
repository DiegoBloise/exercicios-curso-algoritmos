package com.curso.projeto2.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.projeto2.domain.Post;
import com.curso.projeto2.dto.PostDTO;
import com.curso.projeto2.mapper.PostMapper;
import com.curso.projeto2.mapper.UserMapper;
import com.curso.projeto2.repository.PostRepository;
import com.curso.projeto2.service.exceptions.ObjectNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository repository;

    public List<PostDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(PostMapper::toDTO)
                .toList();
    }

    public PostDTO findById(String id) {
        Post post = repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(id));

        return PostMapper.toDTO(post);
    }

    public List<PostDTO> findByTitle(String search) {
        return repository.findByTitleContainingIgnoreCase(search)
                .stream()
                .map(PostMapper::toDTO)
                .toList();
    }

    public List<PostDTO> fullSearch(String search, LocalDate minDate, LocalDate maxDate) {
        maxDate = maxDate.plusDays(1);
        return repository.fullSearch(search, minDate, maxDate)
                .stream()
                .map(PostMapper::toDTO)
                .toList();
    }

    public PostDTO insert(PostDTO dto) {
        Post newPost = PostMapper.toEntity(dto);
        return PostMapper.toDTO(repository.insert(newPost));
    }

    public PostDTO update(String id, PostDTO updatedPost) {
        Post existingPost = repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(id));

        updatePost(existingPost, updatedPost);

        return PostMapper.toDTO(repository.save(existingPost));
    }

    public void delete(String id) {
        findById(id);
        repository.deleteById(id);
    }

    private void updatePost(Post existingPost, PostDTO updatedPost) {
        existingPost.setDate(updatedPost.date());
        existingPost.setTitle(updatedPost.title());
        existingPost.setBody(updatedPost.body());
        existingPost.setAuthor(UserMapper.toEntity(updatedPost.author()));
    }
}