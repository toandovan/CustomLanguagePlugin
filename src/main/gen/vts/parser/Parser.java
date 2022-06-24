// This is a generated file. Not intended for manual editing.
package vts.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static vts.psi.Types.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class Parser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return program(b, l + 1);
  }

  /* ********************************************************** */
  // DTO
  public static boolean dto_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dto_declaration")) return false;
    if (!nextTokenIs(b, DTO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DTO);
    exit_section_(b, m, DTO_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // LP entity_field* RP
  public static boolean entity_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_body")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && entity_body_1(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, ENTITY_BODY, r);
    return r;
  }

  // entity_field*
  private static boolean entity_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_body_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!entity_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity_body_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ENTITY IDENTIFIER* table_name?
  public static boolean entity_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration")) return false;
    if (!nextTokenIs(b, ENTITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENTITY);
    r = r && entity_declaration_1(b, l + 1);
    r = r && entity_declaration_2(b, l + 1);
    exit_section_(b, m, ENTITY_DECLARATION, r);
    return r;
  }

  // IDENTIFIER*
  private static boolean entity_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "entity_declaration_1", c)) break;
    }
    return true;
  }

  // table_name?
  private static boolean entity_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_2")) return false;
    table_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ID type entity_validate* SEMI
  public static boolean entity_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_field")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, TYPE);
    r = r && entity_field_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, ENTITY_FIELD, r);
    return r;
  }

  // entity_validate*
  private static boolean entity_field_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_field_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!entity_validate(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity_field_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // REQUIRE | UNIQUE
  public static boolean entity_validate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_validate")) return false;
    if (!nextTokenIs(b, "<entity validate>", REQUIRE, UNIQUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_VALIDATE, "<entity validate>");
    r = consumeToken(b, REQUIRE);
    if (!r) r = consumeToken(b, UNIQUE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (entity_declaration|relationship_declaration |dto_declaration)* EOF
  static boolean program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = program_0(b, l + 1);
    r = r && consumeToken(b, EOF);
    exit_section_(b, m, null, r);
    return r;
  }

  // (entity_declaration|relationship_declaration |dto_declaration)*
  private static boolean program_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!program_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "program_0", c)) break;
    }
    return true;
  }

  // entity_declaration|relationship_declaration |dto_declaration
  private static boolean program_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_0_0")) return false;
    boolean r;
    r = entity_declaration(b, l + 1);
    if (!r) r = relationship_declaration(b, l + 1);
    if (!r) r = dto_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ONETOMANY | ONETOONE | MANYTOMANY |MANYTOONE
  public static boolean relation_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATION_TYPE, "<relation type>");
    r = consumeToken(b, ONETOMANY);
    if (!r) r = consumeToken(b, ONETOONE);
    if (!r) r = consumeToken(b, MANYTOMANY);
    if (!r) r = consumeToken(b, MANYTOONE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // API
  public static boolean relationship_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationship_declaration")) return false;
    if (!nextTokenIs(b, API)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, API);
    exit_section_(b, m, RELATIONSHIP_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // LSB IDENTIFIER RSB
  public static boolean table_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_name")) return false;
    if (!nextTokenIs(b, LSB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LSB, IDENTIFIER, RSB);
    exit_section_(b, m, TABLE_NAME, r);
    return r;
  }

}
