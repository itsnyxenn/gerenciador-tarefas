package com.nyxenn.gerenciadortarefas.repository;

import com.nyxenn.gerenciadortarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}