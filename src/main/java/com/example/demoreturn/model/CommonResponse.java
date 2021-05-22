package com.example.demoreturn.model;

import java.io.Serial;
import java.io.Serializable;

/**
 * 通用响应类，增加泛型接口
 * @author pangkang
 * @version 2018-1-24 13:56:13 V1.1
 * @param <T> 结果result模型
 */
public class CommonResponse<T> implements Serializable {

    /**
     *
     */
    @Serial
    private static final long serialVersionUID = -7367995372616638542L;
//    @ApiModelProperty("返回结果码.-1为正常")
    private int code;
//    @ApiModelProperty("结果模型")
    private T result;
//    @ApiModelProperty("错误信息")
    private String serviceMessage ="";
    public void setTrueCode() {
        this.code = -1;
    }
    //返回数据有错，但是不需要执行错误码时，可调用该方法来设置默认的不正确错误码
    public void setFalseCode(){
        this.code = 1;
    }
    public String getServiceMessage() {
        return serviceMessage;
    }
    public void setServiceMessage(String serviceMessage) {
        this.serviceMessage = serviceMessage;
    }
    public T getResult() {
        return result;
    }
    public void setResult(T result) {
        this.result = result;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
}
