package com.doge.exchange.center.common.util;

import lombok.extern.slf4j.Slf4j;
import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;

import java.util.List;


@Slf4j
public class VerifyUtil {

    private static Validator validator = new Validator();

    /**
     * 私有构造方法
     */
    private VerifyUtil() {

    }

    /**
     * 请求参数非空、格式验证，请求对象Z
     *
     * @param object 请求校验参数
     */
    public static void validateObject(Object object) throws RuntimeException {
        List<ConstraintViolation> list = validator.validate(object);
        if (null != list && !list.isEmpty()) {
            throw new RuntimeException();
        }
    }

}


