package com.demo.academy.demo.service.iml;

import com.demo.academy.demo.entity.Aluno;
import com.demo.academy.demo.entity.Matricula;
import com.demo.academy.demo.form.MatriculaForm;
import com.demo.academy.demo.repository.AlunoRepository;
import com.demo.academy.demo.repository.MatriculaRepository;
import com.demo.academy.demo.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServiceIml implements MatriculaService {
    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private MatriculaRepository service;



    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return service.save(matricula);

    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    public List<Matricula> getAll() {
        return null;
    }

    @Override
    public Matricula update(Long id, MatriculaForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
