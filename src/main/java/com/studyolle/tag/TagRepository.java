package com.studyolle.tag;

import com.studyolle.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
public interface TagRepository extends JpaRepository<Tag, String> {
    Optional<Tag> findByTitle(String title);
}