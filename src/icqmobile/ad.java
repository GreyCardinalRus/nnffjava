// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:10:53
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;

public final class ad
{

    public final void a(int i1, int j1)
    {
        O = j1;
        N = i1;
    }

    public ad(byte byte0)
    {
        x = 2;
        a = 63;
    }

    public final void a()
    {
        bh.a(k);
        bh.a(j);
    }

    public final ad b()
    {
        if(t.g(245))
        {
            k = bh.q();
            y();
        }
        return this;
    }

    private ad(int i1, int j1, int k1, int l1)
    {
        j = bh.q();
        A = new int[16];
        x = i1;
        b = k1;
        c = l1;
        a = j1;
        i = -1;
        y();
    }

    public ad(int i1, int j1, int k1, int l1, boolean flag)
    {
        this(i1, j1, k1, l1);
        g = flag;
    }

    private final ad y()
    {
        int i1 = b - 4;
        int k1 = c - 4;
        B = w == null ? 0 : w.m() + 3;
        D = b - 4;
        E = B;
        F = (k1 - E) + 3;
        C = E + 1;
        l = i1 - 3;
        m = F - 1;
        if(k != null)
        {
            int j1;
            F -= j1 = x.b(t.f(1419), 16) + 3;
            m -= j1;
        }
        m++;
        return this;
    }

    public final String c()
    {
        if(g && j.size() > 0 && i >= 0)
            return d(i).b;
        else
            return null;
    }

    public final int d()
    {
        if(g && j.size() > 0)
            return d(i).c;
        else
            return 200;
    }

    public final av e()
    {
        if(g && j.size() > 0)
            return d(i);
        else
            return null;
    }

    public final av f()
    {
        int i1;
        if(d == 9 && (i1 = K()) < j.size())
            return d(i1);
        else
            return null;
    }

    public final ad a(int i1, String s1)
    {
        v.b();
        w = av.e().a(t.c(1005), 1, 0).a(i1, s1, 1, 42);
        y();
        return this;
    }

    public final ad a(av av1, int i1)
    {
        if(x == 0)
        {
            av1.d(l);
            j.insertElementAt(av1, i1);
            A = v.a(A, 0, z);
            z += av1.m();
        } else
        {
            int j1 = 0;
            int k1 = 0;
            int l1 = j.size() - 1;
            if(j.size() > 0)
            {
                j1 = e(l1) + d(l1).l();
                k1 = a(l1);
            }
            if(j1 > 0 && j1 + av1.l() >= l)
            {
                j1 = 0;
                k1 = a(l1) + d(l1).m();
            }
            j.insertElementAt(av1, i1);
            A = v.a(A, j1, k1);
            z = k1 + av1.m();
        }
        E();
        if(g && i < 0 && av1.c())
            i = j.size() - 1;
        return this;
    }

    public final ad a(av aav[])
    {
        if(aav != null)
        {
            for(int i1 = 0; i1 < aav.length; i1++)
                a(aav[i1]);

        }
        return this;
    }

    public final ad a(av av1)
    {
        int i1 = j.size();
        return a(av1, i1);
    }

    public final ad g()
    {
        if(m - z > 5 && x == 0)
        {
            c = B + z + 4;
            y();
        }
        J();
        return this;
    }

    public final void a(ar ar1, boolean flag)
    {
        if(x != 2)
        {
            boolean flag1 = d == 2 || d == 3 || d == 4 || d == 10 || d == 11;
            if(d == 7 || d == 8)
                ar1.f(v, e, b, c);
            else
                ar1.a(v, e, b, c, flag ? 1 : 2, flag1);
            b(ar1);
            b(ar1, flag1);
            c(ar1);
            if(k != null)
                a(ar1);
            if(flag)
                d(ar1);
        }
        if(d == 1 || d == 12)
            bg.a(ar1);
        if(a == 6)
        {
            int i1;
            ar1.b(v, i1 = e + C, b, m);
            m.a(ar1, i1);
            return;
        }
        if(a == 4)
        {
            ar1.b(v, e + C, b, m);
            a.a(ar1);
        }
    }

    private final void a(ar ar1)
    {
        int j1 = x.b(t.f(1419), 16);
        int k1 = t.h();
        int i1;
        ar1.b(0, k1 - j1 - 3, i1 = t.f(1509), j1 + 3).c(15).d(0, k1 - j1 - 3, i1, j1 + 3).c(0).a(t.l(0));
        Vector vector = k;
        int l1 = 3;
        boolean flag = false;
        int i2 = (k1 - j1 - 1) + aw.m();
        for(int j2 = 0; j2 < vector.size(); j2++)
        {
            Object obj;
            if((obj = vector.elementAt(j2)) instanceof Integer)
            {
                if(flag)
                {
                    v.i();
                    ar1.a(((Integer)obj).intValue(), l1 -= 18, i2);
                } else
                {
                    v.i();
                    ar1.a(((Integer)obj).intValue(), 3, i2);
                    l1 += 18;
                }
            } else
            {
                flag = true;
                v.i();
                ar1.a((String)obj, l1, k1 - j1 - 1, 20);
                l1 = i1;
            }
        }

    }

    private void z()
    {
        c(0);
        i = 0;
        if(g)
            for(; !d(i).c(); i++);
    }

    private void A()
    {
        if(g)
        {
            i = j.size() - 1;
            c(z - m);
            if(h < 0)
            {
                c(0);
                return;
            }
        } else
        {
            if(z < m)
            {
                c(0);
                return;
            }
            if(((av)j.lastElement()).m() < m)
            {
                c(z - m);
                return;
            }
            c(A[A[0]]);
        }
    }

    public final void h()
    {
        if(s)
        {
            bd.e();
            return;
        }
        if(a == 6)
        {
            t.c(1544, 1);
            return;
        }
        if(x == 1)
        {
            int i1;
            i = ((i + (i1 = j.size())) - 1) % i1;
            q();
        }
    }

    public final boolean i()
    {
        int i1;
        if((i1 = j.size()) == 0)
            return true;
        int j1;
        return (i1 = ((j1 = i) + 1) % i1) <= j1 || e(i1) <= e(j1);
    }

    public final boolean j()
    {
        int i1;
        if((i1 = j.size()) == 0)
            return true;
        int j1;
        return (i1 = (((j1 = i) + i1) - 1) % i1) >= j1 || e(i1) >= e(j1);
    }

    public final void k()
    {
        av av1;
        if(null != (av1 = e()) && av1.e)
        {
            bh.e();
            return;
        }
        if(a == 6)
        {
            t.c(1544, 0);
            return;
        }
        if(a == 4)
        {
            int i1;
            if((i1 = j.size()) == 0)
                return;
            int j1;
            if((i1 = ((j1 = i) + 1) % i1) > j1 && e(i1) > e(j1))
            {
                i = i1;
                q();
                return;
            }
        } else
        if(x == 1)
        {
            i = (i + 1) % j.size();
            q();
            return;
        }
    }

    public final int l()
    {
        if(j.size() == 0)
            return 0;
        if(!g)
        {
            c(h - m - 20);
            if(h < 0)
                c(0);
        } else
        {
            c(h - m - 20);
            if(h < 0)
                c(0);
            i = t();
            int i1 = d(i).m();
            int j1 = a(i);
            if(i1 < m && h > j1)
                c(j1);
        }
        q();
        return 0;
    }

    public final int m()
    {
        int i1;
        if((i1 = j.size()) == 0)
            return 0;
        D();
        c((h + m) - 20);
        if(!g)
        {
            c(x.c(z - m, h));
            if(z < m)
                c(0);
        } else
        {
            av av1 = d(i1 - 1);
            i1 = a(i1 - 1);
            int j1 = av1.m();
            if(h > (i1 + j1) - m)
                c((i1 + j1) - m);
            if(h < 0)
                c(0);
            i = D();
            i1 = d(i).m();
            j1 = a(i);
            if(i1 < m && h > j1)
                c(j1);
        }
        q();
        return 0;
    }

    public final int n()
    {
        c(0);
        i = 0;
        if(g)
            for(; !d(i).c(); i++);
        q();
        return 0;
    }

    public final int o()
    {
        if(g)
        {
            i = j.size() - 1;
            c(z - m);
            if(h < 0)
                c(0);
        } else
        if(z < m)
            c(0);
        else
        if(((av)j.lastElement()).m() < m)
            c(z - m);
        else
            c(A[A[0]]);
        q();
        return 0;
    }

    private final boolean B()
    {
        if(i == 0)
            return true;
        for(int i1 = i; --i1 >= 0;)
            if(d(i1).c())
                return false;

        return true;
    }

    public final void p()
    {
        if(a == 6)
        {
            t.c(1544, 2);
            return;
        }
        if(j.size() == 0)
            return;
        if(g)
        {
            int i1 = e(i);
            int j1 = a(i);
            if(x == 0)
            {
                if(j1 < h)
                {
                    c(h - 20);
                    return;
                }
                if(B())
                {
                    if(h != 0)
                    {
                        c(0);
                        return;
                    }
                    if(!t)
                    {
                        A();
                        return;
                    }
                } else
                {
                    for(int k1 = i; --k1 >= 0;)
                        if(d(k1).c())
                        {
                            i = k1;
                            break;
                        }

                    c(x.c(h, a(i)));
                    return;
                }
            } else
            {
                int l1 = -1;
                int i2 = 0;
                for(int j2 = i; --j2 >= 0;)
                {
                    int k2;
                    if((k2 = a(j2)) != j1)
                        if(l1 == -1)
                        {
                            l1 = j2;
                            i2 = k2;
                        } else
                        if(k2 < i2)
                        {
                            i = l1;
                            q();
                            return;
                        }
                    int l2;
                    if((l2 = e(j2)) == i1 || l2 == 0 && k2 != j1)
                    {
                        i = j2;
                        q();
                        return;
                    }
                }

                i = j.size() - 1;
                q();
                return;
            }
        } else
        {
            F();
        }
    }

    public final void q()
    {
        if(g && x.c(j) > 0)
        {
            int i1 = d(i).m();
            int j1;
            if((j1 = a(i)) < h)
                c(j1);
            if(h < (j1 + i1) - m)
                c((j1 + i1) - m);
            if(h < 0)
                c(0);
        }
    }

    public final ad r()
    {
        c(x.b(0, z - m));
        int i1;
        if((i1 = j.size()) > 1)
            c(x.c(h, a(i1 - 2)));
        if(d == 9)
        {
            int j1;
            if((j1 = L()) < j.size())
            {
                ((av)j.elementAt(j1)).f = true;
                I = j1;
            } else
            {
                I = 0xf4240;
            }
            J = 2;
        }
        return this;
    }

    public final void s()
    {
        if(a == 6)
        {
            ay.e(this);
            return;
        }
        int i1;
        if((i1 = j.size()) == 0)
            return;
        if(g)
        {
            if(x == 0)
            {
                if(i < i1 - 1)
                {
                    av av1 = null;
                    for(int l1 = i; ++l1 <= i1;)
                    {
                        if(l1 == i1)
                            return;
                        if((av1 = d(l1)).c())
                        {
                            i = l1;
                            break;
                        }
                    }

                    int j2 = av1.m();
                    int i3;
                    if((i3 = a(i)) + j2 >= h + m)
                        if(j2 <= m)
                        {
                            c((i3 + j2) - m);
                            return;
                        } else
                        {
                            c(h + 20);
                            return;
                        }
                } else
                {
                    int j1 = h;
                    c(h + 20);
                    int k2 = d(i).m();
                    int j3 = a(i);
                    if(h > (j3 + k2) - m)
                        h -= h - ((j3 + k2) - m);
                    if(h < 0)
                        c(0);
                    if(h == j1 && !t)
                    {
                        z();
                        return;
                    }
                }
            } else
            {
                int k1 = e(i);
                int i2 = a(i);
                int l2 = -1;
                int k3 = 0;
                for(int l3 = i; ++l3 < i1;)
                {
                    int i4;
                    if((i4 = a(l3)) != i2)
                        if(l2 == -1)
                        {
                            l2 = l3;
                            k3 = i4;
                        } else
                        if(i4 > k3)
                        {
                            i = l2;
                            q();
                            return;
                        }
                    if(e(l3) == k1)
                    {
                        i = l3;
                        q();
                        return;
                    }
                }

                i = 0;
                q();
                return;
            }
        } else
        {
            G();
        }
    }

    private final int C()
    {
        int i1 = t();
        if(!g(i1))
            i1++;
        return i1;
    }

    private final int D()
    {
        int i1 = H();
        if(!g(i1) && !d(i1).c())
            i1--;
        return i1;
    }

    private final void E()
    {
        if(z > 0 && z >= m)
        {
            G = ((F - 4) * m) / z;
            if(G < 10)
                G = 10;
            y = true;
            return;
        } else
        {
            y = false;
            return;
        }
    }

    private av d(int i1)
    {
        if(i1 >= 0)
            return (av)j.elementAt(i1);
        else
            return null;
    }

    private final int e(int i1)
    {
        return A[(i1 << 1) + 1];
    }

    public final int a(int i1)
    {
        return A[(i1 << 1) + 1 + 1];
    }

    private final boolean f(int i1)
    {
        int j1;
        return (j1 = a(i1)) < h + m && j1 + d(i1).m() > h;
    }

    private final boolean g(int i1)
    {
        int j1;
        return (j1 = a(i1)) >= h && (j1 + d(i1).m()) - 1 <= h + m;
    }

    private final void b(ar ar1)
    {
        if(w != null)
        {
            ar1.a(v, e, b, B, ar.b(25), ar.b(16), !t.g(299));
            w.a(ar1, v, e, 0, false);
        }
    }

    private final void b(ar ar1, boolean flag)
    {
        int i1 = v;
        int j1 = e + C;
        int k1 = y ? l + 3 : l + 7;
        int l1 = j.size();
        boolean flag1 = x != 0;
        int i2 = h;
        for(int j2 = 0; j2 < l1; j2++)
        {
            int k2;
            if((k2 = a(j2)) - i2 > m)
                break;
            av av1;
            int l2;
            if(k2 + (l2 = (av1 = d(j2)).m()) >= i2)
            {
                int i3 = e(j2);
                int j3 = av1.l();
                ar1.b(i1, j1, k1, m);
                i3 = i1 + i3;
                k2 = (j1 + k2) - i2;
                j3 = x != 0 ? j3 : k1;
                int k3 = av1.a;
                boolean flag2 = false;
                if(g && j2 == i && k3 != 11)
                {
                    if(av1.i())
                    {
                        ar1.a(i3, k2 - 1, j3, l2, ar.b(37), ar.b(38), false);
                        ar1.c(39);
                        ar1.e(i3, (k2 + l2) - 1, j3, 0);
                    } else
                    if(av1.h)
                    {
                        av1.a(ar1, i3, k2);
                    } else
                    {
                        ar1.c(12);
                        if(flag)
                        {
                            i3++;
                            j3 -= 2;
                        }
                        ar1.d(i3, k2, j3, l2);
                        if((flag2 = ((boolean) (av1.d))) != null && ((flag2 instanceof y) || (flag2 instanceof au)))
                        {
                            ar1.c(24);
                            ar1.d(i3, (k2 + l2) - 1, j3, 1);
                        }
                    }
                    flag2 = true;
                }
                if(k3 == 15 && av1.g())
                {
                    ar1.c(12);
                    ar1.e(i3 + 7, k2 + 2, j3 - 10, l2 - 4);
                } else
                if(k3 == 14 && av1.f)
                {
                    ar1.c(12);
                    ar1.d(i3, k2, j3, l2);
                }
                if(!flag1 || ar1.a(i3, k2, j3, l2))
                    av1.a(ar1, i3, k2, k1, flag2);
            }
        }

    }

    private final void c(ar ar1)
    {
        if(u)
        {
            e(ar1);
            return;
        }
        if(y)
        {
            int i1 = I() + 2;
            a(i1, G + 2, ar1);
        }
    }

    private final void F()
    {
        if(!g)
        {
            if(d == 9)
            {
                int i1;
                if((i1 = K()) < j.size())
                {
                    ((av)j.elementAt(i1)).f = false;
                    int k1;
                    if((k1 = i(i1)) < j.size())
                    {
                        ((av)j.elementAt(k1)).f = true;
                        I = k1;
                    } else
                    {
                        c(h - 20);
                        if(h < 0)
                            c(0);
                    }
                } else
                if(I < j.size())
                {
                    int l1 = i(I);
                    if(a(I) > h && (a(I) + ((av)j.elementAt(I)).m()) - h <= m && J != 1)
                        l1 = I;
                    if(a(I) > h && (a(I) + ((av)j.elementAt(I)).m()) - h <= m && J == 1 && a(I) - h <= 20)
                        l1 = I;
                    if(l1 < j.size())
                    {
                        ((av)j.elementAt(l1)).f = true;
                        I = l1;
                    } else
                    {
                        c(h - 20);
                        if(h < 0)
                            c(0);
                    }
                } else
                if((i1 = L()) < j.size())
                {
                    ((av)j.elementAt(i1)).f = true;
                    I = i1;
                } else
                {
                    c(h - 20);
                    if(h < 0)
                        c(0);
                }
                J = 1;
                return;
            }
            c(h - 20);
            if(h < 0)
            {
                c(0);
                return;
            }
        } else
        if(!g(0))
        {
            int j1 = D();
            for(int i2 = C(); i2 > 0 && g(j1); c(a(--i2)));
        }
    }

    private final void G()
    {
        if(d == 9)
        {
            int i1;
            if((i1 = K()) < j.size())
            {
                ((av)j.elementAt(i1)).f = false;
                if((i1 = j(i1)) < j.size())
                {
                    ((av)j.elementAt(i1)).f = true;
                    I = i1;
                } else
                if(h + m < z)
                    c(h + 20);
            } else
            if(I < j.size())
            {
                i1 = j(I);
                if(a(I) > h && (a(I) + ((av)j.elementAt(I)).m()) - h <= m && J != 2)
                    i1 = I;
                if(a(I) > h && (a(I) + ((av)j.elementAt(I)).m()) - h <= m && J == 2 && m - ((a(I) + ((av)j.elementAt(I)).m()) - h) <= 20)
                    i1 = I;
                if(i1 < j.size())
                {
                    ((av)j.elementAt(i1)).f = true;
                    I = i1;
                } else
                if(h + m < z)
                    c(h + 20);
            } else
            if((i1 = L()) < j.size())
            {
                ((av)j.elementAt(i1)).f = true;
                I = i1;
            } else
            if(h + m < z)
                c(h + 20);
            J = 2;
            return;
        }
        if(h + m < z)
            c(h + 20);
    }

    private final int e(int i1, int j1)
    {
        int k1;
        for(int l1 = -1; (k1 = i1 + j1 >> 1) != l1;)
        {
            l1 = k1;
            if(a(k1) + d(k1).m() < h)
                i1 = k1 + 1;
            else
                j1 = k1;
        }

        if(!f(k1))
            k1++;
        else
        if(k1 > 0 && f(k1 - 1))
            k1--;
        return k1;
    }

    private final int f(int i1, int j1)
    {
        int k1;
        for(int l1 = -1; (k1 = i1 + j1 >> 1) != l1;)
        {
            l1 = k1;
            if(a(k1) > h + m)
                j1 = k1 - 1;
            else
                i1 = k1;
        }

        if(k1 < j.size() - 1 && f(k1 + 1))
            k1++;
        return k1;
    }

    public final int t()
    {
        return e(0, g ? i : j.size() - 1);
    }

    private final int H()
    {
        return f(g ? i : 0, j.size() - 1);
    }

    private final int I()
    {
        if(z == 0)
            return 0;
        else
            return x.c(((F - 4) * h) / z, F - 4 - G);
    }

    public final ad a(String s1, String s2, int i1)
    {
        v.b();
        v.b();
        return a(-1, s1, s2, i1, null);
    }

    public final ad a(int i1, String s1, int j1)
    {
        v.b();
        return a(i1, ((String) (null)), s1, j1, null);
    }

    public final ad a(int i1, String s1, int j1, Object obj)
    {
        v.b();
        return a(i1, ((String) (null)), s1, j1, obj);
    }

    public final ad a(String s1, String s2)
    {
        v.b();
        v.b();
        return a(s1, s2, 200);
    }

    public final ad a(int i1, int j1, int k1)
    {
        return a(i1, t.c(j1), k1);
    }

    public final ad a(String s1, int i1, int j1)
    {
        v.b();
        return a(av.e().a(s1, 0, i1, j1));
    }

    public final ad b(int i1, String s1, int j1, Object obj)
    {
        v.b();
        return a(av.f().a(i1).a(s1, 5, j1).a(obj));
    }

    public final ad a(String s1, int i1)
    {
        v.b();
        return a(av.e().a(s1, 1, i1));
    }

    public final ad b(int i1, int j1, int k1)
    {
        (i1 = av.a(j1 = t.c(j1), k1).a(i1).h(j1).a(244)).e = true;
        return a(i1);
    }

    public final ad a(String s1)
    {
        v.b();
        return a(-1, s1, 200);
    }

    public final ad b(String s1, String s2)
    {
        v.b();
        v.b();
        return a(-1, ((String) (null)), s1, 200, s2);
    }

    public final ad b(int i1, String s1, int j1)
    {
        v.b();
        return a(av.a(s1, j1).a(i1));
    }

    public final ad b(int i1)
    {
        return a(av.e().h(t.c(i1)));
    }

    private ad a(int i1, String s1, String s2, int j1, Object obj)
    {
        v.b();
        v.b();
        v.i();
        j1 = av.a(s2, j1);
        if(i1 >= 0)
            j1.a(i1);
        if(s1 != null)
            j1.a(s1, 0, 6);
        if(s2 != null)
            j1.h((i1 = s2.indexOf('\0')) >= 0 ? ab.b(s2, i1) : s2);
        j1.a(obj);
        return a(j1);
    }

    private void J()
    {
        int i1 = 0;
        for(Enumeration enumeration = j.elements(); enumeration.hasMoreElements();)
            i1 = x.b(i1, ((av)enumeration.nextElement()).k());

        b = x.c(b, i1 + 4);
        y();
    }

    public final int b(String s1)
    {
        v.b();
        if(s1 != null)
        {
            int i1 = 0;
            for(Enumeration enumeration = j.elements(); enumeration.hasMoreElements();)
            {
                av av1 = (av)enumeration.nextElement();
                if(s1.equals(av1.b))
                    return i1;
                i1++;
            }

        }
        return -1;
    }

    public final av c(String s1)
    {
        v.b();
        if(s1 != null)
        {
            for(Enumeration enumeration = j.elements(); enumeration.hasMoreElements();)
            {
                av av1 = (av)enumeration.nextElement();
                if(s1.equals(av1.b))
                    return av1;
            }

        }
        return null;
    }

    public final ad d(String s1)
    {
        v.b();
        if(s1 != null)
        {
            int i1 = 0;
            for(Enumeration enumeration = j.elements(); enumeration.hasMoreElements(); i1++)
            {
                av av1 = (av)enumeration.nextElement();
                if(!s1.equals(av1.b))
                    continue;
                i = i1;
                break;
            }

        }
        return this;
    }

    public final void u()
    {
        Vector vector = bh.q();
        for(int i1 = j.size(); --i1 >= 0;)
            vector.addElement(j.elementAt(i1));

        j.removeAllElements();
        A[0] = 0;
        z = 0;
        for(int j1 = vector.size(); --j1 >= 0;)
            a((av)vector.elementAt(j1));

        bh.a(vector);
    }

    public final void c(String s1, String s2)
    {
        v.b();
        v.b();
        ar ar1;
        H = x.b((ar1 = t.l(1)).a(q = s1), ar1.a(r = s2)) << 1;
    }

    private final void d(ar ar1)
    {
        if(t.g(71))
        {
            int i1;
            int j1;
            ar1.b(0, 0, i1 = t.f(1509), 128 + (j1 = t.h()));
            ar1.a(t.l(1));
            ar1.c(41);
            if(q != null)
                ar1.a(q, 5, j1 + 2, 20);
            if(r != null)
                ar1.a(r, i1 - 5, j1 + 2, 24);
            if(z.e + H < i1 - 14)
                ar1.a(x.h(t.c(1225)), i1 >> 1, j1 + 2, 17);
        }
    }

    public final ad v()
    {
        return a(t.c(1006), t.c(1019), n, o, p);
    }

    public final ad a(String s1, String s2, int i1, int j1, int k1)
    {
        c(s1, s2);
        n = i1;
        o = j1;
        p = k1;
        return this;
    }

    public final boolean b(int i1, int j1)
    {
        M = true;
        K = 0;
        L = 0;
        i1 -= v;
        j1 -= e;
        boolean flag;
        if((flag = i1 >= 0 && i1 < 0 + l && j1 >= C && j1 < C + m) && a == 6)
            if((j1 -= C) > 0)
            {
                ay.a(this);
                o.a(i1, j1);
                return true;
            } else
            {
                return false;
            }
        if(!flag && d != 0 && d != 1 && d != 12)
        {
            if(aw.c().a != 41 && aw.c().a != 193)
                bd.d();
            bf.c = true;
            return true;
        } else
        {
            return false;
        }
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        if(!M)
            return;
        i1 -= v;
        j1 -= e + C;
        if(K == 0 && L == 0)
        {
            K = i1;
            L = j1;
        }
        int i2 = i1 - K;
        int j2 = j1 - L;
        K = i1;
        L = j1;
        if(a == 6)
        {
            ay.a(this);
            o.b(i2, j2);
            return;
        } else
        {
            h(j2);
            a(k1, l1, true);
            return;
        }
    }

    private final void h(int i1)
    {
        c(h - i1);
        if(z < m)
            c(0);
        if(h > z - m)
            c(z - m);
        if(h < 0)
            c(0);
        bf.c = true;
    }

    public final boolean a(int i1, int j1, int k1, int l1, boolean flag)
    {
        if(!M)
            return true;
        bf.c = true;
        M = false;
        i1 -= v;
        j1 -= e;
        k1 -= v;
        l1 -= e;
        if(a == 6)
        {
            ay.a(this);
            o.c(i1, j1 - C);
            return true;
        }
        if(g && !flag && a(flag ? k1 : i1, flag ? l1 : j1, flag))
            return true;
        if(!flag)
        {
            if(d == 9)
            {
                g(i1, j1);
                bf.c();
            } else
            if(d != 0 && d != 1)
                bf.c();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean c(int i1, int j1)
    {
        i1 -= v;
        j1 -= e;
        M = false;
        if(a == 6)
        {
            j1 -= C;
            ay.a(this);
            o.d(i1, j1);
            return true;
        } else
        {
            return false;
        }
    }

    private final boolean a(int i1, int j1, boolean flag)
    {
        j1 = (j1 + h) - C;
        int k1 = j.size();
        int l1 = y ? l : l + 2;
        for(int i2 = 0; i2 < k1; i2++)
        {
            int j2;
            int k2;
            av av1;
            if((av1 = d(i2)).c() && i1 > (j2 = e(i2)) && j1 > (k2 = a(i2)) && i1 < j2 + (x != 0 ? av1.l() : l1) && j1 < k2 + av1.m())
            {
                if(i == i2 && !flag)
                    bf.c();
                else
                    i = i2;
                return true;
            }
        }

        return false;
    }

    private final void g(int i1, int j1)
    {
        j1 = (j1 + h) - C;
        int k1 = y ? l : l + 2;
        int l1;
        if((l1 = K()) < j.size())
            ((av)j.elementAt(l1)).f = false;
        int j2;
        int k2;
        av av1;
        for(int i2 = j.size(); --i2 >= 0;)
            if((av1 = d(i2)).a == 14 && i1 > (j2 = e(i2)) && j1 > (k2 = a(i2)) && i1 < j2 + k1 && j1 < k2 + av1.m())
            {
                av1.f = true;
                return;
            }

    }

    private int K()
    {
        int i1 = j.size() + 1;
        for(int j1 = 0; j1 < j.size(); j1++)
        {
            av av1;
            if((av1 = (av)j.elementAt(j1)).a == 14 && av1.f && a(j1) > h && (a(j1) + av1.m()) - h <= m)
                i1 = j1;
        }

        return i1;
    }

    private int i(int i1)
    {
        int j1 = j.size() + 1;
        for(int k1 = 0; k1 < j.size(); k1++)
        {
            av av1;
            if((av1 = (av)j.elementAt(k1)).a == 14 && !av1.f && a(k1) > h && (a(k1) + av1.m()) - h <= m && a(k1) < a(i1))
                j1 = k1;
        }

        return j1;
    }

    private int j(int i1)
    {
        int j1 = j.size() + 1;
        for(int k1 = 0; k1 < j.size(); k1++)
        {
            av av1;
            if((av1 = (av)j.elementAt(k1)).a != 14 || av1.f || a(k1) <= h || (a(k1) + av1.m()) - h > m || a(k1) <= a(i1))
                continue;
            j1 = k1;
            break;
        }

        return j1;
    }

    private int L()
    {
        int i1 = j.size() + 1;
        for(int j1 = 0; j1 < j.size(); j1++)
        {
            av av1;
            if((av1 = (av)j.elementAt(j1)).a == 14 && !av1.f && a(j1) > h && (a(j1) + av1.m()) - h <= m)
                i1 = j1;
        }

        return i1;
    }

    public final int w()
    {
        return v + b;
    }

    public final int x()
    {
        int i1 = 0;
        if(i > 0)
            i1 = a(i);
        return e + i1;
    }

    public final ad d(int i1, int j1)
    {
        v = i1;
        e = j1;
        return this;
    }

    private void e(ar ar1)
    {
        if(N == 0)
            return;
        Object obj;
        if(((Vector) (obj = j)).size() > 1)
            obj = (av)((Vector) (obj)).elementAt(1);
        else
            obj = (av)((Vector) (obj)).elementAt(0);
        int i1 = ((av) (obj)).m();
        i1 = m / i1;
        if((i1 = (m * i1) / N) < 10)
            i1 = 10;
        int j1;
        if((j1 = (O * m) / N + 2) + i1 > F)
            j1 = F - i1;
        a(j1, i1, ar1);
    }

    private void a(int i1, int j1, ar ar1)
    {
        int k1 = v + D;
        int l1 = e + E;
        ar1.b(k1, l1, 8, F + 4);
        ar1.c(30);
        ar1.d(k1, l1 + 1, 4, F - 1);
        ar1.c(31);
        ar1.d(k1 + 1, l1 + i1, 2, j1);
    }

    public final void c(int i1)
    {
        h = i1;
        if(h < 0)
            h = 0;
    }

    public final ad a(int i1, int j1, int k1, int l1, int i2)
    {
        j1 = t.c(j1);
        (i2 = av.a(k1 = t.c(k1), i2)).a(k1, 1, 0);
        if(l1 > 0)
        {
            l1 = bh.b(bh.r().append(l1).append(t.c(853 + x.k(l1))));
            int j2 = ar.d(i1);
            int k2 = t.r().stringWidth(j1);
            k1 = t.s().stringWidth(k1);
            if((k1 = j2 + k1 + k2 + 40) > 30)
            {
                k1 = x.a(l1, 0, k1);
                i2.a(k1, 0, 3);
            } else
            {
                i2.h(t.c(0x10047));
            }
        } else
        {
            i2.h(t.c(0x10047));
        }
        i2.h();
        i2.h(j1);
        if(i1 >= 0)
            i2.a(i1);
        i2.h(t.c(0x10031));
        return a(i2);
    }

    public ad()
    {
    }

    public static void a(Object aobj[])
    {
        int i1 = ae.a;
        ag ag1;
        if(!(ag1 = (ag)aobj[0]).a && !ae.i() && !ae.j())
            i1++;
        c(aobj, i1);
        d(aobj, 5);
        if(!ag1.a)
            i1++;
        else
            i1--;
        c(aobj, i1);
        d(aobj, 3);
        synchronized(ag1)
        {
            ag1.a();
            ag1.a(2);
            if(ag1.b)
                ae.a(ag1);
        }
        ae.k();
    }

    private static void a(Object aobj[], int i1)
    {
        ((ag)aobj[0]).a();
        int j1 = ae.d << 1;
        s s1 = null;
        if((aobj = (Vector)aobj[2]) != null && ((Vector) (aobj)).size() > 0)
        {
            s1 = new s();
            for(int k1 = 0; k1 < ((Vector) (aobj)).size(); k1++)
            {
                String s2 = (String)((Vector) (aobj)).elementAt(k1);
                s1.f(s2);
                s1.c(0x100c5);
            }

        }
        StringBuffer stringbuffer = bh.r().append(t.c(0x220a75)).append(t.c(0x110c07)).append(t.c(0x90cf6)).append(x.h(t.c(1310))).append(t.c(0x60e77)).append(ab.e(Integer.toString(i1))).append(t.c(0x70e70)).append(t.c(0x90d4a)).append(t.c(0x120afe)).append(t.c(0x70e7d)).append(ab.e(Integer.toString(j1)));
        if(s1 != null)
            stringbuffer.append(t.c(0x111dc1)).append(s1.d());
        r.f(u.b(stringbuffer));
    }

    private static void b(Object aobj[], int i1)
    {
        ((ag)aobj[0]).a();
        int j1 = ae.d << 1;
        s s1 = null;
        Object obj;
        if((obj = (Vector)aobj[2]) != null && ((Vector) (obj)).size() > 0)
        {
            s1 = new s();
            for(int k1 = 0; k1 < ((Vector) (obj)).size(); k1++)
            {
                String s2 = (String)((Vector) (obj)).elementAt(k1);
                s1.f(s2);
                s1.c(0x100c5);
            }

        }
        obj = t.c(0x220a75);
        StringBuffer stringbuffer = bh.r().append(((String) (obj))).append(t.c(0x110b7a)).append(t.c(0x80ce7)).append(t.c(0x80e60)).append(ab.e(Integer.toString(((Integer)aobj[1]).intValue()))).append(t.c(0x70e7d)).append(ab.e(Integer.toString(j1))).append(t.c(0x50e5b)).append(t.c(0x1006a)).append(t.c(0x90d4a)).append(t.c(0x120afe)).append(t.c(0x60e77)).append(ab.e(Integer.toString(i1))).append(t.c(0x70d53)).append(t.c(0x1006f));
        if(s1 != null)
            stringbuffer.append(t.c(0x111dc1)).append(s1.d());
        r.f(u.b(stringbuffer));
    }

    private static void c(Object aobj[], int i1)
    {
        ae.d = t.d().getHeight() / 30;
        if(((ag)aobj[0]).c)
        {
            a(aobj, i1);
            return;
        } else
        {
            b(aobj, i1);
            return;
        }
    }

    private static void d(Object aobj[], int i1)
    {
        ag ag1;
        (ag1 = (ag)aobj[0]).a();
        do
        {
            Object aobj1[];
            if((aobj1 = u.c(r.Z())) != null)
            {
                int j1;
                if((j1 = r.h(aobj1)) != 0)
                {
                    aobj[4] = new Integer(j1);
                    ag1.a(1);
                    return;
                }
                Object obj = r.aa();
                synchronized(ag1)
                {
                    aobj[i1] = obj;
                    if(ab.f(obj))
                    {
                        aobj[4] = new Integer(188);
                        ag1.a(1);
                        aobj = null;
                        v.by().i = 1;
                        throw new RuntimeException();
                    }
                }
                return;
            }
            try
            {
                Thread.sleep(500L);
            }
            catch(Throwable _ex) { }
        } while(true);
    }

    public int a;
    public int b;
    public int c;
    public int d;
    private int v;
    public int e;
    public int f;
    private av w;
    private int x;
    public boolean g;
    private boolean y;
    public int h;
    public int i;
    private int z;
    public Vector j;
    private int A[];
    public Vector k;
    private int B;
    private int C;
    public int l;
    public int m;
    private int D;
    private int E;
    private int F;
    private int G;
    public int n;
    public int o;
    public int p;
    public String q;
    public String r;
    public boolean s;
    private int H;
    public boolean t;
    private int I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private int N;
    private int O;
    public boolean u;
}