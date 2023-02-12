package com.my.bookcatalog.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * A DTO for the {@link com.my.bookcatalog.domain.BookCatalog} entity.
 */
public class BookCatalogDTO implements Serializable {
    
    private String id;

    @NotNull
    private String title;

    @NotNull
    private String author;

    private String description;

    @NotNull
    private String bookId;

    private Integer rentCnt;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Integer getRentCnt() {
        return rentCnt;
    }

    public void setRentCnt(Integer rentCnt) {
        this.rentCnt = rentCnt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BookCatalogDTO)) {
            return false;
        }

        return id != null && id.equals(((BookCatalogDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "BookCatalogDTO{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", author='" + getAuthor() + "'" +
            ", description='" + getDescription() + "'" +
            ", bookId='" + getBookId() + "'" +
            ", rentCnt=" + getRentCnt() +
            "}";
    }
}
