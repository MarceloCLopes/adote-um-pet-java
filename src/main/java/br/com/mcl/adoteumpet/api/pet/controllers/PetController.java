package br.com.mcl.adoteumpet.api.pet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mcl.adoteumpet.api.pet.dtos.PetResponse;
import br.com.mcl.adoteumpet.api.pet.mappers.PetMapper;
import br.com.mcl.adoteumpet.core.repositories.PetRepository;

@RestController
public class PetController {

  @Autowired
  private PetRepository petRepository;

  @Autowired
  private PetMapper petMapper;

  @GetMapping("/api/pets")
  public List<PetResponse> findAll() {
    return petRepository.findAll()
        .stream()
        .map(petMapper::toResponse)
        .toList();
  }
}
