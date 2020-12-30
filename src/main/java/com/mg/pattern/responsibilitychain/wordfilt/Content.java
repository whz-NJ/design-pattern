package com.mg.pattern.responsibilitychain.wordfilt;

import java.util.Date;

/**
 * @author whz
 * @create 2020-12-07 17:06
 * @desc TODO: add description here
 **/
public class Content {
  private String content;
  private String author;
  private Date updateTime;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
}