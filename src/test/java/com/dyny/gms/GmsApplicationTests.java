package com.dyny.gms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmsApplicationTests {

	@Test
	public void contextLoads() {
		Jedis jedis = new Jedis("193.112.68.193");
		jedis.set("foo", "111");
		String value = jedis.get("foo");
		System.out.println("************************************:"+value);
	}

}
