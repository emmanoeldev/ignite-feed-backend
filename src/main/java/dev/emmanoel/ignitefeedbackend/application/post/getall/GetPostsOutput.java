package dev.emmanoel.ignitefeedbackend.application.post.getall;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public record GetPostsOutput(AuthorOutput author, Map<String, List<String>> content, LocalDateTime publicationDate) {
    public static GetPostsOutput createGetPostsOutputWith(AuthorOutput author, Map<String, List<String>> content, LocalDateTime publicationDate) {
        return new GetPostsOutput(author, content, publicationDate);
    }
}

