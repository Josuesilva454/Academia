package com.demo.academy.demo.form;

import com.demo.academy.demo.entity.Aluno;

import java.time.LocalDateTime;

public class MatriculaForm {

    private Long AlunoId;
    private Aluno aluno;
    private LocalDateTime dataMatricula;

    public Long getAlunoId() {
        return AlunoId;
    }

    public void setAlunoId(Long alunoId) {
        AlunoId = alunoId;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public LocalDateTime getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDateTime dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
