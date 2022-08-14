package com.demo.academy.demo.controller;

import com.demo.academy.demo.entity.Matricula;
import com.demo.academy.demo.form.MatriculaForm;
import com.demo.academy.demo.service.iml.MatriculaServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceIml serviceIml;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return serviceIml.create(form);
    }
        @GetMapping
        public List<Matricula> getAll() {
            return serviceIml.getAll();
        }

    }



