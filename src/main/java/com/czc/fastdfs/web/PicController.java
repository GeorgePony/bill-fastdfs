package com.czc.fastdfs.web;

import com.czc.fastdfs.service.FastDFSClientWrapper;
import com.czc.fastdfs.serviceintf.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author : chen.zhangchao
 * @date 2019/6/7 23:58
 * @todo 文件上传的web
 */
@RestController
@RequestMapping("/fdfs")
public class PicController
{
    @Autowired
    private FastDFSClientWrapper fastDFSClientWrapper;

    @Autowired
    private FileUploadService fileUploadService;

    @Value("${fdfs.url}")
    private String hdfsPath;


    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam(name = "file", required = true) MultipartFile file,
                             @RequestParam(name="type") String type,
                             @RequestParam(name="id") int id )throws IOException{
        String url = getUrl(file);
        if("movie".equalsIgnoreCase(type)){
            fileUploadService.addMovieInfo(id , url);
        }
        return url;
    }




    private String getUrl(MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        String originalFileName = file.getOriginalFilename();
        String extension = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
        String fileName = file.getName();
        long fileSize = file.getSize();
        return hdfsPath +  fastDFSClientWrapper.uploadFile(bytes, fileSize, extension);
    }

}
