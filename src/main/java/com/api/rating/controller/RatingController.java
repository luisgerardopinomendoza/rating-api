package com.api.rating.controller;

import com.api.rating.entity.Rating;
import com.api.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    private final RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping
    public List<Rating> findRatingByBookId(@RequestParam (required=false, defaultValue="0") Long bookId){
    if(bookId.equals(0L)){
        return  ratingService.findAllRatings();
    }
        return ratingService.findRatingByBookId(bookId);
    }

}
