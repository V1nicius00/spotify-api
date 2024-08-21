package dev.vini.spotify_api.client;

public class Show {

    private String id;
    private String description;
    private String name;
    private String publisher;
    private String type;

    public Show() {
    }

    public Show(String id, String description, String name, String publisher, String type) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.publisher = publisher;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
