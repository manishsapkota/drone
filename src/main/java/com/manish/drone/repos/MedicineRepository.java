package com.manish.drone.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manish.drone.entities.medicine;

public interface MedicineRepository extends JpaRepository<medicine, Integer> {

}
