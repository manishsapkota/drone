package com.manish.drone.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manish.drone.entities.drone;

public interface DroneRepository extends JpaRepository<drone, Integer> {

}
