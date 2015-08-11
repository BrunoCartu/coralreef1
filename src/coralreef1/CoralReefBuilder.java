/**
 * 
 */
package coralreef1;

/**
 * @author Bruno
 *
 */

import java.util.List;

import org.apache.poi.ss.formula.functions.T;

import coralreef1.Agents.Macroalgae;
import coralreef1.common.SMUtils;
import repast.simphony.context.Context;
import repast.simphony.context.space.grid.GridFactory;
import repast.simphony.context.space.grid.GridFactoryFinder;
import repast.simphony.dataLoader.ContextBuilder;
import repast.simphony.query.space.grid.GridCell;
import repast.simphony.query.space.grid.GridCellNgh;
import repast.simphony.random.RandomHelper;
import repast.simphony.space.continuous.NdPoint;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridBuilderParameters;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.space.grid.SimpleGridAdder;
import repast.simphony.space.grid.WrapAroundBorders;
import repast.simphony.util.ContextUtils;


public class CoralReefBuilder implements ContextBuilder<Object> {

	private final int width = 50;
	private final int height = 50;
	// the % of macroalgae cover wanted
	int InitialMacroalgaeCover = 60;
	
	@Override
	public Context build(Context<Object> context) {
		
		context.setId("CONTEXT_ID");


		GridFactory gridFactory = GridFactoryFinder.createGridFactory(null);
		Grid<Object> grid = gridFactory.createGrid("grid", context, new GridBuilderParameters<Object>(
			new WrapAroundBorders(),
			new SimpleGridAdder<Object>(),
			true, width, height
		));
		// % of Macroalgae cover 
		int MacroalgaeCover = 0;
		
		while (MacroalgaeCover < InitialMacroalgaeCover){

			// define coordinate randomly within grid
			int x = RandomHelper.nextIntFromTo (0, width);
			int y = RandomHelper.nextIntFromTo(0, height);
			// creates 1 Macroalgae agent
			Macroalgae macroalgae = new Macroalgae(grid, x, y, 3, 0, 3);
			// define location of the new macroalgae agent
			final GridPoint location = new GridPoint(x,y);
			
			// creates a list of cell around the new macroalgae agent (its own cell excluded), within a squarre whose size is random
			int sizePatch = RandomHelper.nextIntFromTo(1, 5);			
			final List<GridCell<Macroalgae>> neighborhood = new GridCellNgh<Macroalgae>(
					grid, location, Macroalgae.class, 
					sizePatch, sizePatch).getNeighborhood(false);
			
			// creates a list of cells in neighborhood that are not occupied
			final List<GridCell<Macroalgae>> freeCells = SMUtils.getFreeGridCells(neighborhood);
			// if the list is empty (= there is no free cells)
			if (freeCells.isEmpty()){		
				break;
			}
			
			// create a macroalgae agent in each cell of the freeCells list
			for (final GridCell<Macroalgae> act : freeCells){
				final GridPoint locationAct = act.getPoint();		
				Macroalgae macroalgaeSister = new Macroalgae(grid, locationAct.getX(), locationAct.getY(), 3, 0, 3);
				context.add(macroalgaeSister);
				grid.moveTo(macroalgaeSister, locationAct.getX(), locationAct.getY());
			}
			
			 method that count agents in the grid count ().....
			
			
			MacroalgaeCover = count macroalgae agents / ( with * height ) * 100
		}
		
//		for (int x = 0; x < width; x++) {
//			for (int y = 0; y < height; y++) {
//				Macroalgae macroalgae = new Macroalgae(grid, x, y, 3, 0, 3);
//				context.add(macroalgae);
//				grid.moveTo(macroalgae, x, y);			
//			}
//		}

////////////// ******************** added since last meeting *****************************/////////////////////////////
		
			
////////////******************************************************************************//////////////////////////////
			
		return context;
	}

}