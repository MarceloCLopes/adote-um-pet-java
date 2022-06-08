package br.com.mcl.adoteumpet.api.pet.mappers;

import org.springframework.stereotype.Component;

import br.com.mcl.adoteumpet.api.pet.dtos.PetResponse;
import br.com.mcl.adoteumpet.core.models.Pet;

@Component
public class PetMapper {

  public PetResponse toResponse(Pet pet) {
    return PetResponse.builder()
        .id(pet.getId())
        .name(pet.getName())
        .history(pet.getHistory())
        .photo(pet.getPhoto())
        .build();

  }
}
