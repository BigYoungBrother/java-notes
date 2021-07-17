package com.young.bean.load;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationStartupAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.util.StringValueResolver;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Book
 *
 * @author Young
 * @Date 2021-06-17 22:56
 */
public class Book implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware
        , ApplicationContextAware, InitializingBean, DisposableBean
        , EnvironmentAware, EmbeddedValueResolverAware, ResourceLoaderAware
        , ApplicationEventPublisherAware, MessageSourceAware, ApplicationStartupAware {

    private String bookName;

    public Book() {
        System.out.println("构造方法");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware#setBeanFactory(BeanFactory beanFactory)");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware#setBeanName(String name)");
    }

    @Override
    public void destroy() {
        System.out.println("DisposableBean#destroy()");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("InitializingBean#afterPropertiesSet()\n@PostConstruct方法执行之后");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware#setApplicationContext(ApplicationContext applicationContext)");
    }

    public String getBookName() {
        return bookName;
    }

    /**
     * XML中定义的property
     *
     * @param bookName
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
        System.out.println("XML中定义的property");
    }

    /**
     * XML中定义的init-method
     */
    public void myPostConstruct() {
        System.out.println("XML中定义的init-method");
    }

    /**
     * 自定义初始化方法
     */
    @PostConstruct
    public void springPostConstruct() {
        System.out.println("@PostConstruct\n此时bean的属性都已经注入了, 但是仍然存在bean的某个属性只是实例化了，但是并没有初始化的可能性");
    }

    /**
     * XML中定义的destroy-method
     */
    public void myPreDestroy() {
        System.out.println("XML中定义的destroy-method");
    }

    /**
     * 自定义销毁方法
     */
    @PreDestroy
    public void springPreDestroy() {
        System.out.println("@PreDestroy");
    }

    @Override
    protected void finalize() {
        System.out.println("------inside finalize-----");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("BeanClassLoaderAware#setBeanClassLoader(ClassLoader classLoader)");
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("EnvironmentAware#setEnvironment(Environment environment)");
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        System.out.println("EmbeddedValueResolverAware#setEmbeddedValueResolver(StringValueResolver resolver)");
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println("ResourceLoaderAware#setResourceLoader(ResourceLoader resourceLoader)");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println("ApplicationEventPublisherAware#setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher)");
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        System.out.println("MessageSourceAware#setMessageSource(MessageSource messageSource)");
    }

    @Override
    public void setApplicationStartup(ApplicationStartup applicationStartup) {
        System.out.println("ApplicationStartupAware#setApplicationStartup(ApplicationStartup applicationStartup)");
    }
}
