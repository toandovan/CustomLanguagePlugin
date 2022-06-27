package com.example.intelijplugin;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import vts.psi.Types;

public class VDLCompletionContributor extends CompletionContributor {
    public VDLCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement() ,
                new CompletionProvider<>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("ENTITY"));
                        resultSet.addElement(LookupElementBuilder.create("API"));
                        resultSet.addElement(LookupElementBuilder.create("DTO"));
                        resultSet.addElement(LookupElementBuilder.create("OneToOne"));
                        resultSet.addElement(LookupElementBuilder.create("OneToMany"));
                        resultSet.addElement(LookupElementBuilder.create("ManyToOne"));
                        resultSet.addElement(LookupElementBuilder.create("ManyToMany"));
                    }
                });
    }
}
