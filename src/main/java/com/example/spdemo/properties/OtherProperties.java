package com.example.spdemo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix="other" )
@PropertySource(value = "classpath:other.properties" , encoding = "utf-8")
public class OtherProperties {
    private String title;
    private String blog;
}
