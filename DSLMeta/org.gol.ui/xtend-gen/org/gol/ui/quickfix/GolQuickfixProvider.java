package org.gol.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.gol.gol.Condition;
import org.gol.validation.GolValidator;

@SuppressWarnings("all")
public class GolQuickfixProvider extends DefaultQuickfixProvider {
  /**
   * BONUS FEATURE:
   * This fixes the "invalidNeighborCount" error.
   * If a user sets neighbors > 8, this automatically clamps it down to 8.
   */
  @Fix(GolValidator.INVALID_NEIGHBOR_COUNT)
  public void fixHighNeighborCount(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      final Condition condition = ((Condition) element);
      condition.setNCount(8);
    };
    acceptor.accept(issue, 
      "Set neighbors to 8", 
      "Reduce the neighbor count to the maximum of 8.", 
      "upcase.png", _function);
  }
}
