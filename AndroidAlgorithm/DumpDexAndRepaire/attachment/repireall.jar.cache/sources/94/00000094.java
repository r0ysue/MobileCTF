package com.a.a;

import com.a.a.b;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/* compiled from: JCommander.java */
/* loaded from: repireall.jar:com/a/a/j.class */
public final class j {
    private Map<b.a, m> eD;
    private Object eH;
    private l eI;
    private m eJ;
    private ResourceBundle eM;
    private c eN;
    private String eQ;
    private String eR;
    private b eS;
    private boolean eV;
    private static com.a.a.b.a eZ;
    private static LinkedList<g> fa;
    private List<Object> eE = new ArrayList();
    private boolean eF = true;
    private o eG = null;
    private Map<o, m> eK = new HashMap();
    private Map<o, m> eL = new HashMap();
    private Map<b, j> eO = new LinkedHashMap();
    private Map<b.a, b> eP = new LinkedHashMap();
    private Comparator<? super m> eT = new Comparator<m>() { // from class: com.a.a.j.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(m mVar, m mVar2) {
            return mVar.cf().compareTo(mVar2.cf());
        }
    };
    private int eU = 79;
    private List<String> eW = new ArrayList();
    private boolean eX = false;
    private boolean eY = false;
    private final a fb = new a(this, (byte) 0);
    private int fc = 0;
    private boolean fd = true;
    private boolean fe = false;

    public j() {
    }

    public j(Object obj) {
        if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                this.eE.add(obj2);
            }
        } else if (obj.getClass().isArray()) {
            for (Object obj3 : (Object[]) obj) {
                this.eE.add(obj3);
            }
        } else {
            this.eE.add(obj);
        }
        bO();
    }

    public static com.a.a.b.a bM() {
        if (eZ == null) {
            try {
                eZ = new com.a.a.b.d(System.class.getDeclaredMethod("console", new Class[0]).invoke(null, new Object[0]));
            } catch (Throwable unused) {
                eZ = new com.a.a.b.b();
            }
        }
        return eZ;
    }

    public final void d(String... strArr) {
        a aVar;
        String str;
        p pVar;
        List asList;
        String[] cK;
        al("Parsing \"" + ((CharSequence) a(strArr).append("\"\n  with:").append((CharSequence) a(this.eE.toArray()))));
        if (this.eD == null) {
            bO();
        }
        bN();
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (str2.startsWith("@")) {
                arrayList.addAll(ah(str2.substring(1)));
            } else {
                Iterator<m> it = this.eD.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        asList = Arrays.asList(str2);
                        break;
                    }
                    m next = it.next();
                    if (next.co()) {
                        for (String str3 : next.ck().cK()) {
                            if (str2.startsWith(str3) && !str2.equals(str3)) {
                                asList = Arrays.asList(str3, str2.substring(str3.length()));
                                break;
                            }
                        }
                        continue;
                    }
                }
                arrayList.addAll(asList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            String str4 = (String) arrayList.get(i);
            String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
            if (a(strArr2, str4)) {
                m b2 = b(strArr2, str4);
                if (b2 != null && (pVar = (p) b2.ci().getClass().getAnnotation(p.class)) != null) {
                    str = pVar.cz();
                } else {
                    str = " ";
                }
                String str5 = str;
                if (!" ".equals(str5)) {
                    for (String str6 : str4.split("[" + str5 + "]", 2)) {
                        arrayList2.add(str6);
                    }
                } else {
                    arrayList2.add(str4);
                }
            } else {
                arrayList2.add(str4);
            }
        }
        String[] strArr3 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < strArr3.length && !z) {
            String str7 = strArr3[i2];
            String ai = ai(str7);
            strArr3[i2] = ai;
            al("Parsing arg: " + ai);
            j an = an(str7);
            int i3 = 1;
            if (z2 || "--".equals(ai) || !a(strArr3, ai) || an != null) {
                if (t.aq(str7)) {
                    continue;
                } else {
                    if ("--".equals(str7)) {
                        z2 = true;
                        i2++;
                        ai = ai(strArr3[i2]);
                    }
                    if (this.eO.isEmpty()) {
                        if (this.eG != null) {
                            List list = (List) this.eG.get(this.eH);
                            ArrayList arrayList3 = list;
                            if (list == null) {
                                arrayList3 = new ArrayList();
                                if (List.class.isAssignableFrom(this.eG.cr())) {
                                    this.eG.a(this.eH, arrayList3);
                                } else {
                                    throw new n("Main parameter field " + this.eG + " needs to be of type List, not " + this.eG.cr());
                                }
                            }
                            if (this.eF) {
                                arrayList3.clear();
                                this.eF = false;
                            }
                            List list2 = arrayList3;
                            String str8 = ai;
                            String str9 = str8;
                            if (this.eG.cu() instanceof ParameterizedType) {
                                Type type = ((ParameterizedType) this.eG.cu()).getActualTypeArguments()[0];
                                if (type instanceof Class) {
                                    str9 = a(this.eG, (Class) type, str8);
                                }
                            }
                            m.a(this.eJ, this.eI.bI(), "Default", str8);
                            this.eJ.w(true);
                            list2.add(str9);
                        } else {
                            throw new n("Was passed main parameter '" + str7 + "' but no main parameter was defined");
                        }
                    } else if (an == null && 1 != 0) {
                        throw new k("Expected a command, got " + str7);
                    } else {
                        if (an != null) {
                            this.eQ = an.eS.fg;
                            this.eR = str7;
                            int i4 = i2 + 1;
                            int length = strArr3.length - i4;
                            String[] strArr4 = new String[length];
                            System.arraycopy(strArr3, i4, strArr4, 0, length);
                            an.d(strArr4);
                            z = true;
                        }
                    }
                }
            } else {
                m mVar = (m) com.a.a.b.a(this.eD, new s(ai), this.fd, this.fe);
                if (mVar != null) {
                    if (mVar.ck().cJ()) {
                        String ch = mVar.ch();
                        boolean cO = mVar.ck().cO();
                        bM().aA(ch + ": ");
                        mVar.ap(new String(bM().y(cO)));
                        this.eK.remove(mVar.cl());
                    } else if (!mVar.ck().cL()) {
                        Class<?> cr = mVar.cl().cr();
                        if ((cr == Boolean.TYPE || cr == Boolean.class) && mVar.ck().cG() == -1) {
                            mVar.ap("true");
                            this.eK.remove(mVar.cl());
                        } else {
                            int i5 = i2;
                            int cG = mVar.ck().cG();
                            i3 = a(strArr3, i5, mVar, cr, cG != -1 ? cG : 1);
                        }
                        if (mVar.cp()) {
                            this.eV = true;
                        }
                    } else {
                        int i6 = i2;
                        Object ci = mVar.ci();
                        if (!(ci instanceof i)) {
                            aVar = this.fb;
                        } else {
                            aVar = (i) ci;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (int i7 = i6 + 1; i7 < strArr3.length; i7++) {
                            arrayList4.add(strArr3[i7]);
                        }
                        String str10 = mVar.ck().cK()[0];
                        i3 = a(strArr3, i6, mVar, List.class, aVar.c((String[]) arrayList4.toArray(new String[0])));
                    }
                } else if (this.eX) {
                    this.eW.add(str7);
                    i2++;
                    while (i2 < strArr3.length && !a(strArr3, strArr3[i2])) {
                        int i8 = i2;
                        i2++;
                        this.eW.add(strArr3[i8]);
                    }
                    i3 = 0;
                } else {
                    throw new n("Unknown option: " + str7);
                }
            }
            i2 += i3;
        }
        for (m mVar2 : this.eD.values()) {
            if (mVar2.cn()) {
                this.eL.get(mVar2.cl()).w(true);
            }
        }
        if (this.eV) {
            return;
        }
        if (!this.eK.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (m mVar3 : this.eK.values()) {
                sb.append(mVar3.cj()).append(" ");
            }
            throw new n("The following " + (this.eK.size() == 1 ? "option is required: " : "options are required: ") + ((Object) sb));
        } else if (this.eJ != null && this.eJ.ck().cI() && !this.eJ.cn()) {
            throw new n("Main parameters are required (\"" + this.eJ.ch() + "\")");
        }
    }

    private static StringBuilder a(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(objArr[i]);
        }
        return sb;
    }

    private void bN() {
        if (this.eN != null) {
            for (m mVar : this.eD.values()) {
                a(mVar);
            }
            for (Map.Entry<b, j> entry : this.eO.entrySet()) {
                entry.getValue().bN();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String[] strArr, String str) {
        return str.length() > 0 && c(strArr, str).indexOf(str.charAt(0)) >= 0;
    }

    private m ag(String str) {
        for (Map.Entry<b.a, m> entry : this.eD.entrySet()) {
            if (str.startsWith(entry.getKey().bf())) {
                return entry.getValue();
            }
        }
        return null;
    }

    private m b(String[] strArr, String str) {
        m ag = ag(str);
        m mVar = ag;
        if (ag != null) {
            return mVar;
        }
        for (String str2 : strArr) {
            m ag2 = ag(str);
            if (ag2 != null) {
                mVar = ag2;
            }
            if (str2.equals(str)) {
                return mVar;
            }
        }
        throw new n("Unknown parameter: " + str);
    }

    private String c(String[] strArr, String str) {
        p pVar;
        m b2 = b(strArr, str);
        if (b2 != null && (pVar = (p) b2.ci().getClass().getAnnotation(p.class)) != null) {
            return pVar.cA();
        }
        String str2 = "-";
        StringBuilder sb = new StringBuilder();
        for (Object obj : this.eE) {
            p pVar2 = (p) obj.getClass().getAnnotation(p.class);
            if (pVar2 != null && !"-".equals(pVar2.cA())) {
                sb.append(pVar2.cA());
            }
        }
        if (!t.aq(sb.toString())) {
            str2 = sb.toString();
        }
        return str2;
    }

    private static String ai(String str) {
        String trim = str.trim();
        String str2 = trim;
        if (trim.startsWith("\"") && str2.endsWith("\"") && str2.length() > 1) {
            str2 = str2.substring(1, str2.length() - 1);
        }
        return str2;
    }

    private void bO() {
        this.eD = new HashMap();
        for (Object obj : this.eE) {
            b(obj);
        }
    }

    private void b(Object obj) {
        String[] bD;
        String[] bD2;
        obj.getClass();
        for (o oVar : o.d(obj)) {
            u cq = oVar.cq();
            if (cq == null || cq.cE() == null) {
                if (oVar.ct() == null) {
                    if (cq != null && cq.cF() != null) {
                        com.a.a.a cF = cq.cF();
                        for (String str : cF.bD()) {
                            if (this.eD.containsKey(str)) {
                                throw new n("Found the option " + str + " multiple times");
                            }
                            al("Adding description for " + str);
                            m mVar = new m(obj, cF, oVar, this.eM, this);
                            this.eL.put(oVar, mVar);
                            this.eD.put(new s(str), mVar);
                            if (cF.bE()) {
                                this.eK.put(oVar, mVar);
                            }
                        }
                        continue;
                    }
                } else {
                    Object obj2 = oVar.get(obj);
                    if (obj2 == null) {
                        throw new n("Delegate field '" + oVar.cs() + "' cannot be null.");
                    }
                    b(obj2);
                }
            } else {
                l cE = cq.cE();
                if (cE.bD().length != 0) {
                    m mVar2 = new m(obj, cE, oVar, this.eM, this);
                    for (String str2 : cE.bD()) {
                        if (this.eD.containsKey(new s(str2))) {
                            throw new n("Found the option " + str2 + " multiple times");
                        }
                        al("Adding description for " + str2);
                        this.eL.put(oVar, mVar2);
                        this.eD.put(new s(str2), mVar2);
                        if (cE.bE()) {
                            this.eK.put(oVar, mVar2);
                        }
                    }
                    continue;
                } else {
                    al("Found main parameter:" + oVar);
                    if (this.eG != null) {
                        throw new n("Only one @Parameter with no names attribute is allowed, found:" + this.eG + " and " + oVar);
                    }
                    this.eG = oVar;
                    this.eH = obj;
                    this.eI = cE;
                    this.eJ = new m(obj, cE, oVar, this.eM, this);
                }
            }
        }
    }

    private void a(m mVar) {
        String[] cK;
        for (String str : mVar.ck().cK()) {
            String bL = this.eN.bL();
            if (bL != null) {
                al("Initializing " + str + " with default value:" + bL);
                mVar.a(bL, true);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JCommander.java */
    /* loaded from: repireall.jar:com/a/a/j$a.class */
    public class a implements i {
        private a() {
        }

        /* synthetic */ a(j jVar, byte b) {
            this();
        }

        @Override // com.a.a.i
        public final int c(String[] strArr) {
            int i = 0;
            while (i < strArr.length && !j.this.a(strArr, strArr[i])) {
                i++;
            }
            return i;
        }
    }

    private int a(String[] strArr, int i, m mVar, Class<?> cls, int i2) {
        String str = strArr[i];
        if (i2 == 0 && (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls))) {
            mVar.ap("true");
            this.eK.remove(mVar.cl());
        } else if (i < strArr.length - 1) {
            int i3 = "--".equals(strArr[i + 1]) ? 1 : 0;
            if (i + i2 < strArr.length) {
                for (int i4 = 1; i4 <= i2; i4++) {
                    mVar.ap(ai(strArr[i + i4 + i3]));
                    this.eK.remove(mVar.cl());
                }
            } else {
                throw new n("Expected " + i2 + " values after " + str);
            }
        } else {
            throw new n("Expected a value after parameter " + str);
        }
        return i2 + 1;
    }

    public final String bP() {
        if (this.eD == null) {
            bO();
        }
        if (this.eI != null) {
            return this.eI.bF();
        }
        return null;
    }

    public final void aj(String str) {
        a(str, new String[0]);
    }

    private void a(String str, String... strArr) {
        this.eS = new b(str, Arrays.asList(strArr));
    }

    public final String ak(String str) {
        ResourceBundle resourceBundle;
        j an = an(str);
        if (an == null) {
            throw new n("Asking description for unknown command: " + str);
        }
        p pVar = (p) an.eE.get(0).getClass().getAnnotation(p.class);
        String str2 = null;
        if (pVar != null) {
            str2 = pVar.cB();
            String cy = pVar.cy();
            if (!"".equals(cy)) {
                resourceBundle = ResourceBundle.getBundle(cy, Locale.getDefault());
            } else {
                resourceBundle = this.eM;
            }
            if (resourceBundle != null) {
                ResourceBundle resourceBundle2 = resourceBundle;
                String cC = pVar.cC();
                String cB = pVar.cB();
                String string = resourceBundle2 != null ? resourceBundle2.getString(cC) : null;
                str2 = string != null ? string : cB;
            }
        }
        return str2;
    }

    public final List<m> bQ() {
        return new ArrayList(this.eL.values());
    }

    public final m bR() {
        return this.eJ;
    }

    private void al(String str) {
        int i = this.fc;
        if (System.getProperty("jcommander.debug") != null) {
            bM().aB("[JCommander] " + str);
        }
    }

    private void a(c cVar) {
        this.eN = cVar;
        for (Map.Entry<b, j> entry : this.eO.entrySet()) {
            entry.getValue().a(cVar);
        }
    }

    private static <T> Class<? extends f<T>> c(Class<T> cls) {
        Iterator<g> it = fa.iterator();
        while (it.hasNext()) {
            Class<? extends f<T>> b2 = it.next().b(cls);
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    public final Object a(m mVar, String str) {
        return a(mVar.cl(), mVar.cl().cr(), str);
    }

    private Object a(o oVar, Class cls, String str) {
        Enum af;
        l cv = oVar.cv();
        if (cv == null) {
            return str;
        }
        Class<com.a.a.a.n> bY = cv.bY();
        boolean z = cv.bZ() != com.a.a.a.l.class;
        if (bY == null || bY == com.a.a.a.l.class) {
            if (cls.isEnum()) {
                bY = cls;
            } else {
                bY = c(cls);
            }
        }
        if (bY == null) {
            Type cw = oVar.cw();
            Class c = cw != null ? c((Class) cw) : com.a.a.a.n.class;
            bY = c;
            if (c == null && Enum.class.isAssignableFrom((Class) cw)) {
                bY = (Class) cw;
            }
        }
        try {
            String[] bD = cv.bD();
            String str2 = bD.length > 0 ? bD[0] : "[Main class]";
            if (bY != null && bY.isEnum()) {
                try {
                    af = Enum.valueOf(bY, str);
                } catch (IllegalArgumentException unused) {
                    try {
                        af = Enum.valueOf(bY, str.toUpperCase());
                    } catch (IllegalArgumentException unused2) {
                        throw new n("Invalid value for " + str2 + " parameter. Allowed values:" + EnumSet.allOf(bY));
                    }
                } catch (Exception unused3) {
                    throw new n("Invalid value for " + str2 + " parameter. Allowed values:" + EnumSet.allOf(bY));
                }
            } else {
                f<?> a2 = a(str2, bY);
                if (cls.isAssignableFrom(List.class) && (oVar.cu() instanceof ParameterizedType)) {
                    if (z) {
                        af = a(str2, cv.bZ()).af(str);
                    } else {
                        com.a.a.a.h newInstance = cv.cb().newInstance();
                        ArrayList arrayList = new ArrayList();
                        for (String str3 : newInstance.as(str)) {
                            arrayList.add(a2.af(str3));
                        }
                        af = arrayList;
                    }
                } else {
                    af = a2.af(str);
                }
            }
            return af;
        } catch (IllegalAccessException e) {
            throw new n(e);
        } catch (InstantiationException e2) {
            throw new n(e2);
        } catch (InvocationTargetException e3) {
            throw new n(e3);
        }
    }

    private static f<?> a(String str, Class<? extends f<?>> cls) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Constructor<?>[] declaredConstructors;
        Constructor<?> constructor = null;
        Constructor<?> constructor2 = null;
        for (Constructor<?> constructor3 : cls.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor3.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(String.class)) {
                constructor2 = constructor3;
            } else if (parameterTypes.length == 0) {
                constructor = constructor3;
            }
        }
        return constructor2 != null ? (f) constructor2.newInstance(str) : constructor != null ? (f) constructor.newInstance(new Object[0]) : null;
    }

    public final void a(String str, org.jf.a.a.b bVar, String... strArr) {
        j jVar = new j(bVar);
        jVar.a(str, strArr);
        jVar.a(this.eN);
        jVar.eX = this.eX;
        b bVar2 = jVar.eS;
        this.eO.put(bVar2, jVar);
        this.eP.put(new s(str), bVar2);
        for (String str2 : strArr) {
            s sVar = new s(str2);
            if (!sVar.equals(str)) {
                b bVar3 = this.eP.get(sVar);
                if (bVar3 == null || bVar3.equals(bVar2)) {
                    this.eP.put(sVar, bVar2);
                } else {
                    throw new n("Cannot set alias " + sVar + " for " + str + " command because it has already been defined for " + bVar3.fg + " command");
                }
            }
        }
    }

    public final String bT() {
        return this.eQ;
    }

    public final List<Object> bU() {
        return this.eE;
    }

    private j a(b bVar) {
        return (j) com.a.a.b.a(this.eO, bVar, this.fd, this.fe);
    }

    private b am(String str) {
        return (b) com.a.a.b.a(this.eP, new s(str), this.fd, this.fe);
    }

    private j an(String str) {
        b am = am(str);
        if (am == null) {
            return null;
        }
        j a2 = a(am);
        if (a2 == null) {
            throw new IllegalStateException("There appears to be inconsistency in the internal command database.  This is likely a bug. Please report.");
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JCommander.java */
    /* loaded from: repireall.jar:com/a/a/j$b.class */
    public static final class b implements b.a {
        private final String fg;
        private final List<String> fh;

        b(String str, List<String> list) {
            this.fg = str;
            this.fh = list;
        }

        @Override // com.a.a.b.a
        public final String bf() {
            return this.fg;
        }

        public final int hashCode() {
            return 31 + (this.fg == null ? 0 : this.fg.hashCode());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.fg == null) {
                if (bVar.fg != null) {
                    return false;
                }
                return true;
            } else if (!this.fg.equals(bVar.fg)) {
                return false;
            } else {
                return true;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.fg);
            if (!this.fh.isEmpty()) {
                sb.append("(");
                Iterator<String> it = this.fh.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    if (it.hasNext()) {
                        sb.append(",");
                    }
                }
                sb.append(")");
            }
            return sb.toString();
        }
    }

    public final boolean bV() {
        return this.eY;
    }

    private static List<String> ah(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (readLine.length() > 0 && !readLine.trim().startsWith("#")) {
                        arrayList.add(readLine);
                    }
                } else {
                    bufferedReader.close();
                    return arrayList;
                }
            }
        } catch (IOException e) {
            throw new n("Could not read file " + str + ": " + e);
        }
    }

    public final Map<String, j> bS() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<b, j> entry : this.eO.entrySet()) {
            linkedHashMap.put(entry.getKey().fg, entry.getValue());
        }
        return linkedHashMap;
    }

    static {
        LinkedList<g> linkedList = new LinkedList<>();
        fa = linkedList;
        linkedList.addFirst(new com.a.a.b.c());
    }
}