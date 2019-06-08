package com.czc.fastdfs.mapper.chen;

import com.czc.fastdfs.bean.chen.MovieFileBean;
import org.springframework.stereotype.Repository;

/**
 * @author : chen.zhangchao
 * @date 2019/6/7 22:48
 * @todo 文件上传Mapper
 */
@Repository
public interface FileUploadMapper {

    /**
     *
     * @param movieFileBean
     */
    void addMovieBean(MovieFileBean movieFileBean);
}
