package sy.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sy.model.user;
import sy.service.UserServiceI;




public class TestMybatis {
	
	private ApplicationContext ac;
	private UserServiceI ui;
	
	@Before
	public void dobefor(){
		ac=new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		ui=(UserServiceI) ac.getBean("userService");
	}
	
	@Test
	public void testone(){
		user u=ui.getUserById("001");
		System.out.println(u.getName());
	}
}
