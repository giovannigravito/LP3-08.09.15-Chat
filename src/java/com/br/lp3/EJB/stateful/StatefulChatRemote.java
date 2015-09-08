/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.EJB.stateful;

import javax.ejb.Remote;

/**
 *
 * @author 31427782
 */

@Remote
public interface StatefulChatRemote {
    
    public void conecta(String nome);
    public void diz(String msg);
    public void desconecta();    
}
