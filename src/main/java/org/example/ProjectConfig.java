package org.example;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    //@Lazy
   /* @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CommentService commentService(){
        CommentService commentService = new CommentService();
        return commentService;
    }*/
}
