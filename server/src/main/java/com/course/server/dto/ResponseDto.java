package com.course.server.dto;

import lombok.Data;

/**
 * @author mingtu
 * @create 2024-03-30 11:33
 */
@Data
public class ResponseDto<T> {
    private T content; //业务上的成功或者失败
    private boolean isSuccess=true; //业务上的成功或者失败
    private String code; //返回值
    private String message; //返回信息
    private T data; // 返回结果
}
