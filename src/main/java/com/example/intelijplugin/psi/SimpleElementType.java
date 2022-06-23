package com.example.intelijplugin.psi;

import com.example.intelijplugin.VDLLanguage;
import com.intellij.psi.tree.IElementType;

public class SimpleElementType extends IElementType {
    public SimpleElementType(String debugName) {
        super(debugName, VDLLanguage.INSTANCE);
    }
}
