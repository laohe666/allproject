package com.laohe.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/24 11:53
 */
@WebService
public class WeatherService {
    /**
     * 查询天气
     */
    public String queryWeather(String city) {
        String weather = "暴风雨";
        return weather;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8080/weather",new WeatherService());
    }

}
