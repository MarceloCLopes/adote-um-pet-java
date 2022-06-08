package br.com.mcl.adoteumpet.api.adocao.dtos;

import java.math.BigDecimal;

import br.com.mcl.adoteumpet.api.pet.dtos.PetResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdocaoResponse {

  private Long id;
  private String email;
  private BigDecimal amount;
  private PetResponse pet;
}
