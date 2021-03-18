/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADP.model;

import java.time.LocalDate;


/**
 *
 * @author lucas
 */
public class Equipamento {
    
    private int id;
    private String nome;
    private String preco;
    private String serie;
    private String data_fabricacao;
    private String fabricante;
    
    
    public Equipamento(){
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getData_fabricacao() {
        return data_fabricacao;
    }

    public void setData_fabricacao(String data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Equipamento{" + "id=" + id + ", nome=" + nome + ", preco=" + preco + ", serie=" + serie + ", data_fabricacao=" + data_fabricacao + ", fabricante=" + fabricante + '}';
    }

   
    
}
