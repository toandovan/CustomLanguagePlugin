package com.example.intelijplugin.psi;

import com.example.intelijplugin.VDLLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SimpleTokenType extends IElementType {
    public SimpleTokenType(@NonNls @NotNull String debugName){
        super(debugName, VDLLanguage.INSTANCE);
    }
}
