package com.eduplatform.sellmaneger.Service;

import com.eduplatform.sellmaneger.Entity.Feedback;
import com.eduplatform.sellmaneger.Repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;
    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();}
    public Optional<Feedback> getFeedbackById(Integer id) {
        return feedbackRepository.findById(id);
    }
    public void deleteFeedbackById(Integer id) {
        feedbackRepository.deleteById(id);
    }
    public void saveFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);    }
}
