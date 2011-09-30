// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:31
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.*;

public final class ax extends ba
{

    public ax(int l, String s1, String s2)
    {
        super(l, s1, s2);
        super.q = -1;
        super.r = 0;
        K = 4;
        (l = new ap(this, 0, t.c(1007))).d = true;
        super.A = l;
        H = new Hashtable();
        I = new Hashtable();
        J = new Hashtable();
    }

    public final int a()
    {
        return 1;
    }

    public final int a(String s1, String s2)
    {
        if((s1 = super.a(s1, s2)) != 0)
            return s1;
        else
            return 0;
    }

    public ax(s s1)
    {
        super(s1);
        K = super.r >>> 16;
        if(K <= 0 || K > 5)
            K = 4;
        super.r &= 0xffff;
        for(int l = s1.g(); --l >= 0;)
            b(new ap(this, s1));

        (s1 = new ap(this, s1)).d = true;
        super.A = s1;
        H = new Hashtable();
        I = new Hashtable();
        J = new Hashtable();
    }

    public final ba a(s s1, boolean flag, boolean flag1)
    {
        super.r = (super.r & 0xffff) + (K << 16);
        return super.a(s1, flag, flag1);
    }

    public final e d_()
    {
        return new ap(this, -1, t.c(1008));
    }

    public final e e_()
    {
        return new ap(this, -2, t.c(1010));
    }

    public final e f_()
    {
        return new ap(this, -3, t.c(1009));
    }

    public final e g_()
    {
        return new ap(this, -4, t.c(1011));
    }

    public final int b_(int l)
    {
        if((l = super.b_(l)) != 0)
            return l;
        else
            return 0;
    }

    public final int h()
    {
        if(super.y == 0)
            return 256;
        else
            return 268 + super.y;
    }

    public final int i()
    {
        X();
        super.x = 0L;
        super.w = 0L;
        ae();
        super.z.removeAllElements();
        return -1;
    }

    public final int b()
    {
        if(super.o > 0 && super.o < 100)
            return 265;
        int l = h();
        switch(super.q)
        {
        case 1: // '\001'
            return 0xf90000 | l;

        case 2: // '\002'
            return 0xfb0000 | l;

        case 4: // '\004'
            return 0xfd0000 | l;

        case 16: // '\020'
            return 0xfe0000 | l;

        case 32: // ' '
            return 0xfa0000 | l;

        case 256: 
            return 0xfc0000 | l;

        case 12288: 
            return 0x1010000 | l;

        case 16384: 
            return 0x1020000 | l;

        case 20480: 
            return 0x1030000 | l;

        case 24576: 
            return 0x1040000 | l;

        case 8193: 
            return 0x1050000 | l;

        case -1: 
            return 255;
        }
        return l;
    }

    public final s a(Object obj)
    {
        if(R())
        {
            Object aobj[];
            s s1;
            (aobj = (Object[])obj)[0] = z.i((s1 = (s)aobj[0]).A());
            super.z.addElement(obj);
            return s1;
        } else
        {
            return null;
        }
    }

    public final ap b(int l)
    {
        ap ap1;
        for(int i1 = super.g.size(); --i1 >= 0;)
            if((ap1 = (ap)o(i1)).e == l)
                return ap1;

        return null;
    }

    public final int j()
    {
        return (++super.l & 0xffffff) % 32768;
    }

    public final int k()
    {
        return ++e;
    }

    private final void b(Throwable throwable)
    {
        super.q = i();
        bh.a(this, throwable.toString());
        super.o = 0;
    }

    public final void a(Throwable throwable)
    {
        try
        {
            a = Integer.parseInt(super.i);
            M = true;
            super.o = 1;
            return;
        }
        catch(Throwable _ex)
        {
            b(throwable);
        }
    }

    public final void h_()
    {
        if(super.o <= 0)
        {
            X();
            super.q = -1;
        }
        switch(super.o)
        {
        case 0: // '\0'
            super.k.c();
            if(b != null)
                b[0] = null;
            b = null;
            super.p = 0;
            M = false;
            break;

        case 1: // '\001'
            bf.c = true;
            if(M)
            {
                super.p = 20;
                super.l = 1292;
                super.m = new g(0x120350);
                super.o = 2;
                bf.c = true;
            } else
            {
                super.p = 10;
                super.o = 2;
            }
            break;

        case 2: // '\002'
            if(M)
            {
                if(super.m.a() == 2)
                {
                    super.o = 3;
                    super.p = 30;
                    bf.c = true;
                }
            } else
            {
                super.o = 3;
            }
            break;

        case 3: // '\003'
            if(M)
            {
                super.m.b(super.k);
                s s1;
                if((s1 = super.k.w()) != null)
                {
                    bf.c = true;
                    super.p = 40;
                    r.a(this, s1);
                    if(z.c(s1))
                    {
                        d(z.a(this));
                        d(z.b(this, super.i));
                        super.o = 4;
                    }
                }
            } else
            {
                ab.a(this);
                super.p = 20;
                super.o = 5;
                bf.c = true;
            }
            break;

        case 4: // '\004'
            super.m.b(super.k);
            s s2;
            if((s2 = super.k.w()) != null)
            {
                bf.c = true;
                super.p = 50;
                r.a(this, s2);
                if(z.d(s2))
                {
                    d(z.a(this, s2));
                    super.o = 5;
                }
            }
            break;

        case 5: // '\005'
            if(M)
            {
                super.m.b(super.k);
                s s3;
                if((s3 = super.k.w()) != null)
                {
                    super.p = 70;
                    bf.c = true;
                    r.a(this, s3);
                    if(z.b(s3))
                        z();
                    else
                    if(z.d(s3))
                    {
                        if(super.p < 75)
                        {
                            super.p = 75;
                            bf.c = true;
                        }
                        if(v.a(s3) == 5891)
                        {
                            super.p = 80;
                            bf.c = true;
                            byte abyte0[] = z.b(s3 = z.a(s3), 5);
                            f = z.b(s3, 6);
                            int i1 = z.e(s3);
                            X();
                            if(abyte0 != null && f != null)
                            {
                                super.l = 28180;
                                super.m = new g(ab.e(new String(abyte0)));
                                super.o = 6;
                            } else
                            {
                                switch(i1)
                                {
                                case 1: // '\001'
                                    v();
                                    break;

                                case 4: // '\004'
                                case 5: // '\005'
                                    ab();
                                    break;

                                case 7: // '\007'
                                case 8: // '\b'
                                    w();
                                    break;

                                case 21: // '\025'
                                case 22: // '\026'
                                    x();
                                    break;

                                case 24: // '\030'
                                case 29: // '\035'
                                    y();
                                    break;

                                case 2: // '\002'
                                case 3: // '\003'
                                case 6: // '\006'
                                case 9: // '\t'
                                case 10: // '\n'
                                case 11: // '\013'
                                case 12: // '\f'
                                case 13: // '\r'
                                case 14: // '\016'
                                case 15: // '\017'
                                case 16: // '\020'
                                case 17: // '\021'
                                case 18: // '\022'
                                case 19: // '\023'
                                case 20: // '\024'
                                case 23: // '\027'
                                case 25: // '\031'
                                case 26: // '\032'
                                case 27: // '\033'
                                case 28: // '\034'
                                default:
                                    f(i1);
                                    break;
                                }
                            }
                        }
                    }
                }
            } else
            if(b != null)
            {
                super.p = 70;
                bf.c = true;
                super.l = 28179;
                f = z.i(b[2]).m();
                a = Integer.parseInt(b[0]);
                super.m = new g(b[1]);
                super.o = 6;
                b = null;
            }
            break;

        case 6: // '\006'
            if(super.m.a() == 2)
                super.o = 7;
            else
            if(super.m.a() <= 0)
            {
                X();
                super.q = i();
            }
            break;

        case 7: // '\007'
            super.m.b(super.k);
            s s4;
            if((s4 = super.k.w()) != null)
            {
                bf.c = true;
                super.p = 85;
                r.a(this, s4);
                if(z.c(s4))
                {
                    long l1;
                    super.x = System.currentTimeMillis() + (l1 = super.w = m.N() ? 25000L : 60000L);
                    ap();
                    d(z.a(this, f));
                    f = null;
                    d(v.e(this));
                    d(v.g(this));
                    d(z.b(this));
                    d(a.a(this));
                    if(t.g(296))
                        d(A());
                    d(bh.a(this, a));
                    super.o = 8;
                }
            }
            break;
        }
        if(super.o >= 8)
        {
            super.m.b(super.k);
            s s5;
            while((s5 = super.k.w()) != null) 
            {
                r.a(this, s5);
                super.p = 90;
                if(z.d(s5))
                {
                    int l = v.a(s5);
                    int j1 = s5.A();
                    int k1 = s5.n(10);
                    s5 = z.a(s5);
                    switch(l)
                    {
                    case 271: 
                        v.b(this, s5, j1);
                        break;

                    case 779: 
                        v.h(this, s5);
                        break;

                    case 780: 
                        v.g(this, s5);
                        break;

                    case 1025: 
                        v.a(this, j1);
                        break;

                    case 1031: 
                        r.a(this, s5);
                        break;

                    case 1035: 
                        v.a(this, s5);
                        break;

                    case 1036: 
                        v.b(this, s5);
                        break;

                    case 1044: 
                        v.f(this, s5);
                        break;

                    case 4870: 
                        v.b(this, s5, j1, k1);
                        break;

                    case 4872: 
                        e(s5);
                        break;

                    case 4878: 
                        v.c(this, s5, j1);
                        break;

                    case 4885: 
                        v.c(this, s5);
                        break;

                    case 4889: 
                        v.d(this, s5);
                        break;

                    case 4891: 
                        z.b(this, s5);
                        break;

                    case 4892: 
                        v.i(this, s5);
                        break;

                    case 5377: 
                        v.a(this, s5, j1);
                        break;

                    case 5379: 
                        v.a(this, s5, j1, k1);
                        break;
                    }
                    bf.b = true;
                } else
                if(z.b(s5))
                {
                    v.e(this, s5);
                    bf.b = true;
                }
                s5.c();
            }
            if(super.q != -1 && super.m != null && super.m.a() == 0)
            {
                X();
                super.q = i();
            }
            if(super.w > 0L && S() && v.b(super.x))
                c(z.a(this, 5));
        }
    }

    private void v()
    {
        bh.a(this, 462);
        ac();
    }

    private void w()
    {
        bh.a(this, 463);
        ac();
    }

    private void x()
    {
        bh.a(this, 464);
        ac();
    }

    private void y()
    {
        bh.a(this, 465);
        ac();
    }

    private final void f(int l)
    {
        bh.b(this, l);
        ac();
    }

    private final void z()
    {
        bh.a(this, 466);
        ac();
    }

    public final void a(int l, long l1, String s1)
    {
        a(Integer.toString(l), l1, s1);
    }

    public final void a(String s1, s s2, boolean flag)
    {
        if((s1 = (j)d(s1)) != null && !s1.s_())
            s1.a(s2, flag);
    }

    public final int a(be be1, String s1, long l)
    {
        int i1;
        if(0 != (i1 = super.a(be1, s1, l)))
        {
            return i1;
        } else
        {
            super.t++;
            return c(r.a(this, (j)be1, s1, l));
        }
    }

    public final int a(be be1, Object aobj[])
    {
        int l;
        if(0 != (l = super.a(be1, aobj)))
            return l;
        else
            return c(z.a(this, (j)be1, (String)aobj[0]));
    }

    public final int c(int l)
    {
        if(l == 256)
            e(3);
        else
        if(K == 3)
            e(4);
        super.r = l;
        if(S())
        {
            c(a.b(this, d));
            c(z.c(this));
            return c(v.e(this));
        }
        if(R())
            return 498;
        else
            return b_(0);
    }

    public final int a(be be1)
    {
        if(!S())
        {
            return 303;
        } else
        {
            be1 = (j)be1;
            t.a(1278, bc.b(this).v(((j) (be1)).c));
            return c(bh.a(this, x.c(((j) (be1)).c)));
        }
    }

    public final int a(be be1, e e1, e e2)
    {
        int l;
        if(0 != (l = super.a(be1, e1, e2)))
        {
            return l;
        } else
        {
            c(v.b(this));
            return c(r.a(this, (j)be1, e1, e2));
        }
    }

    public final int a(e e1, String s1)
    {
        int l;
        if((l = super.a(e1, s1)) != 0)
            return l;
        else
            return c(z.a(this, (ap)e1, s1));
    }

    public final int b_(String s1)
    {
        int l;
        if((l = super.b_(s1)) != 0)
        {
            return l;
        } else
        {
            c(v.b(this));
            return c(z.a(this, s1));
        }
    }

    public final int a(e e1)
    {
        int l;
        if(0 != (l = super.a(e1)))
        {
            return l;
        } else
        {
            c(v.b(this));
            return c(z.a(this, (ap)e1));
        }
    }

    public final int b(be be1)
    {
        j j1;
        if(0 != (be1 = super.b(j1 = (j)be1)))
            return be1;
        if(j1.s_())
        {
            f(j1);
            return 0;
        }
        if(j1.r_())
            c(r.c(this, j1));
        if(j1.q_())
            c(r.a(this, j1));
        if(j1.g())
            c(r.b(this, j1));
        return c(z.a(this, j1));
    }

    public final int a(String s1, String s2, String s3, e e1, boolean flag)
    {
        if(0 != (flag = super.a(s1, s2, s3, e1, flag)))
            return ((flag) ? 1 : 0);
        c(ay.a(this, s1));
        if(null == (flag = (j)d(s1)) || flag.s_())
        {
            c(v.b(this));
            return c(ay.a(this, s1, s2, s3, (ap)e1));
        } else
        {
            return c(ay.a(this, flag, s3));
        }
    }

    public final s m()
    {
        int l;
        s s1 = (new s()).r(0).o(0).o(1).o(((l = super.g.size()) << 1) + 4).o(200).o(l << 1);
        for(int i1 = 0; i1 < l; i1++)
            s1.o(((ap)o(i1)).e);

        return s1;
    }

    public final int n()
    {
        switch(super.r)
        {
        case 2: // '\002'
            return 19;

        case 4: // '\004'
            return 5;

        case 16: // '\020'
            return 17;
        }
        return super.r & 0xffff;
    }

    public final int o()
    {
        boolean flag;
        int l;
        do
        {
            flag = false;
            if((l = (x.e() & 0x6fff) + 4096) == d)
            {
                flag = true;
            } else
            {
                Vector vector;
                for(int i1 = (vector = super.g).size(); --i1 >= 0;)
                {
                    Object obj;
                    if(((ap) (obj = (ap)vector.elementAt(i1))).e == l)
                        flag = true;
                    for(int j1 = ((Vector) (obj = ((e) (obj)).b)).size(); --j1 >= 0;)
                        if(((j)((Vector) (obj)).elementAt(j1)).a(l))
                            flag = true;

                }

            }
        } while(flag);
        return l;
    }

    public final int c(be be1)
    {
        if(be1.s_())
            return 314;
        else
            return c(r.c(this, (j)be1));
    }

    public final int d(be be1)
    {
        if((be1 = (j)be1).g() && !be1.q_())
            c(r.b(this, be1));
        return c(r.a(this, be1));
    }

    public final int e(be be1)
    {
        if(!(be1 = (j)be1).g() && be1.q_())
            c(r.a(this, be1));
        return c(r.b(this, be1));
    }

    public final int p()
    {
        if(b != null)
            b[0] = null;
        b = null;
        int l;
        if(0 != (l = super.p()))
        {
            return l;
        } else
        {
            c(v.a(this));
            X();
            super.q = i();
            return 0;
        }
    }

    public final int a_(Object obj)
    {
        return c(bh.a(this, (String[])obj));
    }

    public final be a_(String s1)
    {
        j j1;
        super.A.b(j1 = new j(this, -1, -1, s1, s1, true));
        c(bh.a(this, s1));
        return j1;
    }

    public final void a(bc bc1)
    {
        j j1;
        if(null != (j1 = (j)super.n.get(bc1.k())))
            j1.g(bc1.m());
    }

    public final void a(String s1, int l)
    {
        H.put(s1, z.i(l));
    }

    public final void b(String s1, int l)
    {
        I.put(s1, z.i(l));
    }

    public final void c(String s1, int l)
    {
        J.put(s1, z.i(l));
    }

    public final void q()
    {
        for(Enumeration enumeration = super.n.elements(); enumeration.hasMoreElements();)
        {
            j j1;
            Object obj;
            if(null != (obj = H.get((j1 = (j)enumeration.nextElement()).c)))
            {
                v.i();
                j1.d = ((Integer)obj).intValue();
            }
            if(null != (obj = I.get(j1.c)))
            {
                v.i();
                j1.e = ((Integer)obj).intValue();
            }
            if(null != (obj = J.get(j1.c)))
            {
                v.i();
                j1.f = ((Integer)obj).intValue();
            }
        }

        H.clear();
        I.clear();
        J.clear();
    }

    public final void d(int l)
    {
        switch(l)
        {
        case 0: // '\0'
            c(0);
            return;

        case 1: // '\001'
            c(32);
            return;

        case 2: // '\002'
            c(1);
            return;

        case 3: // '\003'
            c(2);
            return;

        case 4: // '\004'
            c(256);
            return;
        }
        p();
    }

    public final int r()
    {
        if(L > 0 && L <= 5)
        {
            K = L;
            L = 0;
        }
        return K;
    }

    public final int k_()
    {
        return 369 + K;
    }

    public final int e(int l)
    {
        L = l;
        if(S())
        {
            c(a.b(this, d));
            return 4;
        } else
        {
            return 0;
        }
    }

    public final void l_()
    {
        super.l_();
        super.s = 0;
    }

    public final int y_()
    {
        return 0x30346;
    }

    private final s A()
    {
        return v.a(this, 770, (new s()).c(0x50362));
    }

    private final void e(s s1)
    {
        try
        {
            while(s1.b > 0) 
            {
                String s2 = null;
                String s3 = s1.D();
                int l = s1.x();
                int i1 = s1.x();
                int j1 = s1.x();
                int i2;
                for(int k1 = s1.x(); k1 > 0; k1 -= i2 + 4)
                {
                    int l1 = s1.x();
                    i2 = s1.n(0);
                    if(l1 == 305)
                        s2 = s1.D();
                    else
                        s1.g(i2 + 2);
                }

                ap ap1;
                if(j1 == 0 && s3.endsWith(t.c(0x120367)) && (ap1 = b(l)) != null)
                {
                    f(d(s3));
                    ap1.b(new j(this, i1, l, s3, s2, false));
                }
            }
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    public final Vector j_()
    {
        Vector vector = super.j_();
        Vector vector1 = bh.q();
        for(int l = 0; l < x.c(vector); l++)
        {
            ap ap1;
            if(!(ap1 = (ap)vector.elementAt(l)).a())
                vector1.addElement(ap1);
        }

        return vector1;
    }

    public int a;
    private int e;
    private byte f[];
    public String b[];
    public int c;
    public int d;
    private Hashtable H;
    private Hashtable I;
    private Hashtable J;
    private int K;
    private int L;
    private boolean M;
}