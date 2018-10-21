package com.dyny.gms;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmsApplicationTests {
    private static Logger logger = Logger.getLogger(GmsApplicationTests.class);

    @Autowired
    RedisTemplate redisTemplate;


    @Test
    public void contextLoads() {
        ValueOperations<String, String> operation = redisTemplate.opsForValue();
        logger.info("******************************************************************" + redisTemplate.hasKey("name"));
    }

}
