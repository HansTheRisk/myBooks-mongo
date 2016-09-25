package mongo.document.universallyIdentifiable;

import mongo.document.identifiable.Identifiable;

public interface UniversallyIdentifiable extends Identifiable
{
    String getUuid();
    void setUuid(String uuid);
}
