package com.fintrack.FinTrack.mapper;

import com.fintrack.FinTrack.dto.UsuarioDTO;
import com.fintrack.FinTrack.model.UsuarioModel;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {
    public UsuarioModel map(UsuarioDTO usuarioDTO){
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setId(usuarioDTO.getId());
        usuarioModel.setNome(usuarioDTO.getNome());
        usuarioModel.setEmail(usuarioDTO.getEmail());
        usuarioModel.setSenha(usuarioDTO.getSenha());
        usuarioModel.setCriacaoConta(usuarioDTO.getCriacaoConta());
        return usuarioModel;
    }

    public UsuarioDTO map(UsuarioModel usuarioModel){
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(usuarioModel.getId());
        usuarioDTO.setNome(usuarioModel.getNome());
        usuarioDTO.setEmail(usuarioModel.getEmail());
        usuarioDTO.setSenha(usuarioModel.getSenha());
        usuarioDTO.setCriacaoConta(usuarioModel.getCriacaoConta());
        return usuarioDTO;

    }

}
