package com.example.microwave.repository;

import com.example.microwave.entity.HeatingMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeatingModeRepository extends JpaRepository<HeatingMode, Long> {
}