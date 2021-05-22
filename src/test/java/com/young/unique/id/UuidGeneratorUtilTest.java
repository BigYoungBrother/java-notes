package com.young.unique.id;


import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * UUID 生成 测试类
 *
 * @author Young
 * @Date 2021-05-20 19:23
 */
@Slf4j
@RunWith(JUnit4.class)
class UuidGeneratorUtilTest {

    @Test
    void uuidGeneratorWithDivider() {
        String uuidStr = UuidGeneratorUtil.uuidGeneratorWithDivider();
        Assert.assertNotNull(uuidStr);
        log.info(uuidStr);
    }

    @Test
    void uuidGeneratorNoDivider() {
        String uuidStr = UuidGeneratorUtil.uuidGeneratorNoDivider();
        Assert.assertNotNull(uuidStr);
        log.info(uuidStr);
    }
}
