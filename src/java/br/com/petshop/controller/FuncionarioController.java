/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author laboratorio
 */
@Named(value = "funcionarioController")
@SessionScoped
public class FuncionarioController implements Serializable {

    /**
     * Creates a new instance of FuncionarioController
     */
    public FuncionarioController() {
    }
    
}
