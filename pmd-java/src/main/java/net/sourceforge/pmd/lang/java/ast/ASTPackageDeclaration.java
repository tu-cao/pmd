/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTPackageDeclaration.java */

package net.sourceforge.pmd.lang.java.ast;

public class ASTPackageDeclaration extends AbstractJavaNode {
    public ASTPackageDeclaration(int id) {
        super(id);
    }

    public ASTPackageDeclaration(JavaParser p, int id) {
        super(p, id);
    }

    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    public String getPackageNameImage() {
        return ((ASTName) jjtGetChild(this.jjtGetNumChildren() - 1)).getImage();
    }
}
