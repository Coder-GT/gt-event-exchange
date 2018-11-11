package com.gt.exchange.constant.qq;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 创建时间：2018/七月/22
 *
 * @author 张政[zhang_zheng@gt.com.cn]
 * 类名：MoJoEvent
 * 描述：MoJoEvent定义的事件类型
 */
@AllArgsConstructor
@Getter
public enum MoJoEvent {
    /**
     * 接收消息
     */
    RECEIVE_MESSAGE("receive_message"),
    /**
     * 发送消息
     */
    SEND_MESSAGE("send_message"),
    /**
     * 其他事件
     */
    EVENT("event"),

    /**
     * 未识别的
     */
    UNDEFINED("undefined");

    private String eventName;

    public static MoJoEvent match(Object name) {
        if (name instanceof String) {
            for (MoJoEvent item : MoJoEvent.values()) {
                if (item.getEventName().equals(name)) {
                    return item;
                }
            }
        }
        return UNDEFINED;
    }

}
