/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.controller;

import br.com.petshop.model.CachorroModel;
import br.com.petshop.viewmodel.CachorroViewModel;
import javax.inject.Named;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ApplicationScoped
@ManagedBean
public class CachorroController implements Serializable {

    /**
     * Creates a new instance of CachorroController
     */
    private CachorroViewModel cachorro = new CachorroViewModel();
    private CachorroModel saveCachorro = new CachorroModel();
    private List<CachorroViewModel> cachorros;

    public CachorroController() {

    }

    public CachorroViewModel getCachorro() {
        return cachorro;
    }

    public void setCachorro(CachorroViewModel cachorro) {
        this.cachorro = cachorro;
    }

    public void salvar() {
        saveCachorro.salvarCachorro(cachorro);
    }

    public CachorroViewModel getCachorro(Long id) {
        this.cachorro = this.saveCachorro.getCachorro(id);
        return cachorro;
    }

    public List<CachorroViewModel> getAllCachorros() {
        this.cachorros = this.saveCachorro.getAllCachorros();
        return this.cachorros;
    }

    public void setAtualizarCachorro(Long id) {
        this.saveCachorro.setAtualizarCachorro(id);
    }

    public void setDeletarCachorro(Long id) {
        this.saveCachorro.setDeletarCachorro(id);
    }

}
