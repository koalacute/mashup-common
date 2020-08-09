package com.xrikui.mashup.common.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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
     */
    public <T> T get(String url, Class<T> c) {
        return restTemplate.getForObject(url, c);
    }


    /**
     * POST请求
     *
     * @param url 请求地址
     * @param object 请求参数
     */
    public void post(String url, Object object) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity httpEntity = new HttpEntity(object, httpHeaders);
        restTemplate.postForEntity(url, httpEntity, String.class);
    }

}
