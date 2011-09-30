// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:42
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Hashtable;
import java.util.Vector;

public abstract class p
{

    public static final void a()
    {
        h = bh.q();
        f = bh.q();
        c = bh.q();
        a = new long[2];
        b = new long[2];
    }

    public static final void a(long l1, long l2)
    {
        a[0] = l1;
        a[1] = l2;
    }

    public static final void b(long l1, long l2)
    {
        b[0] = l1;
        b[1] = l2;
    }

    public static final void a(boolean flag)
    {
        e = flag;
        t.a(1553, flag);
        t.a(1554, flag && !t.g(1555));
    }

    public static final boolean b()
    {
        return a[0] != 0L && a[1] != 0L && b[0] != 0L && b[1] != 0L && (a[0] != b[0] || a[1] != b[1]);
    }

    public static final void c()
    {
        a[0] = 0L;
        a[1] = 0L;
        b[0] = 0L;
        b[1] = 0L;
        h.removeAllElements();
        f.removeAllElements();
        c.removeAllElements();
        a(false);
        g = 0;
        t.c(1553, 0);
        t.c(1554, 0);
        t.c(1555, 0);
    }

    public static final String d()
    {
        s s1 = (new s()).c(0x160677).c(0x2f176b).f(r.a(a[0])).w(0x3d307926).f(r.b(a[1])).c(0x141621).d(223);
        int i1 = f.size();
        for(int j1 = 0; j1 <= i1; j1++)
        {
            int ai[] = j1 >= i1 ? x.a((int)b[0], (int)b[1]) : (int[])f.elementAt(j1);
            s1.w(30758).v(j1 + 1).f(61).f(r.a(ai[0])).w(31014).v(j1 + 1).f(61).f(r.b(ai[1]));
        }

        return s1.d();
    }

    public static final void a(s s1)
    {
        Object obj = null;
        int i1 = 0;
        h.removeAllElements();
        i = 0;
        j = 0;
        i = ((Integer)(s1 = (Hashtable)ab.b(s1)).get("totalLength")).intValue();
        j = ((Integer)s1.get("totalTime")).intValue();
        int j1 = (s1 = (Vector)s1.get("regions")).size();
        for(int k1 = 0; k1 < j1; k1++)
        {
            Object aobj[] = new Object[2];
            Object obj1;
            Vector vector = (Vector)((Hashtable) (obj1 = (Hashtable)s1.elementAt(k1))).get("lefttop");
            Vector vector1 = (Vector)((Hashtable) (obj1)).get("rightbottom");
            Object obj2 = vector.elementAt(0);
            v.i();
            obj2 = vector.elementAt(1);
            v.i();
            obj2 = vector1.elementAt(0);
            v.i();
            obj2 = vector1.elementAt(1);
            v.i();
            aobj[0] = x.a(((Integer)obj2).intValue(), ((Integer)obj2).intValue(), ((Integer)obj2).intValue(), ((Integer)obj2).intValue());
            int l1;
            Object aobj1[];
            (aobj1 = new Object[l1 = ((Vector) (obj1 = (Vector)((Hashtable) (obj1)).get("points"))).size() + 2])[0] = obj;
            aobj1[l1 - 1] = null;
            for(int i2 = 1; i2 < l1 - 1; i2++)
            {
                int j2;
                Object aobj2[];
                obj = (Vector)((Vector) (obj1)).elementAt(i2 - 1);
                Object obj3 = ((Vector) (obj)).elementAt(0);
                v.i();
                obj3 = ((Vector) (obj)).elementAt(1);
                v.i();
                (aobj2 = new Object[(j2 = (k1 != 0 || i2 != 1) && (k1 != j1 - 1 || i2 != l1 - 2) ? ((Vector) (obj)).size() : 4) - 1])[0] = x.a(((Integer)obj3).intValue(), ((Integer)obj3).intValue());
                if(j2 == 4)
                    if(k1 == 0 && i2 == 1)
                    {
                        String s2;
                        aobj2[1] = bh.b(bh.r().append(s2 = t.c(941)).append(x.h(i)).append(t.c(945)).append(x.i(j)));
                        aobj2[2] = t.i();
                    } else
                    if(k1 == j1 - 1 && i2 == l1 - 2)
                    {
                        aobj2[1] = t.c(942);
                        aobj2[2] = t.i();
                    } else
                    {
                        aobj2[1] = ((Vector) (obj)).elementAt(2);
                        aobj2[2] = ((Vector) (obj)).elementAt(3);
                    }
                aobj1[i2] = ((Object) (aobj2));
                if(i2 == 1 && l1 > 2 && k1 > 0 && i1 != 0)
                    ((Object[])((Object[])h.elementAt(k1 - 1))[1])[i1 - 1] = ((Object) (aobj2));
                obj = ((Object) (aobj2));
            }

            i1 = l1;
            aobj[1] = ((Object) (aobj1));
            h.addElement(((Object) (aobj)));
        }

        o();
    }

    private static final boolean a(int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2)
    {
        return j1 <= j2 && j1 >= l2 && (i2 >= i1 && i2 <= k1 || k2 >= i1 && k2 <= k1) || l1 <= j2 && l1 >= l2 && (i2 >= i1 && i2 <= k1 || k2 >= i1 && k2 <= k1) || k1 >= i2 && k1 <= k2 && (j1 >= j2 && l1 <= j2 || j1 >= l2 && l1 <= l2) || i1 >= i2 && i1 <= k2 && (j1 >= j2 && l1 <= j2 || j1 >= l2 && l1 <= l2);
    }

    private static final boolean b(int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2)
    {
        if(k2 - i2 > k1 - i1 && j2 - l2 > j1 - l1)
            return i1 > i2 && k1 < k2 && j1 < j2 && l1 > l2;
        return i2 > i1 && k2 < k1 && j2 < j1 && l2 > l1;
    }

    public static final Vector a(int i1, int j1, int k1, int l1)
    {
        Vector vector = bh.q();
        int i2 = h.size();
        for(int j2 = 0; j2 < i2; j2++)
        {
            int ai[];
            if(b((ai = (int[])((Object[])h.elementAt(j2))[0])[0], ai[1], ai[2], ai[3], i1, j1, k1, l1) || a(ai[0], ai[1], ai[2], ai[3], i1, j1, k1, l1))
                vector.addElement(h.elementAt(j2));
        }

        return vector;
    }

    public static final boolean e()
    {
        return a[0] != 0L && a[1] != 0L;
    }

    public static final boolean f()
    {
        return b[0] != 0L && b[1] != 0L;
    }

    public static final int[] g()
    {
        int i1 = l();
        int j1 = t.f(39);
        int ai[];
        int l1 = (int)v.c((ai = a(g))[0], j1);
        int k1 = (int)v.c(ai[1], j1);
        for(int i2 = g + 1; i2 < i1; i2++)
        {
            if(b(i2) == null)
                continue;
            int ai1[];
            int k2 = (int)v.c((ai1 = a(i2))[0], j1);
            int j2 = (int)v.c(ai1[1], j1);
            if(!aa.a(l1, k2, k1, j2) && i2 != i1 - 1)
                continue;
            g = i2;
            break;
        }

        return a(g);
    }

    public static final int[] h()
    {
        if(g == 0 && b(g) != null)
            return a(g);
        int ai[];
        int i1 = t.f(39);
        boolean flag = false;
        int k1 = (int)v.c((ai = a(g))[0], i1);
        int j1 = (int)v.c(ai[1], i1);
        for(int l1 = g; --l1 >= 0;)
            if(b(l1) != null)
            {
                int ai1[];
                int i2 = (int)v.c((ai1 = a(l1))[0], i1);
                int j2 = (int)v.c(ai1[1], i1);
                if(aa.a(k1, i2, j1, j2) || l1 == 0)
                {
                    g = l1;
                    return ai1;
                }
            }

        return null;
    }

    public static final boolean i()
    {
        return h.size() > 0;
    }

    public static final long j()
    {
        Object aobj[];
        if(h.size() > 0 && (aobj = (Object[])((Object[])h.firstElement())[1]).length > 0)
            return (long)((int[])((Object[])((Object[])aobj)[1])[0])[0];
        else
            return 0L;
    }

    public static final long k()
    {
        Object aobj[];
        if(h.size() > 0 && (aobj = (Object[])((Object[])h.firstElement())[1]).length > 0)
            return (long)((int[])((Object[])((Object[])aobj)[1])[0])[1];
        else
            return 0L;
    }

    public static final void c(long l1, long l2)
    {
        f.addElement(l1 = x.a((int)l1, (int)l2));
        c.addElement(((Object) (x.a(null, l1))));
    }

    public static final int l()
    {
        int i1 = 0;
        for(int j1 = 0; j1 < h.size(); j1++)
        {
            Object aobj[];
            if((aobj = (Object[])((Object[])h.elementAt(j1))[1]) != null)
                i1 += aobj.length - 2;
        }

        return i1;
    }

    public static final int[] a(int i1)
    {
        if(i1 > l())
        {
            return null;
        } else
        {
            int j1 = ((Object[])((Object[])h.firstElement())[1]).length - 2;
            int k1 = i1 / j1;
            i1 %= j1;
            return (int[])((Object[])((Object[])((Object[])h.elementAt(k1))[1])[i1 + 1])[0];
        }
    }

    public static final String[] b(int i1)
    {
        if(i1 > l())
            return null;
        int j1 = ((Object[])((Object[])h.firstElement())[1]).length - 2;
        int k1 = i1 / j1;
        i1 %= j1;
        if((i1 = ((int) ((Object[])((Object[])((Object[])h.elementAt(k1))[1])[i1 + 1]))).length > 1)
        {
            Object obj = i1[1];
            v.i();
            obj = i1[2];
            v.i();
            return x.a((String)obj, (String)obj);
        } else
        {
            return null;
        }
    }

    private static final int a(int i1, int j1)
    {
        int k1;
        if((k1 = l()) == 0)
            throw new RuntimeException();
        int l1 = 0;
        int ai[];
        int i2 = v.a((ai = a(0))[0], ai[1], i1, j1);
        for(int j2 = 1; j2 < k1; j2++)
        {
            int ai1[];
            int k2;
            if((k2 = v.a((ai1 = a(j2))[0], ai1[1], i1, j1)) < i2)
            {
                i2 = k2;
                l1 = j2;
            }
        }

        return l1;
    }

    private static void o()
    {
        c.removeAllElements();
        for(int i1 = 0; i1 < f.size(); i1++)
            try
            {
                int ai[];
                int j1 = a((ai = (int[])f.elementAt(i1))[0], ai[1]);
                c.addElement(((Object) (x.a(z.i(j1), ai))));
            }
            catch(Throwable throwable) { }

    }

    public static final void m()
    {
        if(d != null)
        {
            int ai[] = (int[])d[1];
            x.a(f, ai);
            x.a(c, ((Object) (d)));
        }
    }

    public static final void n()
    {
        h.removeAllElements();
        g = 0;
    }

    public static long a[];
    public static long b[];
    private static Vector f;
    public static Vector c;
    public static Object d[];
    private static int g;
    private static Vector h;
    public static boolean e;
    private static int i;
    private static int j;
}