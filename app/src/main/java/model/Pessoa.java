package application.model;


import jakarta.persistente.id;
import jakarta.persistente.GeneratedValue;
import jakarta.persistente.Generation;


import jakarta.persistente.Entity;

import jakarta.persistente.Table;


@Entity 
@Table(name = "pessoas")

public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    private int idade;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
