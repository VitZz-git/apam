package dev.java10x.apam;

import jakarta.persistence.*;

//entity transforma uma classe em uma entidade do banco de dados
@Entity
//table cria um nome para a tabela
@Table(name = "tb_cadastro")


public class NinjaModel {

    //Id informa ao java que ele deve criar uma id automaticamente para uma informação
    @Id
    //GeneratedVlaue informa ao java que ele deve gerar um valor para essas ids de maneira numérica sequencial, por exemplo, 1, 2, 3, 4
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
