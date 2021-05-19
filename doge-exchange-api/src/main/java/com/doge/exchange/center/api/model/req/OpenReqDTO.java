package com.doge.exchange.center.api.model.req;

import lombok.Data;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotNull;

import java.io.Serializable;

/**
 * 账户开户ReqDTO
 *
 * @author aaaaa
 * @date 2021/01/19
 */
@Data
public class OpenReqDTO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 8235468342778336850L;

    /**
     * 账户类型
     */
    @NotNull(message = "账户类型不能为空")
    @NotBlank(message = "账户类型不能为空或空格")
    @Length(max = 16, message = "账户类型超过最大长度（16）")
    private String accountType;

    /**
     * 账户属性
     */
    @NotNull(message = "账户属性不能为空")
    @NotBlank(message = "账户属性不能为空或空格")
    @Length(max = 32, message = "账户属性参数超过最大长度（32）")
    private String accountAttribute;

    /**
     * 客户账号
     */
    @NotNull(message = "客户账号不能为空")
    @NotBlank(message = "客户账号不能为空或空格")
    @Length(max = 32, message = "客户账号超过最大长度（32）")
    private String contractNo;

    /**
     * 资金账户号
     */
    @NotNull(message = "资金账户号不能为空")
    @NotBlank(message = "资金账户号不能为空或空格")
    @Length(max = 64, message = "资金账户号超过最大长度（64）")
    private String accountNo;

    /**
     * 货币类型
     */
    @NotNull(message = "货币类型不能为空")
    @NotBlank(message = "货币类型不能为空或空格")
    @Length(max = 3, message = "货币类型超过最大长度(3)")
    private String ccy;

    /**
     * 核算机构
     */
    @NotNull(message = "核算机构不能为空")
    @NotBlank(message = "核算机构不能为空或空格")
    @Length(max = 32, message = "核算机构超过最大长度（32）")
    private String branch;

    /**
     * 备注
     */
    @Length(max = 256, message = "备注超过最大长度(256)")
    private String remark;

    /**
     * 操作人员
     */
    @NotNull(message = "操作人员不能为空")
    @NotBlank(message = "操作人员不能为空或空格")
    @Length(max = 64, message = "操作人员超过最大长度(64)")
    private String operator;

}
