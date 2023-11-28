package com.timife.library_catalog.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Table(name = "books")
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {
    @Id
    private String isbn;
    private String title;

    private String author;

}
