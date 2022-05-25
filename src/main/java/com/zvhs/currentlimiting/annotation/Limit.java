package com.zvhs.currentlimiting.annotation;

import com.zvhs.currentlimiting.contants.LimitType;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Limit {

    /**
     * 名称
     *
     * @return
     */
    String name() default "";

    /**
     * key
     *
     * @return
     */
    String key() default "";

    /**
     * key 前缀
     *
     * @return
     */
    String prefix() default "";

    /**
     * 时间
     *
     * @return
     */
    int period();

    /**
     * 在 period 最多访问次数
     *
     * @return
     */
    int count();

    /**
     * 限流的类型
     *
     * @return
     */
    LimitType limitType() default LimitType.CUSTOMER;
}
