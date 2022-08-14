package com.demo.academy.demo.service.iml;

import com.demo.academy.demo.entity.Aluno;
import com.demo.academy.demo.entity.AvaliacaoFisica;
import com.demo.academy.demo.form.AlunoForm;
import com.demo.academy.demo.form.AlunoUpdateForm;
import com.demo.academy.demo.repository.AlunoRepository;
import com.demo.academy.demo.service.IAlunoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
@AllArgsConstructor
public class AlunoServiceImpl implements IAlunoService {


    private AlunoRepository repository;


    public Aluno create(AlunoForm form) {

        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return  repository.save(aluno);

    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        return null;
    }

    /*
    public Aluno get(Long id) {
        return null;
    }
    public List<Aluno> getAll(String dataDeNascimento){

        if ((dataDeNascimento == null)){
            return repository.findAll();
        }else {
            LocalDate localDate = LocalDate.parse(JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataDeNascimento(localDate);
        }

    }
*/
   @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    public void delete(Long id) {
    }
  @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

        Aluno aluno = repository.findById((id)).get();

        return aluno.getAvaliacaoFisicas();

    }


}



