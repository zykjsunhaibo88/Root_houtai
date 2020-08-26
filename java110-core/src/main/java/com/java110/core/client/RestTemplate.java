package com.java110.core.client;

import com.java110.utils.constant.ServiceConstant;
import com.java110.utils.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

/**
 * @author wux
 * @create 2019-02-02 下午8:28
 * @desc 对RestTemplate类封装
 **/
public class RestTemplate extends org.springframework.web.client.RestTemplate {

    private static Logger logger = LoggerFactory.getLogger(RestTemplate.class);

    public static final String URL_COMMON_SERVICE = "http://common-service";
    public static final String URL_ORDER_SERVICE = "http://order-service";
    public static final String URL_USER_SERVICE = "http://user-service";
    public static final String URL_STORE_SERVICE = "http://store-service";
    public static final String URL_COMMUNITY_SERVICE = "http://community-service";
    public static final String URL_JOB_SERVICE = "http://job-service";
    public static final String URL_FRONT_SERVICE = "http://front-service";
    public static final String URL_FEE_SERVICE = "http://fee-service";

    // exchange

    /**
     * 重写spring RestTemplate类 加入日志等信息
     *
     * @param url
     * @param method
     * @param requestEntity
     * @param responseType
     * @param uriVariables
     * @param <T>
     * @return
     * @throws RestClientException
     */
    @Override
    public <T> ResponseEntity<T> exchange(String url, HttpMethod method,
                                          HttpEntity<?> requestEntity, Class<T> responseType, Object... uriVariables) throws RestClientException {

        url = replaceUrl(url);
        Long startTime = DateUtil.getCurrentDate().getTime();
        logger.debug("请求信息：url:{},method:{},request:{},uriVariables:{},startTime:{}", url, method, requestEntity, uriVariables,startTime);
        ResponseEntity<T> responseEntity = null;

        try {
            responseEntity = super.exchange(url, method, requestEntity, responseType, uriVariables);

            logger.debug("返回信息：responseEntity:{}", responseEntity);
        } catch (Exception e) {
            logger.error("调用接口失败", e);
        }

        logger.debug("-----------------------------------------------------------------------------------请求信息：costTime:{}-----------------------------------------------------------------------------------", DateUtil.getCurrentDate().getTime()-startTime);

        return responseEntity;
    }


    @Override
    public <T> T postForObject(String url, Object request, Class<T> responseType, Object... uriVariables) throws RestClientException {
        url = replaceUrl(url);
        return super.postForObject(url, request, responseType, uriVariables);
    }

    public String replaceUrl(String url) {
        if (url.contains(URL_COMMON_SERVICE)) {
            return url.replace(URL_COMMON_SERVICE, ServiceConstant.SERVICE_SERVICE_URL);
        } else if (url.contains(URL_ORDER_SERVICE)) {
            return url.replace(URL_ORDER_SERVICE, ServiceConstant.SERVICE_SERVICE_URL);
        } else if (url.contains(URL_USER_SERVICE)) {
            return url.replace(URL_USER_SERVICE, ServiceConstant.SERVICE_SERVICE_URL);
        } else if (url.contains(URL_STORE_SERVICE)) {
            return url.replace(URL_STORE_SERVICE, ServiceConstant.SERVICE_SERVICE_URL);
        } else if (url.contains(URL_COMMUNITY_SERVICE)) {
            return url.replace(URL_COMMUNITY_SERVICE, ServiceConstant.SERVICE_SERVICE_URL);
        } else if (url.contains(URL_JOB_SERVICE)) {
            return url.replace(URL_JOB_SERVICE, ServiceConstant.SERVICE_SERVICE_URL);
        } else if (url.contains(URL_FRONT_SERVICE)) {
            return url.replace(URL_FRONT_SERVICE, ServiceConstant.SERVICE_SERVICE_URL);
        } else if (url.contains(URL_FEE_SERVICE)) {
            return url.replace(URL_FEE_SERVICE, ServiceConstant.SERVICE_SERVICE_URL);
        }
        return url;
    }

}
