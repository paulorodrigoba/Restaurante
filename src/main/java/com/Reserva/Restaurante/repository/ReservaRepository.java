package com.Reserva.Restaurante.repository;


import com.Reserva.Restaurante.domain.reserva.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reservas, Long> {
}
