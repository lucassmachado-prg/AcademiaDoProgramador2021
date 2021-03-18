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
public class Chamado {
    
    private int id;
    private String titulo;
    private String descricao_chamado;
    private Equipamento equipamento;
    private int eqp;
    private LocalDate data_abertura;
    
    public Chamado(){
        
        
    }

    public int getEqp() {
        return eqp;
    }

    public void setEqp(int eqp) {
        this.eqp = eqp;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao_chamado() {
        return descricao_chamado;
    }

    public void setDescricao_chamado(String descricao_chamado) {
        this.descricao_chamado = descricao_chamado;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public LocalDate getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(LocalDate data_abertura) {
        this.data_abertura = data_abertura;
    }

    

    @Override
    public String toString() {
        return "Chamado{" + "id=" + id + ", titulo=" + titulo + ", descricao_chamado=" + descricao_chamado + ", equipamento=" + equipamento + ", data_abertura=" + data_abertura + '}';
    }

    
    
    
    
}
