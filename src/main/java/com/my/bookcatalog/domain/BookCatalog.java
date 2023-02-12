package com.my.bookcatalog.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import javax.validation.constraints.*;

import java.io.Serializable;

/**
 * A BookCatalog.
 */
@Document(collection = "book_catalog")
public class BookCatalog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @NotNull
    @Field("title")
    private String title;

    @NotNull
    @Field("author")
    private String author;

    @Field("description")
    private String description;

    @NotNull
    @Field("book_id")
    private String bookId;

    @Field("rent_cnt")
    private Integer rentCnt;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public BookCatalog title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public BookCatalog author(String author) {
        this.author = author;
        return this;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public BookCatalog description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBookId() {
        return bookId;
    }

    public BookCatalog bookId(String bookId) {
        this.bookId = bookId;
        return this;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Integer getRentCnt() {
        return rentCnt;
    }

    public BookCatalog rentCnt(Integer rentCnt) {
        this.rentCnt = rentCnt;
        return this;
    }

    public void setRentCnt(Integer rentCnt) {
        this.rentCnt = rentCnt;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BookCatalog)) {
            return false;
        }
        return id != null && id.equals(((BookCatalog) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "BookCatalog{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", author='" + getAuthor() + "'" +
            ", description='" + getDescription() + "'" +
            ", bookId='" + getBookId() + "'" +
            ", rentCnt=" + getRentCnt() +
            "}";
    }
}
