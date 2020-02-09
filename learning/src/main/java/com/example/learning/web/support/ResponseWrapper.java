package com.example.learning.web.support;

public interface ResponseWrapper<E> {
    String getMessage();
    String getStatus();
    E getData();
}
