// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:40
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class bc extends Hashtable
{

    public bc(be be1)
    {
        put(z.i(-2), be1.i);
        String s1 = be1.X();
        a(0, s1);
        if(be1 instanceof n)
        {
            String s2 = ((n)be1).d;
            a(3, s2);
            return;
        }
        if(be1 instanceof j)
        {
            c(x.c(((j)be1).c));
            return;
        }
        if(be1 instanceof ab)
            A(((ab)be1).a);
    }

    public bc()
    {
    }

    private bc(ba ba1)
    {
        put(z.i(-2), ba1);
    }

    public static final bc a(ba ba1)
    {
        return new bc(ba1);
    }

    public final boolean a()
    {
        return g(26) != null || d() != null && (d() instanceof az);
    }

    public final boolean b()
    {
        return g(60) == null && (d() == null || !(d() instanceof ax)) && g(26) == null && (d() == null || !(d() instanceof az));
    }

    public static final bc b(ba ba1)
    {
        return new bc(ba1);
    }

    public final String c()
    {
        return (String)get(z.i(-1));
    }

    public final ba d()
    {
        return (ba)get(z.i(-2));
    }

    private String g(int i1)
    {
        return (String)get(z.i(i1));
    }

    public final bc a(String s1)
    {
        v.b();
        return a(-1, s1);
    }

    private final bc a(int i1, String s1)
    {
        if(x.n(s1))
            put(z.i(i1), s1);
        return this;
    }

    public final bc b(String s1)
    {
        return a(0, s1);
    }

    public final bc c(String s1)
    {
        return a(1, s1);
    }

    public final bc d(String s1)
    {
        return a(2, s1);
    }

    public final bc e(String s1)
    {
        return a(3, s1);
    }

    private bc p()
    {
        return a(4, t.c(322));
    }

    private bc q()
    {
        return a(4, t.c(323));
    }

    private bc r()
    {
        return a(4, t.c(0x301da));
    }

    public final bc f(String s1)
    {
        return a(6, s1);
    }

    public final bc g(String s1)
    {
        return a(9, s1);
    }

    public final bc h(String s1)
    {
        return a(10, s1);
    }

    public final bc i(String s1)
    {
        return a(32, s1);
    }

    public final bc j(String s1)
    {
        return a(33, s1);
    }

    public final bc k(String s1)
    {
        return a(34, s1);
    }

    public final bc l(String s1)
    {
        return a(35, s1);
    }

    public final bc m(String s1)
    {
        return a(36, s1);
    }

    public final bc n(String s1)
    {
        return a(37, s1);
    }

    public final bc e()
    {
        return this;
    }

    public final bc o(String s1)
    {
        return a(8, s1);
    }

    public final bc a(int i1)
    {
        int j1 = i1 % 10;
        this;
        5;
        if(i1 > 0 && i1 < 100) goto _L2; else goto _L1
_L1:
        t.c(327);
          goto _L3
_L2:
        if(i1 >= 5 && i1 <= 20) goto _L5; else goto _L4
_L4:
        if(j1 != 1) goto _L7; else goto _L6
_L6:
        a(i1, 325);
          goto _L3
_L7:
        if(j1 < 2 || j1 > 4) goto _L5; else goto _L8
_L8:
        a(i1, 326);
          goto _L3
_L5:
        a(i1, 324);
_L3:
        a();
        return;
    }

    private static final String a(int i1, int j1)
    {
        return bh.b(bh.r().append(i1).append(t.c(j1)));
    }

    public final bc a(int i1, int j1, int k1)
    {
        if(k1 >= 0)
        {
            k1 = x.c(k1 + 1);
            i1 = bh.b(bh.r().append(k1).append('/').append(x.c(j1)).append('/').append(i1));
            return a(6, i1);
        } else
        {
            return this;
        }
    }

    public final bc b(int i1)
    {
        if(i1 == 1)
            return q();
        if(i1 == 2)
            return p();
        else
            return r();
    }

    public final bc p(String s1)
    {
        if((s1 = x.a(s1, 1, 12, 0)) != 0)
        {
            Vector vector;
            s1 = (String)(vector = x.b(t.c(676), '\0')).elementAt(s1);
            a(7, s1);
            bh.a(vector);
        }
        return this;
    }

    public final bc q(String s1)
    {
        if(1 == (s1 = x.a(s1, 1, 2, 0)))
            p();
        else
        if(2 == s1)
            q();
        return this;
    }

    public final bc r(String s1)
    {
        return a(50, s1);
    }

    public final bc s(String s1)
    {
        return a(51, s1);
    }

    public final bc t(String s1)
    {
        return a(52, s1);
    }

    public final bc f()
    {
        return this;
    }

    public final bc g()
    {
        return this;
    }

    public final bc u(String s1)
    {
        return a(53, s1);
    }

    public final String h()
    {
        return g(50);
    }

    public final String i()
    {
        return g(51);
    }

    public final bc c(int i1)
    {
        return a(60, ab.e(Integer.toString(i1)));
    }

    public final bc v(String s1)
    {
        return a(60, s1);
    }

    public final bc j()
    {
        return this;
    }

    public final bc d(int i1)
    {
        return a(61, ab.e(Integer.toString(i1)));
    }

    private final String h(int i1)
    {
        return x.h(g(i1));
    }

    public final String k()
    {
        return g(60);
    }

    public final String l()
    {
        String s1;
        if((s1 = g(3)) != null)
            return s1;
        else
            return h(60);
    }

    public final String m()
    {
        String s1;
        if(ab.a(s1 = x.l(h(0))))
            return g(60);
        else
            return s1;
    }

    public final String n()
    {
        String s1;
        if(ab.a(s1 = x.l(ab.b(x.i(h(1)), x.l(h(2))))) && null == (s1 = g(0)))
            return l();
        else
            return s1;
    }

    public final av o()
    {
        int i1;
        if(d() instanceof bi)
        {
            String s1 = g(3);
            return av.d().a(z.a(x.a(g(10), 0, 4, 0), g(12), s1)).a(x.d(h(0)), 1, 0).h(x.s(s1)).a(this);
        } else
        {
            return av.d().a((i1 = x.c(g(61))) != 0 ? ((int) (i1 != 1 ? 263 : 256)) : 255).h(x.i(g(60))).a(x.d(h(0)), 1, 0).h(ab.b(x.i(h(1)), h(2))).a(this);
        }
    }

    public final ad e(int i1)
    {
        Object obj = d();
        i1 = aw.b(i1);
        boolean flag = false;
        Vector vector;
        int j1 = (vector = x.b(t.c(316), '\0')).size();
        if(obj instanceof bi)
        {
            obj = (n)((ba) (obj)).d(g(3));
            for(int k1 = 0; k1 < j1; k1++)
                try
                {
                    String s2 = (String)vector.elementAt(k1);
                    s2 = bh.b(x.a(bh.r().append(s2)));
                    String s4;
                    if(null == (s4 = g(k1)))
                        continue;
                    if(k1 == 6)
                    {
                        i1.a(s2, bh.b(bh.r().append(s2 = ab.a(s4, 8, 10)).append('/').append(ab.a(s4, 5, 7)).append('/').append(ab.b(s4, 4))));
                        continue;
                    }
                    if(k1 == 10)
                    {
                        i1.a(av.e().a(s2, 0, 6).a(obj != null ? ((n) (obj)).p_() : z.a(x.a(s4, 0, 4, 0), x.h(g(12)), g(3))).h(x.h(g(13))));
                        break;
                    }
                    if(k1 == 3 && x.r(g(3)))
                        i1.a("ICQ UIN: ", x.s(g(3)));
                    else
                        i1.a(s2, k1 != 9 ? s4 : x.j(x.k(s4)));
                }
                catch(Throwable throwable) { }

            if(obj != null)
            {
                String s3;
                if(x.n(s3 = ((n) (obj)).r()))
                    i1.a(av.e().a(t.c(321), 0, 6).a(((n) (obj)).q()).h(s3));
                if(x.n(s3 = ((n) (obj)).h))
                    i1.a(av.e().a(t.c(328), 0, 6).a(242).h(s3));
                if(x.n(s3 = ((n) (obj)).g))
                    i1.a(av.e().a(t.c(329), 0, 6).a(2).h(s3));
                if(x.n(s3 = ((n) (obj)).s()))
                    i1.a(av.e().a(t.c(330), 0, 6).a(365).h(s3));
            }
        } else
        if(obj instanceof ax)
        {
            if(null != (obj = g(60)))
                i1.a(x.i(t.c(0x407ab)), ((String) (obj)));
            for(int l1 = 0; l1 < 5; l1++)
                try
                {
                    if(null != (obj = g(l1)))
                        i1.a(bh.b(x.a(bh.r().append(vector.elementAt(l1)))), ((String) (obj)));
                }
                catch(Throwable throwable1) { }

            if(null != (obj = g(5)))
                i1.a(t.c(319), ((String) (obj)));
            if(null != (obj = g(32)))
                i1.a(t.c(317), ((String) (obj)));
            if(null != (obj = g(37)))
                i1.a(t.c(318), ((String) (obj)));
            if(null != (obj = g(36)))
                i1.a(t.c(320), ((String) (obj)));
        } else
        if(obj instanceof az)
        {
            Image image;
            if((image = (Image)get(z.i(25))) != null)
                i1.a(av.a(new ar(image)));
            Object obj1 = null;
            i1.a(x.c(g(24)), h(0), 0);
            i1.a(t.c(0x407c4), g(26), 0);
            String s1;
            if(null != (s1 = g(11)))
                i1.a(s1);
        }
        bh.a(vector);
        return i1;
    }

    public final void w(String s1)
    {
        a(12, s1);
    }

    public final void x(String s1)
    {
        a(13, s1);
    }

    public final bc y(String s1)
    {
        return a(11, s1);
    }

    private void A(String s1)
    {
        a(26, s1);
    }

    public final bc z(String s1)
    {
        return a(11, s1);
    }

    public final bc a(Image image)
    {
        if(image != null)
            put(z.i(25), image);
        return this;
    }

    public final bc f(int i1)
    {
        return a(24, ab.e(Integer.toString(i1)));
    }
}