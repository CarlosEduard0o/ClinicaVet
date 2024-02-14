package br.com.entidades;

import java.util.ArrayList;
import java.util.List;

//        ◦ Cavalo
//            ▪ Herda de Animal
//            ▪ Construtor:
//        • deve receber por parâmetro o id e nome e setar em suas respectivas variáveis
public class Cavalo extends Animal {
    public Cavalo(int id, String nome) {
        setId(id);
        setNome(nome);
    }

}
