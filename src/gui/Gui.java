package gui;
import javax.swing.*;
import actions.KeyHandler;

//BenuterOberfläche
public class Gui {
    
//Variablen für die BenutzerOberfläche
    JFrame jf;
    Draw d;
    public static int width= 800, height= 600;
    public static  int xoff= 130, yoff=20;
    
    public void create(){
        //Erstellt Das Fenster
        jf = new JFrame("Snake");
        jf.setSize(width,height);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setResizable(false);
        jf.requestFocus();
        jf.setVisible(true);  
        jf.addKeyListener(new KeyHandler());  

        //Erstellt den Zeichenbereich
        d= new Draw();
        d.setBounds(0,0,width,height);
        d.setVisible(true);
        jf.add(d);

    

    }
}
