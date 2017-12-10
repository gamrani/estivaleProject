package com.estivale.root.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estivale.root.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
