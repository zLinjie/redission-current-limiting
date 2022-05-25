package com.zvhs.currentlimiting.contants;

/**
 * 限流类型
 */
public enum LimitType {
    /**
     * 自定义 key
     */
    CUSTOMER,
    /**
     * IP 作为 key
     */
    IP;
}
