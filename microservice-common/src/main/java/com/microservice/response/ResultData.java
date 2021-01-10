package com.microservice.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultData<T> {
    private int status = 200;
    private String message;
    private T data;
    private boolean success = true;
    private long timestamp;

    public static ResultData<String> success(String message) {
        ResultData<String> resultData = new ResultData<String>();
        resultData.setMessage(message);
        return resultData;
    }

    public static <T> ResultData<T> success(T data) {
        ResultData<T> resultData = new ResultData<T>();
        resultData.setData(data);
        return resultData;
    }
}