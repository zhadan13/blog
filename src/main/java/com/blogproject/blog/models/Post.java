package com.blogproject.blog.models;

import javax.persistence.*;

@Entity(name = "Post")
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String fullText;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private Integer views;

    @Column(nullable = false)
    private Long author;

    public Post() {
    }

    public Post(String title, String fullText, String date, Integer views, Long author) {
        this.title = title;
        this.fullText = fullText;
        this.date = date;
        this.views = views;
        this.author = author;
    }

    public Post(Long id, String title, String fullText, String date, Integer views, Long author) {
        this.id = id;
        this.title = title;
        this.fullText = fullText;
        this.date = date;
        this.views = views;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Long getAuthor() {
        return author;
    }

    public void setAuthor(Long author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post { " +
                "id = " + id +
                ", title = '" + title + '\'' +
                ", fullText = '" + fullText + '\'' +
                ", date = '" + date + '\'' +
                ", views = " + views +
                ", author = " + author +
                '}';
    }
}
