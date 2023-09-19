package com.neu.testspringboot.service.serviceImpl;

import com.neu.testspringboot.dto.Message;
import com.neu.testspringboot.service.UploadService;
import com.neu.testspringboot.service.baseService.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.SplittableRandom;

@Service
public class UploadServiceImpl extends BaseServiceImpl implements UploadService {
    @Override
    public Message savePicURL(String picName) {
        Message message = new Message();
        //save the pic
        String picServer = "http://192.168.2.100:8080/";
        String picURL = picServer + picName;
        System.out.println(picURL);
        message.setStatusCode(200);
        message.setMsg("ok " + picURL);
        return message;
    }
}
