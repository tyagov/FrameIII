/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.viewmodel;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author laboratorio
 */
@MappedSuperclass
public abstract class AnimalViewModel {

    private String nome;
    private String anoNascimento;
    private String peso;
    private String corPelo;
    private String doencas;
    private String tratamentoEspecial;

    public AnimalViewModel() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(String anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String getDoencas() {
        return doencas;
    }

    public void setDoencas(String doencas) {
        this.doencas = doencas;
    }

    public String getTratamentoEspecial() {
        return tratamentoEspecial;
    }

    public void setTratamentoEspecial(String tratamentoEspecial) {
        this.tratamentoEspecial = tratamentoEspecial;
    }

}
