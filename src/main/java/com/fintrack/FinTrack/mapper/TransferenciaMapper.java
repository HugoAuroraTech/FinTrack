package com.fintrack.FinTrack.mapper;

import com.fintrack.FinTrack.dto.CategoriaDTO;
import com.fintrack.FinTrack.dto.TransferenciaDTO;
import com.fintrack.FinTrack.model.CategoriaModel;
import com.fintrack.FinTrack.model.TransferenciaModel;
import org.springframework.stereotype.Component;

@Component
public class TransferenciaMapper {

    public TransferenciaModel map(TransferenciaDTO transferenciaDTO){
        TransferenciaModel transferenciaModel = new TransferenciaModel();
        transferenciaModel.setId(transferenciaDTO.getId());
        transferenciaModel.setValor(transferenciaDTO.getValor());
        transferenciaModel.setUsuario(transferenciaDTO.getUsuario());
        transferenciaModel.setCategoria(transferenciaDTO.getCategoria());
        transferenciaModel.setTipoTransferencia(transferenciaDTO.getTipoTransferencia());
        transferenciaModel.setValor(transferenciaDTO.getValor());
        transferenciaModel.setDescricao(transferenciaDTO.getDescricao());
        transferenciaModel.setData(transferenciaDTO.getData());
        return transferenciaModel;
    }

    public TransferenciaDTO map(TransferenciaModel transferenciaModel){
        TransferenciaDTO transferenciaDTO = new TransferenciaDTO();
        transferenciaDTO.setId(transferenciaModel.getId());
        transferenciaDTO.setValor(transferenciaModel.getValor());
        transferenciaDTO.setUsuario(transferenciaModel.getUsuario());
        transferenciaDTO.setCategoria(transferenciaModel.getCategoria());
        transferenciaDTO.setTipoTransferencia(transferenciaModel.getTipoTransferencia());
        transferenciaDTO.setValor(transferenciaModel.getValor());
        transferenciaDTO.setDescricao(transferenciaModel.getDescricao());
        transferenciaDTO.setData(transferenciaModel.getData());
        return transferenciaDTO;
    }
}
