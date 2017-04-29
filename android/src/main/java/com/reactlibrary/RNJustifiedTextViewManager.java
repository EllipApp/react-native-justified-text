
package com.reactlibrary;

import com.bluejamesbond.text.DocumentView;
import com.facebook.react.uimanager.SimpleViewManager;

public class RNJustifiedTextViewManager extends SimpleViewManager<DocumentView> {

    public static final String REACT_CLASS = "JustifiedText";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public DocumentView createViewInstance(ThemedReactContext context) {
        DocumentView documentView = new DocumentView(this, DocumentView.PLAIN_TEXT);  // Support plain text
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        documentView.setText("Insert your text here Insert your text here Insert your text here Insert your text here Insert your text here Insert your text here Insert your text here Insert your text here", true); // Set to `true` to enable justification

        return documentView;
    }
}