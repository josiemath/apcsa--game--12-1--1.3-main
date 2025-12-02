import greenfoot.*;

public class Level_4 extends Actor
{
    public Level_4()
    {
        //
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