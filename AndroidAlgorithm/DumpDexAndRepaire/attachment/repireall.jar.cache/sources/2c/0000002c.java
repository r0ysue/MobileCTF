package antlr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* compiled from: PreservingFileWriter.java */
/* loaded from: repireall.jar:antlr/bg.class */
public final class bg extends FileWriter {
    private File cC;
    private File cD;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JavaClassParseException: Unknown opcode: 0xa8 in method: antlr.bg.close():void, file: repireall.jar:antlr/bg.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:158)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:409)
        	at jadx.core.ProcessClass.process(ProcessClass.java:67)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:115)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:383)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:307)
        Caused by: jadx.plugins.input.java.utils.JavaClassParseException: Unknown opcode: 0xa8
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:71)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:48)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:148)
        	... 5 more
        */
    @Override // java.io.OutputStreamWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        /*
        // Can't load method instructions: Load method exception: JavaClassParseException: Unknown opcode: 0xa8 in method: antlr.bg.close():void, file: repireall.jar:antlr/bg.class
        */
        throw new UnsupportedOperationException("Method not decompiled: antlr.bg.close():void");
    }

    public bg(String str) throws IOException {
        super(new StringBuffer().append(str).append(".antlr.tmp").toString());
        this.cC = new File(str);
        String parent = this.cC.getParent();
        if (parent != null) {
            File file = new File(parent);
            if (!file.exists()) {
                throw new IOException(new StringBuffer("destination directory of '").append(str).append("' doesn't exist").toString());
            }
            if (!file.canWrite()) {
                throw new IOException(new StringBuffer("destination directory of '").append(str).append("' isn't writeable").toString());
            }
        }
        if (this.cC.exists() && !this.cC.canWrite()) {
            throw new IOException(new StringBuffer("cannot write to '").append(str).append("'").toString());
        }
        this.cD = new File(new StringBuffer().append(str).append(".antlr.tmp").toString());
    }
}