/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import javax.swing.JFrame;

/**
 *
 * @author dani_
 */
public class Ventanagrafica extends JFrame {


    public Ventanagrafica(){
        panelprograma p1= new panelprograma();
        this.setLayout(new BorderLayout());
        this.setSize(600,420);
        this.add(p1,BorderLayout.CENTER);
        
        
    
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
