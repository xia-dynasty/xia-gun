package com.xia.digun.passmetacore;

import com.google.gson.Gson;
import com.xia.digun.passmetacore.model.MetaModel;
import com.xia.digun.passmetacore.model.ModelReader;

/**
 * description:
 *
 * @author wanghaoxin
 * date     2022/9/4 11:40
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        ModelReader reader = new ModelReader();
        final MetaModel metaModel = reader.listMetaModel();
        System.out.println(new Gson().toJson(metaModel));
    }
}
