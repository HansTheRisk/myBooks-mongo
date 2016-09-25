package mongo.repository;

import mongo.document.universallyIdentifiable.UniversallyIdentifiableDocument;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MongoUniversallyIdentifiableRepository<T extends UniversallyIdentifiableDocument> extends MongoBaseRepository<T>
{
    public T findByUuid(String uuid);
}
