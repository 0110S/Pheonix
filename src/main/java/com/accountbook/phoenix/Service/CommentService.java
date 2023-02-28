package com.accountbook.phoenix.Service;

import com.accountbook.phoenix.DTO.CommentRequest;
import com.accountbook.phoenix.DTO.MessageResponse;
import org.springframework.http.ResponseEntity;

public interface CommentService {
    ResponseEntity<MessageResponse> addCommentToPost(CommentRequest commentRequest);

    ResponseEntity<MessageResponse> addCommentToComment(CommentRequest commentRequest);

    ResponseEntity<MessageResponse> deleteComment(int postId, int commentId);
}
