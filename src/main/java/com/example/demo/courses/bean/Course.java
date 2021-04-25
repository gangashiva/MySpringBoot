package com.example.demo.courses.bean;

import java.util.Objects;

public class Course {
  private long id;
  private String name;
  private String author;

  public Course(long id, String name, String author) {
    this.id = id;
    this.name = name;
    this.author = author;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "Course{" + "id=" + id + ", name='" + name + '\'' + ", author='" + author + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Course)) {
      return false;
    }
    Course course = (Course)o;
    return getId() == course.getId() && Objects.equals(getName(), course.getName()) && Objects.equals(getAuthor(), course.getAuthor());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getName(), getAuthor());
  }
}
