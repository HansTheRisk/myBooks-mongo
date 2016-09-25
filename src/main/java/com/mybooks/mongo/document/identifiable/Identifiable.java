package com.mybooks.mongo.document.identifiable;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface Identifiable
{
    DocumentID getId();
    void setId(DocumentID id);
}
