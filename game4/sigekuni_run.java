import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sigekuni_run here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sigekuni_run extends Actor
{  private int  y=100;
   private double g = 0;
   
     public void act() 
    {
        //Add your action code here.
        getImage().scale( 50, 50 );
        g+=0.05;
        y+=g;
        setLocation(100,y);
        setRotation((int)(g * 15));
        if( Greenfoot.isKeyDown( "space" ) )
        {
                g=-1.3;
                
        }
        
        Actor actor = getOneIntersectingObject( bird.class );
        if( actor != null ){
    // TARO とぶつかった時の処理を書く
            getWorld().showText( "dead", 100, 50 );
            getWorld().addObject(new gemeover(), 300, 175);
            Greenfoot.stop();
        }
        Actor actor2 = getOneIntersectingObject( tonakai.class );
        if( actor2 != null ){
    // TARO とぶつかった時の処理を書く
            getWorld().showText( "dead", 100, 50 );
            getWorld().addObject(new gemeover(), 300, 175);
            Greenfoot.stop();
        }
        if(getY()>=399 ){
            getWorld().showText( "dead", 100, 50 );
            getWorld().addObject(new gemeover(), 300, 175);
            Greenfoot.stop();
        }
        if(getY()<=1 ){
             getWorld().showText( "dead", 100, 50 );
            getWorld().addObject(new gemeover(), 300, 175);
            Greenfoot.stop();
        }
}
          }
         