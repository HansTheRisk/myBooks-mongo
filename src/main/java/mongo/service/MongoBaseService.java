package mongo.service;

import mongo.document.identifiable.Document;
import mongo.document.identifiable.DocumentID;
import mongo.repository.MongoBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MongoBaseService<T extends Document>
{
    public T save(T object) {
        object.setId(new DocumentID(repository.count() + 1));
        return repository.save(object);
    }

    @Autowired
    protected MongoBaseRepository<T> repository;
}