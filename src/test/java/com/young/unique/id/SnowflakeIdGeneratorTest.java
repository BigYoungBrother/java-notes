package com.young.unique.id;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 雪花算法测试类
 *
 * @author Young
 * @Date 2021-05-22 17:46
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class SnowflakeIdGeneratorTest {

    @Autowired
    private SnowflakeIdGenerator snowflakeIdGenerator;

    @Test
    void nextId() {
        long nextId = snowflakeIdGenerator.nextId();
        System.out.println(nextId);
        Assert.assertNotNull(nextId);
    }
}
