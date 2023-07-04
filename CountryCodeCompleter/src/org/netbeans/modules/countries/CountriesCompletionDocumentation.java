/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.netbeans.modules.countries;

import java.net.URL;
import javax.swing.Action;
import org.netbeans.spi.editor.completion.CompletionDocumentation;

/**
 *
 * @author Ferdi
 */
public class CountriesCompletionDocumentation implements CompletionDocumentation {

    private CountriesCompletionItem item;

    public CountriesCompletionDocumentation(CountriesCompletionItem item) {
        this.item = item;
    }

    @Override
    public String getText() {
        return "Information about " + item.text;
    }

    @Override
    public URL getURL() {
        return null;
    }

    @Override
    public CompletionDocumentation resolveLink(String string) {
        return null;
    }

    @Override
    public Action getGotoSourceAction() {
        return null;
    }

}
