package com.demo.academy.demo.service;

import com.demo.academy.demo.entity.AvaliacaoFisica;
import com.demo.academy.demo.form.AvaliacaoFisicaForm;
import com.demo.academy.demo.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface AvaliacaoFisicaService {


    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    /**
     * Retorna uma Avaliação Física que está no banco de dados de acordo com seu Id.
     * @param id - id da Avaliação Física que será exibida.
     * @return - Avaliação Física de acordo com o Id fornecido.
     */
    AvaliacaoFisica get(Long id);

    /**
     * Retorna todas as Avaliações Física que estão no banco de dados.
     * @return - Uma lista com todas as Avaliações Física que estão salvas no DB.
     */
    List<AvaliacaoFisica> getAll();

    /**
     * Atualiza a avaliação física.
     * @param id - id da Avaliação Física que será atualizada.
     * @param formUpdate - formulário referente aos dados necessários para atualização da Avaliação
     * Física no banco de dados.
     * @return - Avaliação Física recém-atualizada.
     */
    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    /**
     * Deleta uma Avaliação Física específica.
     * @param id - id da Avaliação Física que será removida.
     */
    void delete(Long id);
}

