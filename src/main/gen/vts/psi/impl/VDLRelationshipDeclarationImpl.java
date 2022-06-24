// This is a generated file. Not intended for manual editing.
package vts.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static vts.psi.Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import vts.psi.*;

public class VDLRelationshipDeclarationImpl extends ASTWrapperPsiElement implements VDLRelationshipDeclaration {

  public VDLRelationshipDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VDLVisitor visitor) {
    visitor.visitRelationshipDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VDLVisitor) accept((VDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getApi() {
    return findNotNullChildByType(API);
  }

}
