package org.metadatacenter.spreadsheetvalidator;

/**
 * @author Josef Hardi <josef.hardi@stanford.edu> <br>
 * Stanford Center for Biomedical Informatics Research
 */
public interface Closure<T> {

  T execute(Object... inputs);
}
