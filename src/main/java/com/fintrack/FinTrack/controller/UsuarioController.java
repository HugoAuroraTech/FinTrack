package com.fintrack.FinTrack.controller;

import com.fintrack.FinTrack.dto.UsuarioDTO;
import com.fintrack.FinTrack.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/registrar")
    public ResponseEntity<String> criarUsuario(@RequestBody UsuarioDTO usuarioDTO){
        UsuarioDTO usuarioCriado = this.usuarioService.criarUsuario(usuarioDTO);
        return ResponseEntity.ok("Usuario criado com sucesso");
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listarUsuarios(){
        List<UsuarioDTO> usuarios = this.usuarioService.listarUsuarios();
        if (usuarios.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhum usuario encontrado");
        }
        return ResponseEntity.ok(usuarios);

    }

}
