package com.javedrpi.servicelocatorfactorypattern.way2.config;

import com.javedrpi.servicelocatorfactorypattern.way2.service.IDbRepositoryFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Javed Ameen Shaikh
 * @website <a href="https://www.javedrpi.com/me">Portfolio</a>
 */

@Configuration
public class DbFactoryBeanConfig {
    @Bean
    public FactoryBean<Object> dbRepositoryFactoryBean(){
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        factoryBean.setServiceLocatorInterface(IDbRepositoryFactory.class);
        return factoryBean;
    }
}
