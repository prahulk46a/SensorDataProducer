package com.example.sensorproducer.controller;


import com.example.sensorproducer.services.SensorProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorProducerController {

    private final SensorProducerService producerService;

    public SensorProducerController(SensorProducerService producerService) {
        this.producerService = producerService;
    }

    // Trigger a single sensor reading
    @PostMapping("/send")
    public String sendSensor() {
        producerService.sendRandomSensorReading();
        return "Sensor data sent!";
    }
}