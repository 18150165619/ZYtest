package com.zhuyan;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @描述： ${DESCRIPTION}
 * @创建者： Yan.zhu
 * @日期： 2018-03-05 22:31
 * @修改者： Yan.zhu *@修改日期： 2018-03-05 22:31
 * @版本： v1.0
 **/
//
public class StudentBean implements InitializingBean,ApplicationContextAware,DisposableBean, BeanNameAware, BeanFactoryAware{
    private String name;
    private int age;
    private String beanName;//实现了BeanNameAware接口，Spring可以将BeanName注入该属性中
    private BeanFactory beanFactory;//实现了BeanFactory接口，Spring可将BeanFactory注入该属性中
   public StudentBean()
   {
        System.out.println("【Bean构造方法】学生类的无参构造方法");
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", beanName='" + beanName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("【set注入】注入学生的name属性");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("【set注入】注入学生的age属性");
        this.age = age;
    }

    public void myInit(){
       System.out.println("【init-method】调用init-method属性配置的初始化方法");
    }

    public void myDestroy(){

        System.out.println("【destroy-method】调用destroy-method属性配置的销毁方法");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【BeanFactoryAware接口】调用BeanFactoryAware的setBeanFactory方法得到beanFactory引用");
    }

    public void setBeanName(String s) {
        System.out.println("【BeanNameAware接口】调用BeanNameAware的setBeanName方法得到Bean的名称");
    }

    public void destroy() throws Exception {
        System.out.println("【DisposableBean接口】调用DisposableBean接口的destroy方法");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("【InitializingBean接口】调用InitializingBean接口的afterPropertiesSet方法");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【ApplicationContext接口】调用ApplicationContext接口的setApplicationContext方法");

    }

}
