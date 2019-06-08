package com.czc.fastdfs.bean.chen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : chen.zhangchao
 * @date 2019/6/7 22:40
 * @todo 电影的Bean
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieFileBean {

    private int movieId;

    private String picPath;

    private String commentText;

}
