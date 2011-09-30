// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:42
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class o
{

    public static final void a()
    {
        f = t.f(1384);
        g = t.f(1385);
        a = t.i(1381);
        b = t.i(1379);
        int i1 = t.f(39);
        h = v.c(b, i1);
        i = v.c(a, i1);
        t.a(1323, Image.createImage(f, g));
        ab.z();
        j = new Object();
        ab.y();
        ay.u();
        c = true;
        p.a();
        m = bh.q();
        if(t.g(253))
            ay.b(t.n(1361));
        z.az();
        c = true;
    }

    private static final Image A()
    {
        Image image;
        if((image = t.o(1322)) != null)
        {
            return image;
        } else
        {
            Image image1;
            t.a(1322, image1 = B());
            return image1;
        }
    }

    private static final Image B()
    {
        Image image;
        Graphics g1;
        (g1 = (image = Image.createImage(128, 128)).getGraphics()).setColor(0xc8c8c8);
        int i1 = 0;
        for(int j1 = 0; j1 < 128;)
        {
            for(int k1 = i1; k1 < 128; k1 += 4)
                g1.fillRect(j1, k1, 2, 2);

            j1 += 2;
            i1 ^= 2;
        }

        return image;
    }

    public static final void b()
    {
        C();
        E();
        D();
        I();
        H();
        if(t.g(277))
            ay.v();
    }

    private static final void C()
    {
        if(k != null && k.n())
            c = true;
    }

    private static final void D()
    {
        if(v.b(11, 2000L))
            t.c(1529, 0);
    }

    private static final void E()
    {
        if(a.w())
            c = true;
        if(c)
            F();
    }

    private static final void F()
    {
        G();
        t.c(1533, 1);
        if(u == 0L)
            c = false;
    }

    private static final void G()
    {
        int i1 = (int)(h - (long)(f / 2));
        int j1 = (int)(i - (long)(g / 2));
        int k1 = (int)(h + (long)(f / 2));
        int l1 = (int)(i + (long)(g / 2));
        i1 = i1 >= 0 ? i1 / 128 : i1 / 128 - 1;
        j1 = j1 >= 0 ? j1 / 128 : j1 / 128 - 1;
        k1 = k1 >= 0 ? k1 / 128 : k1 / 128 - 1;
        l1 = l1 >= 0 ? l1 / 128 : l1 / 128 - 1;
        int i2 = (int)(((long)((i1 << 7) + 64) - h) + (long)(f / 2));
        int j2 = (int)((long)g - (((long)((j1 << 7) + 64) - i) + (long)(g / 2)));
        Vector vector = bh.q();
        Graphics g1 = t.o(1323).getGraphics();
        int k2 = t.f(39);
        for(int l2 = i1; l2 <= k1; l2++)
        {
            for(int i3 = j1; i3 <= l1; i3++)
            {
                Object obj = new bh(1, k2, l2, i3);
                bh bh2 = null;
                vector.addElement(obj);
                if(t.g(277) && k2 > 8 && t.g(41) && ab.b(b, a))
                    vector.addElement(bh2 = new bh(3, k2, l2, i3));
                obj = ab.a(((bh) (obj)));
                Image image = bh2 == null ? null : ab.a(bh2);
                if(obj == null)
                    obj = A();
                g1.drawImage(((Image) (obj)), i2 + 128 * (l2 - i1), j2 - 128 * (i3 - j1), 3);
                if(bh2 != null && obj != A())
                    if(image != null)
                        g1.drawImage(image, i2 + 128 * (l2 - i1), j2 - 128 * (i3 - j1), 3);
                    else
                    if(image == null)
                    {
                        bh bh1 = bh2;
                        if(!t.n(1356).contains(bh1))
                            aa.a(g1, i2 + 128 * (l2 - i1), j2 - 128 * (i3 - j1));
                    }
            }

        }

        z.a(vector);
        ab.a(vector);
        int _tmp = f;
        int _tmp1 = g;
        a.a(g1);
        aa.f(g1, h, i, k2, f, g);
        aa.a(g1, k, h, i, k2, f, g);
        aa.a(g1, h, i, k2, f, g);
        aa.e(g1, h, i, k2, f, g);
        aa.b(g1, h, i, k2, f, g);
        aa.d(g1, h, i, k2, f, g);
        aa.c(g1, h, i, k2, f, g);
        aa.a(g1, h, i, b, a, k2, f, g);
        aa.a(g1, f, g, k2, h, i, e);
        long _tmp2 = h;
        long _tmp3 = i;
        int _tmp4 = f;
        int _tmp5 = g;
        aa.a(g1, h, i, k2, f, g, a);
        aa.a(g1, f / 2, g / 2, d);
        aa.a(g1, ab.a(b, a));
        aa.a(g1, k2, a);
        aa.a(g1, v, w, u);
    }

    public static final String c()
    {
        return r.b((int)v.a((int)(i - (long)(g / 2)), t.f(39)));
    }

    public static final long d()
    {
        return (long)(int)v.a((int)(i - (long)(g / 2)), t.f(39));
    }

    public static final String e()
    {
        return r.a((int)v.a((int)(h - (long)(f / 2)), t.f(39)));
    }

    public static final long f()
    {
        return (long)(int)v.a((int)(h - (long)(f / 2)), t.f(39));
    }

    public static final String g()
    {
        return r.b((int)v.a((int)(i + (long)(g / 2)), t.f(39)));
    }

    public static final long h()
    {
        return (long)(int)v.a((int)(i + (long)(g / 2)), t.f(39));
    }

    public static final String i()
    {
        return r.a((int)v.a((int)(h + (long)(f / 2)), t.f(39)));
    }

    public static final long j()
    {
        return (long)(int)v.a((int)(h + (long)(f / 2)), t.f(39));
    }

    private static void a(long al1[])
    {
        a(al1[0], al1[1]);
    }

    public static final void a(long l1, long l2)
    {
        if(l2 != a || l1 != b)
        {
            int i1 = t.f(39);
            synchronized(j)
            {
                t.a(37, a = l2);
                t.a(35, b = l1);
                h = v.c(l1, i1);
                i = v.c(l2, i1);
                if(r != (l1 = ab.c(l1, l2)))
                {
                    if(t.g(277))
                        ay.w();
                    r = l1;
                }
                a(c(i1));
            }
            c = true;
        }
    }

    private static final int c(int i1)
    {
        if(!ab.b(b, a) && i1 > 10)
            return 10;
        int j1;
        if(r != null && i1 > (j1 = r.g))
            return j1;
        else
            return i1;
    }

    public static final void a(int i1)
    {
        int j1 = t.f(39);
        if(i1 != j1 && i1 >= 3 && i1 <= 17)
        {
            i1 = (i1 = c(i1)) == 8 ? ((int) (j1 >= i1 ? 7 : 9)) : i1;
            t.c(39, i1);
            h = v.c(b, i1);
            i = v.c(a, i1);
            x();
            c = true;
        }
    }

    public static final void a(boolean flag)
    {
        if(d != flag)
        {
            d = flag;
            c = true;
        }
    }

    public static final void a(m m1)
    {
        k = m1;
        ay.u();
        c = true;
        a(k.a, k.b);
        a(k.c);
        k.l();
        x();
    }

    public static final void b(m m1)
    {
        if(t.g(1411))
            p.b(m1.a, m1.b);
        else
            p.a(m1.a, m1.b);
        c = true;
        if(m())
            z.ay();
        m1.m();
        t.c(1412, 0);
    }

    public static final void c(m m1)
    {
        ay.u();
        c = true;
        a(m1.a, m1.b);
        a(m1.c);
        m1.l();
        x();
    }

    public static final String a(String s1)
    {
        long l1;
        al al1;
        long l2;
        if((al1 = e) != null && al1.u_())
        {
            l1 = al1.e();
            l2 = al1.f();
        } else
        {
            l1 = b;
            l2 = a;
        }
        return v.a(l1, l2, t.f(39), s1);
    }

    public static final String k()
    {
        if(e != null)
            return e.v_();
        else
            return null;
    }

    public static final void l()
    {
        if(k != null)
            k.m();
    }

    public static final boolean m()
    {
        return p.b();
    }

    public static final void n()
    {
        long l1;
        long l2;
        al al1;
        if((al1 = e) != null && al1.u_())
        {
            l1 = al1.e();
            l2 = al1.f();
            al1.c();
        } else
        {
            l1 = b;
            l2 = a;
        }
        p.a(l1, l2);
    }

    public static final void o()
    {
        long l1;
        long l2;
        al al1;
        if((al1 = e) != null && al1.u_())
        {
            l1 = al1.e();
            l2 = al1.f();
            al1.c();
        } else
        {
            l1 = b;
            l2 = a;
        }
        p.b(l1, l2);
    }

    public static final void p()
    {
        long l1;
        long l2;
        al al1;
        if((al1 = e) != null && al1.u_())
        {
            l1 = al1.e();
            l2 = al1.f();
            al1.c();
        } else
        {
            l1 = b;
            l2 = a;
        }
        p.c(l1, l2);
    }

    public static final void q()
    {
        p.m();
        t.c(1555, 0);
        t.a(1554, t.g(1553));
    }

    public static final void a(s s1)
    {
        p.a(s1);
        if(p.i())
        {
            p.a(true);
            a(p.j(), p.k());
        }
    }

    public static final void r()
    {
        int ai[];
        if(p.e && (ai = p.g()) != null)
            b(ai[0], ai[1]);
    }

    public static final void s()
    {
        int ai[];
        if(p.e && (ai = p.h()) != null)
            b(ai[0], ai[1]);
    }

    private static void b(long l1, long l2)
    {
        synchronized(m)
        {
            m.removeAllElements();
            n = 0;
            long l3 = b;
            long l4 = a;
            long l5 = (l1 - l3) / 5L;
            long l6 = (l2 - l4) / 5L;
            for(int i1 = 0; i1 < 5; i1++)
                m.addElement(new long[] {
                    l3 + l5 * (long)i1, l4 + l6 * (long)i1
                });

            m.addElement(new long[] {
                l1, l2
            });
            o = System.currentTimeMillis();
        }
    }

    public static final boolean t()
    {
        return p > 0;
    }

    public static final void b(int i1)
    {
        if(p <= 0)
        {
            p = i1;
            q = System.currentTimeMillis();
            l = true;
        }
    }

    private static void H()
    {
        long l1;
        if(p > 0 && !d && (l1 = System.currentTimeMillis()) - q > 80L)
        {
            int i1;
            long l2 = (v.x(i1 = t.f(39)) / v.y(i1)) * 9L;
            a(b, a + l2);
            p -= 9;
            q = l1;
        }
    }

    private static void I()
    {
        Vector vector;
        long l1;
        synchronized(vector = m)
        {
            if(n <= 5 && vector.size() > 0 && (l1 = System.currentTimeMillis()) - o > 80L)
            {
                a((long[])vector.elementAt(n));
                n++;
                o = l1;
            }
        }
    }

    public static final boolean u()
    {
        return e != null;
    }

    public static final void a(al al1)
    {
        if(!l)
            e = al1;
    }

    public static final void v()
    {
        if(!l)
            e = null;
    }

    public static final void w()
    {
        al al1;
        if((al1 = e) != null && al1.u_())
            al1.c();
    }

    public static final void x()
    {
        a(true);
        l = false;
        p = 0;
    }

    public static final void a(int i1, int j1)
    {
        s = false;
        u = System.currentTimeMillis();
        v = i1;
        w = j1;
        c = true;
    }

    private static final int d(int i1)
    {
        return (int)h + (i1 - (f >> 1));
    }

    private static final int e(int i1)
    {
        return (int)i - (i1 - (g >> 1));
    }

    public static final void b(int i1, int j1)
    {
        s = true;
        u = 0L;
        int k1 = t.f(39);
        a(b - (long)(int)v.a(i1, k1), a + (long)(int)v.a(j1, k1));
        c = true;
    }

    public static final void c(int i1, int j1)
    {
        u = 0L;
        if(!s)
        {
            int ai[];
            if(e != null && (ai = aa.a) != null && i1 > ai[0] && i1 < ai[0] + ai[2] && j1 > ai[1] - ai[3] / 2 && j1 < ai[1] + ai[3] / 2)
            {
                t = true;
                return;
            }
            int k1 = t.f(39);
            b((int)v.a(d(i1), k1), (int)v.a(e(j1), k1));
        }
        c = true;
    }

    public static final void d(int i1, int j1)
    {
        t = true;
        u = 0L;
        int k1 = t.f(39);
        a((int)v.a(d(i1), k1), (int)v.a(e(j1), k1));
        c = true;
    }

    public static final boolean y()
    {
        if(t)
        {
            t = false;
            return true;
        } else
        {
            return false;
        }
    }

    public static final String z()
    {
        return q.a(q.d(q.c(0x4004000000000000L, q.c((g / 128 + 2) * (f / 128 + 2))), q.c(J())), 100);
    }

    private static final long J()
    {
        int i1 = t.f(39);
        int j1;
        return (v.a((int)(h + (long)(j1 = f / 2)), i1) - v.a((int)(h - (long)j1), i1)) * (v.a((int)(i + (long)(j1 = g / 2)), i1) - v.a((int)(i - (long)j1), i1));
    }

    private static int f;
    private static int g;
    public static long a;
    public static long b;
    private static long h;
    private static long i;
    private static Object j;
    public static boolean c;
    public static boolean d;
    private static m k;
    public static al e;
    private static boolean l;
    private static Vector m;
    private static int n;
    private static long o;
    private static int p;
    private static long q;
    private static k r;
    private static boolean s;
    private static boolean t;
    private static long u;
    private static int v;
    private static int w;
}