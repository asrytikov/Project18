package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private /*final*/ CommentRepository commentRepository;

    /*public CommentService(CommentRepository commentRepository){
        //this.commentRepository = commentRepository;
        System.out.println("CommentService instance created!");
    }*/

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    public void sendComment(Comment comment){
        CommentProcessor commentProcessor = context.getBean(CommentProcessor.class);
        commentProcessor.setComment(comment);
        commentProcessor.processComment(comment);
        commentProcessor.validateComment(comment);
        comment = commentProcessor.getComment();


    }
}
