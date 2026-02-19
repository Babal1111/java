package Collections;

public class UndoRedoStack {
    
}
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor("Hello World");

        System.out.println("Editor Content: " + editor.getContent());

        // Insert " Java" at position 11
        editor.performAction(new InsertAction(" Java", 11));
        System.out.println("Editor Content: " + editor.getContent());

        // Delete "World" from position 6
        editor.performAction(new DeleteAction(6, 5));
        System.out.println("Editor Content: " + editor.getContent());

        // Replace "Hello" with "Hi"
        editor.performAction(new ReplaceAction(0, "Hello", "Hi"));
        System.out.println("Editor Content: " + editor.getContent());

        // Undo twice
        System.out.println("\nUndo operations:");
        editor.undo();
        System.out.println("Editor Content: " + editor.getContent());

        editor.undo();
        System.out.println("Editor Content: " + editor.getContent());

        // Redo once
        System.out.println("\nRedo operation:");
        editor.redo();
        System.out.println("Editor Content: " + editor.getContent());
    }
}

/* ================= TEXT EDITOR ================= */

class TextEditor {

    private StringBuilder content;
    private Stack<EditorAction> undoStack;
    private Stack<EditorAction> redoStack;

    public TextEditor(String text) {
        content = new StringBuilder(text);
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void performAction(EditorAction action) {

        action.execute(this);

        undoStack.push(action);

        // clear redo history
        redoStack.clear();
    }

    public void undo() {

        if (!undoStack.isEmpty()) {

            EditorAction action = undoStack.pop();

            action.undo(this);

            redoStack.push(action);
        }
    }

    public void redo() {

        if (!redoStack.isEmpty()) {

            EditorAction action = redoStack.pop();

            action.execute(this);

            undoStack.push(action);
        }
    }

    public void insertText(String text, int position) {
        content.insert(position, text);
    }

    public String deleteText(int position, int length) {

        String deleted =
                content.substring(position, position + length);

        content.delete(position, position + length);

        return deleted;
    }

    public void replaceText(int position, int length, String newText) {
        content.replace(position, position + length, newText);
    }

    public String getContent() {
        return content.toString();
    }
}

/* ================= ACTION ================= */

abstract class EditorAction {

    abstract void execute(TextEditor editor);

    abstract void undo(TextEditor editor);
}

/* ================= INSERT ================= */

class InsertAction extends EditorAction {

    private String text;
    private int position;

    public InsertAction(String text, int position) {
        this.text = text;
        this.position = position;
    }

    public void execute(TextEditor editor) {
        editor.insertText(text, position);
    }

    public void undo(TextEditor editor) {
        editor.deleteText(position, text.length());
    }
}

/* ================= DELETE ================= */

class DeleteAction extends EditorAction {

    private int position;
    private int length;
    private String deletedText;

    public DeleteAction(int position, int length) {
        this.position = position;
        this.length = length;
    }

    public void execute(TextEditor editor) {

        deletedText = editor.deleteText(position, length);
    }

    public void undo(TextEditor editor) {

        editor.insertText(deletedText, position);
    }
}

/* ================= REPLACE ================= */

class ReplaceAction extends EditorAction {

    private int position;
    private String oldText;
    private String newText;

    public ReplaceAction(int position,
                         String oldText,
                         String newText) {

        this.position = position;
        this.oldText = oldText;
        this.newText = newText;
    }

    public void execute(TextEditor editor) {

        editor.replaceText(position,
                oldText.length(),
                newText);
    }

    public void undo(TextEditor editor) {

        editor.replaceText(position,
                newText.length(),
                oldText);
    }
}
