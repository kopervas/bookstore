package com.bookstore.dto;

public record BookSearchParameters(String[] title, String[] author, String[] isbn) {

}
