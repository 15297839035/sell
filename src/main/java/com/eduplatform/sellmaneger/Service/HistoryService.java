package com.eduplatform.sellmaneger.Service;

import com.eduplatform.sellmaneger.Entity.History;
import com.eduplatform.sellmaneger.Repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {
    @Autowired
    private HistoryRepository historyRepository;
    public List<History> getAllHistories() {
        return historyRepository.findAll();
    }
    public History getHistory(Integer id) {return historyRepository.findById(id).get();    }
    public void deleteHistoryById(Integer id) {        historyRepository.deleteById(id);
    }
    public void saveHistory(History history) {
        historyRepository.save(history);
    }
}
