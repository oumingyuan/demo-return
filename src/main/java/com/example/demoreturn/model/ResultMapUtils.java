package com.example.demoreturn.model;

import java.util.Map;

//把返回值封装成工具类，方便调用
public class ResultMapUtils {
    //常量，代表后台调用的结果：成功、失败和异常
    public static final String SUCCESS = "success";
    public static final String FAIL = "fail";
    public static final String ERROR = "error";

    /**
     * @param map 返回给前端的需要构造的map对象，required
     * @param result 调用接口的结果，sucess、fail和error，required
     * @param message 调用接口失败或异常的反馈信息
     * @param tag 给要返回的对象添加便签，key值
     * @param data 要返回给前端的数据,value值
     * @Description message,tag,data视情况而定，可以传null
     */
    public static void makeResultMap(Map<String,Object> map, String result, String message, String tag, Object data){
        map.put("result",result);
        if(!isNullOrEmpty(message)){
            map.put("message",message);
        }
        if(!isNullOrEmpty(tag)){
            map.put(tag,data);
        }
    }
    //判断字符串是否为空
    private static boolean isNullOrEmpty(String str){
        return (null == str || "".equals(str));
    }
}

