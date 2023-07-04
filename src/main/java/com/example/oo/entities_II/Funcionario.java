package com.example.oo.entities_II;

import com.example.oo.entities_II.enums.Experiencia;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@ToString
public class Funcionario extends Pessoa {

    private String cargo;
    private double salario;
    private Integer cargaHoraria;
    private Enum<Experiencia> experiencia;

    public Funcionario(String nome,
                       Integer idade,
                       String nacionalidade,
                       String endereco,
                       String cpf,
                       String cargo,
                       double salario,
                       Integer cargaHoraria,
                       Enum<Experiencia> experiencia) {
        super(nome, idade, nacionalidade, endereco, cpf);
        this.cargo = cargo;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", cargaHoraria=" + cargaHoraria +
                ", experiencia=" + experiencia +
                "} " + super.toString();
    }
}
