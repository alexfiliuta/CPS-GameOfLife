package org.gol.generator;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.gol.gol.Condition;
import org.gol.gol.Game;
import org.gol.gol.Grid;
import org.gol.gol.PopulatedCell;
import org.gol.gol.Rule;

/**
 * Helper class to extract lists from the model for the generator.
 * This keeps the main generator code cleaner.
 */
@SuppressWarnings("all")
public class Auxiliary {
  public static List<Rule> getRules(final Game root) {
    List<Rule> ruleList = new ArrayList<Rule>();
    EList<Rule> _rules = root.getRules().getRules();
    for (final Rule r : _rules) {
      ruleList.add(r);
    }
    return ruleList;
  }

  public static List<Condition> getConditions(final Rule rule) {
    List<Condition> conditionList = new ArrayList<Condition>();
    EList<Condition> _conditions = rule.getConditions();
    for (final Condition c : _conditions) {
      conditionList.add(c);
    }
    return conditionList;
  }

  public static List<PopulatedCell> getStartingPoints(final Grid grid) {
    List<PopulatedCell> pointList = new ArrayList<PopulatedCell>();
    EList<PopulatedCell> _populatedCells = grid.getPopulatedCells();
    for (final PopulatedCell p : _populatedCells) {
      pointList.add(p);
    }
    return pointList;
  }

  public static ArrayList<String> getPesets(final Grid grid) {
    ArrayList<String> patternList = new ArrayList<String>();
    EList<String> _predefinedPatterns = grid.getPredefinedPatterns();
    for (final String p : _predefinedPatterns) {
      patternList.add(p);
    }
    return patternList;
  }
}
