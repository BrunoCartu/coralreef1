/**
 * 
 */
package coralreef1.Agents;

/**
 * @author Bruno
 *
 */
import repast.simphony.space.grid.Grid;

/**
 * 
 */
public class Macroalgae extends AbstractAlgaeAgent {

	public Macroalgae(Grid<Object> grid, int x, int y,  double growthRate, int age,
			int aggressiveness) {
		super(grid, x, y, growthRate, age, aggressiveness);
	}

}