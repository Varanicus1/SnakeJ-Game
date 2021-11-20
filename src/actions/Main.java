package actions; // In welchem Order es sich befindet

import clocks.GameClock;
import gui.Gui; // wenn Datein in unterordnern liegen muss man diese aus dem Ordner importierren

//Ist die ausführende Datei welche Die BenutzerOberfläche und die Run time datei für das Spiel
public class Main {
    public static void main(String[] args) throws Exception {
        Gui g=new Gui();
        GameClock gc= new GameClock();

        g.create(); //erstellt das Gui
        gc.start(); // lasst die GameClock starten
        
       
    }
}
