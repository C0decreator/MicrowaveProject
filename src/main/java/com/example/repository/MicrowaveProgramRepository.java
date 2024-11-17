package com.example.repository;

import com.example.model.MicrowaveProgram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MicrowaveProgramRepository extends JpaRepository<MicrowaveProgram, Long> {
}
