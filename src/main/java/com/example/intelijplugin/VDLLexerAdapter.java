package com.example.intelijplugin;

import com.intellij.lexer.FlexAdapter;
import vts.lexer._VDLLexer;

public class VDLLexerAdapter extends FlexAdapter {
    public VDLLexerAdapter() {
        super(new _VDLLexer(null));
    }
}
