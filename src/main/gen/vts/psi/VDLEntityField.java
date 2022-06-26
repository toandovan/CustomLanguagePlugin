// This is a generated file. Not intended for manual editing.
package vts.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VDLEntityField extends PsiElement {

  @NotNull
  List<VDLEntityValidate> getEntityValidateList();

  @NotNull
  VDLType getType();

  @NotNull
  PsiElement getIdentifier();

}
