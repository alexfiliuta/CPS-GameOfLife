package org.gol.validation;

import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.gol.gol.Condition;
import org.gol.gol.GolPackage;
import org.gol.gol.Grid;
import org.gol.gol.PopulatedCell;
import org.gol.gol.Rule;
import org.gol.gol.Rules;

@SuppressWarnings("all")
public class GolValidator extends AbstractGolValidator {
  public static final String INVALID_NEIGHBOR_COUNT = "invalidNeighborCount";

  @Check
  public void checkIfValidNumberOfNeighbors(final Condition condition) {
    int _nCount = condition.getNCount();
    boolean _greaterThan = (_nCount > 8);
    if (_greaterThan) {
      this.error("Neighbors can not be greater than 8", GolPackage.Literals.CONDITION__NCOUNT, GolValidator.INVALID_NEIGHBOR_COUNT);
    }
    int _nCount_1 = condition.getNCount();
    boolean _lessThan = (_nCount_1 < 0);
    if (_lessThan) {
      this.error("The number of neighbors cannot be negative", GolPackage.Literals.CONDITION__NCOUNT);
    }
  }

  @Check
  public void checkIfInitialCellsAreInGrid(final Grid grid) {
    EList<PopulatedCell> _populatedCells = grid.getPopulatedCells();
    for (final PopulatedCell cell : _populatedCells) {
      if (((((cell.getX() > grid.getSize().getWidth()) || (cell.getY() > grid.getSize().getHeight())) || (cell.getX() < 0)) || (cell.getY() < 0))) {
        this.error("Cell cannot be outside the grid", GolPackage.Literals.GRID__POPULATED_CELLS);
      }
    }
  }

  @Check
  public void checkIfGridIsBigEnough(final Grid grid) {
    if (((grid.getSize().getHeight() < 10) || (grid.getSize().getWidth() < 10))) {
      this.error("The world is too small! It should have at least width and height of 10.", GolPackage.Literals.GRID__SIZE);
    }
  }

  @Check
  public void doIdenticalCoordinatedExist(final Grid grid) {
    EList<PopulatedCell> populatedCells = grid.getPopulatedCells();
    for (int i = 0; (i < populatedCells.size()); i++) {
      for (int j = (i + 1); (j < populatedCells.size()); j++) {
        if (((populatedCells.get(i).getX() == populatedCells.get(j).getX()) && 
          (populatedCells.get(i).getY() == populatedCells.get(j).getY()))) {
          this.error("Identical coordinates are not allowed", GolPackage.Literals.GRID__POPULATED_CELLS, j);
        }
      }
    }
  }

  @Check
  public void doRulesExist(final Rules rules) {
    int _size = rules.getRules().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      this.warning("Game has no rules, so everyone and everything will die", null);
    }
  }

  /**
   * Semantic Checks for logical consistency
   */
  @Check
  public void checkDeadSurviving(final Rule rule) {
    if ((Objects.equals(rule.getState(), "dead") && Objects.equals(rule.getResult(), "survives"))) {
      this.warning("A dead cell cannot survive. Only living cells can survive.", GolPackage.Literals.RULE__STATE);
    }
  }

  @Check
  public void checkLivingPopulating(final Rule rule) {
    if ((Objects.equals(rule.getState(), "living") && Objects.equals(rule.getResult(), "populates"))) {
      this.warning("A living cell cannot be populated. Only dead cells can be populated.", GolPackage.Literals.RULE__STATE);
    }
  }

  @Check
  public void checkDeadDying(final Rule rule) {
    if ((Objects.equals(rule.getState(), "dead") && Objects.equals(rule.getResult(), "dies"))) {
      this.warning("A dead cell cannot die. How do you kill that which has no life?", GolPackage.Literals.RULE__STATE);
    }
  }
}
