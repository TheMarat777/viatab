package com.viatab.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "stories")
public class Story {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private String department;

    public Story() {}

    public Story(Long id, String title, String content, String department) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
