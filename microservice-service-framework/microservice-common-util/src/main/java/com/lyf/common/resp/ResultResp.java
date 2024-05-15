package com.lyf.common.resp;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liyunfei
 **/
@Data
public class ResultResp<T> implements Serializable {

    private Integer code;

    private String msg;

    private T content;

}
