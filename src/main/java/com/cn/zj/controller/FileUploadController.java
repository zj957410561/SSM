package com.cn.zj.controller;

import com.cn.zj.util.UUIDUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TODO
 *
 * @author 95741
 * @version 1.0
 * @date 2021/1/6 19:52
 */
@Controller
public class FileUploadController {
    @RequestMapping("/upload")
    public String upload(MultipartFile multipartFile, HttpServletRequest request) throws IOException {
        // 获取实际的文件上传文件名称
        String uploadFile = multipartFile.getOriginalFilename();
        System.out.println(uploadFile);
        String suffix = uploadFile.substring(uploadFile.lastIndexOf("."));
        uploadFile = uploadFile + UUIDUtils.getUUID32();
        uploadFile = uploadFile + suffix;
        System.out.println(uploadFile);
        ServletContext servletContext = request.getServletContext();
        String upload = servletContext.getRealPath("upload");
        System.out.println(upload);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = simpleDateFormat.format(new Date());
        File parent = new File(upload + File.separator + date);
        System.out.println(upload + File.separator + date);
        if (!parent.exists()) {
            parent.mkdirs();
        }
        File file = new File(parent, uploadFile);
        multipartFile.transferTo(file);
        return "upload";


    }
}
