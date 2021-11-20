package game;
import gui.Gui;
import java.awt.*;
import java.util.ArrayList;

public class Snake {
//Variablen
    public static int score = 0, bestscore = 0; //Punkte und BestPunkte
    
    public static boolean waitToMove = false; //Warten

    public static Head head = new Head(7,7); //erstellt ein Kopf

    public static ArrayList<Tail> tails= new ArrayList<>(); //erstellt ein Schwanz

    public static PickUp pickup = new PickUp(); //erstellt ein PickUp

    //Fügt ein Schwanzteil hinzu
    public static void addTail(){
        if(tails.size() < 1){//wenn nur der Kopf da ist
            tails.add(new Tail(head.getX(),head.getY()));
        }else{ // wenn es schon Schwanzteile gibt
            tails.add(new Tail(tails.get(tails.size()-1).x,tails.get(tails.size()-1).y));
        }
    }

    //Bewegungen
    public static void move(){

        //Move Tails
        if(tails.size()>=2){
            for(int i = tails.size()-1; i>=1; i--){
                if(tails.get(i).isWait()){
                    tails.get(i).setWait(false);
                }
                else{
                    tails.get(i).setX(tails.get(i-1).getX());
                    tails.get(i).setY(tails.get(i-1).getY());
                }
            }
        }

        //Move first Tail to Head
        if(tails.size()>=1){
            if(tails.get(0).isWait()){
                    tails.get(0).setWait(false);
            }
            else{
                    tails.get(0).setX(head.getX());
                    tails.get(0).setY(head.getY());
                }
            
        }

        //Move Head
        switch (head.getDir()) {
            case RIGHT: //Rechts
            head.setX(head.getX()+1);
            break;

            case UP: //Oben
            head.setY(head.getY()-1);
            break;  
            
            case LEFT: //Links
            head.setX(head.getX()-1);
            break;

            case DOWN: //Unten
            head.setY(head.getY()+1);
            break;
        }
    }

    //Position to Coordiantes
    public static Point ptc(int x, int y){
        Point p = new Point(0,0);
        p.x = x*32 + Gui.xoff; //ersetzt Kordinaten zu fällt eins da ein feld 32 Pixel groß ist
        p.y = y*32 + Gui.yoff;

        return p;
    }
}
