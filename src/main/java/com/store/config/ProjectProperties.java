package com.store.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author Administrator
 * @Date 2018/4/17 0017
 * @Description
 */
@ConfigurationProperties(prefix = "project")
@PropertySource("classpath:application-dev.yml")
public class ProjectProperties {
    @Value("${spring.application.name}")
    private String applicationName;

    public String getApplicationName() {
        return applicationName;
    }

    private final Config config = new Config();

    public Config getConfig(){
        return config;
    }

    public static class Config{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
