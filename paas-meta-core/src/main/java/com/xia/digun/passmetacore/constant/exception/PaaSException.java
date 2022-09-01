package com.xia.digun.passmetacore.constant.exception;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xia.digun.passmetacore.constant.ResultStatusEnum;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * description: paas 异常
 *
 * @author wanghaoxin
 * date     2022/8/12 18:07
 * @version 1.0
 */
@Data
public class PaaSException extends RuntimeException {

    private Object payload;

    private String message;

    private ResultStatusEnum resultStatusEnum;

    public PaaSException() {
        this(ResultStatusEnum.SYSTEM_ERROR);
    }

    public PaaSException(ResultStatusEnum resultStatusEnum) {
        this(resultStatusEnum, resultStatusEnum.getMessage());
    }

    public PaaSException(ResultStatusEnum resultStatusEnum, String message) {
        this(resultStatusEnum, null, message);
    }

    public PaaSException(ResultStatusEnum resultStatusEnum, Object payload, String message) {
        super(message, new RuntimeException());
        this.setMessage(message);
        this.setPayload(payload);
        this.setResultStatusEnum(resultStatusEnum);
    }
}
