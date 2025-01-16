import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String difficulty;
    private int timeLimit;

    public Button(String difficulty, int timeLimit) {
        this.difficulty = difficulty;
        this.timeLimit = timeLimit;
        setImage(new GreenfootImage(difficulty, 24, Color.BLACK, Color.WHITE));
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MyWorld(timeLimit));  // 選択された時間を渡してゲーム本編へ
        }
    }
}
