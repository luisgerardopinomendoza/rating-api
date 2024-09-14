package com.api.rating.service;

import com.api.rating.entity.Rating;
import com.api.rating.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="ratingService")
public class RatingService {
    private final RatingRepository ratingRepository;

    @Autowired
    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public List<Rating> findAllRatings(){
        return ratingRepository.findAll();
    }

    public Rating findRatingById(long id){
        return ratingRepository.getReferenceById(id);
    }

    public List<Rating> findRatingByBookId(long bookId){
        return ratingRepository.findRatingByBookId(bookId);
    }
}
