package org.gol.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;
import org.gol.gol.Game;
import org.gol.gol.Grid;
import org.gol.gol.GridSize;
import org.gol.gol.PopulatedCell;
import org.gol.gol.Rule;
import org.gol.gol.Rules;
import org.gol.services.GolGrammarAccess;

@SuppressWarnings("all")
public class GolFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private GolGrammarAccess _golGrammarAccess;

  protected void _format(final Game game, @Extension final IFormattableDocument document) {
    document.<Grid>format(game.getGrid());
    document.<Rules>format(game.getRules());
  }

  protected void _format(final Grid grid, @Extension final IFormattableDocument document) {
    document.<GridSize>format(grid.getSize());
    EList<PopulatedCell> _populatedCells = grid.getPopulatedCells();
    for (final PopulatedCell populatedCell : _populatedCells) {
      document.<PopulatedCell>format(populatedCell);
    }
  }

  /**
   * We added this to ensure rules are separated by empty lines,
   * making the DSL much easier to read.
   */
  protected void _format(final Rules rules, @Extension final IFormattableDocument document) {
    EList<Rule> _rules = rules.getRules();
    for (final Rule rule : _rules) {
      {
        document.<Rule>format(rule);
        final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
          it.setNewLines(2);
        };
        document.<Rule>append(rule, _function);
      }
    }
  }

  @XbaseGenerated
  public void format(final Object game, final IFormattableDocument document) {
    if (game instanceof XtextResource) {
      _format((XtextResource)game, document);
      return;
    } else if (game instanceof Game) {
      _format((Game)game, document);
      return;
    } else if (game instanceof Grid) {
      _format((Grid)game, document);
      return;
    } else if (game instanceof Rules) {
      _format((Rules)game, document);
      return;
    } else if (game instanceof EObject) {
      _format((EObject)game, document);
      return;
    } else if (game == null) {
      _format((Void)null, document);
      return;
    } else if (game != null) {
      _format(game, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(game, document).toString());
    }
  }
}
