package com.ukou.entity;

import java.util.Date;

public class Works {

    private Integer id;

    private String title;

    private String content;

    private Integer author;

    private User user;

    private Date uploadTime;

    private Double size;

    private Date historyTime;

    private Date wholeTime;

    private Integer viewCounts;

    private Integer likeCounts;

    private Integer commentCounts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Date getHistoryTime() {
        return historyTime;
    }

    public void setHistoryTime(Date historyTime) {
        this.historyTime = historyTime;
    }

    public Date getWholeTime() {
        return wholeTime;
    }

    public void setWholeTime(Date wholeTime) {
        this.wholeTime = wholeTime;
    }

    public Integer getViewCounts() {
        return viewCounts;
    }

    public void setViewCounts(Integer viewCounts) {
        this.viewCounts = viewCounts;
    }

    public Integer getLikeCounts() {
        return likeCounts;
    }

    public void setLikeCounts(Integer likeCounts) {
        this.likeCounts = likeCounts;
    }

    public Integer getCommentCounts() {
        return commentCounts;
    }

    public void setCommentCounts(Integer commentCounts) {
        this.commentCounts = commentCounts;
    }

    @Override
    public String toString() {
        return "Works{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author=" + author +
                ", uploadTime=" + uploadTime +
                ", size=" + size +
                ", historyTime=" + historyTime +
                ", wholeTime=" + wholeTime +
                ", viewCounts=" + viewCounts +
                ", likeCounts=" + likeCounts +
                ", commentCounts=" + commentCounts +
                '}';
    }
}
