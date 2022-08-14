package com.demo.academy.demo.repository;

import com.demo.academy.demo.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findByDataDeNascimento(LocalDate localDate);
}
