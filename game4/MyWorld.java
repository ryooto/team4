 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    
    public MyWorld()
    {   
       
        super(800, 400, 1); 
        /**addObject(new Start(),100,100);*/
       
        addObject(new sigekuni_run(),100,100);
        addObject(new bird(), 300, 175);
        addObject(new tonakai(), 500, 300);
        
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("r")) {
            // スペースキーが押されたらMyWorldに切り替え
            Greenfoot.setWorld(new StartWorld());
        }
    }
}
