package dev.wakandaacademy.produdoro.tarefa.application.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import dev.wakandaacademy.produdoro.tarefa.domain.Tarefa;

public interface TarefaRepository {

    Tarefa salva(Tarefa tarefa);
    Optional<Tarefa> buscaTarefaPorId(UUID idTarefa);
	List<Tarefa> buscaTodasAsTarefasDoUsuario(UUID idUsuario);
	void deletaTodasAsTarefasDoUsuario(List<Tarefa> tarefasDoUsuario);
}
