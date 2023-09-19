package com.neu.testspringboot.controller;


import com.neu.testspringboot.dto.Message;
import com.neu.testspringboot.service.UploadService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.*;
import java.net.URLEncoder;
import java.util.UUID;

@RestController
public class UploadController {

    @Autowired
    UploadService uploadService;

    @PostMapping("/upload")
    public Message upload(MultipartFile myFile){
        Message message = new Message();

        String path = "/Users/junghoonpark/Desktop/학교/2023년/인턴/File Directory";

        String fileName = myFile.getOriginalFilename();
        String newFileName = UUID.randomUUID() + fileName.substring(fileName.indexOf("."));

        File targetFile = new File(path, newFileName);

        try {
            myFile.transferTo(targetFile);
            message = uploadService.savePicURL(newFileName);
//            message.setStatusCode(200);
//            message.setMsg("ok, " + newFileName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return message;

    }

    @GetMapping(value = "/downloadFile", consumes = MediaType.ALL_VALUE)
    void downloadFile(final HttpServletResponse response) throws Exception {
        File file = new File("/Users/junghoonpark/Desktop/사진 정리/파일 모음/IMG_3731.JPG");
        String fileName = file.getName();

        response.reset();
        response.setContentType("application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;fileName="
                + fileName + ";filename*=utf-8''" + URLEncoder.encode(fileName, "utf-8"));

        byte[] buffer = new byte[1024];
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);

            OutputStream os = response.getOutputStream();
            int i = bis.read(buffer);
            while (i != 1){
                os.write(buffer, 0, i);
                i = bis.read(buffer);
            }
            System.out.println("Download Successfully");
        } catch (Exception e) {
            System.out.println("Download Failed");
        } finally {
            if (bis != null){
                try {
                    bis.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
