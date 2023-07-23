package com.javedrpi.servicelocatorfactorypattern.way1.config;

import com.javedrpi.servicelocatorfactorypattern.way1.service.IOutputLoggerFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Javed Ameen Shaikh
 * @website <a href="https://www.javedrpi.com/me">Portfolio</a>
 */

@Configuration
public class FactoryBeanConfig {
    @Bean
    public FactoryBean<Object> outputLoggerFactoryBean(){
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        factoryBean.setServiceLocatorInterface(IOutputLoggerFactory.class);
        return factoryBean;
    }
}
