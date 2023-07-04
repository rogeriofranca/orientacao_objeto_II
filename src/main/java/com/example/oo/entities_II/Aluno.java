package com.example.oo.entities_II;

import lombok.*;

@Data
@Getter
@Setter
public class Aluno extends Pessoa {
    private String curso;
    private String disciplina;
    private Integer CargaHoraria;

    public Aluno(String curso,
                 String disciplina,
                 Integer cargaHoraria) {
        super();
        this.curso = curso;
        this.disciplina = disciplina;
        CargaHoraria = cargaHoraria;

    }

}
