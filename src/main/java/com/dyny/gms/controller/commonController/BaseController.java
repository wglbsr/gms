package com.dyny.gms.controller.commonController;

import com.alibaba.fastjson.JSONObject;

public class BaseController {

    private JSONObject result = new JSONObject();
    private static String DATA_KEY = "data";
    private static String ERROR_MSG_KEY = "errorMsg";
    private static String RESULT_KEY = "result";
    private static String DEFAULT_ERROR_MSG = "内部错误!";

    /**
     * 返回成功信息
     *
     * @param data
     * @return
     */
    public String getSuccessResult(Object data) {
        return this.getResult(true, data, "");
    }

    /**
     * 返回错误信息
     *
     * @param data
     * @param errorMessage
     * @return
     */
    public String getErrorResult(Object data, String errorMessage) {
        return this.getResult(false, data, errorMessage);
    }

    public String getErrorResult(Object data) {
        return this.getResult(false, data, "");
    }

    public String getErrorMsg(String msg) {
        return this.getResult(false, null, msg);
    }

    public String getError() {
        return this.getResult(false, null, null);
    }

    private String getResult(boolean successFlag, Object data, String errorMessage) {
        if (successFlag) {
            this.result.put(DATA_KEY, data);
        } else {
            this.result.put(ERROR_MSG_KEY, errorMessage != null && errorMessage.isEmpty() ? DEFAULT_ERROR_MSG : errorMessage);
        }
        this.result.put(RESULT_KEY, successFlag);
        return this.result.toJSONString();
    }
}
