package com.bookstore.service;

import com.bookstore.dto.BookDto;
import com.bookstore.dto.BookSearchParameters;
import com.bookstore.dto.CreateBookRequestDto;
import com.bookstore.dto.UpdateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto book);

    List<BookDto> findAll();

    BookDto findById(Long id);

    BookDto update(Long id, UpdateBookRequestDto requestDto);

    List<BookDto> search(BookSearchParameters bookSearchParameters);
}
