package com.neuq.info.entity;

import java.util.Date;

/**
 * Created by lihang on 2017/4/15.
 */
public class Like {
    private long postId;
    private long userId;
    private Date createTime;
    private User toUser;
    private User fromUser;
    public Like() {
    }

    public Like(long postId, long userId) {
        this.postId = postId;
        this.userId = userId;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User getToUser() {
        return toUser;
    }

    public void setToUser(User toUser) {
        this.toUser = toUser;
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }


    @Override
    public String toString() {
        return "Like{" +
                "postId=" + postId +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", toUser=" + toUser +
                ", fromUser=" + fromUser +
                '}';
    }
}
