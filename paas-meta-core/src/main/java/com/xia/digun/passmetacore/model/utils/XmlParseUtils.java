package com.xia.digun.passmetacore.model.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.List;

/**
 * description: xml 解析工具
 *
 * @author wanghaoxin
 * date     2022/7/14 23:25
 * @version 1.0
 */
public class XmlParseUtils {

    public static Document parse(URL url) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(url);
        return document;
    }

    public static void bar(Document document) {
        List<Node> list = document.selectNodes("//models/model");
        list.forEach(node -> {
            Node node1 = node.selectSingleNode("//name");
            System.out.println(node1.getText());
        });


    }
}
