package com.fintrack.FinTrack.model;


import com.fintrack.FinTrack.enums.TipoTransferencia;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "tb_transferencias")
@NoArgsConstructor
@AllArgsConstructor
public class TransferenciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private UsuarioModel usuario;

    @Enumerated(EnumType.STRING)
    private TipoTransferencia tipoTransferencia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id", nullable = false)
    private CategoriaModel categoria;

    @Column(precision = 10, scale = 2)
    private BigDecimal valor;

    private String descricao;

    private LocalDate data;


}
