package com.fintrack.FinTrack.dto;

import com.fintrack.FinTrack.enums.TipoTransferencia;
import com.fintrack.FinTrack.model.CategoriaModel;
import com.fintrack.FinTrack.model.UsuarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferenciaDTO {

    private Long id;

    private UsuarioModel usuario;

    private TipoTransferencia tipoTransferencia;

    private CategoriaModel categoria;

    private BigDecimal valor;

    private String descricao;

    private LocalDate data;
}
