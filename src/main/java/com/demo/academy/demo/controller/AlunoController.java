package com.demo.academy.demo.controller;

import com.demo.academy.demo.entity.Aluno;
import com.demo.academy.demo.entity.AvaliacaoFisica;
import com.demo.academy.demo.form.AlunoForm;
import com.demo.academy.demo.service.iml.AlunoServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@AllArgsConstructor
public class AlunoController {

    @Autowired
    private AlunoServiceImpl alunoService;



    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return alunoService.create(form);
    }
    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica>geAlltAvaliacaoFisica(@PathVariable Long id){
        return  alunoService.getAllAvaliacaoFisicaId(id);
    }


}
