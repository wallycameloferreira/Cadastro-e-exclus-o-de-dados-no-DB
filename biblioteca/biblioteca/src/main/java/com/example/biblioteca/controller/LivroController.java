package com.example.biblioteca.controller;

import com.example.biblioteca.model.Livro;
import com.example.biblioteca.repository.LivroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    private final LivroRepository repository;

    public LivroController(LivroRepository repository){
        this.repository = repository;
    }


    /* METODO GET PARA BUSCAR TODOS OS ITENS NO BANCO*/
    @GetMapping
    public List<Livro> listar(){
        return repository.findAll();
    }

    /* METODO POST PARA SALVAR TODOS OS ITENS NO BANCO*/
    @PostMapping
    public Livro cadastrar(@RequestBody Livro livro) {
        return repository.save(livro);
    }

    /*METODO DELLET PARA APAGAR DADOS NO BANCO*/
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
