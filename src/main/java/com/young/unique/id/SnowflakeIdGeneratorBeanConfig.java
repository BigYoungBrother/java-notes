package com.young.unique.id;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 雪花算法注册为SpringBean
 *
 * @author Young
 * @Date 2021-05-22 17:43
 */
@Component
public class SnowflakeIdGeneratorBeanConfig {

    @Bean
    public SnowflakeIdGenerator snowflakeIdGenerator() {
        return new SnowflakeIdGenerator(RandomUtils.nextInt(0, 1024));
    }

}
