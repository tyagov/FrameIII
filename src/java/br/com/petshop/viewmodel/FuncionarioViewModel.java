/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.viewmodel;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author laboratorio
 */
@Entity
@Table(name = "Funcionario")
public class FuncionarioViewModel extends PessoaViewModel implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    public FuncionarioViewModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
