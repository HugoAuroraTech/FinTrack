package com.fintrack.FinTrack.repository;

import com.fintrack.FinTrack.model.OrcamentoModel;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrcamentoRepository extends JpaRepository<OrcamentoModel, Long> {
    List<OrcamentoModel> findByUsuarioIdAndMesAndAno(Long id, Integer mes, Integer ano);
}
