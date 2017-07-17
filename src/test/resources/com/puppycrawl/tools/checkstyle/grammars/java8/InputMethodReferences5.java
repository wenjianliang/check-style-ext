package com.puppycrawl.tools.checkstyle.grammars.java8;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Target({ METHOD, FIELD })
@Retention(RUNTIME)
public @interface InputMethodReferences5 {
    JoinFormula formula() default @JoinFormula(value = "", referencedColumnName = "");

    JoinColumn column() default @JoinColumn();
}

@interface JoinFormula {
    String value();

    String referencedColumnName();
}

@interface JoinColumn {

}
