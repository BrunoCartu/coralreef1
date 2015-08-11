/**
 * 
 */
package coralreef1.Agents;

import repast.simphony.space.grid.Grid;

public abstract class AbstractCoralAgent extends AbstractAgent {
	public final String species;
	public final int IDNumber;
	
	public AbstractCoralAgent(Grid<Object> grid, int x, int y, double growthRate, int age,
			int aggressiveness, String species, int IDNumber) {
		super(grid, x, y, growthRate, age, aggressiveness);
		this.species = species;
		this.IDNumber = IDNumber;
	}
}

