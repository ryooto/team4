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
        getImage().scale( 100, 100 );
        
    }
    
    public void act() 
    {
        // Add your action code here.
        Actor actor = getOneIntersectingObject( sigekuni_run.class );
        if( actor != null ){
            Greenfoot.stop();// TARO とぶつかった時の処理を書く
        }     
    }
}
