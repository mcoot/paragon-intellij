package com.paragonplugin;

import com.intellij.lang.Language;

public class ParagonLanguage extends Language {

    public static final ParagonLanguage INSTANCE = new ParagonLanguage();

    private ParagonLanguage() {
        super("Paragon");
    }

}
