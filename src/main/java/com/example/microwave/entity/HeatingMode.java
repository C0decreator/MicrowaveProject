package com.example.microwave.entity;

public class HeatingMode {
    private Long id;
    private String modeName;

    public HeatingMode(Long id, String modeName) {
        this.id = id;
        this.modeName = modeName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    @Override
    public String toString() {
        return "HeatingMode{" +
                "id=" + id +
                ", modeName='" + modeName + '\'' +
                '}';
    }
}