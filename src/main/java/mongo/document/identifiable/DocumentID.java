package mongo.document.identifiable;

import mongo.identifier.Identifier;

public class DocumentID extends Identifier<Long>
{
    public DocumentID(long id)
    {
        super(new Long(id));
    }
}
