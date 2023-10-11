package org.fasttrack.repository;

import org.fasttrack.model.Actor;
import org.fasttrack.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
