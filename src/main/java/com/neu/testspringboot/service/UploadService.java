package com.neu.testspringboot.service;

import com.neu.testspringboot.dto.Message;
import com.neu.testspringboot.service.baseService.BaseService;

public interface UploadService extends BaseService {

    public Message savePicURL(String picURL);
}
