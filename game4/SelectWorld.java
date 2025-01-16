import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectWorld extends World
{

    /**
     * Constructor for objects of class SelectWorld.
     * 
     */
    public SelectWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    private void prepare(){
        addObject(new Button("Easy", 20), 200, 200);  // 簡単: プレゼント20
        addObject(new Button("Medium", 40), 300, 200);  // 普通: プレゼント40
        addObject(new Button("Hard", 60), 400, 200);  // 難しい: プレゼント60
    }
}
