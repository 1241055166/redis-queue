package com.henry.bean;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.henry.constants.JobStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: Henry
 * @Date: 2020/9/23 下午8:36
 * @Description: 任务
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job implements Serializable {

    /**
     * 延迟任务的唯一标识，用于检索任务
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 任务类型（具体业务类型）
     */
    private String topic;

    /**
     * 任务的延迟时间
     */
    private long delayTime;

    /**
     * 任务的执行超时时间
     */
    private long ttrTime;

    /**
     * 任务具体的消息内容，用于处理具体业务逻辑用
     */
    private String message;

    /**
     * 重试次数
     */
    private int retryCount;
    /**
     * 任务状态
     */
    private JobStatus status;
}
