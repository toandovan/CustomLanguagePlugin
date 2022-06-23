package com.example.intelijplugin;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class VDLLanguage extends Language {
    public static final VDLLanguage INSTANCE=new VDLLanguage();
    protected VDLLanguage() {
        super("VDL");
    }
}
