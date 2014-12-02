package com.rengwuxian.materialedittext.validation;

import android.support.annotation.NonNull;

import java.util.regex.Pattern;

/**
 * Custom validator for Regexes
 */
public class RegexValidator extends MaterialETValidator {

  private Pattern pattern;

  public RegexValidator(@NonNull String errorMessage, @NonNull String regex) {
    super(errorMessage);
    pattern = Pattern.compile(regex);
  }

  @Override
  public boolean isValid(@NonNull CharSequence text, boolean isEmpty) {
    return pattern.matcher(text).matches();
  }
}
