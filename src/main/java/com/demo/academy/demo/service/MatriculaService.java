package com.demo.academy.demo.service;

import com.demo.academy.demo.entity.AvaliacaoFisica;
import com.demo.academy.demo.entity.Matricula;
import com.demo.academy.demo.form.AvaliacaoFisicaUpdateForm;
import com.demo.academy.demo.form.MatriculaForm;

import java.util.List;

public interface MatriculaService {

    Matricula create(MatriculaForm form);


    Matricula get(Long id);


    List<Matricula> getAll();


    Matricula update(Long id, MatriculaForm formUpdate);

    void delete(Long id);

}
