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
    private int timeLimit;
    private int counter=0;
    public sigekuni_run player;
     
    public MyWorld(int timeLimit)
    {   
        super(800, 400, 1); 
        this.timeLimit = timeLimit;
        /**addObject(new Start(),100,100);*/
        player=new sigekuni_run();
        addObject(player,100,100);
        //getBackground().scale( 100, 100 );
        addObject(new bird(), 300, 175);
        addObject(new tonakai(), 500, 300);
        showText( "プレゼント残り："+ timeLimit + "個", 650, 30);

    }
    public void act()
    {
        
        counter++;
        if (counter >= 60) 
        {  // 1秒に相当するフレーム数（Greenfootのフレームレートが60fpsのため）
            counter = 0;  // カウンターをリセット
            if (timeLimit > 0) 
            {
                timeLimit--;  // 残りのプレゼント数を減らす
                showText("プレゼント残り：" + timeLimit + "個", 650, 30);  // 表示を更新
                int y_s = player.getY();
                addObject(new present(),100,y_s);
                
            }
        }
        if(timeLimit <= 0)
        {
            showText( "Clear", 300, 300);
            addObject(new gameclear(), 300, 175);
            Greenfoot.stop();
        }
        if (Greenfoot.isKeyDown("r")) {
            // スペースキーが押されたらMyWorldに切り替え
            Greenfoot.setWorld(new StartWorld());
        }
        
    }
    public int get_sigekuni(){
        int y_s = player.getY();
        
        return  y_s;
        
    }
}
