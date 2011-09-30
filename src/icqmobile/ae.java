// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:13:18
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Vector;

public abstract class ae
{

    public static final boolean a()
    {
        return m;
    }

    public static final void a(Object aobj[])
    {
        n = null;
        j = false;
        ad.a(aobj);
        m = false;
        return;
        JVM INSTR pop ;
        if(g != null)
        {
            aobj = null;
            if(g.d == 1)
                break MISSING_BLOCK_LABEL_70;
        }
        if(aw.c().a == 41)
        {
            n = new Integer(v.m(914));
            j = true;
            break MISSING_BLOCK_LABEL_117;
        }
        if(g != null && g.d == 1 && (n = (Integer)g.e[4]) != null && n.intValue() != 0)
            j = true;
        g = null;
        m = false;
        return;
        Exception exception;
        exception;
        m = false;
        throw exception;
    }

    public static final void b()
    {
        if(g != null)
            g.a(3);
        ag ag1;
        g = ag1 = new ag();
        ag1.a = false;
        ag1.b = true;
        ag1.c = l = true;
        a = 1;
        k = true;
        new f(37, ((Object) (c(ag1))));
    }

    public static void c()
    {
        l = false;
    }

    public static boolean d()
    {
        return l;
    }

    public static final void e()
    {
        if(g != null)
            g.a(3);
        ag ag1;
        g = ag1 = new ag();
        ag1.a = false;
        ag1.b = true;
        l = false;
        a = 1;
        k = true;
        new f(37, ((Object) (c(ag1))));
    }

    private static final int b(String s)
    {
        Object obj = t.n();
        int i1 = t.f(1488);
        obj = ((bi) (obj)).e(i1).d();
        for(int j1 = 0; j1 < ((Vector) (obj)).size(); j1++)
        {
            String s1 = (String)((Vector) (obj)).elementAt(j1);
            if(ab.a(s, s1))
                return j1;
        }

        return -1;
    }

    public static final int a(int i1)
    {
        return (a - 1) * (d << 1) + i1;
    }

    public static final void f()
    {
        if(g != null)
            g.a(3);
        (g = new ag()).a = false;
        g.b = true;
        e = true;
        new f(37, ((Object) (c(g))));
    }

    public static final int a(String s)
    {
        if(!x.n(s))
            return 0;
        boolean flag = false;
        boolean flag1 = false;
        int i1;
        if((i1 = b(s)) == h)
            return 0;
        ad ad1;
        Vector vector = (ad1 = aw.c()).j;
        int j1 = b % (d << 1) != 0 ? 1 : 0;
        j1 = b / (d << 1) + j1;
        int _tmp = c;
        ad1.a(b, a(i1));
        bf.c = true;
        if(i1 < f && a > 1)
            flag = true;
        else
        if(a + 2 <= j1)
            if(a == 1 && i1 >= vector.size() - 1 - f)
                flag1 = true;
            else
            if(a < j1 - 1 && i1 >= vector.size() - f)
                flag1 = true;
        h = i1;
        i = s;
        if(flag || flag1)
        {
            if(g != null && g.d == 3)
                g = null;
            if(g != null && (!g.a || !flag) && (g.a || !flag1))
                g.a(3);
            if(g == null || g.d == 3)
            {
                m = true;
                (g = new ag()).c = l;
                g.a = flag;
                new f(37, ((Object) (c(g))));
            }
            return c(i1);
        } else
        {
            return 0;
        }
    }

    private static int c(int i1)
    {
        if(g == null)
            return 0;
        byte byte0 = 0;
        synchronized(g)
        {
            Vector vector = aw.c().j;
            boolean flag = false;
            boolean flag1 = false;
            if(i1 == 0)
            {
                byte0 = 41;
                flag = true;
            } else
            if(i1 == vector.size() - (a != 1 ? 1 : 2))
            {
                byte0 = 41;
                flag1 = true;
            }
            if(flag || flag1)
                if((i1 = g.d) == 2 || i1 == 1)
                    b(g);
                else
                if(i1 == 0)
                    g.b = true;
        }
        return byte0;
    }

    private static au a(int i1, Object obj, ag ag1)
    {
        if(ag1.c)
            return new au();
        obj = (Vector)ab.d(obj, 8);
        ag1 = null;
        for(int j1 = 0; j1 < ((Vector) (obj)).size(); j1++)
        {
            Object obj1;
            if(ab.c(obj1 = ((Vector) (obj)).elementAt(j1), 0) != i1)
                continue;
            ag1 = ((ag) (obj1));
            break;
        }

        return new au(ag1);
    }

    public static int g()
    {
        if(j)
        {
            j = false;
            if(n != null)
                return n.intValue();
            else
                return 43;
        } else
        {
            return 0;
        }
    }

    private static void a(au au1, au au2)
    {
        Vector vector = au1.d();
        Vector vector1 = au2.d();
        for(int i1 = 0; i1 < vector.size(); i1++)
        {
            String s = (String)vector.elementAt(i1);
            for(int j1 = 0; j1 < vector1.size(); j1++)
            {
                String s1;
                if(ab.a(s1 = (String)vector1.elementAt(j1), s))
                {
                    y y1 = au1.b(s);
                    y y2 = au2.b(s1);
                    if(y1.d)
                    {
                        y2.a(4, !y1.b());
                        y2.a(64, y1.a(64));
                        au1.a(s1, y2);
                    }
                }
            }

        }

        if(au2.e != null)
        {
            Vector vector2 = au2.e;
            for(int k1 = 0; k1 < vector2.size(); k1++)
                au1.e((String)vector2.elementAt(k1));

        }
        au1.f = au2.f;
        au1.g = au2.g;
    }

    private static void b(au au1, au au2)
    {
        Vector vector = au2.d();
        for(int i1 = 0; i1 < vector.size(); i1++)
        {
            String s = (String)vector.elementAt(i1);
            y y1 = au2.b(s);
            au1.a(s, y1);
        }

    }

    public static void b(int i1)
    {
        b = i1;
    }

    private static void b(ag ag1)
    {
        try
        {
            bi bi1 = t.n();
            int i1 = ag1.c ? -1 : t.f(1488);
            au au2 = bi1.e(i1);
            t.a(1307, i);
            Object obj1 = null;
            if(ag1.d == 2)
            {
                Object aobj[];
                Object obj2 = (aobj = ag1.e)[3];
                Object obj = aobj[5];
                au au3 = a(i1, obj2, ag1);
                au au1 = a(i1, obj, ag1);
                if(ag1.c)
                {
                    au3.a((Vector)obj2);
                    au1.a((Vector)obj);
                } else
                {
                    au3.b(obj2);
                    au1.b(obj);
                }
                a(au3, au2);
                a(au1, au2);
                if(ag1.a)
                {
                    a--;
                    b(au3, au1);
                } else
                {
                    if(!k)
                        a++;
                    b(au1, au3);
                    au3 = au1;
                }
                if(k)
                    k = false;
                b = au3.c;
                c = au3.d().size();
                bi1.a(au3);
                t.a(1559, ag1.a);
                j = true;
                t.c(1488, au3.a);
                if(ag1.c)
                    au3.b = t.c(995);
                if(a == 1)
                    au3.i();
            }
        }
        catch(Throwable throwable)
        {
            n = new Integer(v.m(914));
            j = true;
        }
        g = null;
    }

    public static void h()
    {
        ag ag1;
        if((ag1 = g) != null)
            ag1.a(3);
    }

    private static void b(Object aobj[])
    {
        Object obj = t.n();
        int i1 = t.f(1488);
        obj = ((bi) (obj)).e(i1);
        aobj[1] = new Integer(i1);
        aobj[2] = ((au) (obj)).d();
    }

    private static Object[] c(ag ag1)
    {
        Object aobj[] = {
            ag1, null, null, null, null, null
        };
        ag1.e = aobj;
        b(aobj);
        return aobj;
    }

    public static boolean i()
    {
        return k;
    }

    public static boolean j()
    {
        return e;
    }

    public static void a(ag ag1)
    {
        b(ag1);
    }

    public static boolean k()
    {
        return e = false;
    }

    private static boolean e = false;
    public static int a = 1;
    public static int b = 0;
    public static int c = 0;
    public static int d = 10;
    private static int f = 5;
    private static ag g;
    private static int h = 0;
    private static String i;
    private static boolean j;
    private static boolean k;
    private static boolean l = false;
    private static boolean m;
    private static Integer n;

}