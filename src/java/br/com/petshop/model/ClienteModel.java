/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.model;

import br.com.petshop.util.Conexao;
import br.com.petshop.viewmodel.ClienteViewModel;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class ClienteModel {

    private Conexao conectar;

    public ClienteModel() {

    }

    public void setSalvarCliente(ClienteViewModel cliente) {
        conectar.Conectar();
        conectar.getSession().save(cliente);
        conectar.Fechar();
    }

    public ClienteViewModel getBuscaCliente(Long id) {
        conectar.Conectar();
        ClienteViewModel cliente;
        cliente = (ClienteViewModel) conectar.getSession().load(ClienteViewModel.class, id);
        conectar.Fechar();
        return cliente;
    }

    public List<ClienteViewModel> getAllClientes() {
        conectar.Conectar();
        List<ClienteViewModel> clientes;
        clientes = conectar.getSession().createQuery("from ClienteViewModel").list();
        return clientes;
    }

    public void setAtualizarCliente(Long id) {
        conectar.Conectar();
        ClienteViewModel cliente;
        cliente = getBuscaCliente(id);
        conectar.getSession().update(cliente);
    }

    public void setDeletarCliente(Long id) {
        conectar.Conectar();
        ClienteViewModel cliente;
        cliente = getBuscaCliente(id);
        conectar.getSession().delete(cliente);
        conectar.Fechar();
    }
}
