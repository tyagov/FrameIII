/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.model;

import br.com.petshop.util.Conexao;
import br.com.petshop.viewmodel.CachorroViewModel;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class CachorroModel {

    private Conexao conectar = new Conexao();

    public CachorroModel() {

    }

    public void salvarCachorro(CachorroViewModel cachorro) {
        conectar.Conectar();
        conectar.getSession().save(cachorro);
        conectar.Fechar();
    }

    public CachorroViewModel getCachorro(Long id) {
        CachorroViewModel cachorro;
        cachorro = (CachorroViewModel) conectar.getSession().load(CachorroViewModel.class, id);
        conectar.Fechar();
        return cachorro;
    }

    public List<CachorroViewModel> getAllCachorros() {
        conectar.Conectar();
        List<CachorroViewModel> cachorros;
        cachorros = conectar.getSession().createQuery("from CachorroViewModel").list();
        conectar.Fechar();
        return cachorros;
    }

    public void setDeletarCachorro(Long id) {
        conectar.Conectar();
        CachorroViewModel cachorro = getCachorro(id);
        conectar.getSession().delete(cachorro);
        conectar.Fechar();
    }

    public void setAtualizarCachorro(Long id) {
        conectar.Conectar();
        CachorroViewModel cachorro = getCachorro(id);
        conectar.getSession().update(cachorro);
        conectar.Fechar();
    }

}
