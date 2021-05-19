package com.doge.exchange.center.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.doge.exchange.center.api.model.Result;
import com.doge.exchange.center.api.model.req.OpenReqDTO;
import com.doge.exchange.center.api.model.res.OpenResDTO;
import com.doge.exchange.center.api.service.ManageService;
import lombok.extern.slf4j.Slf4j;


/**
 * 账户管理服务
 *
 * @author aaaaa
 * @date 2021/01/19
 */
@Slf4j
@Service
public class ManageServiceImpl implements ManageService {


    @Override
    public Result<OpenResDTO> accountOpen(OpenReqDTO reqDTO) {
        return null;
    }
}
