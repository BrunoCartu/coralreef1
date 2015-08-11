/**
 * 
 */
package coralreef1.Agents;

import repast.simphony.space.grid.Grid;

/**
 * This is that abstract Agent class that is parent to all
 * Agent class instances.
 * 
 * This defines method that have common behavior to all agents
 * and generic parameters.
 */

public abstract class AbstractAgent implements AgentInterface {
	
	protected int x;
	protected int y;
	// grid that holds all agents
	protected final Grid<Object> grid;

	// distance in centimeter that agent grows per time interval
	public final double growthRate;
	// age in time intervals
	public int age;
	// rank strength between agents
	public final int aggressiveness;
	
	// constructor
	public AbstractAgent (Grid<Object> grid, int x, int y, double growthRate,  int age, int aggressiveness) {
		this.grid = grid;
		this.growthRate = growthRate;
		this.age = age;
		this.aggressiveness = aggressiveness;
	//grid.moveTo(this, x, y);
	}
	

	@Override
	public void grow() {
		
	}
}
