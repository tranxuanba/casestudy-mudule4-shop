package com.casestudy.service.comment;

import com.casestudy.model.LoginUser;
import com.casestudy.model.Product;
import com.casestudy.model.UserComment;
import com.casestudy.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements ICommentService{

    @Autowired
    CommentRepository commentRepository;
    @Override
    public List<UserComment> findALl() {
        return null;
    }

    @Override
    public Page<UserComment> findALl(Pageable pageable) {
        return null;
    }

    @Override
    public UserComment findById(Long id) {
        return null;
    }

    @Override
    public UserComment save(UserComment userComment) {
        return commentRepository.save(userComment);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<UserComment> findUserCommentByProduct(Product product) {
        return commentRepository.findUserCommentByProduct(product);
    }

    @Override
    public List<UserComment> findUserCommentByLoginUser(LoginUser loginUser) {
        return commentRepository.findUserCommentByLoginUser(loginUser);
    }
}
