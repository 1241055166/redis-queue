package com.henry.constants;

import lombok.Getter;

/**
 * @Author: Henry
 * @Date: 2020/9/23 下午8:40
 * @Description:  任务执行动作
 */
@Getter
public enum JobProcess {

    /**
     * 创建任务
     */
    PUT,
    /**
     * 创建延时任务
     */
    PUT_DELAY,
    /**
     * 延时结束
     */
    TIME_PASS,
    /**
     * 请求超时
     */
    TTR,
    /**
     * 消费者确认
     */
    RESERVE,
    /**
     * 完成
     */
    FINISH,
    /**
     * 删除
     */
    DELETE;
}
