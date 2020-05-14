package com.cxytiandi.spring_rest_template.annoation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/**
 * @description: 自定义注解
 * @author: zhanglu
 * @create: 2020-05-13 18:27
 */

/**
 * 类继承关系中@Inherited的作用

 类继承关系中，子类会继承父类使用的注解中被@Inherited修饰的注解

 接口继承关系中@Inherited的作用

 接口继承关系中，子接口不会继承父接口中的任何注解，不管父接口中使用的注解有没有被@Inherited修饰

 类实现接口关系中@Inherited的作用

 类实现接口时不会继承任何接口中定义的注解

 */

@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Qualifier
public @interface MyLoadBalanced {

}
