package br.com.mcl.adoteumpet.api.adocao.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.mcl.adoteumpet.api.adocao.dtos.AdocaoRequest;
import br.com.mcl.adoteumpet.api.adocao.dtos.AdocaoResponse;
import br.com.mcl.adoteumpet.api.pet.mappers.PetMapper;
import br.com.mcl.adoteumpet.core.models.Adocao;
import br.com.mcl.adoteumpet.core.repositories.PetRepository;

@Component
public class AdocaoMapper {

  @Autowired
  private PetRepository petRepository;

  @Autowired
  private PetMapper petMapper;

  public Adocao toModel(AdocaoRequest adocaoRequest) {

    return Adocao.builder()
        .email(adocaoRequest.getEmail())
        .amount(adocaoRequest.getAmount())
        .pet(petRepository.findByIdOrElseThrow(adocaoRequest.getPetId()))
        .build();
  }

  public AdocaoResponse toResponse(Adocao adocao) {

    return AdocaoResponse.builder()
        .id(adocao.getId())
        .email(adocao.getEmail())
        .amount(adocao.getAmount())
        .pet(petMapper.toResponse(adocao.getPet()))
        .build();
  }

}
