
package com.java110;

import com.java110.core.annotation.Java110ListenerDiscovery;
import com.java110.core.annotation.Java110ListenerServiceDiscovery;
import com.java110.core.client.RestTemplate;
import com.java110.core.event.service.BusinessServiceDataFlowEventPublishing;
import com.java110.core.event.service.api.ServiceDataFlowEventPublishing;
import com.java110.service.init.ServiceStartInit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;


/**
 * spring boot 初始化启动类
 *
 * @version v0.1
 * @auther com.java110.wuxw
 * @mail 928255095@qq.com
 * @date 2016年8月6日
 * @tag "com.java110.api",
 * "com.java110.common",
 */
@SpringBootApplication(scanBasePackages = {
        "com.java110.core",
        "com.java110.config.properties.code",
        "com.java110.service",
        "com.java110.db",
        "com.java110.common",
        "com.java110.community",
        "com.java110.order",
        "com.java110.fee",
        "com.java110.store",
        "com.java110.user",
        "com.java110.front",
        "com.java110.job",
        "com.java110.api",
},
        exclude = {
                LiquibaseAutoConfiguration.class,
                org.activiti.spring.boot.SecurityAutoConfiguration.class,
                org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@Java110ListenerDiscovery(listenerPublishClass = ServiceDataFlowEventPublishing.class,
        basePackages = {"com.java110.api.listener"})

@Java110ListenerServiceDiscovery(listenerPublishClass = BusinessServiceDataFlowEventPublishing.class,
        basePackages = {"com.java110.community.listener",
                "com.java110.common.listener",
                "com.java110.fee.listener",
                "com.java110.job.listener",
                "com.java110.store.listener",
                "com.java110.user.listener"
        })
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class BootApplicationStart {

    private static Logger logger = LoggerFactory.getLogger(BootApplicationStart.class);

    /**
     * 实例化RestTemplate，通过@LoadBalanced注解开启均衡负载能力.
     *
     * @return restTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        StringHttpMessageConverter m = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        RestTemplate restTemplate = new RestTemplateBuilder().additionalMessageConverters(m).build(RestTemplate.class);
        return restTemplate;
    }

    /**
     * 实例化RestTemplate
     *
     * @return restTemplate
     */
    @Bean
    public RestTemplate outRestTemplate() {
        StringHttpMessageConverter m = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        RestTemplate restTemplate = new RestTemplateBuilder().additionalMessageConverters(m).build(RestTemplate.class);
        return restTemplate;
    }

    public static void main(String[] args) throws Exception {
        try {
            ApplicationContext context = SpringApplication.run(BootApplicationStart.class, args);

            //服务启动加载
            ServiceStartInit.initSystemConfig(context);
        } catch (Throwable e) {
            logger.error("系统启动失败", e);
        }
    }

}