package com.rachein.uploaddemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@SpringBootTest
class UploaddemoApplicationTests {

    @Test
    void contextLoads() {
        File f = new File("D:\\IdeaProjects\\uploaddemo1\\src\\main\\resources\\static\\new");
        if (f.mkdirs()) {
            System.out.println("T");
        } else System.out.println("F");

    }

    @Test
    void t2() throws FileNotFoundException {
        String newFileName = new SimpleDateFormat("yyyyMMddHHmmss") + UUID.randomUUID().toString();
        System.out.println(newFileName);
        String realPath = ResourceUtils.getURL("classpath:").getPath() + "/static/files";
        System.out.println(realPath);
        String dateDirPath = realPath + "/" + new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println(dateDirPath);
    }

    /**
     * 测试文件夹创建：
     */
    @Test
    void t3() throws FileNotFoundException {
        //处理根据日期生成目录
        String realPath = ResourceUtils.getURL("classpath:").getPath() + "/static/files";
        System.out.println("realpath" + realPath);
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String dateDirPath = realPath + "/" + format;
        System.out.println(dateDirPath);
        File dataDir = new File(dateDirPath);
        if (!dataDir.exists());
    }


}
