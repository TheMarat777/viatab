package com.viatab.backend.repository;

import com.viatab.backend.model.Story;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story, Long> {}
