package com.fintrack.FinTrack.dto;


import com.fintrack.FinTrack.model.UsuarioModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaDTO {

    private Long Id;

    private UsuarioModel usuario;

    private String nome;

    private String icone;
}
