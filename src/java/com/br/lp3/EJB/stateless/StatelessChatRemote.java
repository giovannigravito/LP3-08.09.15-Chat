package com.br.lp3.EJB.stateless;

import javax.ejb.Remote;

/**
 *
 * @author 1147106
 */
@Remote
public interface StatelessChatRemote {
    public void conecta();
    public void diz(String msg);
    public void desconecta();
}
