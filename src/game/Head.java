package game;

//Definitionen des Kopfes
public class Head {
//Variablen 
    Dir dir = Dir.RIGHT; //richtung
    int x,y;
//Konstructor
    public Head(int x, int y){
        this.x= x;
        this.y= y;
    }
//Methoden
    public Dir getDir(){
        return dir;
    }

    public void setDir(Dir dir){
        this.dir = dir;
    }
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
