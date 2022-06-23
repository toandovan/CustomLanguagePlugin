// This is a generated file. Not intended for manual editing.
package vts.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static vts.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import vts.psi.*;

public class SimpleRelationTypeImpl extends ASTWrapperPsiElement implements SimpleRelationType {

  public SimpleRelationTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitRelationType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

}
