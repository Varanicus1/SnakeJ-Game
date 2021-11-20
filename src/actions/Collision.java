package actions;
import game.Snake;

//Überprüft auf Kollision
public class Collision {

    //wenn es mit sich selbst Kollidiert
    public static boolean collideSelf(){

        //wenn der Kopf ein teil von dem Schwanz triftt
        for(int i = 0; i<Snake.tails.size(); i++){
            if(Snake.head.getX() == Snake.tails.get(i).getX() && Snake.head.getY() == Snake.tails.get(i).getY() && !Snake.tails.get(i).isWait()){
                 return true;
            }
        }
        return false;
    }

    //wenn es mit der Wand Kollidiert
    public static boolean collideWall(){ 

        //sobald der Spieler den Bereich verlässt
        return (Snake.head.getX()<0 || Snake.head.getX()>15 || Snake.head.getY()<0 || Snake.head.getY()>15);
    }
    
    //wenn es mit dem Apfel/Gegenstand Kollidiert
    public static void collidePickUp(){

        //sobald der Spieler auf das PickUp trifft
        if(Snake.head.getX() == Snake.pickup.getX() && Snake.head.getY() == Snake.pickup.getY()){
            Snake.pickup.reset(); // neues PickUp wird erstellt
            Snake.addTail(); // Die Schlange wird Größer
            Snake.score +=1; // Die Punkte werden erhöht

            //falls neue Punkte höher als bestePunkte werden BestePunkte überschrieben
            if(Snake.score > Snake.bestscore) { 
                Snake.bestscore = Snake.score;
            }
        }
    }
    
}
