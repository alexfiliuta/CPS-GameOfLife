package org.gol.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;
import org.gol.gol.Condition;
import org.gol.gol.Game;
import org.gol.gol.PopulatedCell;
import org.gol.gol.Rule;

@SuppressWarnings("all")
public class GolGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    final Game root = ((Game) _head);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package GameOfLife;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.awt.Point;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.Arrays;");
    _builder.newLine();
    _builder.append("import java.util.HashSet;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class RulesOfLife {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Mapping the DSL GridSize to static Java variables");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static int gridWidth = ");
    int _width = root.getGrid().getSize().getWidth();
    _builder.append(_width, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public static int gridHeight = ");
    int _height = root.getGrid().getSize().getHeight();
    _builder.append(_height, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// I kept these predefined patterns as static helpers");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static HashSet<Point> Glider = new HashSet<Point>(");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Arrays.asList(");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("new Point(4,3), new Point(5,4), new Point(5,5), new Point(4,5), new Point(3,5)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static HashSet<Point> Blinker = new HashSet<Point>(");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Arrays.asList(");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("new Point(3,3), new Point(3,4), new Point(21,20), new Point(3,5)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static ArrayList<Point> populatedCells;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static HashSet<Point> initialCells;");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// Static block to initialize the grid based on the DSL input");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("static {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("initialCells = new HashSet<Point>(");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Arrays.asList(");
    _builder.newLine();
    {
      List<PopulatedCell> _startingPoints = Auxiliary.getStartingPoints(root.getGrid());
      boolean _hasElements = false;
      for(final PopulatedCell populatedCell : _startingPoints) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "                ");
        }
        _builder.append("                ");
        _builder.append("new Point(");
        int _x = populatedCell.getX();
        _builder.append(_x, "                ");
        _builder.append(",");
        int _y = populatedCell.getY();
        _builder.append(_y, "                ");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("            ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(");");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    {
      ArrayList<String> _pesets = Auxiliary.getPesets(root.getGrid());
      for(final String preset : _pesets) {
        _builder.append("        ");
        _builder.append("initialCells.addAll(");
        _builder.append(preset, "        ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("populatedCells = new ArrayList<>(initialCells);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("     ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Iterate through the array to check neighbors");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (int i=1; i<gameBoard.length-1; i++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int j=1; j<gameBoard[0].length-1; j++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("int surrounding = 0;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("// Counting neighbors manually");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i-1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i-1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i-1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i][j-1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i][j+1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i+1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i+1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i+1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("// Here I inject the logic defined in the DSL rules");
    _builder.newLine();
    {
      List<Rule> _rules = Auxiliary.getRules(root);
      for(final Rule rule : _rules) {
        _builder.append("                ");
        CharSequence _rule2Text = GolGenerator.rule2Text(rule);
        _builder.append(_rule2Text, "                ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile("GameOfLife/RulesOfLife.java", _builder);
  }

  /**
   * Helper to convert a single DSL rule into Java logic inside the loop.
   * It checks the cell state (dead/alive) and the neighbor conditions.
   */
  protected static CharSequence _rule2Text(final Rule rule) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if ((");
    {
      String _state = rule.getState();
      boolean _equals = Objects.equals(_state, "dead");
      if (_equals) {
        _builder.append("!");
      }
    }
    _builder.append("gameBoard[i][j]) && ");
    _builder.newLineIfNotEmpty();
    {
      List<Condition> _conditions = Auxiliary.getConditions(rule);
      for(final Condition condition : _conditions) {
        _builder.append("(surrounding ");
        String _boolOp = condition.getBoolOp();
        _builder.append(_boolOp);
        _builder.append(" ");
        int _nCount = condition.getNCount();
        _builder.append(_nCount);
        _builder.append(") ");
        {
          String _separator = condition.getSeparator();
          boolean _equals_1 = Objects.equals(_separator, "||");
          if (_equals_1) {
            _builder.append("||");
          }
        }
        {
          String _separator_1 = condition.getSeparator();
          boolean _equals_2 = Objects.equals(_separator_1, "&&");
          if (_equals_2) {
            _builder.append("&&");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      String _result = rule.getResult();
      boolean _equals_3 = Objects.equals(_result, "survives");
      if (_equals_3) {
        _builder.append("survivingCells.add(new Point(i-1,j-1));");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      String _result_1 = rule.getResult();
      boolean _equals_4 = Objects.equals(_result_1, "populates");
      if (_equals_4) {
        _builder.append("survivingCells.add(new Point(i-1,j-1));");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _result_2 = rule.getResult();
      boolean _equals_5 = Objects.equals(_result_2, "dies");
      if (_equals_5) {
        _builder.append("    ");
        _builder.append("// If the rule is \'dies\', we explicitly remove it from the list");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("Point pointToRemove = new Point(i-1, j-1);");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("survivingCells.removeIf(point -> point.equals(pointToRemove));");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  @XbaseGenerated
  public static CharSequence rule2Text(final Rule rule) {
    return _rule2Text(rule);
  }
}
