package com.test;


import com.zhuyan.StudentBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @描述： ${DESCRIPTION}
 * @创建者： Yan.zhu
 * @日期： 2018-03-05 23:01
 * @修改者： Yan.zhu *@修改日期： 2018-03-05 23:01
 * @版本： v1.0
 **/
public class TestCyclelife {

    public static void main(String[] args){
        System.out.println("--------------初始化容器---------------");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("-------------------容器初始化成功------------------");
        //得到studentBean，并显示其信息
        StudentBean studentBean = context.getBean("studentBean",StudentBean.class);
        System.out.println(studentBean);
        System.out.println("--------------------销毁容器----------------------");
        ((ClassPathXmlApplicationContext)context).registerShutdownHook();
    }

}
