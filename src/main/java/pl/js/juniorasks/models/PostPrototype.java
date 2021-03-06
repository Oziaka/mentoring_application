package pl.js.juniorasks.models;

import java.util.Objects;

public final class PostPrototype {

    private final String title;
    private final String content;

    public PostPrototype(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostPrototype postPrototype = (PostPrototype) o;
        return Objects.equals(title, postPrototype.title) &&
                Objects.equals(content, postPrototype.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content);
    }
}
