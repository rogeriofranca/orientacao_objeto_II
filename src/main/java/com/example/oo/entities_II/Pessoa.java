package com.example.oo.entities_II;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Pessoa {
    private String  nome;
    private Integer idade;
    private String nacionalidade;
    private String endereco;
    private String cpf;

    private void andar(){
        System.out.println("Andar");
    }
    public void respirar(){
        System.out.println("Respirar");

    }
}
