/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

/**
 *
 * @author Fabin_000
 */
public class Pessoa {
    String nome;
    int idade;


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

}