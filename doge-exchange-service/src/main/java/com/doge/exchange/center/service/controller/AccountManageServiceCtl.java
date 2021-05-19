package com.doge.exchange.center.service.controller;

import com.doge.exchange.center.api.model.Result;
import com.doge.exchange.center.api.model.req.OpenReqDTO;
import com.doge.exchange.center.api.model.res.OpenResDTO;
import com.doge.exchange.center.api.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 账户管理服务
 *
 * @author aaaaa
 * @date 2021/01/19
 */
@RestController
@RequestMapping(value = "/account/accountManage")
public class AccountManageServiceCtl {

    @Autowired
    ManageService manageService;

    /**
     * 账户开户
     *
     * @param reqDTO 账户开户ReqDTO
     * @return 账户开户ResDTO
     */
    @RequestMapping(value = "/accountOpen", method = RequestMethod.POST)
    public Result<OpenResDTO> accountOpen(@RequestBody OpenReqDTO reqDTO) {
        return manageService.accountOpen(reqDTO);
    }

}
