import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tonakai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tonakai extends Actor
{
    private GreenfootImage img_bkup = null;
      private int width=50;
      private int height= 50;

      public tonakai()
      {
               img_bkup = new GreenfootImage( getImage() );
               getImage().scale( width,height );
      }
    
      public void act() 
      {
               GreenfootImage img = new GreenfootImage(img_bkup);
               // (注意) scale で画像サイズを変更してから setImage すること
               img.scale( width++,height++ );
               setImage(img);
      } 
}
