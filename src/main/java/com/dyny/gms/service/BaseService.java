package com.dyny.gms.service;

import com.dyny.gms.controller.commonController.BaseController;
import org.apache.poi.ss.formula.functions.T;

import java.lang.reflect.Field;
import java.util.Map;

public class BaseService extends BaseController {

    public String parsePojoAttrToColumnName(Object pojoAttr) {
//        String attrName = pojoAttr.
        if (pojoAttr instanceof String) {

        }

        return "";
    }

    ;

    private String getPrefixByDataType(Field temp) {

        return "";
    }

    public String appendLike(String content) {
        return "%" + content + "%";
    }
}
