package com.neu.testspringboot.service;

import com.neu.testspringboot.dto.Message;
import com.neu.testspringboot.dto.Message2;
import com.neu.testspringboot.dto.Message3;
import com.neu.testspringboot.dto.Message4;
import com.neu.testspringboot.service.baseService.BaseService;
import com.neu.testspringboot.service.baseService.BaseServiceImpl;

public interface UserInfoService extends BaseService {

    public Message findAll();
    public Message2 findAll2();
    public Message3 findAll3();
    public Message4 findAll4();

}
