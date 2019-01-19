package cde.codeboje.springbootbook.commentstore.service;

import java.io.IOException;

public interface CommentService {
    String put(CommentModel commentModel) throws IOException;

    String delete(String id);
}
