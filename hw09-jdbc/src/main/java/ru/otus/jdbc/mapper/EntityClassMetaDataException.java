package ru.otus.jdbc.mapper;

public class EntityClassMetaDataException extends RuntimeException {
    public EntityClassMetaDataException(String s) {
        super(s);
    }

    public EntityClassMetaDataException(Throwable cause) {
        super(cause);
    }
}
