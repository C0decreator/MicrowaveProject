package com.example.microwave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.microwave.entity.HeatingMode;

public interface HeatingModeRepository extends JpaRepository<HeatingMode, Long> {
}