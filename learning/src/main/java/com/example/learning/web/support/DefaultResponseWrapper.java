package com.example.learning.web.support;

public class DefaultResponseWrapper<E> implements ResponseWrapper<E> {
    private static final String SUCCESS = "success";

    private final String status;
    private final E data;

    public DefaultResponseWrapper(final E data) {
        this.status = SUCCESS;
        this.data = data;
    }

    public DefaultResponseWrapper() {
        this.status = SUCCESS;
        this.data = null;
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public E getData() {
        return data;
    }
}
