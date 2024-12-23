package com.eduplatform.sellmanager.Controller;

import com.eduplatform.sellmanager.Entity.History;
import com.eduplatform.sellmanager.Service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/history")
@CrossOrigin(origins = "http://localhost:5173", allowedHeaders = "*")
public class HistoryController {
    @Autowired
    HistoryService historyService;
    @GetMapping
    public List<History> getHistory() {
        return historyService.getAllHistories();
    }
    @GetMapping("/{id}")
    public History getHistoryById(@PathVariable Integer id) {
        return historyService.getHistory(id);
    }
    @PostMapping
    public void addHistory(@RequestBody History history) {
        historyService.saveHistory(history);
    }
    @DeleteMapping("/{id}")
    public void deleteHistory(@PathVariable Integer id) {
        historyService.deleteHistoryById(id);
    }
}
