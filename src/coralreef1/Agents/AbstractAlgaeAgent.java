/**
 * 
 */
package coralreef1.Agents;

import repast.simphony.space.grid.Grid;

/**
 * @author Bruno
 *
 */
public class AbstractAlgaeAgent extends AbstractAgent {
	
	public AbstractAlgaeAgent(Grid<Object> grid, int x, int y, double growthRate, int age,
			int aggressiveness) {
		super(grid, x, y, growthRate, age, aggressiveness);									
	}


}

