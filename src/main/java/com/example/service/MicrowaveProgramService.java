package com.example.service;

import com.example.model.MicrowaveProgram;
import com.example.repository.MicrowaveProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MicrowaveProgramService {

    private final MicrowaveProgramRepository repository;

    @Autowired
    public MicrowaveProgramService(MicrowaveProgramRepository repository) {
        this.repository = repository;
    }

    // Получить все программы
    public List<MicrowaveProgram> getAllPrograms() {
        return repository.findAll();
    }

    // Добавить новую программу
    public MicrowaveProgram addProgram(MicrowaveProgram program) {
        program.setCustom(true); // Устанавливаем, что это пользовательская программа
        return repository.save(program);
    }

    // Удалить программу по ID
    public void deleteProgram(Long id) {
        repository.deleteById(id);
    }
}
