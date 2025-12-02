import greenfoot.*;

public class Level_5 extends Actor
{
    public Level_5()
    {
        // Set the image/text for the Level 1 title screen
        // Example: setImage(new GreenfootImage("LEVEL 1: THE OUTSKIRTS", 40, Color.WHITE, Color.BLACK));
    }
    
private int timer = 360;
public void act()
{
    timer--;

    if (timer <= 0)
    {
        getWorld().removeObject(this);
    }
}
}