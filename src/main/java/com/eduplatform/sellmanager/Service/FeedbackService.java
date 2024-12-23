package com.eduplatform.sellmanager.Service;

import com.eduplatform.sellmanager.Entity.Feedback;
import com.eduplatform.sellmanager.Repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;
    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();}
    public Feedback getFeedbackById(int id) {
        return feedbackRepository.findById(id).get();
    }
    public void deleteFeedbackById(Integer id) {
        feedbackRepository.deleteById(id);
    }
    public void saveFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);    }
}
