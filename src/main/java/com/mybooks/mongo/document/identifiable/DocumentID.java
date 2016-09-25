package com.mybooks.mongo.document.identifiable;

import com.mybooks.mongo.identifier.Identifier;

public class DocumentID extends Identifier<Long>
{
    public DocumentID(long id)
    {
        super(new Long(id));
    }
}
