package com.czc.fastdfs.serviceintf;

import com.czc.fastdfs.bean.chen.MovieFileBean;

/**
 * @author : chen.zhangchao
 * @date 2019/6/8 0:03
 * @todo 电影
 */
public interface FileUploadService {

    /**
     * 添加电影信息
     * @param id
     * @param url
     */
    void addMovieInfo(int id , String url);
}
