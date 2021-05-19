package com.doge.exchange.center.api.service;

import com.doge.exchange.center.api.model.Result;
import com.doge.exchange.center.api.model.res.OpenResDTO;
import com.doge.exchange.center.api.model.req.OpenReqDTO;

/**
 * 账户管理服务
 *
 * @author aaaaa
 * @date 2021/01/19
 */
public interface ManageService {

    /**
     * 账户开户
     *
     * @param reqDTO 账户开户ReqDTO
     * @return 账户开户ResDTO
     */
    Result<OpenResDTO> accountOpen(OpenReqDTO reqDTO);

}
