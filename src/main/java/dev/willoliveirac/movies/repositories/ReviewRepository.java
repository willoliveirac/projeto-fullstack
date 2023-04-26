package dev.willoliveirac.movies.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.willoliveirac.movies.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId>{

    
}