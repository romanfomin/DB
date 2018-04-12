package generator.customAnnotation.annotations;

import generator.customAnnotation.impl.OperatorIdGenerator;
import generator.customAnnotation.impl.UserIdGenerator;
import io.dummymaker.annotation.PrimeGen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@PrimeGen(OperatorIdGenerator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface GenOperatorId {
}
