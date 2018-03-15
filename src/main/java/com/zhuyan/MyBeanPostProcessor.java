package com.zhuyan;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @描述： ${DESCRIPTION}
 * @创建者： Yan.zhu
 * @日期： 2018-03-05 22:45
 * @修改者： Yan.zhu *@修改日期： 2018-03-05 22:45
 * @版本： v1.0
 **/
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor(){
        System.out.println("【BeanPostProcessor接口】调用BeanPostProcessor的构造方法");
    }


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【BeanPostProcessor接口】调用postProcessBeforeInitialization方法，这里可对"+beanName+"的属性进行更改。");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【BeanPostProcessor接口】调用postProcessAfterInitialization方法，这里可对"+beanName+"的属性进行更改。");
        return bean;
    }
}
