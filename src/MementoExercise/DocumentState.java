package MementoExercise;

import java.util.HashMap;
import java.util.Map;

public class DocumentState {
    private String content;
    private String fontName;
    private int fontSize;
    Map<String, Object> values = new HashMap<>();


    public DocumentState(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;

        values.put("content", content);
        values.put("fontName", fontName);
        values.put("fontSize", fontSize);
    }

    public Map<String, Object> getValues() { return values; }
}
