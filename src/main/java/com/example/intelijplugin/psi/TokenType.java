package com.example.intelijplugin.psi;

import com.example.intelijplugin.VDLLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TokenType extends IElementType {
    public TokenType(@NonNls @NotNull String debugName){
        super(debugName, VDLLanguage.INSTANCE);
    }
}
