package com.eduplatform.sellmaneger.Repository;

import com.eduplatform.sellmaneger.Entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
}
