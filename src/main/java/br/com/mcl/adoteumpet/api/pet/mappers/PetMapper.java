package br.com.mcl.adoteumpet.api.pet.mappers;

import org.springframework.stereotype.Component;

import br.com.mcl.adoteumpet.api.pet.dtos.PetResponse;
import br.com.mcl.adoteumpet.core.models.Pet;

@Component
public class PetMapper {

  public PetResponse toResponse(Pet pet) {
    var petResponse = new PetResponse();
    petResponse.setId(pet.getId());
    petResponse.setName(pet.getName());
    petResponse.setHistory(pet.getHistory());
    petResponse.setPhoto(pet.getPhoto());
    return petResponse;

  }
}
