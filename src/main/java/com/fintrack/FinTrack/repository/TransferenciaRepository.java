package com.fintrack.FinTrack.repository;

import com.fintrack.FinTrack.model.TransferenciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransferenciaRepository extends JpaRepository<TransferenciaModel, Long> {
    List<TransferenciaModel> findByUsuarioId(Long id);
    List<TransferenciaModel> findByUsuarioIdAndDataBetween(Long id, LocalDateTime inicio, LocalDateTime fim);
}
