package com.fintrack.FinTrack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

    private Long id;

    private String nome;

    private String email;

    private String senha;

    private LocalDate criacaoConta;
}
