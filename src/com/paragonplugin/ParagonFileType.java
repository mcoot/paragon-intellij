package com.paragonplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ParagonFileType extends LanguageFileType {
    public static final ParagonFileType INSTANCE = new ParagonFileType();

    private ParagonFileType() {
        super(ParagonLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Paragon file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Paragon language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "para";
    }

    @NotNull
    @Override
    public Icon getIcon() {
        return ParagonIcons.FILE;
    }
}
