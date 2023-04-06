package be.vdab.validation.constraints;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = PrijsValidator.class)
public @interface Prijs {
    String message() default "{be.vdab.Prijs.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
