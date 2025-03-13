/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import static java.lang.System.out;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author kemily
 */
public class rmiWebImpl extends UnicastRemoteObject implements rmiWebInterface{
    
    public rmiWebImpl() throws RemoteException{
        super();
    }
    

    @Override
    public boolean sendMessage(String webMsg, String deskMsg) throws RemoteException {
        boolean bool = false;
        try{
          File arqWeb = new File("/home/kemily/Dados/chatterWeb.txt");
          FileWriter escWeb = new FileWriter(arqWeb, true);
          escWeb.write(webMsg);
          escWeb.close();
          File arqDesk = new File("/home/kemily/Dados/chatterDesktop.txt");
          FileWriter escDesk = new FileWriter(arqDesk, true);
          escDesk.write(deskMsg);
          escDesk.close();
          bool = true;
      } catch(Exception e){
          bool = false;
          e.printStackTrace();
      }
      return bool;
    }

    @Override
    public String showMessagesWeb() throws RemoteException {
       String sret = "";
       try{
           File arq = new File("/home/kemily/Dados/chatterWeb.txt");
           FileReader lt = new FileReader(arq);
           BufferedReader buf = new BufferedReader(lt);
           while(buf.ready()){
              sret += buf.readLine();
           }
           lt.close();
       } catch(Exception e){
           sret = "Mensagens Indisponiveis - Erro no repositorio";
           e.printStackTrace();
       }
       return sret;
    }
    
}
