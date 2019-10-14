package com.ccid.official.controller;

import com.alibaba.fastjson.JSON;
import com.ccid.official.dao.entity.po.GwReceive;
import com.ccid.official.service.GwReceiveService;
import com.ccid.official.service.impl.GwReceiveServiceImpl;
import com.ccid.official.util.CommonResponse;

public class GwReceiveController {


    public String addGwReceive(GwReceive gwReceive)  {
        GwReceiveService gwReceiveService = new GwReceiveServiceImpl();
        int num= gwReceiveService.addGwReceive(gwReceive);
        CommonResponse response = new CommonResponse().code("200").message("录入收文成功").data(gwReceive);
        return JSON.toJSONString(response);
    }

}
