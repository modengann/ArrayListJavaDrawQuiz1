/**
 *  Task: Create a program that will:
 *     -Make hail constantly appear on the screen. 
 *         -Hail will be a square where the height and width are random values between 4 and 12. 
 *     -It is a windy day! The hail will fly from LEFT to RIGHT across the screen. The hail should spawn (form)
 *      at random locations across the LEFT side of the screen.
 *     -If the hail reaches the right edge of the screen, it should be removed from the screen 
 *         AND any list it may be a part of
 *     -There will be a UFO flying across the screen, if the hail touches the UFO the hail should disappear.
 * 
 *   Specifications:
 *   -You are NOT allowed to modify any code that I have written for you. 
 *   -Use appropriate loops! Not everything is a for-each loop, not everything should be a while loop.
 *   -Create methods, high level work will not have all of the code written in the start() method!
 * 
 *   A+ level work:
 *   Add a creative twist of your own with explanatory comments. Any extra work should demonstrate mastery
 *   of both ArrayLists and their usage with JavaDraw. For example, play with what happens to the UFO when hit by hail
 * 
 */

import javadraw.*;
import java.util.*;


public class App extends Window{
    public static void main(String[] args) throws Exception {
        Window.open();
    }

    public void start(){
        Oval ufo = new Oval(screen, 500, 100, 100, 100);
        ufo.color(new Color(110,149,152));
        int ufoDirection = 1;

        while(true){
            ufoDirection = ufoMove(ufo, ufoDirection);

            screen.update();
            screen.sleep(1/30.0);
        }

    }

    public int ufoMove(Oval o, int direction){
        
        if(o.y() <= 0 || o.y() + o.height() >= screen.height()){
            direction *= -1;
        }
        o.move(0, 7*direction);
        return direction;
    }


}
