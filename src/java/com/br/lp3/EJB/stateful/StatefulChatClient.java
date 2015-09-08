/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.EJB.stateful;

import com.br.lp3.EJB.util.JNDIutil;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.NamingException;

/**
 *
 * @author 31427782
 */
public class StatefulChatClient {
    
    public static void main(String[] args) {
        try {
            Context context = JNDIutil.getCORBAInitialContext();
            StatefulChatRemote chat = (StatefulChatRemote) context.lookup("StatefulChat");
            Scanner Sc = new Scanner(System.in);
            System.out.println("Informe seu nome");
            String nome = Sc.nextLine();
            chat.conecta(nome);
            
            String msg = "";
            do{
               Scanner sc = new Scanner(System.in);
               msg = sc.nextLine();
               chat.diz(msg);
            } while( !msg.equalsIgnoreCase("zzz"));
            
            chat.desconecta();  
            
        } catch (NamingException ex) {
            Logger.getLogger(StatefulChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
