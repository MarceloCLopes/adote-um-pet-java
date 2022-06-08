package br.com.mcl.adoteumpet.api.adocao.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.mcl.adoteumpet.api.adocao.dtos.AdocaoRequest;
import br.com.mcl.adoteumpet.api.adocao.dtos.AdocaoResponse;
import br.com.mcl.adoteumpet.api.adocao.services.AdocaoService;

@RestController
public class AdocaoController {

  @Autowired
  private AdocaoService adocaoService;

  @PostMapping("/api/adocoes")
  @ResponseStatus(code = HttpStatus.CREATED)
  public AdocaoResponse create(@RequestBody @Valid AdocaoRequest adocaoRequest) {
    return adocaoService.create(adocaoRequest);
  }
}
