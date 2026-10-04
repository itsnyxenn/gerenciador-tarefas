package com.nyxenn.gerenciadortarefas.controller;

import com.nyxenn.gerenciadortarefas.model.Tarefa;
import com.nyxenn.gerenciadortarefas.repository.TarefaRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaRepository repository;

    public TarefaController(TarefaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Tarefa> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return repository.save(tarefa);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscar(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizar(@PathVariable Long id, @RequestBody Tarefa dados) {
        return repository.findById(id)
                .map(tarefa -> {
                    tarefa.setTitulo(dados.getTitulo());
                    tarefa.setDescricao(dados.getDescricao());
                    tarefa.setStatus(dados.getStatus());
                    return ResponseEntity.ok(repository.save(tarefa));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}