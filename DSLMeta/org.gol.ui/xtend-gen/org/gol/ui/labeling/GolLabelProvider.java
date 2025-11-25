package org.gol.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

@SuppressWarnings("all")
public class GolLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public GolLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
