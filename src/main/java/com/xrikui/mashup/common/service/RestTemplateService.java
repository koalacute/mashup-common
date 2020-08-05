package com.xrikui.mashup.common.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {

    private final RestTemplate restTemplate = new RestTemplate();

    /**
     * GET请求
     *
     * @param url 请求地址
     * @param c   实体class
     * @param <T> 泛型
     * @return
     */
    public <T> T get(String url, Class<T> c) {
        return restTemplate.getForObject(url, c);
    }
}
