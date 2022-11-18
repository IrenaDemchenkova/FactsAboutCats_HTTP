import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    public String id;
    public String text;
    public String type;
    public String user;
    public Integer upvotes;

    public Post(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "Post: " +
                "id = " + id + '\n' +
                "text = " + text + '\n' +
                "type = " + type + '\n' +
                "user = " + user + '\n' +
                "upvotes = " + upvotes + '\n' +
                "*****\n";
    }
}
