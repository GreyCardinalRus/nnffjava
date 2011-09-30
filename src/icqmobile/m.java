// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:42
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.*;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class m
    implements al
{

    public m()
    {
        n = new am();
    }

    private m(String s1, long l1, long l2, int i1, byte byte0)
    {
        v.b();
        h = s1;
        i = 0L;
        j = 0L;
        k = 0L;
        l = 0L;
        a = l1;
        b = l2;
        c = i1;
        n = new am();
    }

    public m(String s1, long l1, long l2, int i1)
    {
        v.b();
        h = s1;
        a = l1;
        b = l2;
        c = i1;
        n = new am();
    }

    public m(String s1)
    {
        try
        {
            h = aa.c(s1);
            a = r.d(aa.d(s1));
            b = r.f(aa.e(s1));
            c = Integer.parseInt(aa.f(s1));
        }
        catch(Throwable _ex) { }
        n = new am();
    }

    public m(s s1)
    {
        h = s1.g(null);
        i = s1.o();
        j = s1.o();
        k = s1.o();
        l = s1.o();
        a = s1.o();
        b = s1.o();
        c = s1.g();
        e = s1.g();
        g = s1.g();
        f = s1.g();
        n = new am();
    }

    public final void a(s s1)
    {
        s1.b(h).a(i).a(j).a(k).a(l).a(a).a(b).r(c).r(e).r(g).r(f);
    }

    public final String j()
    {
        String _tmp = h;
        v.b();
        return h;
    }

    public final String k()
    {
        int i1;
        try
        {
            if((i1 = h.indexOf(';')) >= 0 && (i1 = h.indexOf(';', i1 + 1)) >= 0)
            {
                return ab.b(h, i1);
            } else
            {
                String _tmp = h;
                v.b();
                return h;
            }
        }
        catch(Throwable _ex)
        {
            String _tmp1 = h;
        }
        v.b();
        return h;
    }

    public final void l()
    {
        d = true;
        m = true;
    }

    public final void m()
    {
        d = false;
        m = true;
    }

    public final long c(int i1)
    {
        return v.c(a, i1);
    }

    public final long d(int i1)
    {
        return v.c(b, i1);
    }

    public final boolean n()
    {
        if(m)
        {
            m = false;
            return true;
        } else
        {
            return false;
        }
    }

    public final String o()
    {
        return v.a(a, b, c, h);
    }

    public static final boolean a(String s1)
    {
        v.b();
        boolean flag = true;
        int i1 = 0;
        char c1;
        for(int j1 = s1.length(); --j1 >= 0;)
            if((c1 = s1.charAt(j1)) == '.')
                i1 += 10;
            else
            if(c1 == ',')
                i1++;
            else
                flag &= c1 >= '0' && c1 <= '9';

        return flag && i1 == 21;
    }

    public final String v_()
    {
        return k();
    }

    public final int e()
    {
        return (int)a;
    }

    public final int f()
    {
        return (int)b;
    }

    public final int t_()
    {
        return e;
    }

    public final boolean u_()
    {
        return d;
    }

    public final void c()
    {
        d = false;
    }

    public final void d()
    {
        d = true;
    }

    public final int h()
    {
        if(f != 0)
            return e(f);
        else
            return 10;
    }

    public final boolean x_()
    {
        return true;
    }

    public final int a(int i1)
    {
        return n.a(i1, this);
    }

    public final int b(int i1)
    {
        return n.b(i1, this);
    }

    public static final int e(int i1)
    {
        switch(i1)
        {
        case 5: // '\005'
        case 6: // '\006'
        case 10: // '\n'
        case 11: // '\013'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 444: 
        case 445: 
        case 456: 
        case 480: 
        case 509: 
        case 510: 
        case 558: 
        case 559: 
        case 560: 
            return 13;

        case 476: 
            return 3;

        case 504: 
            return 4;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 8: // '\b'
        case 9: // '\t'
        case 13: // '\r'
        case 2000: 
        case 2001: 
            return 5;

        case 154: 
        case 155: 
        case 156: 
        case 157: 
            return 17;

        case 30: // '\036'
        case 32: // ' '
        case 33: // '!'
        case 40: // '('
        case 41: // ')'
        case 43: // '+'
        case 44: // ','
        case 45: // '-'
        case 47: // '/'
        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 53: // '5'
        case 54: // '6'
        case 132: 
        case 133: 
        case 134: 
        case 451: 
            return 16;
        }
        return 10;
    }

    public static final void f(int i1)
    {
        t.a(1538, 0x3fc2c4L);
        t.a(1540, 0x722e50L);
        t.a(1360, ay.c(225));
        t.a(1361, ay.c(226));
        t.c(1384, t.f(1509));
        t.c(1385, i1);
        t.a(1379, t.i(35));
        t.a(1381, t.i(37));
        o.a();
        long l1 = System.currentTimeMillis() - 90L;
        t.a(1536, l1);
        v.bu();
    }

    public static final void a(ar ar1, int i1)
    {
        try
        {
            int j1 = t.f(1384);
            int k1 = t.f(1385);
            (ar1 = ar1.b).drawImage(t.o(1323), j1 >> 1, i1 + (k1 >> 1), 3);
            if(!t.g(1383) && t.g(1516))
            {
                int ai[] = new int[j1];
                for(int l1 = j1; --l1 >= 0;)
                    ai[l1] = 0x3c000000;

                while(--k1 >= 0) 
                    ar1.drawRGB(ai, 0, j1, 0, i1 + k1, j1, 1, true);
            }
        }
        catch(Throwable _ex) { }
        t.c(1533, 0);
    }

    public static final void p()
    {
        long l1;
        if((l1 = System.currentTimeMillis()) - t.i(1536) > 45L)
            t.a(1536, l1);
        if(v.F(10) && o.d)
        {
            if(t.g(276) && l.h())
                r.K();
            o.a(false);
        }
        int i1;
        if((i1 = t.f(1544)) >= 0 && t.i(1536) == l1 && !t.g(1533))
        {
            long l3 = o.b;
            t.a(1538, l3);
            l3 = o.a;
            t.a(1540, l3);
            int j1;
            long l2 = (v.x(j1 = t.f(39)) / v.y(j1)) * 9L;
            switch(i1)
            {
            case 0: // '\0'
                long l4 = t.i(1538) + l2;
                t.a(1538, l4);
                break;

            case 1: // '\001'
                long l5 = t.i(1538) - l2;
                t.a(1538, l5);
                break;

            case 2: // '\002'
                long l6 = t.i(1540) + l2;
                t.a(1540, l6);
                break;

            case 3: // '\003'
                long l7 = t.i(1540) - l2;
                t.a(1540, l7);
                break;
            }
            o.a(t.i(1538), t.i(1540));
            v.a(10, 500L);
            o.x();
        }
        if(t.i(1536) == l1)
            o.b();
        if(t.g(277))
            P();
    }

    public static final void a(boolean flag)
    {
        o.c = true;
        t.a(41, flag);
    }

    public static final void q()
    {
        o.a(t.f(39) + 1);
    }

    public static final void r()
    {
        o.a(t.f(39) - 1);
    }

    public static final void b(s s1)
    {
        t.a(1359, ay.e(s1.K()));
    }

    public static final void s()
    {
        t.a(1359, bh.q());
    }

    public static final void b(String s1)
    {
        Image image = t.o(1323);
        z.a(s1, o.a, o.b, image.getWidth(), image.getHeight());
    }

    public static final void t()
    {
        if(o.m())
            p.n();
        o.n();
        o.c = true;
        if(o.m())
            z.ay();
    }

    public static final void u()
    {
        if(o.m())
            p.n();
        o.o();
        o.c = true;
        if(o.m())
            z.ay();
    }

    public static final void v()
    {
        if(o.m())
            p.n();
        o.p();
        o.c = true;
        if(o.m())
            z.ay();
    }

    public static final void w()
    {
        if(o.m())
            p.n();
        o.q();
        o.c = true;
        if(o.m())
            z.ay();
    }

    public static final void a(m m1, boolean flag)
    {
        if(flag)
        {
            ay.a(t.n(1360), m1, 5);
            ay.a(t.n(1360), 225);
        }
        o.a(m1);
    }

    public static final Vector x()
    {
        Vector vector;
        if((vector = t.n(1359)) != null)
            t.h(1359);
        return vector;
    }

    public static final void c(String s1)
    {
        long l1 = o.b;
        long l2 = o.a;
        al al1;
        if((al1 = o.e) != null && al1.u_())
        {
            l1 = al1.e();
            l2 = al1.f();
            al1.c();
        }
        (s1 = new m(s1, l1, l2, t.f(39), (byte)0)).e = 4;
        Vector vector;
        ay.a(vector = t.n(1361), s1, 50);
        ay.a(vector, 226);
        o.c(s1);
    }

    public static final void g(int i1)
    {
        t.a(1213, bh.r().append(i1 = t.c(i1)).append(' ').append('(').append(O()).append(')'));
    }

    public static final Enumeration y()
    {
        return t.n(1361).elements();
    }

    private static int O()
    {
        return t.n(1361).size();
    }

    public static final boolean z()
    {
        return t.n(1361).size() > 0;
    }

    private static final void P()
    {
        if(v.b(7, 0x493e0L))
        {
            v.a(7, 0x493e0L);
            ab.C();
            z.aA();
            o.c = true;
            v.bs();
        }
    }

    public static final void a(m m1)
    {
        Vector vector;
        ay.a(vector = t.n(1361), m1);
        ay.a(vector, 226);
    }

    public static final void A()
    {
        ay.g = bh.q();
        r = x.a(t.c(264), '\0');
        try
        {
            d(z.i(t.c(265)));
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    public static final void a(ao ao1)
    {
        o = new Hashtable();
        Object obj1 = null;
        Vector vector;
        if((vector = ao1.b) == null)
            return;
        for(ao1 = 0; ao1 < x.c(vector); ao1++)
        {
            Object obj;
            String s1 = ((ao) (obj = (ao)vector.elementAt(ao1))).c(25705);
            c c1 = new c(Integer.parseInt(s1), ((ao) (obj)).b(0x401d6), ((ao) (obj)).a(), ((ao) (obj)).b(0x81816));
            obj = ((ao) (obj)).b;
            ao ao2;
            for(int i1 = 0; i1 < x.c(((Vector) (obj)));)
                if(ab.a(0x406da, (ao2 = (ao)((Vector) (obj)).elementAt(i1++)).a))
                    c1.d = ab.a(ao2.c);

            o.put(s1, c1);
        }

        p = new Hashtable();
        t.c(1556, 1);
        try
        {
            t.a(265, t.i());
            t.a(265, Q().e());
            return;
        }
        catch(Throwable _ex)
        {
            t.a(254, t.i());
        }
    }

    public static final String a(Object obj)
    {
        if(!t.g(1556) || (obj = (c)o.get(obj)) == null)
            return null;
        else
            return ((c) (obj)).c;
    }

    private static String f(String s1)
    {
        if(!t.g(1556) || (s1 = (c)o.get(s1)) == null)
            return null;
        else
            return ((c) (s1)).d;
    }

    public static final Image d(String s1)
    {
        if(!t.g(1556))
            return null;
        synchronized(p)
        {
            Image image;
            String s2;
            if((image = (Image)p.get(s1)) == null)
                try
                {
                    p.put(s1, image = ay.j(ab.b("upi", s2 = s1)).u());
                }
                catch(Throwable _ex)
                {
                    if(q == null)
                    {
                        q = s1;
                        v.i(f(s1));
                    }
                }
            s1 = image;
        }
        return s1;
    }

    public static final Vector B()
    {
        if(!t.g(1556))
            return null;
        Vector vector = bh.q();
        Object obj;
        for(Enumeration enumeration = o.keys(); enumeration.hasMoreElements();)
            if(!e(obj = enumeration.nextElement()) && c(obj))
                vector.addElement(obj);

        return vector;
    }

    public static final Vector C()
    {
        if(!t.g(1556))
            return null;
        Vector vector = bh.q();
        Object obj;
        for(Enumeration enumeration = o.keys(); enumeration.hasMoreElements();)
            if(!e(obj = enumeration.nextElement()))
                vector.addElement(obj);

        return vector;
    }

    private static final boolean c(Object obj)
    {
        v.i();
        return (obj = (c)o.get(obj)) != null && ((c) (obj)).a == 1;
    }

    public static final void e(String s1)
    {
        v.b();
        r = x.a(s1, '\0');
        t.a(264, s1);
    }

    public static final boolean b(Object obj)
    {
        v.i();
        return r.contains(obj);
    }

    public static final Vector D()
    {
        if(!t.g(1556))
            return null;
        Vector vector = bh.q();
        Object obj;
        for(Enumeration enumeration = o.keys(); enumeration.hasMoreElements();)
            if(!f(obj = enumeration.nextElement()))
                vector.addElement(obj);

        return vector;
    }

    public static final void c(s s1)
    {
        synchronized(p)
        {
            String s2;
            String s3 = s2 = q;
            s3 = ab.b("upi", s3);
            v.b();
            v.b();
            ay.a(s3, s1);
            try
            {
                p.put(s2, s1.u());
            }
            catch(Throwable _ex) { }
            q = null;
            o.c = true;
        }
    }

    private static final int d(Object obj)
    {
        v.i();
        if(!t.g(1556))
            return 2;
        try
        {
            return ((c)o.get(obj)).e;
        }
        catch(Throwable _ex)
        {
            return 2;
        }
    }

    private static final boolean e(Object obj)
    {
        v.i();
        return d(obj) == 0;
    }

    private static final boolean f(Object obj)
    {
        v.i();
        return d(obj) == 2;
    }

    private static s Q()
    {
        s s1;
        (s1 = new s()).q(o.size());
        for(Enumeration enumeration = o.keys(); enumeration.hasMoreElements(); ((c)o.get(enumeration.nextElement())).a(s1));
        return s1;
    }

    private static void d(s s1)
    {
        o = new Hashtable();
        try
        {
            if(s1.b > 0)
            {
                for(int i1 = s1.z(); --i1 >= 0;)
                {
                    c c1 = new c(s1);
                    o.put(ab.e(Integer.toString(c1.b)), c1);
                }

            }
        }
        catch(Throwable _ex) { }
        E();
        t.c(1556, 1);
    }

    public static final void E()
    {
        p = new Hashtable();
    }

    public static final int a(String s1, String s2, String s3, Object aobj[])
    {
        a(s1, null, s2, s3);
        v = aobj;
        return 54;
    }

    public static final int a(String s1, String s2, String s3, String s4)
    {
        v = null;
        v.b();
        v.b();
        t.c(1507, 0);
        t.c(1506, 0);
        ay.z();
        t.a(1311, s1);
        t.a(1314, s2);
        t.a(1312, x.h(s3));
        s1 = t.i();
        s2 = t.g(92) ? bh.b(bh.r().append(s3 = t.c(93)).append('\n')) : s1;
        s1 = t.g(94) ? bh.b(bh.r().append(s3 = t.c(95)).append('\n')) : s1;
        s1 = bh.r().append(s2).append(s1).append(x.h(s4));
        if(t.f(1488) != 0x7a121)
            s1.append(t.c(849));
        t.a(1313, s1);
        return 54;
    }

    public static final void F()
    {
        u = false;
        t.a(1560, false);
        ad ad1 = aw.b(4713);
        if(v != null)
        {
            for(int i1 = 0; i1 < v.length; i1++)
            {
                String as[] = (String[])v[i1];
                a(ad1, as[6], as[0], as[2]);
            }

        }
        aw.b(ad1);
        at.e();
    }

    public static final int G()
    {
        av av1 = aw.f();
        if(193 == av1.c)
        {
            Vector vector = aw.c().j;
            if(av1 == vector.elementAt(0))
                s = true;
            else
                s = false;
            if(av1 == vector.elementAt(2))
                t = true;
            else
                t = false;
            ay.i = s;
            S();
            return 193;
        } else
        {
            return 0;
        }
    }

    public static final int H()
    {
        S();
        return u ? 0 : 12;
    }

    private static final void R()
    {
        Object obj = ay.A();
        char c1;
        Object obj1 = x.h(t.c(c1 = s ? '\u051F' : '\u0522'));
        if(((StringBuffer) (obj1 = bh.r().append(((String) (obj1))))).length() > 0 && ((Vector) (obj)).size() > 0)
            ((StringBuffer) (obj1)).append(',');
        for(obj = ((Vector) (obj)).elements(); ((Enumeration) (obj)).hasMoreElements();)
        {
            ((StringBuffer) (obj1)).append(((Enumeration) (obj)).nextElement());
            if(((Enumeration) (obj)).hasMoreElements())
                ((StringBuffer) (obj1)).append(',');
        }

        t.a(c1, bh.b(((StringBuffer) (obj1))));
        s = false;
        t = false;
        F();
    }

    private static final void a(int i1, int j1, String s1)
    {
        int k1 = x.d(s1, ",");
        t.c(i1, k1 != 0 ? k1 + 1 : k1);
        t.a(j1, s1);
    }

    public static final int I()
    {
        boolean flag = ay.B();
        boolean flag1 = false;
        if((s || t) && flag)
            R();
        Object obj;
        String s1 = (String)((Object[])((av)((Vector) (obj = aw.c().j)).elementAt(1)).d)[0];
        obj = (String)((Object[])((av)((Vector) (obj)).elementAt(3)).d)[0];
        if(!ab.a(s1, w))
        {
            w = s1;
            a(1506, 1311, s1);
            flag1 = true;
        }
        if(!ab.a(((String) (obj)), x))
        {
            x = ((String) (obj));
            a(1507, 1314, ((String) (obj)));
            flag1 = true;
        }
        if(flag1)
        {
            ay.z();
            F();
        }
        if(x.n(((String) (obj = t.c(1373)))))
        {
            t.a(1373, t.i());
            ac.b = ((String) (obj));
            J();
            return 82;
        } else
        {
            return 0;
        }
    }

    public static final int J()
    {
        S();
        Vector vector = bh.q();
        StringBuffer stringbuffer = bh.r();
        String s1;
        int i1 = (s1 = x.h(t.c(1311))).length();
        for(int j1 = 0; j1 <= i1; j1++)
        {
            char c1;
            if((c1 = j1 != i1 ? s1.charAt(j1) : ';') == ';' || (c1 == ',' || c1 == ' '))
            {
                if(!ab.a(c1 = ab.b(stringbuffer)))
                    vector.addElement(c1);
            } else
            {
                stringbuffer.append(c1);
            }
        }

        if(x.c(vector) == 0)
            return v.m(848);
        else
            return 0;
    }

    private static void a(ad ad1, String s1, String s2, Object obj)
    {
        int i1 = s2 == null ? s1.lastIndexOf('/') : 0;
        if(-1 == i1)
            i1 = 0;
        String s3 = s2 == null ? ab.c(s1, i1) : s2;
        (s2 = av.a(bh.b(bh.r().append(s3).append(' ').append(obj == null ? t.i() : obj.toString())), true)).b = s1;
        ad1.a(s2);
    }

    private static void S()
    {
        String as[] = new String[4];
        int i1 = 0;
        av av1;
        for(Enumeration enumeration = aw.c().j.elements(); enumeration.hasMoreElements();)
            if((av1 = (av)enumeration.nextElement()).a == 15)
            {
                Object aobj[] = (Object[])av1.d;
                if(null != aobj[0])
                    as[i1] = ab.e((String)aobj[0]);
                i1++;
            }

        bh.r();
        StringBuffer stringbuffer = bh.r();
        if(!a(1311, as[0]) || !a(1314, as[1]) || !a(1312, as[2]) || !a(1313, as[3]) || !a(1365, ab.e(stringbuffer.toString())))
            u = true;
        t.a(1311, as[0]);
        t.a(1314, as[1]);
        t.a(1312, as[2]);
        t.a(1313, as[3]);
        t.a(1365, bh.b(stringbuffer));
    }

    private static final boolean a(int i1, String s1)
    {
        i1 = t.c(i1);
        if(!x.n(s1) && !x.n(i1))
            return true;
        else
            return ab.a(i1, s1);
    }

    public static final void K()
    {
        t.a(1334, t.k(1334));
        U();
        g(h(t.k(1341)));
        t.a(1342, t.k(1342));
        t.a((new s()).w(0x3d646926).f(x.h(t.c(222))).c(0x3d72657626L).f(T()));
        t.b(1335, ab.e(System.getProperty(t.c(930))));
        t.b(1336, ab.e(System.getProperty(t.c(931))));
        t.b(1337, ab.e(System.getProperty(t.c(1337))));
        t.b(1339, ab.e(System.getProperty(t.c(1339))));
        t.b(1340, ab.e(System.getProperty(t.c(1340))));
        t.b(1338, ab.e(System.getProperty(t.c(1338))));
        for(int i1 = 934; --i1 >= 932;)
            try
            {
                Class.forName(t.b(i1));
                t.c(1518, 1);
                break;
            }
            catch(Throwable _ex) { }

        if(t.c(295) == null)
            t.a(295, bh.a(0x75725f716369L));
        Object obj;
        if(t.c(1334).charAt(0) != '3' || t.c(1334).charAt(2) != '5')
            t.a(1334, ((Object) (x.a(obj = t.m(1334), obj, obj))));
        if(t.c(239) == null)
            t.a(239, 988);
        t.h(405);
        String s1;
        z = t.a(s1 = ab.e(ab.b(t.c(1335), t.c(1336)).toLowerCase()), 0x63697265796e6f73L) >= 0 || t.a(s1, 0x32303373) == 0 || t.a(s1, 0x32303377) == 0;
        y = t.a(s1, 0x61696b6f6eL) >= 0;
        t.a(1517, t.a(s1, 0x2d656973) == 0 || t.a(s1, 0x716e6562) == 0);
        t.a(1524, y || z);
        t.a(1519, V() || t.a(s1, 0x676e75736d6173L) >= 0 || t.a(s1, 0x636573) == 0 || t.a(s1, 0x686373) == 0 || t.a(s1, 0x686773) == 0 || t.a(s1, 29799) == 0);
        v.a(h(0), h(1), h(2));
        if(t.i(219) == 0L)
            t.a(219, System.currentTimeMillis());
    }

    public static final byte h(int i1)
    {
        try
        {
            return (byte)x.c((String)x.a(t.c(1334), '.').elementAt(i1));
        }
        catch(Throwable _ex)
        {
            return 0;
        }
    }

    private static final String T()
    {
        String s1 = t.c(1334);
        String s2 = t.i();
        String as[] = x.a(s2, s2, s2);
        int i1 = 0;
        for(int j1 = 0; j1 < s1.length(); j1++)
        {
            char c1;
            if((c1 = s1.charAt(j1)) == '.')
                i1++;
            else
                as[i1] += c1;
        }

        for(; as[0].length() < 2; as[0] = '0' + as[0]);
        for(; as[1].length() < 2; as[1] = '0' + as[1]);
        for(; as[2].length() < 4; as[2] = '0' + as[2]);
        return (new s()).d(as[0]).d(as[1]).d(as[2]).d();
    }

    private static final void U()
    {
        do
            try
            {
                if(x.c(x.h(t.c(222))) <= 106)
                    throw new Throwable();
                break;
            }
            catch(Throwable _ex)
            {
                t.a(222, ab.e(Integer.toString(x.e())));
            }
        while(true);
    }

    private static final void g(String s1)
    {
        v.b();
        if(s1 != null)
            t.a(1333, s1);
        if(null == t.c(223))
        {
            if(s1 == null)
            {
                s1 = bh.r();
                for(int i1 = 0; i1 < 2; i1++)
                {
                    long l1 = i1 != 0 ? (long)x.e() << 32 | (long)x.c(x.h(t.c(222))) : System.currentTimeMillis();
                    for(int j1 = 0; j1 < 64; j1 += 4)
                    {
                        int k1;
                        s1.append((k1 = (int)(l1 >>> 60 - j1) & 0xf) >= 10 ? (char)(k1 + 87) : (char)(k1 + 48));
                    }

                }

                t.a(223, s1);
                return;
            }
            t.a(223, s1);
        }
    }

    private static final String h(String s1)
    {
        v.b();
        if(s1 != null && s1.length() == 32)
        {
            char c1;
            for(int i1 = 32; --i1 >= 0;)
                if(((c1 = s1.charAt(i1)) < '0' || c1 > '9') && (c1 < 'a' || c1 > 'f'))
                    return null;

            return s1;
        } else
        {
            return null;
        }
    }

    public static final boolean L()
    {
        return y;
    }

    public static final boolean M()
    {
        return z;
    }

    private static boolean V()
    {
        return t.g(1518);
    }

    public static final boolean N()
    {
        return t.g(1517);
    }

    private String h;
    private long i;
    private long j;
    private long k;
    private long l;
    public long a;
    public long b;
    public int c;
    public boolean d;
    private boolean m;
    public int e;
    public int f;
    public int g;
    private am n;
    private static Hashtable o;
    private static Hashtable p;
    private static String q;
    private static Vector r;
    private static boolean s;
    private static boolean t;
    private static boolean u;
    private static Object v[];
    private static String w;
    private static String x;
    private static boolean y;
    private static boolean z;
}