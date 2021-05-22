package com.young.unique.id;


import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * UUID 生成 测试类
 *
 * @author Young
 * @Date 2021-05-20 19:23
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class MyUuidGeneratorServiceTest {

    @Autowired
    private MyUuidGeneratorService myUuidGeneratorService;

    @Test
    void uuidGeneratorWithDivider() {
        String uuidStr = myUuidGeneratorService.uuidGeneratorWithDivider();
        Assert.assertNotNull(uuidStr);
        log.info(uuidStr);
    }

    @Test
    void uuidGeneratorNoDivider() {
        String uuidStr = myUuidGeneratorService.uuidGeneratorNoDivider();
        Assert.assertNotNull(uuidStr);
        log.info(uuidStr);
    }
}
