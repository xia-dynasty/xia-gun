package com.xia.digun.passmetacore.constant.exception;

import com.xia.digun.passmetacore.constant.ResultStatusEnum;

/**
 * description: 元数据处理异常
 *
 * @author wanghaoxin
 * date     2022/8/12 18:06
 * @version 1.0
 */
public class MetaException extends PaaSException {
    public MetaException() {
        super();
    }

    public MetaException(ResultStatusEnum resultStatusEnum) {
        super(resultStatusEnum);
    }

    public MetaException(ResultStatusEnum resultStatusEnum, String message) {
        super(resultStatusEnum, message);
    }

    public MetaException(ResultStatusEnum resultStatusEnum, Object payload, String message) {
        super(resultStatusEnum, payload, message);
    }
}
