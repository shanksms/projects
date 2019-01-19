package cde.codeboje.springbootbook.commentstore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import cde.codeboje.springbootbook.commentstore.service.CommentModel;
import cde.codeboje.springbootbook.commentstore.service.CommentModelRepository;
import cde.codeboje.springbootbook.commentstore.service.CommentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class CommentstoreServiceImplTest {

	@Autowired
	private CommentModelRepository repository;

	@Autowired
	private CommentService service;

	private CommentModel model;

	@Before
	public void setup() {
		model = new CommentModel();

		model.setId("dqe345e456rf34rw");
		model.setPageId("product0815");
		repository.deleteAll();
	}

	@Test
	public void testPutAndGet() throws IOException {
		service.put(model);

		String id = service.put(model);
		System.out.println("id " + id);

	}



}
