package org.jf.a.a;

import com.a.a.j;
import com.b.a.c.au;
import com.b.a.c.ax;
import java.util.ArrayList;
import java.util.List;
import org.jf.a.h;

/* compiled from: Command.java */
/* loaded from: repireall.jar:org/jf/a/a/b.class */
public abstract class b {
    protected final List<j> Gv;

    public abstract void run();

    public b(List<j> list) {
        this.Gv = list;
    }

    public final void mX() {
        System.out.println(new f().cg(h.mU()).i(mY()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(j jVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j hV() {
        return ((j) au.a(this.Gv)).bS().get(((e) getClass().getAnnotation(e.class)).nb());
    }

    public final List<j> mY() {
        ArrayList j = ax.j(this.Gv);
        j.add(hV());
        return j;
    }
}