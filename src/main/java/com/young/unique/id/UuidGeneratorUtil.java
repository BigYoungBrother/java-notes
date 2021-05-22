package com.young.unique.id;

import java.util.UUID;

/**
 * UUID 生成
 * 使用可参考对应测试类
 *
 * @author Young
 * @Date 2021-05-20 18:58
 */
public class UuidGeneratorUtil {

    /**
     * 随机生成uuid-包含分割符
     *
     * @return
     */
    public static String uuidGeneratorWithDivider() {
        return UUID.randomUUID().toString();
    }

    /**
     * 随机生成uuid-不包含分割符
     *
     * @return
     */
    public static String uuidGeneratorNoDivider() {
        return UUID.randomUUID().toString().replace("-", "");
    }


}
