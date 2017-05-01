package com.ellip.justifiedtext;

import javax.annotation.Nullable;
import java.lang.reflect.Field;

import android.util.TypedValue;
import android.graphics.Color;
import android.graphics.Typeface;
import android.content.Context;
import android.graphics.Typeface;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RNJustifiedTextViewManager extends SimpleViewManager<DocumentView> {

    public static final String REACT_CLASS = "JustifiedText";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public DocumentView createViewInstance(ThemedReactContext context) {
        DocumentView documentView = new DocumentView(context, DocumentView.PLAIN_TEXT);  // Support plain text
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        // documentView.setText("Insert your text here Insert your text here Insert your text here Insert your text here Insert your text here Insert your text here Insert your text here Insert your text here"); // Set to `true` to enable justification

        return documentView;
    }

    public static Typeface getFontFromString(Context context, String fontAssetName) {
        return Typeface.createFromAsset(context.getAssets(),
                "fonts/" + fontAssetName);
    }

    public static void setDefaultFont(Context context,
                                      String staticTypefaceFieldName, String fontAssetName) {
        final Typeface regular = Typeface.createFromAsset(context.getAssets(),
                "fonts/" + fontAssetName);
        replaceFont(staticTypefaceFieldName, regular);
    }

    protected static void replaceFont(String staticTypefaceFieldName,
                                      final Typeface newTypeface) {
        try {
            final Field staticField = Typeface.class
                    .getDeclaredField(staticTypefaceFieldName);
            staticField.setAccessible(true);
            staticField.set(null, newTypeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @ReactProp(name = "text")
    public void setText(DocumentView view, @Nullable String text) {
        view.getLayout().setText(text);
    }

    @ReactProp(name = "color")
    public void setColor(DocumentView view, @Nullable String textColor) {
        view.getDocumentLayoutParams().setTextColor(Color.parseColor(textColor));
    }

    @ReactProp(name = "fontSize")
    public void setFontFamily(DocumentView view, @Nullable int fontSize) {
        view.getDocumentLayoutParams().setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize);
    }

    @ReactProp(name = "lineHeightMultiplicator")
    public void setFontFamily(DocumentView view, @Nullable float multiplicator) {
        view.getDocumentLayoutParams().setLineHeightMultiplier(multiplicator);
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(DocumentView view, @Nullable String fontFamily) {
        view.getDocumentLayoutParams().setTextTypeface(getFontFromString(view.getContext(), fontFamily));
        // setDefaultFont(view.getContext(), "DEFAULT", fontFamily);
    }
}