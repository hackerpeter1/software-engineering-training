package Part2;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class ZBugRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		
		//CircleBug alice = new CircleBug(1);
		//SpiralBug bob = new SpiralBug(1);
		ZBug c = new ZBug(4);
		//DancingBug d = new DancingBug(2);
		
		//alice.setColor(Color.orange);
		//c.setDirection(Location.EAST);
		c.setColor(Color.blue);
		c.setDirection(Location.EAST);
		//d.setColor(Color.cyan);
		
		//world.add(new Location(0,0), alice);
		//world.add(new Location(4,4),bob);
		world.add(new Location(3,3), c);
		//world.add(new Location(5,5), d);
		
		world.show();
	}
}