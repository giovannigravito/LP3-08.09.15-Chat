package com.br.lp3.EJB.stateless;

import javax.ejb.Stateless;

/**
 *
 * @author 1147106
 */
@Stateless(mappedName = "StatelessChat")
public class StatelessChat implements StatelessChatRemote{
    
    private String nome = "Anônimo";

    @Override
    public void conecta() {
        System.out.println("Usuário "+nome+" conectado");
    }

    @Override
    public void diz(String msg) {
        System.out.println(nome+" diz: "+msg);
    }

    @Override
    public void desconecta() {
        System.out.println("Usuário "+nome+" desconectado");
    }
    
    
}
