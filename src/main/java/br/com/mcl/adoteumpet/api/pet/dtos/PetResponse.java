package br.com.mcl.adoteumpet.api.pet.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetResponse {

  private Long id;
  private String name;
  private String history;
  private String photo;

}
