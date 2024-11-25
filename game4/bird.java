import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bird extends Actor
{
    public bird(){
        GreenfootImage image = getImage();
        image.scale(512, 900);
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Jugador.isAlive()){
            setLocation(getX() - 1, getY());
        }
        if(getX() <= 1){
            setLocation(getX() + 700, 75 + Greenfoot.getRandomNumber(225));
        }
        if (Greenfoot.isKeyDown("r"))
        {
            getWorld().removeObject(this);
        }
    }
}
