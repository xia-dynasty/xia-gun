package com.xia.digun.passmetacore;

import com.xia.digun.passmetacore.model.contextmodel.context.AbstractContext;
import com.xia.digun.passmetacore.model.utils.XmlParseUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;

import java.net.URL;

/**
 * description:
 *
 * @author wanghaoxin
 * date     2022/7/14 23:55
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws DocumentException {
        URL url = Main.class.getResource(AbstractContext.META_MODEL_ROOT_PATH);
        Document parse = XmlParseUtils.parse(url);
        XmlParseUtils.bar(parse);
    }
}
