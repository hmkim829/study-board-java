package com.example.studyboard.repository;

import com.example.studyboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {

}
