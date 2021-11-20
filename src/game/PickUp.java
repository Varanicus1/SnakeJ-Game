package game;
import java.util.concurrent.ThreadLocalRandom;

public class PickUp {
//Variablen
    int x,y;
//Konstructor PickUp bekommt Random Kordinaten    
     public PickUp (){
         this.x = ThreadLocalRandom.current().nextInt(0, 15);
         this.y = ThreadLocalRandom.current().nextInt(0, 15);
     }
//PickUp bekommt Random Kordinaten
     public void reset(){ //aufruf bei kollisiob
        this.x = ThreadLocalRandom.current().nextInt(0, 15);
        this.y = ThreadLocalRandom.current().nextInt(0, 15);
     }
//Methoden
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    
}
