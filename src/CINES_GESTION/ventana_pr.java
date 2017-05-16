/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CINES_GESTION;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dani_
 */
public class ventana_pr extends JFrame {
      static JLabel jl_logo,jl_titulo,jl_foot;
      static JMenuBar JMB_barramenu;
      static JMenu JM_archivo,JM_opciones;
      static JMenuItem JMI_abrir,JMI_guardar_proyecto,JMI_guardar_proyecto_como,JMI_guardar_foto,JMI_ajustes;
      static JPanel jp_logo,jp_nav,jp_section,jp_foot,jp_titulo,jp_contenido;
      static JButton jb_altacine,jb_bajacine,jb_modcine,jb_listcine;
      
      
      
    
   
public ventana_pr() {
       
                initVentanaPrincipal(this.initMenuInicial());
      
    }

    private void initVentanaPrincipal(JPanel jp_section) {
     
      
      
      
      JPanel jp_sectionvpr=null;
        this.getContentPane().remove(jp_sectionvpr);
       
       
      
       
       
      
        jl_logo= new JLabel("MANAGER");
        jl_foot= new JLabel("Creado por dani bellver martinez");
        
        JMB_barramenu= new JMenuBar();
        JM_archivo=new JMenu("Archivo");
        JM_opciones=new JMenu("Opciones");
        JMI_abrir=new JMenuItem("arbir archivo");
        JMI_guardar_proyecto= new JMenuItem("Guardar proyecto");
        JMI_guardar_proyecto_como=new JMenuItem("Guardar como");
        JMI_guardar_foto=new JMenuItem("Exportar alineacion");
        JMI_ajustes=new JMenuItem("ajustes");
        
        this.setLayout(new BorderLayout());
        
        JMB_barramenu.add(JM_archivo);
        JMB_barramenu.add(JM_opciones);
        JM_archivo.add(JMI_abrir);
        JM_archivo.add(JMI_guardar_proyecto);
        JM_archivo.add(JMI_guardar_proyecto_como);
        JM_archivo.add(JMI_guardar_foto);
        JM_opciones.add(JMI_ajustes);
        this.setJMenuBar(JMB_barramenu);
        
        
        
        jp_nav=new JPanel();
        jp_nav.setLayout(new GridLayout(4,1));
        jb_listcine=new JButton("Listar cines");
        jb_altacine= new JButton("Dar de alta");
        jb_bajacine= new JButton("Dar de baja");
        jb_modcine=new JButton("modificar cine");
        
        jp_nav.add(jb_listcine);
        jp_nav.add(jb_altacine);
        jp_nav.add(jb_bajacine);
        jp_nav.add(jb_modcine);
        
        jp_foot= new JPanel();
        jp_foot.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp_foot.add(jl_foot);
        
        jp_sectionvpr=jp_section;
        this.add(jp_nav,BorderLayout.WEST);
        this.add(jp_sectionvpr,BorderLayout.CENTER);
        this.add(jp_foot,BorderLayout.SOUTH);
        
        
        
         this.setSize(800, 600);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private JPanel initMenuInicial() {
         JTextField jt_user,jt_pass;
         JLabel jl_user,jl_pass;
         JButton jb_insesion, jb_recucon;
        
        jp_section=new JPanel();
        jp_section.setLayout(new GridLayout(3,2));
        jp_section.setSize(30,60);
        
        
        
        jl_user=new JLabel("usuario");
        jl_pass=new JLabel("Constraseña");
        jt_user=new JTextField("usuario");
        jt_pass=new JTextField("Contraseña");
        jb_insesion=new JButton("Iniciar sesion");
        jb_recucon=new JButton("Recuperar clave");
        
        
        jp_section.add(jl_user);
        jp_section.add(jt_user);
        jp_section.add(jl_pass);
        jp_section.add(jt_pass);
        jp_section.add(jb_insesion);
        jp_section.add(jb_recucon);
        
          return jp_section;
        
    }
    private JPanel initListarcines(){
        jp_section=new JPanel();
        return jp_section;
    }
    private JPanel initaltacine(){
        
        //creacion panele principal, secundarios y contenido
        jp_section=new JPanel();
        jp_section.setLayout(new BorderLayout());
        
        
         jp_titulo=new JPanel();
         jl_titulo=new JLabel("Dar de alta");
         jp_contenido=new JPanel();
         jp_contenido.setLayout(GridLayout(3,2));
         jl_nombre=new JPanel();
         jl_poblacion=new JPanel();
         //creacion interfaz de contenido
         jl_
         
        
              
         
         
         
         
         //añadir contenido a los paneles
         jp_titulo.add(jl_titulo);
         
         
         //añadir paneles al jp_section
         jp_section.add(jl_titulo,BorderLayout.NORTH);
         
         
        
         
         
         
            
        
        
        
        
        return jp_section;
    }
    private JPanel initmodcine(){
        jp_section=new JPanel();
            
        
        
        
        
        return jp_section;
        
    }
    private JPanel initbajacine(){
        jp_section=new JPanel();
            
        
        
        
        
        return jp_section;
    }

   
    
    
}

 
