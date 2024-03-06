package com.example.demo13.Configuration;

import com.example.demo13.Interceptor.APILoggingInterceptor;
import com.example.demo13.Interceptor.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {
    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;
    @Autowired
    private LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //NB: mappare con il path se voglio che sia davvero specifico il login, non è mappato nell'interceptor
        registry.addInterceptor(apiLoggingInterceptor).addPathPatterns("/date/local");
        registry.addInterceptor(legacyInterceptor);
    }
}
