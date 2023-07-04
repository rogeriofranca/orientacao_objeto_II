package com.example.oo;

import com.example.oo.entities.Genero;
import com.example.oo.entities.Especie;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OoApplication {


	public static void main(String[] args) {
		Genero objeto1 = new Genero("Serpente",100,Especie.REPTEIS);
		Genero objeto2 = new Genero("Humano",90,Especie.MAMIFEROS);
		Genero objeto3 = new Genero("Aguia", 10,Especie.AVES);
		Genero objeto4 = new Genero("Sapo", 77,Especie.ANFIBIOS);
		Genero objeto5 = new Genero("Peixe", 20,Especie.PEIXES);

		objeto1.rastejar();
		objeto2.correr();
		objeto3.voar();
		objeto4.pular();
		objeto5.nadar();

	}

}
