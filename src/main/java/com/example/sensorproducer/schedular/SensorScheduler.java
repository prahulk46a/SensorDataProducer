package com.example.sensorproducer.schedular;
import com.example.sensorproducer.services.SensorProducerService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SensorScheduler {

    private final SensorProducerService producerService;

    public SensorScheduler(SensorProducerService producerService) {
        this.producerService = producerService;
    }

    // Sends every 1 second automatically
    @Scheduled(fixedRate = 1000)
    public void sendPeriodic() {
        producerService.sendRandomSensorReading();
    }
}