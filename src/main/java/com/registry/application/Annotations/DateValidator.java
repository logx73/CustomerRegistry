package com.registry.application.Annotations;

import com.registry.application.Entity.Customer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.sql.Date;
import java.time.LocalDate;

public class DateValidator implements ConstraintValidator<DateValidation, LocalDate> {

    @Override
    public boolean isValid(LocalDate date, ConstraintValidatorContext constraintValidatorContext) {
        LocalDate localDate = LocalDate.of(2002,01,01);
        if(date.isBefore(localDate)){
            return true;
        }
        return false;
    }
}
