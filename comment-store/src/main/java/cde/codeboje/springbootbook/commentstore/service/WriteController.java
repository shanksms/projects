package cde.codeboje.springbootbook.commentstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WriteController {

    @Autowired
    private CommentService commentService;
}
