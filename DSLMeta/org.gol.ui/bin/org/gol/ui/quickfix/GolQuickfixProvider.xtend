package org.gol.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.gol.validation.GolValidator
import org.gol.gol.Condition

class GolQuickfixProvider extends DefaultQuickfixProvider {

	/*
     * BONUS FEATURE:
     * This fixes the "invalidNeighborCount" error.
     * If a user sets neighbors > 8, this automatically clamps it down to 8.
     */
    @Fix(GolValidator.INVALID_NEIGHBOR_COUNT)
    def void fixHighNeighborCount(Issue issue, IssueResolutionAcceptor acceptor) {
        acceptor.accept(issue, 
            "Set neighbors to 8", 
            "Reduce the neighbor count to the maximum of 8.", 
            "upcase.png", 
            [ element, context |
                val condition = element as Condition
                // Applying the fix
                condition.NCount = 8
            ]
        )
    }
}