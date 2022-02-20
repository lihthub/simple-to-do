package com.lihthub.simpletodo;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * 启动类
 *
 * @author lihaitao
 * @date 2022/2/19
 */
public class SimpleToDoApplication {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Simple To Do");

        Map<String, Object> map = new HashMap<>();
        map.put("success", true);
        map.put("message", "成功");
        String s = JSON.toJSONString(map);
        System.out.println(s);

        Thread.sleep(500000);
    }

}
