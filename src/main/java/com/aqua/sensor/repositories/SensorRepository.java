package com.aqua.sensor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aqua.sensor.models.Sensor;

public interface SensorRepository extends JpaRepository<Sensor, Long> {

}
