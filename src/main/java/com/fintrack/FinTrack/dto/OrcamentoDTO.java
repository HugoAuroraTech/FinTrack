package com.fintrack.FinTrack.dto;

import com.fintrack.FinTrack.model.CategoriaModel;
import com.fintrack.FinTrack.model.UsuarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrcamentoDTO {

    private Long id;

    private UsuarioModel usuario;

    private CategoriaModel categoria;

    private BigDecimal limite;

    private Integer mes;
    private Integer ano;
}
