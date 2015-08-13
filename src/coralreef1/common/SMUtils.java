/**
 * 
 */
package coralreef1.common;

import java.util.ArrayList;
import java.util.List;

import coralreef1.Agents.Macroalgae;
import repast.simphony.engine.environment.RunState;
import repast.simphony.query.space.grid.GridCell;
import repast.simphony.space.grid.Grid;
import repast.simphony.util.ContextUtils;




/**
 * @author Bruno
 *
 */
public class SMUtils {

		// general getGrid() function that return the grid of the object concerned
//		public static Grid<Object> getGrid(final Object o){
//			@SuppressWarnings("unchecked")
//			final Grid<Object> grid = (Grid<Object>) ContextUtils.getContext(o).getProjection(Constants.GRID_ID);
//			return grid;
//		}
		
		// generalized method that makes a list (ret) of neighboring cells that are empty
//		public static <T> List<GridCell<T>> getFreeGridCells(final List <GridCell<T>> neighborhood){  
//			if (null == neighborhood){
//				throw new IllegalArgumentException("Parameter neighborhood cannot be null.");
//			}
//			final ArrayList<GridCell<T>> ret = new ArrayList<GridCell<T>>();
//			
//			for (final GridCell<T> act : neighborhood){                                               // act is one of the cell of the list neighborhood
//				if (0 == act.size()){                                                                 // if act is empty, 
//					ret.add(act); 																	  // act is added to the list ret
//				}
//			}
//			return ret;
//		}
		
		// returns a arrayList of macroalgae agents
//		public static ArrayList<Macroalgae> getMacroalgaeList(){   
//			final Iterable<Macroalgae> macroagents = RunState.getInstance().getMasterContext().getObjects(Macroalgae.class); // " get a reference to the current master context (since we have only that context) from the RunState instance assigned to the simulation, and query all of the Bug agents by specifying their class instance to the getObjects() function" ??
//			final ArrayList<Macroalgae> macroalgaeList = new ArrayList<Macroalgae>();
//			for (final  Macroalgae macro : macroagents){
//				macroalgaeList.add(macro);
//			}
//			return macroalgaeList;
//		}
//		
		// final Iterable<Macroalgae> macroagents = RunState.getInstance().getMasterContext().getObjects(Macroalgae.class);
		
//		private ArrayList<Bug> getBugList(){    // returns the list bugList of bugs in the model
//			@SuppressWarnings("unchecked")
//			final Iterable<Bug> bugs = RunState.getInstance().getMasterContext().getObjects(Bug.class); // " get a reference to the current master context (since we have only that context) from the RunState instance assigned to the simulation, and query all of the Bug agents by specifying their class instance to the getObjects() function" ??
//			final ArrayList<Bug> bugList = new ArrayList<Bug>();
//			for (final Bug bug : bugs){
//				bugList.add(bug);
//			}
//			return bugList;
//		}
		
		// method that counts the agents from the arrayList made by the 'getAgentList()' method
		
		
//		public Grid<Object> getGrid(){             // acquire the reference of a projection from the context the agent is associated with (the grid)
//			@SuppressWarnings("unchecked")
//			final Grid<Object> grid = (Grid<Object>) ContextUtils.getContext(this)
//					.getProjection(Constants.GRID_ID);
//			if (null == grid){															// in the stupid model files
//				throw new IllegalStateException("cannot locate grid in context");
//			}
//			return grid;
//		}
		
//		public static Grid<Object> getGrid(final Object o){
//			@SuppressWarnings("unchecked")
//			final Grid<Object> grid = (Grid<Object>) ContextUtils.getContext(o).getProjection(Constants.GRID_ID);
//			return grid;
//		}
		
		
}
