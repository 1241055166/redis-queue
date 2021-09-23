package com.henry.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: Henry
 * @Date: 2020/9/23 下午8:40
 * @Description:  任务类别
 */
@AllArgsConstructor
@Getter
public enum  JobTopic {

    TOPIC_ONE("one"),
    TOPIC_TWO("two");

    private String topic;
}
