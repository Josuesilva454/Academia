package com.demo.academy.demo.service.iml;

import com.demo.academy.demo.entity.Aluno;
import com.demo.academy.demo.entity.AvaliacaoFisica;
import com.demo.academy.demo.form.AvaliacaoFisicaForm;
import com.demo.academy.demo.form.AvaliacaoFisicaUpdateForm;
import com.demo.academy.demo.repository.AlunoRepository;
import com.demo.academy.demo.repository.AvaliacaoFisicaRepository;
import com.demo.academy.demo.service.AvaliacaoFisicaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AvaliacaoFisicaServiceIml implements AvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
   public AvaliacaoFisica create(AvaliacaoFisicaForm form){

        AvaliacaoFisica avaliacaoFisica =new AvaliacaoFisica();
       Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return  avaliacaoFisicaRepository.save(avaliacaoFisica);

    }



    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}