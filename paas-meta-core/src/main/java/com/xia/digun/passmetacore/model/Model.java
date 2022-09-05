package com.xia.digun.passmetacore.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: 模型
 *
 * @author wanghaoxin
 * date     2022/8/12 17:03
 * @version 1.0
 */
@Data
public abstract class Model {
    private String id;
    private String name;
    private String resourcePath;
}
