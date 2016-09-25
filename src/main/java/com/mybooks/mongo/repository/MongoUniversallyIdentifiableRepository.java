package com.mybooks.mongo.repository;

import com.mybooks.mongo.document.universallyIdentifiable.UniversallyIdentifiableDocument;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MongoUniversallyIdentifiableRepository<T extends UniversallyIdentifiableDocument> extends MongoBaseRepository<T>
{
    public T findByUuid(String uuid);
}
