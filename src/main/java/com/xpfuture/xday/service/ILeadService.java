package com.xpfuture.xday.service;

import com.xpfuture.xday.entity.form.LeadForm;
import com.xpfuture.xday.entity.Lead;

import java.util.List;

public interface ILeadService {
    /**
     * Cria um Aluno e salva no banco de dados.
     *
     * @param form - formulário referente aos dados para criação de um Aluno no banco de dados.
     * @return - Aluno recém-criado.
     */
    Lead create(LeadForm form);

    /**
     * Retorna um Aluno que está no banco de dados de acordo com seu Id.
     *
     * @param id - id do Aluno que será exibido.
     * @return - Aluno de acordo com o Id fornecido.
     */
    Lead get(Long id);

    /**
     * Retorna todos os Alunos que estão no banco de dados.
     *
     * @return - Uma lista os Alunos que estão salvas no DB.
     */
    List<Lead> getAll();

    /**
     * Deleta um Aluno específico.
     *
     * @param id - id do Aluno que será removido.
     */
    void delete(Long id);
}
