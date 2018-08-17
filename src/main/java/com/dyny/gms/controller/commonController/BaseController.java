package com.dyny.gms.controller.commonController;

import com.alibaba.fastjson.JSONObject;

public class BaseController {

    private JSONObject result = new JSONObject();
    private static String DATA_KEY = "data";
    private static String PAGE_SIZE_KEY = "size";
    private static String PAGE_NUM_KEY = "page_num";
    private static String TOTAL_PAGE_NUM_KEY = "total_page_num";
    private static String TOTAL_NUM_KEY = "total_num";

    private static String ERROR_MSG_KEY = "errorMsg";
    private static String RESULT_KEY = "result";
    private static String DEFAULT_ERROR_MSG = "内部错误!";

    private static long DEFAULT_PAGE_SIZE=20;
    private static long DEFAULT_PAGE_NUM=1;

    /**
     * 返回成功信息
     *
     * @param data
     * @return
     */
    public String getSuccessResult(Object data) {
        return this.getResult(true, data, "", 0, 0, 0);
    }

    public String getSuccessResult(Object data, int pageNum, int pageSize, long total) {
        return this.getResult(true, data, "", pageNum, pageSize, total);
    }

    /**
     * 返回错误信息
     *
     * @param data
     * @param errorMessage
     * @return
     */
    public String getErrorResult(Object data, String errorMessage) {
        return this.getResult(false, data, errorMessage, 0, 0, 0);
    }

    public String getErrorResult(Object data) {
        return this.getResult(false, data, "", 0, 0, 0);
    }

    public String getErrorMsg(String msg) {
        return this.getResult(false, null, msg, 0, 0, 0);
    }

    public String getError() {
        return this.getResult(false, null, null, 0, 0, 0);
    }


    private String getResult(boolean successFlag, Object data, String errorMessage, int pageNum, int pageSize, long totalNum) {
        if (successFlag) {
            this.result.put(DATA_KEY, data);
            this.result.put(PAGE_SIZE_KEY, pageSize);
            this.result.put(PAGE_NUM_KEY, pageNum);
            long totalPageNum = pageSize>0?(totalNum / pageSize + (totalNum % pageSize > 0 ? 1 : 0)):0;
            this.result.put(TOTAL_PAGE_NUM_KEY,totalPageNum);
            this.result.put(TOTAL_NUM_KEY, totalNum);
        } else {
            this.result.put(ERROR_MSG_KEY, errorMessage != null && errorMessage.isEmpty() ? DEFAULT_ERROR_MSG : errorMessage);
        }
        this.result.put(RESULT_KEY, successFlag);
        return this.result.toJSONString();
    }
}
