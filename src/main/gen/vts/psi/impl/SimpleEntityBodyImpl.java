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

public class SimpleEntityBodyImpl extends ASTWrapperPsiElement implements SimpleEntityBody {

  public SimpleEntityBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitEntityBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SimpleEntityField> getEntityFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleEntityField.class);
  }

}
