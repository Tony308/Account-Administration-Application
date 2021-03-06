package com.qa.backend;


import org.apache.commons.httpclient.HttpStatus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BackendApplication.class,
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BackendApplicationTests {

	@LocalServerPort
	private int port;
	@Test
	public void contextLoads() {
	}

}
