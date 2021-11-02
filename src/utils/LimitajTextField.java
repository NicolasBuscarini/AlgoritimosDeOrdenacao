package utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitajTextField extends PlainDocument {

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        int ilen = (getLength() + str.length());
        if (ilen <= 7) 
            super.insertString(offs, str.replaceAll("[^0-9]", ""), a); 
    }
}
