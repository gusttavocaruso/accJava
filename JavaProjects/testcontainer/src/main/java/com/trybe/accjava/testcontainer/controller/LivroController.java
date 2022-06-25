package com.trybe.accjava.testcontainer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trybe.accjava.testcontainer.model.Livro;
import com.trybe.accjava.testcontainer.service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {

  private final LivroService livroService;

  public LivroController(LivroService livroService) {
    this.livroService = livroService;
  }

  @PostMapping
  public Livro cadastrarLivro(@RequestBody Livro livro) {
    return livroService.cadastrarLivro(livro);
  }

  @GetMapping
  public List<Livro> listarTodosLivros() {
    return livroService.listarTodosLivros();
  }

  @GetMapping(path = "/{id}")
  public Optional<Livro> buscarLivroPeloId(@PathVariable("id") String id) {
    return livroService.buscarLivroPeloId(id);
  }

  @PutMapping(path = "/{id}")
  public void atualizarLivroPeloId(@PathVariable String id, @RequestBody Livro livro ) {
    livroService.atualizarLivroPeloId(id, livro);
  }

  @DeleteMapping(path = "/{id}")
  public void excluirLivroPeloId(@PathVariable("id") String id) {
    livroService.excluirLivroPeloId(id);
  }

}
