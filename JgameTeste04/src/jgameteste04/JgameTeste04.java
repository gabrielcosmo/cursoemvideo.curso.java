/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgameteste04;
import jgame.*;
import jgame.platform.JGEngine;
/**
 *
 * @author gabriel cosmo
 */
public class JgameTeste04 extends JGEngine {
    public Highscore hg[] = new Highscore[10]; //ignorar isso
    Circulo c;
    Bloco bloco; //isso tbm
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new JgameTeste04(new JGPoint(640,480));
        
        System.out.println();
    }
    public JgameTeste04(JGPoint size){
        initEngine(size.x, size.y);
    }
    
    @Override
    public void initCanvas() {
        setCanvasSettings(
                20,20, 16, 16, null, JGColor.blue, null
                );
    }

    @Override
    public void initGame() {
        setFrameRate(50,2);
      c = new Circulo("Circulo",true, getMouseX(), getMouseY(),1,null);
    }
    
    @Override
    public void doFrame(){    
       // a cada frame a posição do objeto c é igualada a do mouse.
       if ((10 < getMouseX() && getMouseX() < pfWidth()-10) && (10 < getMouseY() && getMouseY() < pfHeight()-10)){
           c.setPos(getMouseX(), getMouseY()); 
       
       }
    }
    //Objeto Circulo;
    public class Circulo extends JGObject{
        
        public Circulo(String name, boolean unique_id, double x, double y, int collisionid, String gfxname) {
            super(name, unique_id, x, y, collisionid, gfxname);
        }
        
        @Override
        public void paint(){
            setColor(JGColor.orange);
            drawOval(x,y,20,20,true,true);
        }
    }
    
    public class Bloco extends JGObject{

        public Bloco(String name, boolean unique_id, double x, double y, int collisionid, String gfxname) {
            super(name, unique_id, x, y, collisionid, gfxname);
        }
        
        @Override
        public void paint(){           
        }
        
        @Override
        public void move(){          
        }
    }
}
