/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.controller;

import br.com.petshop.model.ClienteModel;
import br.com.petshop.viewmodel.ClienteViewModel;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author laboratorio
 */
@Named(value = "clienteController")
@SessionScoped
public class ClienteController implements Serializable {

    /**
     * Creates a new instance of ClienteController
     */
    private ClienteViewModel cliente;
    private ClienteModel saveCliente;
    private List<ClienteViewModel> clientes;

    public ClienteController() {
    }

    public void setSalvarCliente(ClienteViewModel cliente) {
        this.saveCliente.setSalvarCliente(cliente);
    }

    public List<ClienteViewModel> getAllClientes() {
        this.clientes = this.saveCliente.getAllClientes();
        return this.clientes;
    }

    public ClienteViewModel getCliente(Long id) {
        this.cliente = this.saveCliente.getBuscaCliente(id);
        return this.cliente;
    }

    public void setDeletarCliente(Long id) {
        this.saveCliente.setDeletarCliente(id);
    }
    public void setAtualizarCliente(Long id){
        this.saveCliente.setAtualizarCliente(id);
    }

}
