// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:31
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Vector;
import javax.microedition.lcdui.Image;

public class az extends ba
{

    public az(int i1, String s1, String s2)
    {
        super(i1, s1, s2);
        super.r = 1;
        a = bh.q();
        (i1 = new ay(this, 0, t.c(1007))).d = true;
        super.A = i1;
        c = t.i();
        f = t.i();
    }

    public int a()
    {
        return 2;
    }

    private String h()
    {
        return bh.b(bh.r().append('m').append(++super.l));
    }

    public az(s s1)
    {
        super(s1);
        a = bh.q();
        for(int i1 = s1.g(); --i1 >= 0;)
            b(new ay(this, s1));

        ay ay1;
        (ay1 = (new ay(this, s1)).g()).d = true;
        super.A = ay1;
        c = s1.j();
        d = s1.x();
        f = s1.j();
    }

    public final ba a(s s1, boolean flag, boolean flag1)
    {
        super.a(s1, flag, flag1);
        s1.a(c).o(d).a(f);
        return this;
    }

    public boolean c_()
    {
        return false;
    }

    public String c()
    {
        return ab.c(super.i);
    }

    private String j()
    {
        Object obj = e;
        v.i();
        return (String)obj;
    }

    public final e d_()
    {
        return new ay(this, -1, t.c(1008));
    }

    public final e e_()
    {
        return new ay(this, -1, t.c(1010));
    }

    public final e f_()
    {
        return new ay(this, -1, t.c(1009));
    }

    public final e g_()
    {
        return new ay(this, -1, t.c(1011));
    }

    public final int i()
    {
        X();
        super.x = 0L;
        super.w = 0L;
        ae();
        return 0;
    }

    private final void k()
    {
        long l1;
        super.x = System.currentTimeMillis() + (l1 = super.w = m.N() ? 25000L : 60000L);
    }

    private final int a(byte abyte0[])
    {
        k();
        return d((new s()).a(abyte0));
    }

    public final int b(ao ao1)
    {
        return d(ao1.b());
    }

    private int d(ao ao1)
    {
        return b(ao1.a(0x20206, h()));
    }

    public final void c(ao ao1)
    {
        synchronized(a)
        {
            a.addElement(ao1);
        }
    }

    private final void m()
    {
        super.k.c();
        z.c(b);
    }

    private static void a(Object aobj[])
    {
        if(aobj != null)
            aobj[0] = null;
    }

    public final void a(Throwable throwable)
    {
        if(super.o == 2)
            I = throwable;
    }

    public final void c(String s1, int i1)
    {
        if(super.o == 2)
        {
            d = i1;
            c = s1;
        }
    }

    private final boolean n()
    {
        return a() == 2 && super.i.endsWith(t.c(0xa19a4));
    }

    public final void h_()
    {
        switch(super.o)
        {
        case 0: // '\0'
            m();
            a(H);
            H = null;
            I = null;
            super.p = 0;
            break;

        case 1: // '\001'
            super.p = 10;
            if(c_())
            {
                if(x.n(f))
                {
                    super.o = 3;
                } else
                {
                    super.o = 2;
                    H = a.b(this);
                }
            } else
            if(x.n(c))
            {
                super.o = 3;
            } else
            {
                super.o = 2;
                H = ac.a(this);
            }
            bf.c = true;
            break;

        case 2: // '\002'
            super.p = 20;
            if(c_())
            {
                if(x.n(f))
                    super.o = 3;
                else
                if(I != null)
                    b(I);
            } else
            if(x.n(c))
                super.o = 3;
            else
            if(I != null)
                b(I);
            bf.c = true;
            break;

        case 3: // '\003'
            super.p = 30;
            super.l = 0;
            super.m = new g(bh.b(bh.r().append(c).append(':').append(d)));
            super.o = 4;
            if(n())
                a.a(this);
            bf.c = true;
            break;

        case 4: // '\004'
            m();
            super.p = 40;
            if(n())
            {
                if(e == null)
                    break;
                if(e instanceof Throwable)
                {
                    Y();
                    break;
                }
            }
            if(super.m.a() == 2)
            {
                super.p = 50;
                super.o = 5;
                b = z.a(this);
                bf.c = true;
                r();
            } else
            if(super.m.a() <= 0)
                X();
            bf.c = true;
            break;

        default:
            q();
            ao ao1;
            if((ao1 = o()) != null)
            {
                e(ao1);
                bf.c = true;
                bf.b = true;
            }
            break;
        }
        if(super.q != 0 && super.m != null && super.m.a() == 0)
        {
            super.o = 0;
            X();
            super.q = i();
        }
        if(super.w > 0L && v.b(super.x))
            a(new byte[] {
                32
            });
    }

    private void b(Throwable throwable)
    {
        bh.a(this, throwable.toString());
        X();
        super.q = i();
    }

    private final void e(ao ao1)
    {
        String s1 = ao1.a;
        if(ab.a(0xd1932, s1))
            return;
        if(ab.a(0xf1a99, s1))
        {
            p(ao1);
            return;
        }
        if(ab.a(0x91aa8, s1))
        {
            a(ao1);
            return;
        }
        if(ab.a(0x71ab1, s1))
        {
            r();
            return;
        }
        if(ab.a(0x81ab8, s1))
        {
            n(ao1);
            return;
        }
        if(ab.a(0x709cf, s1))
        {
            m(ao1);
            return;
        }
        if(ab.a(0x71ac0, s1))
        {
            ab();
            return;
        }
        if(ab.a(0x219f9, ao1.a))
        {
            if(g(ao1))
                return;
            if(j(ao1))
                return;
            if(i(ao1))
                return;
            if(h(ao1))
                return;
            if(f(ao1))
                return;
            if(k(ao1))
                return;
        }
    }

    private final ao o()
    {
        return (ao)x.a(a);
    }

    private final void q()
    {
        super.m.b(super.k);
        r.a(this, super.k.b);
        z.a(b, super.k);
    }

    public final void d(String s1, int i1)
    {
        if(!S())
        {
            bh.a(303);
            return;
        } else
        {
            b(ao.a(0x81ab8).a(0x2022e, s1).i(i1 != 0 ? i1 != 1 ? 0xc1849 : 0xa184b : 0x9184b).a(ao.a(0x4182e).h(0x1f19ae).a(super.F)));
            return;
        }
    }

    public final void d(int i1)
    {
        switch(i1)
        {
        case 0: // '\0'
            i1 = 1;
            break;

        case 1: // '\001'
            i1 = 4;
            break;

        case 2: // '\002'
            i1 = 2;
            break;

        case 3: // '\003'
            i1 = 5;
            break;

        case 4: // '\004'
            i1 = 3;
            break;

        default:
            p();
            return;
        }
        if(S())
        {
            b(i1);
            return;
        }
        super.r = i1;
        if(R())
        {
            return;
        } else
        {
            b_(0);
            return;
        }
    }

    private final void b(int i1)
    {
        if(c_())
            i1 = 1;
        super.q = i1;
        ao ao1 = ao.a(0x81ab8);
        char c1 = '\0';
        switch(i1)
        {
        case 1: // '\001'
            c1 = '\u027A';
            break;

        case 2: // '\002'
            ao1.a(0x41ae2, 0x41a8d);
            c1 = '\u027C';
            break;

        case 3: // '\003'
            ao1.i(0x9187c);
            break;

        case 4: // '\004'
            ao1.a(0x41ae2, 0x40368);
            c1 = '\u027B';
            break;

        case 5: // '\005'
            ao1.a(0x41ae2, 0x31a93);
            c1 = '\u027D';
            break;

        case 6: // '\006'
            ao1.a(0x41ae2, 0x21a91);
            c1 = '\u0280';
            break;
        }
        if(c1 != 0)
        {
            ao1.a(t.c(0x81b18), t.c(0x100d3));
            ao1.a(0x60963, c1);
            ao1.b(0x4182e, 0x1f19ae).a(super.F);
        }
        b(ao1);
    }

    public final int a(String s1, String s2)
    {
        if((s1 = super.a(s1, s2)) != 0)
            return s1;
        if(!c_())
            c = t.i();
        else
            f = t.i();
        return 0;
    }

    public final int h(int i1)
    {
        super.r = i1;
        if(S())
        {
            b(i1);
            return 0;
        }
        if(R())
            return 498;
        else
            return b_(0);
    }

    public final int c(be be1)
    {
        return 991;
    }

    public final int d(be be1)
    {
        return 991;
    }

    public final int e(be be1)
    {
        return 991;
    }

    public final be a_(String s1)
    {
        return null;
    }

    public int b()
    {
        if(super.o > 0 && super.o < 100)
            return 382;
        else
            return i(super.q);
    }

    private void r()
    {
        a((new s()).c(0x7c191c).f(c()).c(0x21b0e).m());
    }

    private final String v()
    {
        return (new s()).f(super.G).f(64).f(c).l();
    }

    public int y_()
    {
        return 0x61913;
    }

    private ab c(String s1)
    {
        v.b();
        return (ab)d(s1);
    }

    public final int a(be be1, Object aobj[])
    {
        int i1;
        if(0 != (i1 = super.a(be1, aobj)))
        {
            return i1;
        } else
        {
            Object obj = be1;
            v.i();
            obj = aobj[0];
            v.i();
            return a(((ab)obj).a, (String)obj, i(be1).c);
        }
    }

    public final int a(be be1, e e1, e e2)
    {
        if(0 != (e1 = super.a(be1, e1, e2)))
        {
            return e1;
        } else
        {
            e1 = be1;
            v.i();
            return a(((ab)e1).a, be1.X(), e2.c);
        }
    }

    public final int a(be be1)
    {
        if(!S())
        {
            return 303;
        } else
        {
            be be2 = be1;
            v.i();
            t.a(1278, ((Object) (x.a(h(), ((ab)be2).n()))));
            super.l--;
            return d(ao.a(0x219f9).i(0x30024).a(0x2022e, be1.n_()).c(0x51ad7, 0xa1a83));
        }
    }

    public final int a_(Object obj)
    {
        return 0;
    }

    public final int N()
    {
        if(!S())
        {
            bh.a(303);
        } else
        {
            String s1;
            a(s1 = z.k(), z.l(), z.m());
            d(s1, 0);
            d(s1, 1);
        }
        return 0;
    }

    private final int a(String s1, String s2, String s3)
    {
        return d(b(s1, s2, s3));
    }

    private static ao b(String s1, String s2, String s3)
    {
        ao ao1 = ao.a(0x50cf9).h(0x1019f2);
        s1 = ao.a(0x41af1).a(0x307c4, s1).a(0x401d6, s2).a(0xc1afc, s2 != null ? null : t.c(0x61b08));
        if(s3 != null && !ab.a(0x70349, s3))
            s1.a(t.c(0x51839), s3);
        return ao.a(0x219f9).i(0x3103b).a(ao1.a(s1));
    }

    public final int b(be be1)
    {
        v.i();
        if(!S())
            bh.a(303);
        else
            a(be1.n_(), ((String) (null)), ((String) (null)));
        return 0;
    }

    public final int a(ab ab1, int i1)
    {
        v.i();
        if(!S())
        {
            return 303;
        } else
        {
            e e1;
            a(ab1.a, ab1.X(), (e1 = i(ab1)) != super.B && !ab1.b ? e1.c : t.c(0x70349));
            return i1;
        }
    }

    public final int p()
    {
        int i1;
        if(0 != (i1 = super.p()))
        {
            return i1;
        } else
        {
            X();
            super.q = i();
            H = null;
            I = null;
            super.p = 0;
            m();
            return 0;
        }
    }

    private ay d(String s1)
    {
        v.e();
        Vector vector;
        ay ay1;
        for(int i1 = x.c(vector = super.g); --i1 >= 0;)
            if(ab.a(s1, ((e) (ay1 = (ay)vector.elementAt(i1))).c))
                return ay1;

        return null;
    }

    public final int b_(String s1)
    {
        v.b();
        int i1;
        if(0 != (i1 = super.b_(s1)))
            return i1;
        if(d(s1) == null)
            super.g.addElement(new ay(this, 1, s1));
        return 0;
    }

    public final int a(e e1)
    {
        v.i();
        int i1;
        if(0 != (i1 = super.a(e1)))
        {
            return i1;
        } else
        {
            x.a(super.g, e1);
            return 0;
        }
    }

    public final int a(e e1, String s1)
    {
        v.b();
        v.i();
        int i1;
        if(0 != (i1 = super.a(e1, s1)))
            return i1;
        if(x.c(e1.b) == 0)
        {
            e1.b(s1);
            return 0;
        } else
        {
            return 991;
        }
    }

    public final int a(be be1, String s1, long l1)
    {
        if(0 != (l1 = super.a(be1, s1, l1)))
        {
            return l1;
        } else
        {
            super.t++;
            return b(ao.a(0x709cf).a(0x2022e, be1.n_()).i(0x40368).a(ao.a(0x40df7).a(s1)).c(0x61adc, 0x2519cd));
        }
    }

    private final boolean f(ao ao1)
    {
        ao ao2;
        if((ao2 = ao1.d(0x50cf9, 0x111a02)) != null && ab.a(0x30024, ao1.c()))
        {
            ao2.a(0x401d6, 0xa183f).a(0x70659, 1334).a(0x204bf, 0x41090);
            b(ao1.d());
            return true;
        } else
        {
            return false;
        }
    }

    private final boolean g(ao ao1)
    {
        if(ao1.d(0x41a7f, 0xd1a76) != null && ab.a(0x30024, ao1.c()))
        {
            (ao1 = ao1.d()).b = null;
            b(ao1);
            return true;
        } else
        {
            return false;
        }
    }

    private final boolean h(ao ao1)
    {
        if(super.p == 70 && ab.a(0x60d31, ao1.c()))
        {
            d(ao.a(0x219f9).i(0x30024).c(0x50cf9, 0x1019f2));
            ap();
            super.p = 80;
            return true;
        } else
        {
            return false;
        }
    }

    private final boolean i(ao ao1)
    {
        if(ao1.d(0x41a4f, 0x201a33) != null && ab.a(0x60d31, ao1.c()))
        {
            d(ao.a(0x219f9).i(0x3103b).c(0x712ff, 0x231a53));
            super.p = 70;
            return true;
        } else
        {
            return false;
        }
    }

    private final boolean j(ao ao1)
    {
        if(ao1.d(0x51a83, 0xa1a83) != null)
        {
            if(ab.a(0x60d31, ao1.c()))
            {
                try
                {
                    Object aobj[];
                    Object obj = (aobj = (Object[])t.m(1278))[0];
                    v.i();
                    if(((String)obj).equals(ao1.b(0x20206)))
                        t.a(1277, ((bc)aobj[1]).z(bh.b(a(bh.r(), ao1))).a(o(ao1)));
                }
                catch(Throwable _ex) { }
                return true;
            }
            if(ab.a(0x51ad2, ao1.c()))
            {
                try
                {
                    Object aobj1[];
                    Object obj1 = (aobj1 = (Object[])t.m(1278))[0];
                    v.i();
                    if(((String)obj1).equals(ao1.b(0x20206)))
                        t.a(1277, ((bc)aobj1[1]).z(ao1.toString()));
                }
                catch(Throwable _ex) { }
                return true;
            }
        }
        return false;
    }

    private final boolean k(ao ao1)
    {
        ao ao2;
        if((ao2 = ao1.d(0x50cf9, 0x1019f2)) != null)
        {
            String s1;
            if(ab.a(0x3103b, s1 = ao1.c()))
            {
                l(ao2);
                (ao1 = ao1.d()).b = null;
                b(ao1);
                return true;
            }
            if(ab.a(0x60d31, s1))
            {
                ad();
                l(ao2);
                if(x.c(super.g) == 0)
                    super.g.addElement(new ay(this, 1, t.c(0x70349)));
                super.o = 100;
                h(super.r);
                super.p = 100;
                return true;
            }
        }
        return false;
    }

    private final void l(ao ao1)
    {
        Vector vector = super.g;
        Object obj;
        for(int i1 = x.c(ao1 = ao1.b); --i1 >= 0;)
            if(ab.a(0x41af1, ((ao) (obj = (ao)ao1.elementAt(i1))).a))
            {
                String s1 = ((ao) (obj)).b(0x307c4);
                String s2 = ((ao) (obj)).b(0xc1afc);
                ((ao) (obj)).b(0x31aee);
                String s3 = ((ao) (obj)).b(0x401d6);
                boolean flag = ab.a(0x61b08, s2);
                if(s3 == null)
                    s3 = s1;
                if(!x.n(((String) (obj = ((ao) (obj)).c(t.c(0x51839))))))
                    obj = t.c(0x70349);
                Object obj1 = d(s1);
                v.i();
                obj1 = (ab)obj1;
                f(((be) (obj1)));
                if(!flag)
                {
                    ay ay1;
                    if((ay1 = d(((String) (obj)))) == null)
                        vector.addElement(ay1 = new ay(this, 1, ((String) (obj))));
                    ay1.b(obj = new ab(this, s1, s3, s2));
                    ((ab) (obj)).a(((ab) (obj1)));
                }
            }

    }

    public String i_()
    {
        return super.G;
    }

    public void a(ao ao1)
    {
        ao ao2 = ao.a(0x818de).h(0x201a13);
        int i1;
        if((i1 = (ao1 = z.i(ab.a(ao1.c)).d()).indexOf(t.c(0x618a3))) >= 0)
        {
            i1 += 7;
            ao2.a(a(i_(), aa(), c(), ab.a(ao1, i1, ao1.indexOf('"', i1))));
        }
        b(ao2);
    }

    private static String a(String s1, String s2, String s3, String s4)
    {
        v.b();
        v.b();
        v.b();
        v.b();
        String s5;
        return (new s()).c(0xa188e).f(s1).c(0x91898).f(s3).c(0x918a1).f(s4).c(0x1618aa).f(s5 = x.f()).c(0x1c18c0).f(s3).c(0xc18dc).f((new s()).f((new s()).f(s1).f(58).f(s3).f(58).n(s2).E().f(58).f(s4).f(58).f(s5).E().M()).f(58).f(s4).c(0xa18e8).f(s5).f(58).c(0x40814).f(58).f((new s()).c(0x1218f2).f(s3).E().M()).E().M()).c(0xf1904).e();
    }

    private final void m(ao ao1)
    {
        String s1;
        if(c(s1 = e(ao1.b(0x402ec))) != null)
        {
            StringBuffer stringbuffer = bh.r();
            Object obj;
            if((obj = ao1.f(0x71af5)) != null && (obj = ab.a(((ao) (obj)).c)) != null)
                stringbuffer.append(((String) (obj))).append('\n');
            if((obj = ao1.f(0x40df7)) != null && (obj = ab.a(((ao) (obj)).c)) != null)
                stringbuffer.append(((String) (obj)));
            if(((String) (obj = bh.b(stringbuffer))).length() > 0)
                a(s1, 0L, ((String) (obj)));
        }
    }

    private final void n(ao ao1)
    {
        String s1;
        String s2;
        String s4 = ao1.c();
        s4;
        s2 = t.c(0x91885);
        s1 = s4;
        JVM INSTR ifnull 19;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_15;
_L2:
        break MISSING_BLOCK_LABEL_19;
        s1 = s1;
        break MISSING_BLOCK_LABEL_21;
        s1 = s2;
        String s3;
        if((s3 = e(ao1.b(0x402ec))) == null)
            return;
        ab ab1 = c(s3);
        if(ab.a(0x9184b, s1))
        {
            if(ab1 == null)
            {
                (ab1 = new ab(this, s3, a(ao1, s3), null)).b = true;
                super.A.b(ab1 = ab1);
            }
            ab1.a(s1, ao1);
            v.o(3);
            a(s3, 0L, t.c(990));
            return;
        }
        if(ab1 != null)
            ab1.a(s1, ao1);
        return;
    }

    private static String a(ao ao1, String s1)
    {
        try
        {
            return ab.a(ao1.f(0x4182e).c);
        }
        catch(Throwable _ex)
        {
            return s1;
        }
    }

    private static String e(String s1)
    {
        if(s1 == null)
            return null;
        int i1;
        if((i1 = s1.indexOf('/')) <= 0)
            return s1;
        else
            return ab.b(s1, i1);
    }

    public static final int i(int i1)
    {
        switch(i1)
        {
        case 0: // '\0'
            return 381;

        case 1: // '\001'
            return 383;

        case 2: // '\002'
            return 0xf9017f;

        case 3: // '\003'
            return 0xfc017f;

        case 4: // '\004'
            return 0xfa017f;

        case 5: // '\005'
            return 0xfb017f;
        }
        return 0xfd017f;
    }

    private final Image o(ao ao1)
    {
        String s1 = null;
        if(ab.a(0x61ac7, ao1.a) && (s1 = ab.a(ao1.c)) != null && x.n(s1 = x.m(s1)))
            try
            {
                return z.i(s1).u();
            }
            catch(Throwable _ex) { }
        Image image;
        for(int i1 = x.c(ao1.b); --i1 >= 0;)
            if((image = o(ao1.g(i1))) != null)
                return image;

        return null;
    }

    private final StringBuffer a(StringBuffer stringbuffer, ao ao1)
    {
        if(!ab.a(0x51acd, ao1.a))
        {
            String s1;
            if((s1 = ab.a(ao1.c)) != null && x.n(s1 = x.m(s1)))
                stringbuffer.append(s1).append('\n');
            for(int i1 = 0; i1 < x.c(ao1.b); i1++)
                a(stringbuffer, ao1.g(i1));

        }
        return stringbuffer;
    }

    private final void p(ao ao1)
    {
        ao ao2;
        if((ao2 = ao1.a(t.c(0xa1855))) != null)
        {
            ao ao3 = ao.a(0x40814).h(0x201a13);
            if(ao2.b(ao1 = t.c(0xa1872)) != null)
            {
                b(ao3.a(0x91855, ao1));
                return;
            }
            if(ao2.b(ao1 = t.c(0xe185f)) != null)
            {
                b(ao3.a(0x91855, ao1).a((new s()).f(0).f(super.G).f(0).f(j()).e()));
                return;
            }
            if(ao2.b(ao1 = t.c(0xf1b40)) != null)
            {
                b(ao3.a(0x91855, ao1).a(w()));
                return;
            }
            if(ao2.b(ao1 = t.c(0x5186d)) != null)
                b(ao3.a(0x91855, ao1).a((new s()).n(v()).f(0).n(super.G).f(0).n(aa()).e()));
            return;
        }
        if(ao1.a(t.c(0x41a4f)) != null)
        {
            ao ao4;
            (ao4 = ao.a(0x219f9).i(0x3103b)).b(0x41a4f, 0x201a33).a(t.c(0x81b10), t.c(0x41090));
            d(ao4);
            super.p = 60;
            return;
        } else
        {
            bh.a(this, 992);
            X();
            super.q = i();
            return;
        }
    }

    private final String w()
    {
        String s1 = super.i;
        return (new s()).f(s1).i((new s()).c(0x9063a)).e();
    }

    private Vector a;
    private Object b[];
    private Object H[];
    public String c;
    public int d;
    public Object e;
    private Throwable I;
    public String f;
}