package actions;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import game.Dir;
import game.Snake;

//Integration mit der Tastatur
public class KeyHandler implements KeyListener{

    //wenn taste gedrückt wird
    @Override public void keyTyped(KeyEvent e){

    }

    //wenn taste gedrückt gehalten
    @Override public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            
            case KeyEvent.VK_W: //nach oben
            if(!(Snake.head.getDir()== Dir.DOWN) && !Snake.waitToMove){
                Snake.head.setDir(Dir.UP);
                Snake.waitToMove = true;
            }
            break;

            case KeyEvent.VK_A: // nach links
            if(!(Snake.head.getDir()== Dir.RIGHT) && !Snake.waitToMove){
                Snake.head.setDir(Dir.LEFT);
                Snake.waitToMove = true;
            }
            break;

            case KeyEvent.VK_S: //nach unten
            if(!(Snake.head.getDir()== Dir.UP) && !Snake.waitToMove){
                Snake.head.setDir(Dir.DOWN);
                Snake.waitToMove = true;
            }
            break;

            case KeyEvent.VK_D: //nach rechts
            if(!(Snake.head.getDir()== Dir.LEFT) && !Snake.waitToMove){
                Snake.head.setDir(Dir.RIGHT);
                Snake.waitToMove = true;
            }
            break;
        }
    }
    //wenn taste losgellasen wird
    @Override public void keyReleased(KeyEvent e){

    }
    
}
