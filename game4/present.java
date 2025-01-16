import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class present here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class present extends Actor
{   private int  y_p;//((MyWorld) getWorld()).get_sigekuni();
    private int  x_p=100;
    private boolean isFirstUpdate = true; 
    /**
     * Act - do whatever the present wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add yoaction code here.
     
     
     
      if (isFirstUpdate) {
            y_p = ((MyWorld) getWorld()).get_sigekuni(); // 最初の一回だけ呼び出す
            isFirstUpdate = false; // フラグを更新
        }
     y_p+=3;
     x_p-=1;
     setLocation(x_p,y_p);
     if( isAtEdge() ){
    getWorld().removeObject( this );
}
}    
}
