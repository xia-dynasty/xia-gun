package com.xia.digun.passmetacore.utils;

import com.xia.digun.passmetacore.constant.ResultStatusEnum;
import com.xia.digun.passmetacore.constant.exception.PaaSException;

import java.text.ParseException;

/**
 * description: 空对象
 *
 * @author wanghaoxin
 * date     2022/9/5 23:07
 * @version 1.0
 */
public class NullObject {
    public static <T> T getNullObject(Class<T> clazz) {
        final T t;
        try {
            t = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new PaaSException(ResultStatusEnum.SYSTEM_ERROR, e.getMessage());
        }
        return t;
    }
}
