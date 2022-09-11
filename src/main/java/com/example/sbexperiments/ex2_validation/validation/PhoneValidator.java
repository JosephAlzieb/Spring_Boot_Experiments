package com.example.sbexperiments.ex2_validation.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//String because phone in Customer-class is a string
public class PhoneValidator implements ConstraintValidator<Phone, String> {

  @Override
  public void initialize(Phone constraintAnnotation) {
    //ConstraintValidator.super.initialize(constraintAnnotation);
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
    if (value == null || value.length() != 10) {
      return false;
    }

    return value.startsWith("+49");

  }
}
