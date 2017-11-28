/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.util;

import org.hibernate.Session;

/**
 *
 * @author laboratorio
 */
public class Conexao {

    private Session mSession;

    public Conexao() {
    }

    public void Conectar() {
        mSession = HibernateUtil.getSessionFactory().openSession();
        mSession.beginTransaction();
    }
    public Session getSession(){
        return mSession;
    }

    public void Fechar() {
        mSession.getTransaction().commit();
        mSession.flush();
        mSession.close();
    }
}
