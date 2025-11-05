package org.example;

import java.util.ArrayList;
import java.util.List;
public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Document original = new Document("Design Notes");
        original.addParagraph("Intro to prototypes");
        original.addParagraph("They avoid expensive creation");


        Document copy = original.clone(); // deep copy
        copy.setTitle("Design Notes (Copy)");
        copy.addParagraph("This line exists only in the copy");


// Show independence
        System.out.println("Original: \n" + original);
        System.out.println("\nClone: \n" + copy);
    }
}


class Document implements Cloneable {
    private String title;
    private final List<String> paragraphs = new ArrayList<>();


    public Document(String title) { this.title = title; }


    public void setTitle(String title) { this.title = title; }
    public void addParagraph(String p) { paragraphs.add(p); }


    @Override public Document clone() throws CloneNotSupportedException {
        Document cloned = (Document) super.clone();
// Deep-copy the mutable list so clones can diverge independently
        cloned.paragraphs.clear();
        cloned.paragraphs.addAll(this.paragraphs);
        return cloned;
    }


    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(title).append('\n');
        for (int i = 0; i < paragraphs.size(); i++) {
            sb.append(i + 1).append(") ").append(paragraphs.get(i)).append('\n');
        }
        return sb.toString();
    }
}