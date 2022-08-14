package com.demo.academy.demo.controller;


import com.demo.academy.demo.entity.Aluno;
import com.demo.academy.demo.entity.AvaliacaoFisica;
import com.demo.academy.demo.form.AvaliacaoFisicaForm;
import com.demo.academy.demo.service.iml.AvaliacaoFisicaServiceIml;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
   @Autowired
    private AvaliacaoFisicaServiceIml service;

    @PostMapping
    public AvaliacaoFisica create (@RequestBody AvaliacaoFisicaForm form) {
        return  service.create(form);

    }


}
