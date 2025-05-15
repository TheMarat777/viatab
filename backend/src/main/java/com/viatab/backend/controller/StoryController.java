package com.viatab.backend.controller;

import com.viatab.backend.model.Story;
import com.viatab.backend.repository.StoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stories")
public class StoryController {

    private final StoryRepository repository;

    public StoryController(StoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Story> getAllStories() {
        return repository.findAll();
    }

    @PostMapping
    public Story addStory(@RequestBody Story story) {
        return repository.save(story);
    }

    @DeleteMapping("/{id}")
    public void deleteStory(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
