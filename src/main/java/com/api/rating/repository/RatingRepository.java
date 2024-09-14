package com.api.rating.repository;

import com.api.rating.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "ratingRepository")
public interface RatingRepository extends JpaRepository<Rating,Long> {
    @Query("SELECT r FROM Rating r WHERE r.bookId = :bookId")
    List<Rating> findRatingByBookId(@Param("bookId") long  bookId);
}
