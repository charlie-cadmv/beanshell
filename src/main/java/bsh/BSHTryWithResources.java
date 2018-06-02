/* Generated by: JJTree: Do not edit this line. BSHTryWithResources.java Version 1.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=BSH,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package bsh;

public class BSHTryWithResources extends SimpleNode {
    private static final long serialVersionUID = 1L;
    public BSHTryWithResources(int id) { super(id); }

    public Object eval( CallStack callstack, Interpreter interpreter)
            throws EvalError {
        for (int i=0; i < jjtGetNumChildren(); i++)
            ((SimpleNode) jjtGetChild(i)).eval(callstack, interpreter);

            return Primitive.VOID;
    }

    public void autoClose() {
        for (int i=0; i < jjtGetNumChildren(); i++) try {
            ((BSHAutoCloseable) jjtGetChild(i)).close();
        } catch (Throwable e) { }
    }
}
/* JavaCC - OriginalChecksum=08f0fcca24c39792c40d25b047261c1c (do not edit this line) */