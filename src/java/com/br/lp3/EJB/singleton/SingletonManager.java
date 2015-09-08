package com.br.lp3.EJB.singleton;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author 1147106
 */
@Singleton //EJB singleton
@LocalBean //Não possui interface local
@WebListener // Define um listener de sessão
@Startup // Inicializar quando o server subir 
public class SingletonManager implements HttpSessionListener{

    private int contador = 0;

    public SingletonManager() {
        System.out.println("Singleton Construído");
    }
    
    
    
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        contador++;
        System.out.println("Usuários ativos: "+contador);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        contador--;
        System.out.println("Usuários ativos: "+contador);
    }
    
    @PostConstruct
    public void init()
    {
        contador = 0;
        System.out.println("construído");
    }
    
    @PreDestroy
    public void destroy()
    {
        System.out.println("Destruído");
    }
    
}
