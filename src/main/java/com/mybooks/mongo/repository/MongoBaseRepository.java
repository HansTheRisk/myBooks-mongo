package com.mybooks.mongo.repository;

import com.mybooks.mongo.document.identifiable.Document;
import com.mybooks.mongo.document.identifiable.DocumentID;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MongoBaseRepository<T extends Document> extends MongoRepository<T, DocumentID>
{
}
