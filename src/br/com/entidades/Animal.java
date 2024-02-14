package br.com.entidades;

//        ◦ Animal
//            ▪ Abstrata
//            ▪ Variáveis:
//        • id: int
//                • nome: String

public abstract class Animal {
    protected int id;
    protected String nome;

    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
