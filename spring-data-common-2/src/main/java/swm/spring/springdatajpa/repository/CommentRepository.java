package swm.spring.springdatajpa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import swm.spring.springdatajpa.entity.Comment;
import swm.spring.springdatajpa.entity.Post;

import java.util.List;

public interface CommentRepository extends MyRepository<Comment, Long> {

    List<Comment> findByCommentContains(String keyword);

    List<Comment> findByCommentContainsIgnoreCase(String keyword);

    Page<Comment> findByCommentContainsIgnoreCase(String keyword, Pageable pageable);

    List<Comment> findByCommentContainsIgnoreCaseAndLikeCountGreaterThan(String keyword, int likeCount);

    List<Comment> findByCommentContainsIgnoreCaseOrderByLikeCountDesc(String keyword);

    Page<Comment> findByLikeCountGreaterThanAndPost(int likeCount, Post post, Pageable pageable);
}
