package com.betrybe.service;

import com.betrybe.dto.AtualizarCarroDTO;
import com.betrybe.dto.CriarCarroDTO;
import com.betrybe.model.Carro;
import com.betrybe.repository.CarroRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CarroService {

  @Inject
  private CarroRepository repository;

  public List<Carro> listar(){
    return repository.listAll();
  }

  public Carro buscarPorId(Long id){
    return repository.findById(id);
  }

  @Transactional
  public void salvar(CriarCarroDTO carroDTO){
    var carro = new Carro();
    carro.setNome(carroDTO.getNome());
    carro.setAno(carroDTO.getAno());
    carro.setPreco(carroDTO.getPreco());

    repository.persist(carro);
  }

  @Transactional
  public void atualizar(AtualizarCarroDTO carroDTO, Long id){
    var carro = repository.findById(id);
    carro.setPreco(carroDTO.getPreco());

    repository.persist(carro);
  }

  @Transactional
  public void deletar(Long id){
    repository.deleteById(id);
  }

}

/* SERVICE SEM DTO:

package com.betrybe.service;

import com.betrybe.model.Carro;
import com.betrybe.repository.CarroRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CarroService {

  @Inject
  private CarroRepository repository;

  public List<Carro> listar(){
      return repository.listAll();
  }

  public Carro buscarPorId(Long id){
      return repository.findById(id);
  }

  @Transactional
  public void salvar(Carro carro){
      repository.persist(carro);
  }

  @Transactional
  public void atualizar(Carro carro){
      repository.persist(carro);
  }
  @Transactional
  public void deletar(Long id){
      repository.deleteById(id);
  }

} */
