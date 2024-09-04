package io.smallrye.graphql.test.namespace;

import io.smallrye.graphql.api.federation.FieldSet;
import io.smallrye.graphql.api.federation.Key;

@Key(fields = @FieldSet("id"))
public class SourceNamespaceModel {
    private String id;
    private String value;

    public SourceNamespaceModel() {
    }

    public SourceNamespaceModel(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
