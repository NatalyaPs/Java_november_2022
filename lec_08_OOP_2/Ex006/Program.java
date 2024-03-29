package lec_08_OOP_2.Ex006;

import lec_08_OOP_2.Ex006.Applications.Notepad;
import lec_08_OOP_2.Ex006.Format.*;

public class Program {
    public static void main(String[] args) {
        
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());

        System.out.println("     !!!      сохранены 3 файла: file1, file2, file2");

    }
}
