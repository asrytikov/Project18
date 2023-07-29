package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = context.getBean(CommentService.class);
        var s2 = context.getBean(UserService.class);

        boolean b1 = s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(b1);

        /*System.out.println("Before");
        var service = context.getBean(CommentService.class);
        System.out.println("After");*/

        /*var c1 = context.getBean("commentService", CommentService.class);
        var c2 = context.getBean("commentService", CommentService.class);

        boolean b = c1 == c2;
        System.out.println(b);*/

    }
}