package com.fintrack.FinTrack.service;

import com.fintrack.FinTrack.dto.UsuarioDTO;
import com.fintrack.FinTrack.mapper.UsuarioMapper;
import com.fintrack.FinTrack.model.UsuarioModel;
import com.fintrack.FinTrack.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    private UsuarioMapper usuarioMapper;

    public UsuarioService(UsuarioRepository usuarioRepository, UsuarioMapper usuarioMapper) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioMapper = usuarioMapper;
    }

    public UsuarioDTO criarUsuario(UsuarioDTO usuarioDTO){
        if (usuarioRepository.findByEmail(usuarioDTO.getEmail()).isPresent()) {
            throw new RuntimeException("Email já cadastrado");
        }
        UsuarioModel usuarioSalvo = this.usuarioMapper.map(usuarioDTO);
        usuarioSalvo.setCriacaoConta(LocalDate.now());
        usuarioSalvo = this.usuarioRepository.save(usuarioSalvo);
        return this.usuarioMapper.map(usuarioSalvo);
    }

    public List<UsuarioDTO> listarUsuarios(){
        List<UsuarioModel> usuarios = this.usuarioRepository.findAll();
        return usuarios.stream()
                .map(usuarioMapper::map)
                .collect(Collectors.toList());
    }

    public UsuarioDTO listarUsuarioPorEmail(String email){
        Optional<UsuarioModel> usuarioPorEmail = this.usuarioRepository.findByEmail(email);
        return usuarioPorEmail.map(usuarioMapper::map).orElse(null);
    }

    public UsuarioDTO atualizarUsuario(Long id, UsuarioDTO usuarioDTO){
        Optional<UsuarioModel> usuarioExiste = this.usuarioRepository.findById(id);
        if (usuarioExiste.isPresent()){
            UsuarioModel usuarioAtualizado = usuarioMapper.map(usuarioDTO);
            usuarioAtualizado.setId(id);
            UsuarioModel usuarioSalvo = this.usuarioRepository.save(usuarioAtualizado);
            return usuarioMapper.map(usuarioSalvo);
        }
        return null;
    }

    public void deletarUsuario(Long id){
        Optional<UsuarioModel> usuarioEncontrado = this.usuarioRepository.findById(id);
            this.usuarioRepository.deleteById(id);
    }
}
