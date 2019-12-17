package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.app.TestBeanFactoryPostProcessor;
import com.luban.dao.Dao;
import com.luban.dao.IndexDao;
import com.luban.dao.IndexDao1;
import com.luban.dao.IndexDao3;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args){
		//ClassPathXmlApplicationContext
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		//applicationContext.register(Appconfig.class);
		/*applicationContext.addBeanFactoryPostProcessor(new TestBeanFactoryPostProcessor());
		applicationContext.refresh();*/
		/*IndexDao indexDao = (IndexDao) applicationContext.getBean("indexDao");
		IndexDao1 indexDao1=(IndexDao1) applicationContext.getBean("indexDao1");
		indexDao.query();
		System.out.println();*/
		/*indexDao.query();*/
		/*Dao dao= (Dao) applicationContext.getBean("indexDao");
		dao.query();*/
		/*//根据Xml配置文件创建Resource资源对象，该对象中包含了BeanDefinition的信息
		ClassPathResource resource = new ClassPathResource("application-context.xml");
		//创建DefaultableBeanFactory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		//创建XmlBeanDefinitionReader读取器，用于载入BeanDefinition，之所以需要BeanFactory作为参数，是因为要将读取的信息回调配置给factory
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		//XmlBeanDefinitionReader执行载入BeanDefinition的方法，最后会完成Bean的载入和注册，完成后Bean就放置到IOC容器中，以后我们就可以从中读取到Bean来使用
		reader.loadBeanDefinitions(resource);*/
	}
}
