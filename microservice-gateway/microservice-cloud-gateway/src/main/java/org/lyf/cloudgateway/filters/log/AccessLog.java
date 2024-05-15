package org.lyf.cloudgateway.filters.log;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liyunfei
 **/
@Data
public class AccessLog<T> implements Serializable {

    private String id;

    private T content;

    private Long timestamp = System.currentTimeMillis();


}
