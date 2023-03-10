package org.metadatacenter.spreadsheetvalidator.validator.exception;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author Josef Hardi <josef.hardi@stanford.edu> <br>
 * Stanford Center for Biomedical Informatics Research
 */
public class RemoteAccessException extends BadValidatorRequestException {

  private final String templateIri;

  public RemoteAccessException(@Nonnull String templateIri) {
    super();
    this.templateIri = checkNotNull(templateIri);
  }

  @Override
  public Integer getErrorCode() {
    return 2;
  }

  @Override
  public String getErrorName() {
    return "RemoteAccessException";
  }

  @Override
  public String getFixSuggestion() {
    return "Please make sure the template ID is correct and you have the read access permission.";
  }

  @Override
  public String getMessage() {
    return String.format("Unable to retrieve CEDAR template: %s. ", templateIri);
  }
}
