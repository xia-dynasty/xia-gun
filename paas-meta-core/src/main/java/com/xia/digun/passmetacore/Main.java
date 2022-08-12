package com.xia.digun.passmetacore;

import com.xia.digun.passmetacore.model.DomainModel;
import org.dom4j.DocumentException;

/**
 * description:
 *
 * @author wanghaoxin
 * date     2022/7/14 23:55
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws DocumentException {
        DomainModel domainModel = new DomainModel();
        final DomainModel domainModel1 = domainModel.getDomainModel();
        System.out.println(domainModel1.getVersion());
    }
}
