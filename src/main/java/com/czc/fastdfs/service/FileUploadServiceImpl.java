package com.czc.fastdfs.service;

import com.czc.fastdfs.bean.chen.MovieFileBean;
import com.czc.fastdfs.mapper.chen.FileUploadMapper;
import com.czc.fastdfs.serviceintf.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : chen.zhangchao
 * @date 2019/6/8 0:03
 * @todo 电影
 */
@Service
public class FileUploadServiceImpl implements FileUploadService {


    @Autowired
    private FileUploadMapper fileUploadMapper;

    @Override
    public void addMovieInfo(int id, String url) {
        MovieFileBean movieFileBean = new MovieFileBean();
        movieFileBean.setPicPath(url);
        movieFileBean.setMovieId(id);
        fileUploadMapper.addMovieBean(movieFileBean);
    }
}
