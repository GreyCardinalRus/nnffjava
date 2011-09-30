// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:41
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import javax.microedition.lcdui.Canvas;
import main.Midlet;

public abstract class bf
{

    public static final void a(Object obj, int k, int l)
    {
        synchronized(d = new Object())
        {
            v.a();
            t.a(obj);
            bh.n();
            aw.a();
            r.A();
            z.ai();
            r.W();
            bb.a();
            a.s();
            z.al();
            z.ag();
            r.L();
            r.C();
            a.u();
            ay.t();
            t.a(new b(k, l));
            t.b();
            bg.a();
            ay.J();
            v.bw();
            v.a(0, v.aq());
            av.a();
            obj = 0;
            t.d(291, 1);
            t.a(true);
            if(t.g(217))
                v.aY();
            else
            if((obj = bb.c()) == 0)
            {
                z.C();
                v.w();
            } else
            {
                while(--obj >= 0) 
                    z.a(bb.a(((int) (obj))));
                aa.a();
                v.w();
            }
            new f(13);
            new f(0);
        }
    }

    public static final void a()
    {
        if(d != null)
        {
            synchronized(d)
            {
                a = true;
                z.aL();
                r.X();
                bh.o();
                bb.a(f, true);
                t.a(f);
            }
            return;
        } else
        {
            return;
        }
    }

    public static final void b()
    {
        while(!a) 
            try
            {
                f();
                g();
            }
            catch(Throwable _ex) { }
    }

    private static final void f()
    {
        synchronized(d)
        {
            if(!a)
            {
                t.c();
                z.ah();
                b.c();
                bb.d();
                z.am();
                h();
                aw.i();
                a.M();
                if(v.bV() && (!t.g(272) || aw.c().a != 6))
                    if(t.d().isShown())
                        v.E(0);
                    else
                        v.a(0, v.aq());
            }
        }
        String s;
        if((s = t.c(1198)) != null)
            try
            {
                e = true;
                t.b(s);
            }
            catch(Throwable _ex)
            {
                t.h(1198);
            }
        if(e)
        {
            t.e().destroyApp(true);
            a = true;
            throw new RuntimeException();
        } else
        {
            return;
        }
    }

    private static final void g()
    {
        if((r.B() != 0 || z.aj()) && v.F(5))
            c = true;
        b b1 = t.d();
        if(!a && c && !t.f())
            if(b1.isShown())
            {
                b1.repaint();
                v.a(5, 1000L);
            } else
            {
                try
                {
                    Thread.sleep(200L);
                }
                catch(Throwable _ex) { }
            }
        int k = b.a();
        try
        {
            Thread.sleep(k);
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    public static final void a(ar ar1)
    {
        try
        {
            synchronized(d)
            {
                if(!a)
                {
                    a.K();
                    aw.a(ar1);
                    r.a(ar1);
                    a.L();
                }
            }
        }
        catch(Throwable throwable) { }
        c = false;
    }

    private static final void h()
    {
        if(b && aw.c().a == 4 && v.F(1))
        {
            b = false;
            t.c(1199);
            aa.e();
            t.h(1199);
            v.a(1, 1000L);
        }
        Object obj;
        if((obj = bh.g()) == null)
        {
            bd.a();
            return;
        }
        if(obj instanceof int[])
        {
            switch((obj = (int[])obj)[0])
            {
            case 0: // '\0'
                a(((int []) (obj)));
                return;

            case 1: // '\001'
                bd.c();
                return;

            case 2: // '\002'
                bd.d();
                return;

            case 3: // '\003'
                c = true;
                c();
                return;

            case 4: // '\004'
                bd.f();
                return;

            case 5: // '\005'
                a(obj[1], obj[2]);
                return;

            case 6: // '\006'
                a(obj[1], obj[2], obj[3], obj[4]);
                return;

            case 7: // '\007'
                a(obj[1], obj[2], obj[3], obj[4], obj[5]);
                return;

            case 8: // '\b'
                b(obj[1], obj[2]);
                return;
            }
            return;
        }
        if(obj instanceof String)
        {
            v.d((String)obj);
            c = true;
            return;
        }
        if(obj instanceof Object[])
            if((obj = ((Object) ((Object[])obj)))[0] instanceof ba)
            {
                if(obj.length == 2)
                    z.a(((Object []) (obj)));
                else
                    v.a(((Object []) (obj)));
                c = true;
                return;
            } else
            {
                obj = obj[0];
                v.i();
                ((bi)obj[1]).n((String)obj);
                return;
            }
        if(obj instanceof h)
        {
            a(((h) (obj = (h)obj)).a, ((h) (obj)).b);
            return;
        } else
        {
            bd.a(obj);
            return;
        }
    }

    private static final void a(int k, Object obj)
    {
        switch(k)
        {
        case 3: // '\003'
            z.H();
            break;

        case 4: // '\004'
            r.b((Object[])obj);
            break;

        case 5: // '\005'
            t.c(1482, 1);
            a.e();
            break;

        case 6: // '\006'
            ((bi)obj).o();
            break;
        }
        c = true;
    }

    private static final void a(int k, int l)
    {
        if(aw.a(k, l))
            return;
        int i1;
        if((i1 = aw.c().a) == 137)
            return;
        int j1;
        if((j1 = r.a(k, l)) > 0)
        {
            if(i1 != j1)
            {
                if(i1 == 4)
                    aa.d();
                bd.a(j1);
            }
            return;
        }
        ad ad1;
        if((ad1 = aw.c()) != null && ad1.b(k, l))
            return;
        if(((ad1 = ad1.d) == 1 || ad1 == 12) && (k = ((int) (bg.b(k, l)))) != null)
        {
            if(k instanceof int[])
            {
                switch(((int[])k)[1])
                {
                case 248: 
                    bd.a(bg.d().b());
                    return;

                case 246: 
                    bd.a(bg.c().b());
                    break;
                }
                return;
            }
            l = ((bg)k).c;
            ba ba1 = ((bg)k).d;
            t.c(1383, 0);
            if(i1 == 4)
                aa.d();
            if(l == 6 || l == 36 || ba1 == null)
            {
                if(i1 != l)
                {
                    bd.a(((bg)k).b());
                    return;
                }
            } else
            {
                aa.a((bg)k);
                bd.a(((bg)k).b());
            }
        }
    }

    private static final void a(int k, int l, int i1, int j1)
    {
        ad ad1;
        if((ad1 = aw.c()) != null)
            ad1.a(k, l, i1, j1);
    }

    private static final void a(int k, int l, int i1, int j1, int k1)
    {
        ad ad1;
        if((ad1 = aw.c()) != null)
            ad1.a(k, l, i1, j1, k1 != 0);
    }

    private static final void b(int k, int l)
    {
        ad ad1;
        if((ad1 = aw.c()) != null && ad1.c(k, l))
            return;
        else
            return;
    }

    public static final void c()
    {
        av av1;
        if((av1 = aw.f()) != null && av1.a(aw.c()) != -1)
        {
            return;
        } else
        {
            bd.b();
            return;
        }
    }

    private static final void a(int ai[])
    {
        ad ad1;
        if((ad1 = aw.c()) != null)
        {
            if(ad1.a != 6)
                c = true;
            int k = ai[1];
            ai = ai[2];
            if(a(ad1, ai, k))
                return;
            if((k = a(k)) != 0)
                bd.a(k);
            else
            if(ai == 8)
                c();
            else
            if(ai == 1)
                ad1.p();
            else
            if(ai == 6)
                ad1.s();
            else
            if(ai == 2)
                ad1.h();
            else
            if(ai == 5)
                ad1.k();
            if(ad1.a == 43)
                bd.a();
        }
    }

    private static final boolean a(ad ad1, int k, int l)
    {
        int i1 = aw.c().a;
        int j1;
        boolean flag = bg.b == (j1 = x.c(t.n(1208))) - 1;
        if(i1 == 4)
        {
            aa.d();
            if(j1 > 1)
            {
                t.c(1383, 0);
                if(k == 2)
                    if(ad1.j())
                    {
                        if((ad1 = bg.d()) != null)
                            bd.a(ad1.b());
                        return true;
                    } else
                    {
                        return false;
                    }
                if(k == 5)
                    if(ad1.i())
                    {
                        if((ad1 = bg.c()) != null)
                            bd.a(ad1.b());
                        return true;
                    } else
                    {
                        return false;
                    }
            }
        }
        if(i1 == 36 || i1 == 38 || i1 == 43 || i1 == 52)
        {
            t.c(1383, 0);
            if(k == 2)
            {
                bd.a(bg.d().b());
                return true;
            }
            if(k == 5)
            {
                if(!flag)
                    bd.a(bg.c().b());
                return true;
            }
        }
        if(i1 == 6)
            if(!t.g(1383))
            {
                if(k == 2)
                {
                    bd.a(bg.d().b());
                    return true;
                }
                if(k == 5)
                {
                    if(!flag)
                        bd.a(bg.c().b());
                    return true;
                }
                if(k == 1)
                    return true;
                if(k == 6)
                {
                    ay.e(ad1);
                    return true;
                }
            } else
            {
                if(l == 42)
                {
                    m.q();
                    return true;
                }
                if(l == 35)
                {
                    m.r();
                    return true;
                }
                if(l == 48)
                {
                    ay.p();
                    return true;
                }
                if(l == 49)
                {
                    bd.a(100);
                    return true;
                }
                if(l == 50)
                {
                    ay.q();
                    return true;
                }
                if(l == 51)
                {
                    bh.j();
                    return true;
                }
                if(l == 53)
                {
                    ay.r();
                    return true;
                }
                if(l == 55)
                {
                    o.s();
                    return true;
                }
                if(l == 57)
                {
                    o.r();
                    return true;
                }
            }
        return false;
    }

    private static final int a(int k)
    {
        if(k == 42)
            return b(t.f(205));
        if(k == 35)
            return b(t.f(206));
        if(k >= 48 && k <= 57)
            return b(t.f(k + 159));
        else
            return 0;
    }

    private static final int b(int k)
    {
        if(i())
            return 0;
        ad ad1 = aw.c();
        int l = aw.c().a;
        switch(k)
        {
        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 4;

        case 2: // '\002'
            return 36;

        case 3: // '\003'
            return 6;

        case 4: // '\004'
            return v.m(t.j(89) ? 596 : 597);

        case 5: // '\005'
            return ad1.l();

        case 6: // '\006'
            return ad1.m();

        case 7: // '\007'
            return ad1.n();

        case 8: // '\b'
            return ad1.o();

        case 9: // '\t'
            return 137;

        case 10: // '\n'
            return aw.n();

        case 11: // '\013'
            t.j(98);
            b = true;
            return 0;

        case 12: // '\f'
            if(l == 73)
                return z.h(ad1.e().d);
            if(l == 4)
                return aa.b();
            if(l == 30 || l == 92 || l == 40)
                return d();
            break;
        }
        return 0;
    }

    public static final int d()
    {
        Object obj;
        if((obj = t.b[1324]) != null && (obj instanceof be))
        {
            be be1;
            if(!(be1 = (be)obj).i.S())
                return v.m(303);
            t.h(1243);
            if((obj instanceof j) && ((j)obj).l())
                return 0;
            if(!be1.p() && !be1.m_())
                return 85;
        }
        return 0;
    }

    private static final boolean i()
    {
        return aw.c().a == 137;
    }

    public static final void e()
    {
        f = true;
        e = true;
    }

    private static Object d;
    public static boolean a;
    public static boolean b;
    public static boolean c;
    private static boolean e;
    private static boolean f;
}