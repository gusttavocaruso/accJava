package com.trybe.accjava.testcontainer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.trybe.accjava.testcontainer.dao.LivroDao;
import com.trybe.accjava.testcontainer.model.Livro;

@Service
public class LivroService {

  private final LivroDao livroDao;


  public LivroService(LivroDao livroDao) {
    this.livroDao = livroDao;
  }

  public Livro cadastrarLivro(Livro livro) {
    return livroDao.cadastrarLivro(livro);
  }

  public List<Livro> listarTodosLivros() {
    return livroDao.listarTodosLivros();
  }

  public Optional<Livro> buscarLivroPeloId(String id) {
    return livroDao.buscarLivroPeloId(id);
  }

  public void atualizarLivroPeloId(String id, Livro livro) {
    livroDao.atualizarLivroPeloId(id, livro);
  }

  public void excluirLivroPeloId(String id) {
    livroDao.excluirLivroPeloId(id);
  }

}
