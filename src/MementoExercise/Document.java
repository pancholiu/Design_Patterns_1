package mementoExercise;

import MementoExercise.DocumentState;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public DocumentState createState() {
        return new DocumentState(content, fontName, fontSize);
    }

    public String getContent() {
        return toString();
    }

    public void setContent(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public void restore(DocumentState state) {
        var values = state.getValues();

        this.content = (String) values.get("content");
        this.fontName = (String) values.get("fontName");
        this.fontSize = (int) values.get("fontSize");
    }


    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
