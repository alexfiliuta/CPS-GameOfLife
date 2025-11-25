package org.gol.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

class GolLabelProvider extends DefaultEObjectLabelProvider {
    @Inject
    new(AdapterFactoryLabelProvider delegate) {
        super(delegate);
    }
}