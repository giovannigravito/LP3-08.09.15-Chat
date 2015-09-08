/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.EJB.stateful;

import javax.ejb.Stateful;

/**
 *
 * @author 31427782
 */

@Stateful(mappedName = "StatefulChat")
public class StatefulChat implements StatefulChatRemote{
    
    private String nome = "Anônimo";   
    private String msg = "Anônimo";   
    
    @Override
    public void conecta(String nome) {
        this.nome = nome;
        System.out.println("Usuário "+nome+" conectado!");
    }

    @Override
    public void diz(String msg) {
        System.out.println(nome+" diz: "+msg);
    }

    @Override
    public void desconecta() {
        System.out.println("Usuario "+nome+" desconectado!");
    }
    
}
