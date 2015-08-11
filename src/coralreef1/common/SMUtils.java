/**
 * 
 */
package coralreef1.common;

import java.util.ArrayList;
import java.util.List;

import repast.simphony.query.space.grid.GridCell;
import repast.simphony.space.grid.Grid;
import repast.simphony.util.ContextUtils;


/**
 * @author Bruno
 *
 */
public class SMUtils {

		// general getGrid() function that return the grid of the object concerned
		public static Grid<Object> getGrid(final Object o){
			@SuppressWarnings("unchecked")
			final Grid<Object> grid = (Grid<Object>) ContextUtils.getContext(o).getProjection(Constants.GRID_ID);
			return grid;
		}
		
		// generalized method that makes a list (ret) of neighboring cells that are empty
		public static <T> List<GridCell<T>> getFreeGridCells(final List <GridCell<T>> neighborhood){  
			if (null == neighborhood){
				throw new IllegalArgumentException("Parameter neighborhood cannot be null.");
			}
			final ArrayList<GridCell<T>> ret = new ArrayList<GridCell<T>>();
			
			for (final GridCell<T> act : neighborhood){                                               // act is one of the cell of the list neighborhood
				if (0 == act.size()){                                                                 // if act is empty, 
					ret.add(act); 																	  // act is added to the list ret
				}
			}
			
			return ret;
		}
		
		// method that counts the agents 
		public static List<Object> countAgents ()
}
