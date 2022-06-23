package com.example.intelijplugin;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class VDLFileType extends LanguageFileType {

    public static final VDLFileType INSTANCE = new VDLFileType();

    private VDLFileType() {
        super(VDLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Viettel Domain Language";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Viettel Domain Language";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "VDL";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SimpleIcons.ICON;
    }
}