package com.learn.ssm.chapter5.mapper;

import com.learn.ssm.chapter5.pojo.Task;

/**
 * @Classname TaskMapper
 * @Description TODO
 * @Date 19-5-16 下午7:29
 * @Created by ltt
 */
public interface TaskMapper {
    public Task getTask(Long id);

}
