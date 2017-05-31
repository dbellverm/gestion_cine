/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dani_
 */
public class panelprograma extends JPanel{
 
    
    private JLabel 
      jl_cine,
      jl_sala,
      jl_film,
      jl_dur,
      jl_hin;
    private JComboBox<String>
      jc_cine,
      jc_sala;
    private JTextField
      jt_film,
      jt_dur,
      jt_hin;
    private JButton
      jb_alta,
      jb_mod,
      jb_del;
     
 public panelprograma(){
     this.initpanel();
     
     
 }           
  
 public JPanel formulario(){
     JPanel form= new JPanel();   
     form.setLayout(new GridLayout(5,2));
     
     jl_cine=new JLabel("Cines");
     jl_sala=new JLabel("Salas");
     jl_film=new JLabel("Pelicula");
     jl_dur=new JLabel("Duracion");
     jl_hin=new JLabel("Hora Inicio");
     
     jc_cine=new JComboBox();
     jc_sala=new JComboBox();
     
     jt_film=new JTextField();
     jt_dur=new JTextField();
     jt_hin=new JTextField();
     
     form.add(jl_cine);
     form.add(jc_cine);
     form.add(jl_sala);
     form.add(jc_sala);
     form.add(jl_film);
     form.add(jt_film);
     form.add(jl_dur);
     form.add(jt_dur);
     form.add(jl_hin);
     form.add(jt_hin);
     
     
     
     
     
     return form;
 }
 
 public JPanel resultado(){
       JPanel east= new JPanel(); 
     
     
       
     return east;
 }
            
 public JPanel opciones(){
     JPanel opciones=new JPanel();
     opciones.setLayout( new GridLayout(3,1));
     
     jb_alta=new JButton("Dar de alta");
     jb_mod=new JButton("Modificar");
     jb_del=new JButton("Eliminar");
     
     opciones.add(jb_alta);
     opciones.add(jb_mod);
     opciones.add(jb_del);
     
     return opciones;
 }        
 public JPanel initpanel(){
     JPanel panel=new JPanel();
     
     this.setLayout(new BorderLayout());
     
     this.add(this.opciones(), BorderLayout.WEST);
     this.add(this.formulario(),BorderLayout.CENTER);
     
     
     
     
     
     return panel;
 }

 
 
 
 
 
}
    
    


                

    
    
    
    
    

