package com.trybe.accjava.testcontainer.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.trybe.accjava.testcontainer.model.Livro;
import com.trybe.accjava.testcontainer.repository.LivroRepository;

@Component
public class LivroDao {

  private final LivroRepository livroRepository;

  public LivroDao(LivroRepository livroRepository) {
      this.livroRepository = livroRepository;
  }

  public Livro cadastrarLivro(Livro livro) {
      return livroRepository.insert(livro);
  }

  public List<Livro> listarTodosLivros() {
      return livroRepository.findAll();
  }

  public Optional<Livro> buscarLivroPeloId(String id) {
      return livroRepository.findById(id);
  }

  public Livro atualizarLivroPeloId(String id, Livro livro) {

    Optional<Livro> buscaLivro = this.buscarLivroPeloId(id);

    Livro livroAtualizado = buscarLivroPeloId(id).get();
    livroAtualizado.setIsbn(livro.getIsbn());
    livroAtualizado.setNome(livro.getNome());

    return livroRepository.save(livroAtualizado);
  }

  public void excluirLivroPeloId(String id) {
      livroRepository.deleteById(id);
  }

}