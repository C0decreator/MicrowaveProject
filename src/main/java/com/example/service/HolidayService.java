package com.example.service;

import org.springframework.stereotype.Service; // Убедитесь, что этот импорт присутствует
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

@Service
public class HolidayService {
    private final RestTemplate restTemplate;

    public HolidayService() {
        this.restTemplate = new RestTemplate();
    }

    public List<String> getHolidays(int year, String country) {
        String url = "https://date.nager.at/Api/v2/PublicHolidays/" + year + "/" + country;
        ResponseEntity<Holiday[]> response = restTemplate.getForEntity(url, Holiday[].class);
        return Arrays.stream(response.getBody()).map(Holiday::getDate).toList();
    }
}

// Предполагаемый класс Holiday (его нужно создать отдельно)
class Holiday {
    private String date;
    // могут быть и другие поля

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}