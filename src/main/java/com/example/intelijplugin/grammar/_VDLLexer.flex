package vts.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static vts.psi.Types.*;

%%

%{
  public _VDLLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _VDLLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*
WHITE_SPACE=[ \t\n\x0B\f\r]+
COMMENT= "/"* .*? *"/"

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "("                { return LB; }
  ")"                { return RB; }
  "{"                { return LP; }
  "}"                { return RP; }
  ";"                { return SEMI; }
  "["                { return LSB; }
  "]"                { return RSB; }
  ","                { return COMMA; }
  "ENTITY"           { return ENTITY; }
  "OneToOne"         { return ONETOONE; }
  "OneToMany"        { return ONETOMANY; }
  "ManyToOne"        { return MANYTOONE; }
  "ManyToMany"       { return MANYTOMANY; }
  "require"          { return REQUIRE; }
  "unique"           { return UNIQUE; }
  "Interger"         { return INTERGER; }
  "Double"           { return DOUBLE; }
  "Long"             { return LONG; }
  "String"           { return STRING; }
  "API"              { return API; }
  "DTO"              { return DTO; }

  {IDENTIFIER}       { return IDENTIFIER; }
  {WHITE_SPACE}      { return WHITE_SPACE; }
  {COMMENT}          { return COMMENT; }

}

[^] { return BAD_CHARACTER; }
