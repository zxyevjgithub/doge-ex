package com.doge.exchange.center.api.model.res;

import lombok.Data;

import java.io.Serializable;

/**
 * 账户开户ResDTO
 *
 * @author aaaaa
 * @date 2021/01/19
 */
@Data
public class OpenResDTO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -9007110677105602290L;

    /**
     * 资金账号
     */
    private String accountNo;

}
