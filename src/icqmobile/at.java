// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:31
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Vector;

public abstract class at
{

    public static String a()
    {
        return h;
    }

    public static Object b()
    {
        return n;
    }

    public static Object c()
    {
        return m;
    }

    public static final boolean d()
    {
        boolean flag = c;
        c = false;
        return flag;
    }

    public static final void e()
    {
        c = true;
    }

    public static final void a(Object aobj[])
    {
        try
        {
            i.a(aobj);
            return;
        }
        catch(Throwable _ex)
        {
            f = null;
        }
    }

    public static final void f()
    {
        if(f != null)
            f.a(3);
        an an1;
        f = an1 = new an();
        an1.a = false;
        an1.b = true;
        a = 1;
        l = true;
        k = false;
        new f(38, ((Object) (c(an1))));
    }

    private static int a(int i1)
    {
        return (a - 1) * (b << 1) + i1;
    }

    public static final int a(int i1, String s)
    {
        boolean flag = false;
        boolean flag1 = false;
        if(i1 == j)
            return 0;
        h = s;
        Vector vector = ((ad) (s = aw.c())).j;
        int j1 = s.t();
        s.a(d, a(j1));
        bf.c = true;
        s = d / (b << 1);
        if(i1 < e && a > 1)
            flag = true;
        else
        if(i1 >= vector.size() - e && a < s - 1)
            flag1 = true;
        j = i1;
        if(flag || flag1)
        {
            if(f != null)
            {
                if((!f.a || !flag) && (f.a || !flag1))
                    f.a(3);
            } else
            {
                (f = new an()).a = flag;
                new f(38, ((Object) (c(f))));
            }
            return b(i1);
        } else
        {
            return 0;
        }
    }

    private static int b(int i1)
    {
        if(f == null)
            return 0;
        char c1 = '\0';
        synchronized(f)
        {
            Vector vector = aw.c().j;
            boolean flag = false;
            boolean flag1 = false;
            if(i1 == 0)
            {
                c1 = '\301';
                flag = true;
            } else
            if(i1 == vector.size() - 1)
            {
                c1 = '\301';
                flag1 = true;
            }
            if(flag || flag1)
                if((i1 = f.c) == 2 || i1 == 1)
                    b(f);
                else
                if(i1 == 0)
                    f.b = true;
        }
        return c1;
    }

    public static int g()
    {
        if(k)
        {
            k = false;
            if(i != -1)
            {
                c = true;
                return i;
            } else
            {
                return 189;
            }
        } else
        {
            return 0;
        }
    }

    private static void b(an an1)
    {
        bi bi1 = t.n();
        int i1 = t.f(1488);
        bi1.e(i1);
        if(an1.c == 2)
        {
            Object aobj[];
            Object obj1 = (aobj = an1.d)[3];
            Object obj = aobj[5];
            if(ab.a(obj1 = ab.d(obj1, 2), 0x51cf6) != null)
                d = ab.c(obj1);
            if(d == 0)
            {
                bh.a(999);
                c = true;
                f = null;
                n = null;
                m = null;
                i = 0;
                k = true;
                return;
            }
            obj1 = ab.a(obj1, 0x60d31);
            obj = ab.a(ab.d(obj, 2), 0x60d31);
            if(an1.a)
            {
                a--;
                n = obj1;
                m = obj;
            } else
            {
                if(!l)
                    a++;
                n = obj;
                m = obj1;
            }
            if(l)
                l = false;
            t.a(1559, an1.a);
            k = true;
        } else
        {
            k = true;
            i = ((Integer)an1.d[4]).intValue();
        }
        f = null;
    }

    public static int a(String s)
    {
        if(!ab.a(g, s))
        {
            g = s;
            t.a(1372, s);
            f();
            return 193;
        } else
        {
            return 0;
        }
    }

    public static int h()
    {
        return a;
    }

    private static Object[] c(an an1)
    {
        Object aobj[] = {
            an1, null, null, null, null, null
        };
        an1.d = aobj;
        return aobj;
    }

    public static boolean i()
    {
        return l;
    }

    public static void a(an an1)
    {
        b(an1);
    }

    public static int j()
    {
        return i = -1;
    }

    public static String k()
    {
        return g;
    }

    private static boolean c = true;
    public static int a = 1;
    private static int d = 100;
    public static int b = 10;
    private static int e = 3;
    private static an f;
    private static String g = t.i();
    private static String h;
    private static int i;
    private static int j = 0;
    private static boolean k;
    private static boolean l;
    private static Object m;
    private static Object n;

}