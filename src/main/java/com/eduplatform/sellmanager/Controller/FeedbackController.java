package com.eduplatform.sellmanager.Controller;

import com.eduplatform.sellmanager.Entity.Feedback;
import com.eduplatform.sellmanager.Entity.FeedbackDTO;
import com.eduplatform.sellmanager.Service.FeedbackService;
import com.eduplatform.sellmanager.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    FeedbackService feedbackService;
    @Autowired
    UserService userService;
    @GetMapping
    public List<Feedback> getAllFeedback(){
        return feedbackService.getAllFeedbacks();
    }
    @GetMapping("/{id}")
    public Feedback getFeedbackById(@PathVariable Integer id){
        return feedbackService.getFeedbackById(id);
    }
    @PostMapping
    public void addFeedback(@RequestBody FeedbackDTO feedbackDTO){
        Feedback feedback = new Feedback();
        feedback.setId(feedbackDTO.getId());
        feedback.setSatisfication(feedbackDTO.getSatisfication());
        feedback.setSuggestion(feedbackDTO.getSuggestion());
        feedback.setUser(userService.getUser(feedbackDTO.getUser_id()));
        feedbackService.saveFeedback(feedback);
    }
    @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable Integer id){
        feedbackService.deleteFeedbackById(id);
    }
}
