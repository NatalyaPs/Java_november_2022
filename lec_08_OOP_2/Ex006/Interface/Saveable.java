package lec_08_OOP_2.Ex006.Interface;

import lec_08_OOP_2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
