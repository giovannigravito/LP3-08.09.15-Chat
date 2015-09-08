package com.br.lp3.EJB.stateless;

import com.br.lp3.EJB.util.JNDIutil;
import java.util.Scanner;
import javax.naming.Context;

/**
 *
 * @author 1147106
 */
public class StatelessChatClient {
    public static void main(String[] args) {
        try{
            Context context = JNDIutil.getCORBAInitialContext();
            StatelessChatRemote chat = (StatelessChatRemote)context.lookup("StatelessChat");
            chat.conecta();
            
            String msg = "";
            do{
               Scanner sc = new Scanner(System.in);
               msg = sc.nextLine();
               chat.diz(msg);
            } while( !msg.equalsIgnoreCase("zzz"));
            
            chat.desconecta();            
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
