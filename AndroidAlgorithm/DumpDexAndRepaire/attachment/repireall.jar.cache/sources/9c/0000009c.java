package com.a.a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Parameterized.java */
/* loaded from: repireall.jar:com/a/a/o.class */
public final class o {
    private Field fs;
    private Method ft;
    private Method fu;
    private u fj;
    private q fv;

    private o(u uVar, q qVar, Field field, Method method) {
        this.fj = uVar;
        this.ft = method;
        this.fs = field;
        if (this.fs != null) {
            this.fs.setAccessible(true);
        }
        this.fv = qVar;
    }

    public final u cq() {
        return this.fj;
    }

    public final Class<?> cr() {
        if (this.ft != null) {
            return this.ft.getParameterTypes()[0];
        }
        return this.fs.getType();
    }

    public final String cs() {
        if (this.ft != null) {
            return this.ft.getName();
        }
        return this.fs.getName();
    }

    public final Object get(Object obj) {
        try {
            if (this.ft != null) {
                if (this.fu == null) {
                    this.fu = this.ft.getDeclaringClass().getMethod("g" + this.ft.getName().substring(1), new Class[0]);
                }
                return this.fu.invoke(obj, new Object[0]);
            }
            return this.fs.get(obj);
        } catch (IllegalAccessException e) {
            throw new n(e);
        } catch (IllegalArgumentException e2) {
            throw new n(e2);
        } catch (NoSuchMethodException unused) {
            String name = this.ft.getName();
            Object obj2 = null;
            try {
                Field declaredField = this.ft.getDeclaringClass().getDeclaredField(Character.toLowerCase(name.charAt(3)) + name.substring(4));
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    obj2 = declaredField.get(obj);
                }
            } catch (IllegalAccessException unused2) {
            } catch (NoSuchFieldException unused3) {
            }
            return obj2;
        } catch (SecurityException e3) {
            throw new n(e3);
        } catch (InvocationTargetException e4) {
            throw new n(e4);
        }
    }

    public final int hashCode() {
        return ((31 + (this.fs == null ? 0 : this.fs.hashCode())) * 31) + (this.ft == null ? 0 : this.ft.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.fs == null) {
            if (oVar.fs != null) {
                return false;
            }
        } else if (!this.fs.equals(oVar.fs)) {
            return false;
        }
        if (this.ft == null) {
            if (oVar.ft != null) {
                return false;
            }
            return true;
        } else if (!this.ft.equals(oVar.ft)) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x003b: INVOKE  (r0 I:java.lang.Throwable) = (r0 I:java.lang.reflect.InvocationTargetException) type: VIRTUAL call: java.lang.reflect.InvocationTargetException.getTargetException():java.lang.Throwable, block:B:14:0x003a */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.InvocationTargetException] */
    public final void a(Object obj, Object obj2) {
        ?? targetException;
        try {
            if (this.ft != null) {
                this.ft.invoke(obj, obj2);
            } else {
                this.fs.set(obj, obj2);
            }
        } catch (IllegalAccessException e) {
            throw new n(e);
        } catch (IllegalArgumentException e2) {
            throw new n(e2);
        } catch (InvocationTargetException e3) {
            if (!(targetException.getTargetException() instanceof n)) {
                throw new n(e3);
            }
            throw ((n) e3.getTargetException());
        }
    }

    public final q ct() {
        return this.fv;
    }

    public final Type cu() {
        if (this.ft != null) {
            return this.ft.getGenericParameterTypes()[0];
        }
        return this.fs.getGenericType();
    }

    public final l cv() {
        return this.fj.cE();
    }

    public final Type cw() {
        if (this.ft == null && (this.fs.getGenericType() instanceof ParameterizedType)) {
            Type type = ((ParameterizedType) this.fs.getGenericType()).getActualTypeArguments()[0];
            if (type instanceof Class) {
                return type;
            }
            return null;
        }
        return null;
    }

    public final boolean cx() {
        return this.fj.cF() != null;
    }

    public static List<o> d(Object obj) {
        Method[] declaredMethods;
        Field[] declaredFields;
        ArrayList arrayList = new ArrayList();
        Class<?> cls = obj.getClass();
        while (true) {
            Class<?> cls2 = cls;
            if (Object.class.equals(cls2)) {
                break;
            }
            for (Field field : cls2.getDeclaredFields()) {
                Annotation annotation = field.getAnnotation(l.class);
                Annotation annotation2 = field.getAnnotation(q.class);
                Annotation annotation3 = field.getAnnotation(a.class);
                if (annotation != null) {
                    arrayList.add(new o(new u((l) annotation), null, field, null));
                } else if (annotation3 != null) {
                    arrayList.add(new o(new u((a) annotation3), null, field, null));
                } else if (annotation2 != null) {
                    arrayList.add(new o(null, (q) annotation2, field, null));
                }
            }
            cls = cls2.getSuperclass();
        }
        Class<?> cls3 = obj.getClass();
        while (true) {
            Class<?> cls4 = cls3;
            if (!Object.class.equals(cls4)) {
                for (Method method : cls4.getDeclaredMethods()) {
                    Annotation annotation4 = method.getAnnotation(l.class);
                    Annotation annotation5 = method.getAnnotation(q.class);
                    Annotation annotation6 = method.getAnnotation(a.class);
                    if (annotation4 != null) {
                        arrayList.add(new o(new u((l) annotation4), null, null, method));
                    } else if (annotation6 != null) {
                        arrayList.add(new o(new u((a) annotation4), null, null, method));
                    } else if (annotation5 != null) {
                        arrayList.add(new o(null, (q) annotation5, null, method));
                    }
                }
                cls3 = cls4.getSuperclass();
            } else {
                return arrayList;
            }
        }
    }
}