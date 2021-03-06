package com.mybooks.mongo.service;

import com.mybooks.mongo.document.universallyIdentifiable.UniversallyIdentifiableDocument;
import com.mybooks.mongo.repository.MongoUniversallyIdentifiableRepository;

public class MongoUniversallyIdentifiableService<T extends UniversallyIdentifiableDocument> extends MongoBaseService<T>
{
    public UniversallyIdentifiableDocument findByUUID(String uuid)
    {
        return ((MongoUniversallyIdentifiableRepository)repository).findByUuid(uuid);
    }

    @Override
    public T save(T object) {
        object.setUuid(java.util.UUID.randomUUID().toString());
        return super.save(object);
    }
}