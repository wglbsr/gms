package com.dyny.gms.controller.commonController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;

@Controller
@RequestMapping(value = "/rest_api", produces = {"application/json;charset=UTF-8"})
public class RestController extends BaseController {


    @GetMapping(value = "/{dataObjectName}")
    @ResponseBody
    public String retrieveData(@PathVariable("dataObjectName") String dataObjectName, @ModelAttribute Object object) {
        if (object != null) {
            Field[] fields = object.getClass().getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
            }
            System.out.println("awdawdawdawd");
        } else {
            System.out.println("null");
        }
        return super.getSuccessResult(dataObjectName);
    }

    private Object getMapper(String mapperName) {
        return null;
    }
}
