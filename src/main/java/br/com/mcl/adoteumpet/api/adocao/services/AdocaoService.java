package br.com.mcl.adoteumpet.api.adocao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mcl.adoteumpet.api.adocao.dtos.AdocaoRequest;
import br.com.mcl.adoteumpet.api.adocao.dtos.AdocaoResponse;
import br.com.mcl.adoteumpet.api.adocao.mappers.AdocaoMapper;
import br.com.mcl.adoteumpet.core.repositories.AdocaoRepository;

@Service
public class AdocaoService {

  @Autowired
  private AdocaoRepository adocaoRepository;

  @Autowired
  private AdocaoMapper adocaoMapper;

  public AdocaoResponse create(AdocaoRequest adocaoRequest) {

    var adocaoToCreate = adocaoMapper.toModel(adocaoRequest);
    var createdAdocao = adocaoRepository.save(adocaoToCreate);
    return adocaoMapper.toResponse(createdAdocao);
  }
}
