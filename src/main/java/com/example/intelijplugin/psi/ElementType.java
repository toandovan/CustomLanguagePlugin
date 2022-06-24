package com.example.intelijplugin.psi;

import com.example.intelijplugin.VDLLanguage;
import com.intellij.psi.tree.IElementType;

public class ElementType extends IElementType {
    public ElementType(String debugName) {
        super(debugName, VDLLanguage.INSTANCE);
    }
}
