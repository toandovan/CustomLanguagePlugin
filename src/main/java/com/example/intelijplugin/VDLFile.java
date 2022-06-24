package com.example.intelijplugin;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class VDLFile extends PsiFileBase {
    protected VDLFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, VDLLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return VDLFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "VDL File";
    }
}
