package com.fintrack.FinTrack.mapper;

import com.fintrack.FinTrack.dto.CategoriaDTO;
import com.fintrack.FinTrack.dto.OrcamentoDTO;
import com.fintrack.FinTrack.model.CategoriaModel;
import com.fintrack.FinTrack.model.OrcamentoModel;
import org.springframework.stereotype.Component;

@Component
public class OrcamentoMapper {

    public OrcamentoModel map(OrcamentoDTO orcamentoDTO){
        OrcamentoModel orcamentoModel = new OrcamentoModel();
        orcamentoModel.setId(orcamentoDTO.getId());
        orcamentoModel.setCategoria(orcamentoDTO.getCategoria());
        orcamentoModel.setUsuario(orcamentoDTO.getUsuario());
        orcamentoModel.setLimite(orcamentoDTO.getLimite());
        orcamentoModel.setMes(orcamentoDTO.getMes());
        orcamentoModel.setAno(orcamentoDTO.getAno());
        return orcamentoModel;
    }

    public OrcamentoDTO map(OrcamentoModel orcamentoModel){
        OrcamentoDTO orcamentoDTO = new OrcamentoDTO();
        orcamentoDTO.setId(orcamentoModel.getId());
        orcamentoDTO.setCategoria(orcamentoModel.getCategoria());
        orcamentoDTO.setUsuario(orcamentoModel.getUsuario());
        orcamentoDTO.setLimite(orcamentoModel.getLimite());
        orcamentoDTO.setMes(orcamentoModel.getMes());
        orcamentoDTO.setAno(orcamentoModel.getAno());
        return orcamentoDTO;
    }
}
