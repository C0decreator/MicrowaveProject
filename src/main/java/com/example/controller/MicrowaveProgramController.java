package com.example.controller;

import com.example.service.MicrowaveProgramService; // Убедитесь, что импорт правильный
import com.example.model.MicrowaveProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programs")
public class MicrowaveProgramController {

    private final MicrowaveProgramService service;

    @Autowired
    public MicrowaveProgramController(MicrowaveProgramService service) {
        this.service = service;
    }

    @GetMapping
    public List<MicrowaveProgram> getAllPrograms() {
        return service.getAllPrograms();
    }

    @PostMapping
    public MicrowaveProgram addProgram(@RequestBody MicrowaveProgram program) {
        return service.addProgram(program);
    }

    @DeleteMapping("/{id}")
    public void deleteProgram(@PathVariable Long id) {
        service.deleteProgram(id);
    }
}
