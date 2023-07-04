/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.netbeans.modules.countries;

import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.StyledDocument;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionTask;

/**
 *
 * @author Ferdi
 */
@MimeRegistration(mimeType = "text/html", service = CompletionProvider.class)
public class CountriesCompletionProvider implements CompletionProvider {
 
    @Override
    public CompletionTask createTask(int i, JTextComponent jtc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getAutoQueryTypes(JTextComponent jtc, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    static int getRowFirstNonWhite(StyledDocument doc, int offset)
    throws BadLocationException {
        Element lineElement = doc.getParagraphElement(offset);
        int start = lineElement.getStartOffset();
        while (start + 1 < lineElement.getEndOffset()) {
            try {
                if (doc.getText(start, 1).charAt(0) != ' ') {
                    break;
                }
            } catch (BadLocationException ex) {
                throw (BadLocationException)new BadLocationException(
                        "calling getText(" + start + ", " + (start + 1) +
                        ") on doc of length: " + doc.getLength(), start
                        ).initCause(ex);
            }
            start++;
        }
        return start;
    }
    static int indexOfWhite(char[] line){
        int i = line.length;
        while(--i > -1){
            final char c = line[i];
            if(Character.isWhitespace(c)){
                return i;
            }
        }
        return -1;
    }
}
