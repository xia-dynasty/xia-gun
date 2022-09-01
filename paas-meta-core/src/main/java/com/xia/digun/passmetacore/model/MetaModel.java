package com.xia.digun.passmetacore.model;

import com.xia.digun.passmetacore.constant.SysConstant;
import com.xia.digun.passmetacore.constant.exception.MetaException;
import com.xia.digun.passmetacore.utils.XmlParseUtils;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;

import java.net.URL;
import java.util.List;

/**
 * description: 元模型
 *
 * @author wanghaoxin
 * date     2022/8/31 00:09
 * @version 1.0
 */
@Data
@NoArgsConstructor
public class MetaModel {
    private String version;
    private List<Model> models;

    public List<Model> listModels() {
        try {
            URL url = this.getClass().getResource(SysConstant.META_MODEL_ROOT_PATH);
            final Document document = XmlParseUtils.getDocument(url);
            final List<Model> nodes = XmlParseUtils.getNodes(document, "/domain-model/models/model", Model.class);
            final String version = XmlParseUtils.getNodeText(document, "/domain-model/version");
            this.setModels(nodes);
            this.setVersion(version);
        } catch (DocumentException e) {
            throw new MetaException(e.getMessage());
        }
        return this;
    }
}
