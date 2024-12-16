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

        image.scale(50, 50);

    }
    
    public void act() 
    {
        // Add your action code here.

        setLocation(getX() - 1, getY());
        if(getX() <= 1){
            setLocation(getX() + 700, 75 + Greenfoot.getRandomNumber(225));
        }

        Actor actor = getOneIntersectingObject( sigekuni_run.class );
        
        setRotation(0);
        move(-2);
        if( actor != null ){
            Greenfoot.stop();// TARO とぶつかった時の処理を書く
        }     

    }
}
