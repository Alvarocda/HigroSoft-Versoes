/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ConsomeArduinoDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Principal;

/**
 *
 * @author Alvaro
 */
public class ThreadsPrincipal implements Runnable{
    Principal atualizaView = new Principal();
    private Thread thread = null;

    @Override
    public void run() {
        atualizaView.AtualizaView();
    }
    
    
    
    
    
    
}
