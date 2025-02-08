package com.fintrack.FinTrack.repository;

import com.fintrack.FinTrack.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
    List<CategoriaModel> findByUsuarioId(Long id);
}
