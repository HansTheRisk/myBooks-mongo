package com.mybooks.mongo.document.universallyIdentifiable;

import com.mybooks.mongo.document.identifiable.Identifiable;

public interface UniversallyIdentifiable extends Identifiable
{
    String getUuid();
    void setUuid(String uuid);
}
