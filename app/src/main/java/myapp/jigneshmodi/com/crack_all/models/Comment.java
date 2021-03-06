package myapp.jigneshmodi.com.crack_all.models;

import java.io.Serializable;

/**
 * Created by jigneshmodi on 03/11/17.
 */

public class Comment implements Serializable {
    private User user;
    private String commentId;
    private  long timeCreated;
    private String comment;

    public Comment(User user, String commentId, long timeCreated, String comment) {
        this.user = user;
        this.commentId = commentId;
        this.timeCreated = timeCreated;
        this.comment = comment;
    }

    public Comment() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public long getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(long timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
