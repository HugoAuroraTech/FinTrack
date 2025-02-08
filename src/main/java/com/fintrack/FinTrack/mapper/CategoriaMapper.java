package com.fintrack.FinTrack.mapper;

import com.fintrack.FinTrack.dto.CategoriaDTO;
import com.fintrack.FinTrack.dto.UsuarioDTO;
import com.fintrack.FinTrack.model.CategoriaModel;
import com.fintrack.FinTrack.model.UsuarioModel;

public class CategoriaMapper {

    public CategoriaModel map(CategoriaDTO categoriaDTO){
        CategoriaModel categoriaModel = new CategoriaModel();
        categoriaModel.setId(categoriaDTO.getId());
        categoriaModel.setNome(categoriaDTO.getNome());
        categoriaModel.setUsuario(categoriaDTO.getUsuario());
        categoriaModel.setIcone(categoriaDTO.getIcone());
        return categoriaModel;
    }

    public CategoriaDTO map(CategoriaModel categoriaModel) {
        CategoriaDTO categoriaDTO = new CategoriaDTO();
        categoriaDTO.setId(categoriaModel.getId());
        categoriaDTO.setNome(categoriaModel.getNome());
        categoriaDTO.setUsuario(categoriaModel.getUsuario());
        categoriaDTO.setIcone(categoriaModel.getIcone());
        return categoriaDTO;
    }
}
