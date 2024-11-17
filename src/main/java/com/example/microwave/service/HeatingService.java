package com.example.microwave.service;

import com.example.microwave.entity.HeatingMode;
import com.example.microwave.repository.HeatingModeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeatingService {

    @Autowired
    private HeatingModeRepository heatingModeRepository;

    public HeatingMode startHeating(Long modeId) {
        HeatingMode mode = heatingModeRepository.findById(modeId)
                .orElseThrow(() -> new RuntimeException("Heating mode not found"));

        // Здесь логика для запуска режима, например:
        // запуск таймера, мониторинг перегрева и т.д.

        return mode;  // Вернуть информацию о режиме
    }

    public List<HeatingMode> getAllHeatingModes() {
        return heatingModeRepository.findAll();
    }
}