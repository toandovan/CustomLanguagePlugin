// This is a generated file. Not intended for manual editing.
package vts.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import vts.psi.impl.*;

public interface SimpleTypes {

  IElementType DTO_DECLARATION = new SimpleElementType("DTO_DECLARATION");
  IElementType ENTITY_BODY = new SimpleElementType("ENTITY_BODY");
  IElementType ENTITY_DECLARATION = new SimpleElementType("ENTITY_DECLARATION");
  IElementType ENTITY_FIELD = new SimpleElementType("ENTITY_FIELD");
  IElementType ENTITY_VALIDATE = new SimpleElementType("ENTITY_VALIDATE");
  IElementType RELATIONSHIP_DECLARATION = new SimpleElementType("RELATIONSHIP_DECLARATION");
  IElementType RELATION_TYPE = new SimpleElementType("RELATION_TYPE");
  IElementType TABLE_NAME = new SimpleElementType("TABLE_NAME");

  IElementType API = new SimpleTokenType("API");
  IElementType COMMA = new SimpleTokenType(",");
  IElementType DTO = new SimpleTokenType("DTO");
  IElementType ENTITY = new SimpleTokenType("ENTITY");
  IElementType EOF = new SimpleTokenType("EOF");
  IElementType ID = new SimpleTokenType("ID");
  IElementType IDENTIFIER = new SimpleTokenType("IDENTIFIER");
  IElementType LB = new SimpleTokenType("(");
  IElementType LP = new SimpleTokenType("{");
  IElementType LSB = new SimpleTokenType("[");
  IElementType MANYTOMANY = new SimpleTokenType("ManyToMany");
  IElementType MANYTOONE = new SimpleTokenType("ManyToOne");
  IElementType ONETOMANY = new SimpleTokenType("OneToMany");
  IElementType ONETOONE = new SimpleTokenType("OneToOne");
  IElementType RB = new SimpleTokenType(")");
  IElementType RELATIONSHIP = new SimpleTokenType("RELATIONSHIP");
  IElementType REQUIRE = new SimpleTokenType("require");
  IElementType RP = new SimpleTokenType("}");
  IElementType RSB = new SimpleTokenType("]");
  IElementType SEMI = new SimpleTokenType(";");
  IElementType TYPE = new SimpleTokenType("type");
  IElementType UNIQUE = new SimpleTokenType("unique");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == DTO_DECLARATION) {
        return new SimpleDtoDeclarationImpl(node);
      }
      else if (type == ENTITY_BODY) {
        return new SimpleEntityBodyImpl(node);
      }
      else if (type == ENTITY_DECLARATION) {
        return new SimpleEntityDeclarationImpl(node);
      }
      else if (type == ENTITY_FIELD) {
        return new SimpleEntityFieldImpl(node);
      }
      else if (type == ENTITY_VALIDATE) {
        return new SimpleEntityValidateImpl(node);
      }
      else if (type == RELATIONSHIP_DECLARATION) {
        return new SimpleRelationshipDeclarationImpl(node);
      }
      else if (type == RELATION_TYPE) {
        return new SimpleRelationTypeImpl(node);
      }
      else if (type == TABLE_NAME) {
        return new SimpleTableNameImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
