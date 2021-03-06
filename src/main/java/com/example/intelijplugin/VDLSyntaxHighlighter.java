package com.example.intelijplugin;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import vts.psi.Types;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class VDLSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey TYPE =
            createTextAttributesKey("TYPE", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey  IDENTIFIER=
            createTextAttributesKey("IDENTIFIER", DefaultLanguageHighlighterColors.STRING);

    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] TYPE_KEYS = new TextAttributesKey[]{TYPE};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new VDLLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(Types.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(Types.ENTITY)
                || tokenType.equals(Types.DTO)
                || tokenType.equals(Types.RELATION_TYPE)
                || tokenType.equals(Types.API)) {
            return KEYWORD_KEYS;
        }
        if(tokenType.equals(Types.IDENTIFIER)){
            return IDENTIFIER_KEYS;
        }
        if(tokenType.equals(Types.TYPE)){
            return TYPE_KEYS;
        }
        return EMPTY_KEYS;
    }
}