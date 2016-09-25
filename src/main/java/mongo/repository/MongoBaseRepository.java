package mongo.repository;

import mongo.document.identifiable.Document;
import mongo.document.identifiable.DocumentID;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MongoBaseRepository<T extends Document> extends MongoRepository<T, DocumentID>
{
}
