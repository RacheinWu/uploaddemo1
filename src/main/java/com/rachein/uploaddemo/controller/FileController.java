package com.rachein.uploaddemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/file")
public class FileController {

    @PostMapping("/upload")
    public void upload(MultipartFile file) throws IOException {

        if (file.getContentType().equals("application/octet-stream")) {
            System.out.println("错误！不允许空文件!");

        } else {
            //获取当前登陆对象
            //获取文件原始名称
            //获取文件的后缀
            //生成新的文件名称
            //获取文件大小
            //文件类型
            //处理根据日期生成目录
            String realPath = ResourceUtils.getURL("classpath:").getPath() + "/static/files";
            System.out.println("realpath" + realPath);
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            String dateDirPath = realPath + "/" + format;
            System.out.println(dateDirPath);
            File dataDir = new File(dateDirPath);
            if (!dataDir.exists());
            //处理文件上传

            //将文件存入数据库
        }


    }


}
