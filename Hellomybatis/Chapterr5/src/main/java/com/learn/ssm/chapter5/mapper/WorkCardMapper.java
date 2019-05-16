package com.learn.ssm.chapter5.mapper;

import com.learn.ssm.chapter5.pojo.WorkCard;

/**
 * @Classname WorkCardMapper
 * @Description TODO
 * @Date 19-5-16 下午10:45
 * @Created by ltt
 */
public interface WorkCardMapper {
    public WorkCard getWorkCardByEmpId(Long empId);
}
