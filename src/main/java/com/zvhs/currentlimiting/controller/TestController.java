package com.zvhs.currentlimiting.controller;

import com.zvhs.currentlimiting.annotation.Limit;
import com.zvhs.currentlimiting.contants.LimitType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class TestController {

    private static final AtomicInteger ATOMIC_INTEGER_1 = new AtomicInteger();
    private static final AtomicInteger ATOMIC_INTEGER_2 = new AtomicInteger();
    private static final AtomicInteger ATOMIC_INTEGER_3 = new AtomicInteger();

    /**
     * 十秒内三次请求
     *
     * @return
     */
    @Limit(key = "limitTest1", period = 10, count = 3)
    @GetMapping("/test1")
    public int testLimit1() {
        return ATOMIC_INTEGER_1.incrementAndGet();
    }

    /**
     * 自定义 key
     */
    @Limit(key = "customer_limit_test", period = 10, count = 3, limitType = LimitType.CUSTOMER)
    @GetMapping("/test2")
    public int testLimiter2() {

        return ATOMIC_INTEGER_2.incrementAndGet();
    }

    /**
     * ip 限制
     */
    @Limit(key = "ip_limit_test", period = 10, count = 3, limitType = LimitType.IP)
    @GetMapping("/test3")
    public int testLimiter3() {

        return ATOMIC_INTEGER_3.incrementAndGet();
    }
}
