// This is a generated file. Not intended for manual editing.
package vts.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.example.intelijplugin.psi.ElementType;
import com.example.intelijplugin.psi.TokenType;
import vts.psi.impl.*;

public interface Types {

  IElementType DTO_DECLARATION = new ElementType("DTO_DECLARATION");
  IElementType ENTITY_BODY = new ElementType("ENTITY_BODY");
  IElementType ENTITY_DECLARATION = new ElementType("ENTITY_DECLARATION");
  IElementType ENTITY_FIELD = new ElementType("ENTITY_FIELD");
  IElementType ENTITY_VALIDATE = new ElementType("ENTITY_VALIDATE");
  IElementType RELATIONSHIP_DECLARATION = new ElementType("RELATIONSHIP_DECLARATION");
  IElementType RELATION_TYPE = new ElementType("RELATION_TYPE");
  IElementType TABLE_NAME = new ElementType("TABLE_NAME");
  IElementType TYPE = new ElementType("TYPE");

  IElementType API = new TokenType("API");
  IElementType COMMA = new TokenType(",");
  IElementType COMMENT = new TokenType("COMMENT");
  IElementType DOUBLE = new TokenType("Double");
  IElementType DTO = new TokenType("DTO");
  IElementType ENTITY = new TokenType("ENTITY");
  IElementType IDENTIFIER = new TokenType("IDENTIFIER");
  IElementType INTERGER = new TokenType("Interger");
  IElementType LB = new TokenType("(");
  IElementType LONG = new TokenType("Long");
  IElementType LP = new TokenType("{");
  IElementType LSB = new TokenType("[");
  IElementType MANYTOMANY = new TokenType("ManyToMany");
  IElementType MANYTOONE = new TokenType("ManyToOne");
  IElementType ONETOMANY = new TokenType("OneToMany");
  IElementType ONETOONE = new TokenType("OneToOne");
  IElementType RB = new TokenType(")");
  IElementType REQUIRE = new TokenType("require");
  IElementType RP = new TokenType("}");
  IElementType RSB = new TokenType("]");
  IElementType SEMI = new TokenType(";");
  IElementType STRING = new TokenType("String");
  IElementType UNIQUE = new TokenType("unique");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == DTO_DECLARATION) {
        return new VDLDtoDeclarationImpl(node);
      }
      else if (type == ENTITY_BODY) {
        return new VDLEntityBodyImpl(node);
      }
      else if (type == ENTITY_DECLARATION) {
        return new VDLEntityDeclarationImpl(node);
      }
      else if (type == ENTITY_FIELD) {
        return new VDLEntityFieldImpl(node);
      }
      else if (type == ENTITY_VALIDATE) {
        return new VDLEntityValidateImpl(node);
      }
      else if (type == RELATIONSHIP_DECLARATION) {
        return new VDLRelationshipDeclarationImpl(node);
      }
      else if (type == RELATION_TYPE) {
        return new VDLRelationTypeImpl(node);
      }
      else if (type == TABLE_NAME) {
        return new VDLTableNameImpl(node);
      }
      else if (type == TYPE) {
        return new VDLTypeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
