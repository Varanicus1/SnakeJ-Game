package clocks;
import actions.Collision;
import game.Snake;

//Aus der Datei wird das Ganze spiel ausgeführt und alle Bewegung oder Kollisionen aufgerufen 
public class GameClock extends Thread
//variablen
    public static boolean running=true;

    public void run(){
        while(running){ //schleife läuft unendlich da running immer true
            try{
                sleep(200);
                Snake.move(); //Bewegung der Schlange wird aufgerufen
                Snake.waitToMove= false; //Das die schlange warten muss wird auf falsch gesetzt
                Collision.collidePickUp(); //Kollision mit dem PickUp

                //Kollision mit sich selbst
                if(Collision.collideSelf()){ 
                    Snake.tails.clear(); //Schwanz wird gelöscht
                    Snake.score = 0; // Punkte werden auf null gesetzt
                }

                //Kollision mit der Wand
                if(Collision.collideWall()){
                    Snake.tails.clear(); //Schwanz wird gelöscht
                    Snake.head.setX(7); // Der Kopf wird in die Mitte des Spielfeldes gesetzt
                    Snake.head.setY(7);
                    Snake.score = 0;  // Punkte werden auf null gesetzt
                }


            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}
