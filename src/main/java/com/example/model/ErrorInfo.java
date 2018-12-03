package com.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorInfo<T> {
    public static final Integer OK = 200;
    public static final Integer ERROR = 400;

    private Integer code;
    private String message;
    private String url;
    private T data;

}
