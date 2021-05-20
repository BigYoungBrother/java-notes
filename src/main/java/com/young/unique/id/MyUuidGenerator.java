package com.young.unique.id;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * UUID 生成
 * 使用可参考对应测试类
 *
 * @author Young
 * @Date 2021-05-20 18:58
 */
@Service
public class MyUuidGenerator {

    /**
     * 随机生成uuid-包含分割符
     *
     * @return
     */
    public String uuidGeneratorWithDivider() {
        return UUID.randomUUID().toString();
    }

    /**
     * 随机生成uuid-不包含分割符
     *
     * @return
     */
    public String uuidGeneratorNoDivider() {
        return UUID.randomUUID().toString().replace("-", "");
    }


}
