package com.chichodes.jpademo.hibernate;

import com.chichodes.jpademo.hibernate.component.DemoAppFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaDemoHibernateApplication.class)
public class JpaDemoHibernateApplicationTests {

	@Autowired
	private DemoAppFacade demoAppFacade;

	@Test
	public void testDemoAppFacadeTrigger() {
		demoAppFacade.doThis();
	}

}
