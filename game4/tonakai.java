
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tonakai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tonakai extends Actor
{
    public tonakai()
    {
                GreenfootImage image = getImage();
                image.scale(512, 900);
                getImage().scale( 100, 100 );
    }
    
    public void act() 
      {
               move(-3);
               Actor actor = getOneIntersectingObject( sigekuni_run.class );
               if( actor != null ){
                   Greenfoot.stop();// sigekuni とぶつかった時の処理を書く
               }
               Actor tonakai = getOneIntersectingObject(tonakai.class);
               if(tonakai != null){
                   getWorld().removeObject( tonakai );
               }
      }
}
