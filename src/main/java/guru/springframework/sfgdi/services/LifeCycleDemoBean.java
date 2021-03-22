package guru.springframework.sfgdi.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
		BeanFactoryAware, ApplicationContextAware {
	
	public LifeCycleDemoBean() {
		System.out.println("## I'm in the LifeCycleBean Constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## The Application context has been set");
		
	}
	
	@PostConstruct
	public void postConstruct() {System.out.println("## The Post Construct annotated method has been called");}
	
	@PreDestroy
	public void preDestory() {System.out.println("## The PreDestory annotated method has been called");}
	
	public void beforeInit() {System.out.println("## - Before Init - Called by Bean Post Processor");}
	
	public void afterInit() {System.out.println("## - After Init - Called by Bean Post Processor");}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## The Factory has been set");
		
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("## The Bean name has been set");
		
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## The LifeCycle Bean has been terminated");
		
	}
}
