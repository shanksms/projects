package cde.codeboje.springbootbook.commentstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.UUID;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentModelRepository commentModelRepository;

    @Override
    @Transactional
    public String put(CommentModel commentModel) throws IOException {
        commentModel.setId(UUID.randomUUID().toString());

        commentModelRepository.save(commentModel);
        return commentModel.getId();
    }

    @Override
    public String delete(String id) {
        return null;
    }
}
