package com.example.intelijplugin;

import com.intellij.lang.Language;

public class VDLLanguage extends Language {
    public static final VDLLanguage INSTANCE=new VDLLanguage();
    protected VDLLanguage() {
        super("VDL");
    }
}
