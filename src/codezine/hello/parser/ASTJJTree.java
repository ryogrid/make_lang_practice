/* Generated By:JJTree: Do not edit this line. ASTJJTree.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=codezine.hello.BaseNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package codezine.hello.parser;

public
class ASTJJTree extends SimpleNode {
  public ASTJJTree(int id) {
    super(id);
  }

  public ASTJJTree(HelloParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HelloParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=09b5658c21d8c8e8a176470552fe1e03 (do not edit this line) */
