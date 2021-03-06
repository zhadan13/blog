package com.blogproject.blog.repository;

import com.blogproject.blog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    @Query(value = "SELECT * FROM posts WHERE author = ?1", nativeQuery = true)
    List<Post> findAllPostsByAuthorId(final Long id);
}
