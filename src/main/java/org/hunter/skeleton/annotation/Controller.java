package org.hunter.skeleton.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wujianchuan 2019/2/12
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RestController
@RequestMapping
public @interface Controller {
    @AliasFor(annotation = org.springframework.stereotype.Controller.class)
    String value() default "";

    @AliasFor(value = "path", annotation = RequestMapping.class)
    String[] bundleId() default "";

    boolean auth() default true;
}
