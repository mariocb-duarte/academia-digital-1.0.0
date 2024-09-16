package com.xpfuture.xday.service;

import com.xpfuture.xday.entity.form.LeadForm;
import com.xpfuture.xday.entity.Lead;

import java.util.List;

public interface ILeadService {
    /**
     * Cria um Lead e salva no banco de dados.
     *
     * @param form - formulário referente aos dados para criação de um Lead no banco de dados.
     * @return - Lead recém-criado.
     */
    Lead create(LeadForm form);

    /**
     * Retorna um Lead que está no banco de dados de acordo com seu Id.
     *
     * @param id - id do Lead que será exibido.
     * @return - Lead de acordo com o Id fornecido.
     */
    Lead get(Long id);

    /**
     * Retorna todos os Leads que estão no banco de dados.
     *
     * @return - Uma lista os Leads que estão salvas no DB.
     */
    List<Lead> getAll();

    /**
     * Deleta um Lead específico.
     *
     * @param id - id do Lead que será removido.
     */
    void delete(Long id);

    //TODO implementar método update
}
