package com.luculent;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WdhsApplicationTests {
	private Logger logger = Logger.getLogger(getClass());
	@Test
	public void contextLoads() {
		logger.debug("dfdf");
	}

}
