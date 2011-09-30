// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:41
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Vector;

public final class bg
{

    private bg(int i1, String s, int j1, ba ba1)
    {
        i = i1;
        h = s;
        c = j1;
        j1 = t.l(1);
        j = ar.d(i1) + j1.a(s);
        d = ba1;
    }

    public static final void a(ba ba1, String s)
    {
        if(ba1 != null && s != null)
        {
            Vector vector;
            bg bg1;
            for(int i1 = x.c(vector = t.n(1208)); --i1 >= 0;)
                if((bg1 = (bg)vector.elementAt(i1)).d == ba1)
                {
                    bg1.e = s;
                    bg1.f = 0;
                    return;
                }

        }
    }

    private final bg a(int i1)
    {
        j = 26 + t.l(i1).a(h);
        return this;
    }

    public static final void a()
    {
        b = 0;
        g = null;
        t.a(1208, bh.q());
        Vector vector;
        int i1;
        if((i1 = (vector = t.n(1203)).size()) == 0 || !t.g(243))
        {
            a(6, t.c(1016), 4, null);
        } else
        {
            for(int j1 = 0; j1 < i1; j1++)
            {
                ba ba1;
                a((ba1 = (ba)vector.elementAt(j1)).b(), ba1.G, 4, ba1);
                if(j1 == 0)
                    g = ba1;
            }

        }
        if(t.g(67) && bb.b() > 0)
            a(240, t.c(1012), 36, null);
        if(t.g(68))
            a(264, t.c(1013), 6, null);
        h();
        bf.c = true;
    }

    public static final void a(int i1, String s)
    {
        Vector vector;
        bg bg1;
        if((bg1 = (bg)(vector = t.n(1208)).elementAt(0)).i != i1 || bg1.h != s)
        {
            String s1 = bg1.e;
            int j1 = bg1.f;
            vector.setElementAt(i1 = new bg(i1, s, 4, null), 0);
            i1.e = s1;
            i1.f = j1;
            h();
            bf.c = true;
        }
    }

    private static void a(int i1, String s, int j1, ba ba1)
    {
        t.n(1208).addElement(new bg(i1, s, j1, ba1));
    }

    public final int b()
    {
        Vector vector;
        for(int i1 = x.c(vector = t.n(1208)); --i1 >= 0;)
            if(vector.elementAt(i1) == this)
            {
                n();
                b(i1);
                return k();
            }

        return 0;
    }

    public static final bg c()
    {
        Vector vector;
        int i1;
        if((i1 = b + 1) < x.c(vector = t.n(1208)))
            return (bg)vector.elementAt(i1);
        else
            return null;
    }

    public static final bg d()
    {
        int i1;
        if((i1 = b - 1) >= 0)
            return (bg)t.n(1208).elementAt(i1);
        else
            return null;
    }

    public static final void e()
    {
        j();
        if(a(36, ((ba) (null))) == null)
            a(240, t.c(1012), 36, null);
    }

    public static final void f()
    {
        j();
        if(a(6, ((ba) (null))) == null)
            a(264, t.c(1013), 6, null);
    }

    public static final void a(int i1, int j1)
    {
        if(!t.g(i1))
        {
            bg bg1;
            for(int k1 = x.c(i1 = t.n(1208)); --k1 >= 0;)
                if((bg1 = (bg)i1.elementAt(k1)).c == j1)
                {
                    x.a(i1, bg1);
                    h();
                    bf.c = true;
                    return;
                }

        }
    }

    private static final void j()
    {
        if(!t.g(243))
            a(6, t.c(1016));
    }

    public static final bg g()
    {
        return (bg)t.n(1208).elementAt(b);
    }

    public static final bg a(int i1, ba ba1)
    {
        Vector vector;
        bg bg1;
        for(int j1 = x.c(vector = t.n(1208)); --j1 >= 0;)
            if((bg1 = (bg)vector.elementAt(j1)).c == i1 && (ba1 == null || bg1.d == ba1))
                return b(j1);

        return null;
    }

    private static final bg b(int i1)
    {
        if(b != i1)
        {
            b = i1;
            h();
        }
        g = ((bg) (i1 = (bg)t.n(1208).elementAt(i1))).d;
        return i1;
    }

    public static final void h()
    {
        int i1;
        Vector vector;
        if((i1 = x.c(vector = t.n(1208))) == 0)
            return;
        bh.a(t.n(1207));
        Vector vector1;
        t.a(1207, vector1 = bh.q());
        int j1 = b;
        bg bg1 = (bg)vector.elementAt(j1);
        int k1 = 0;
        int k2 = 0;
        int l2 = 20;
        for(int l3 = 0; l3 < i1; l3++)
        {
            bg bg2;
            (bg2 = (bg)vector.elementAt(l3)).a(l3 != j1 ? 0 : 1).k = l2;
            vector1.addElement(bg2);
            l2 += bg2.j;
            k1 += bg2.j;
            if(l3 == j1)
                k2 = k1;
        }

        int k4 = k1;
        for(j1 = t.f(1509) - 20; k2 >= j1 - 32;)
        {
            int l1 = 0;
            do
            {
                Object obj1;
                if(vector1.contains(obj1 = vector.elementAt(l1)))
                {
                    l1 = (bg)obj1;
                    break;
                }
                l1++;
            } while(true);
            if(l1 == bg1)
                break;
            int i3 = ((bg) (l1)).j;
            x.a(vector1, l1);
            Object obj4;
            int ai[];
            if((obj4 = vector1.firstElement()) instanceof int[])
            {
                ai = (int[])obj4;
            } else
            {
                vector1.insertElementAt(ai = x.a(20, 248), 0);
                i3 -= 16;
            }
            if(((bg) (l1)).c == 36 && z.aj())
            {
                if(ai[1] == 248)
                {
                    vector1.insertElementAt(x.a(20, 16385), 0);
                    ai[0] += 16;
                } else
                {
                    vector1.insertElementAt(x.a(36, 16385), 1);
                    ((int[])vector1.elementAt(2))[0] += 16;
                }
                i3 -= 16;
            }
            ba ba2;
            if(((bg) (l1)).c == 4 && r.a(ba2 = ((bg) (l1)).d) && t.g(67) && ai[1] == 248)
            {
                vector1.insertElementAt(x.a(20, r.b(ba2)), 0);
                ai[0] += 16;
                i3 -= 16;
            }
            for(int j5 = 0; j5 < i1; j5++)
                ((bg)vector.elementAt(j5)).k -= i3;

            k2 -= i3;
            k4 -= i3;
        }

        int j4;
        for(; k4 >= j1; k4 -= j4)
        {
            int i2 = i1 - 1;
            do
            {
                Object obj2;
                if(vector1.contains(obj2 = vector.elementAt(i2)))
                {
                    i2 = (bg)obj2;
                    break;
                }
                i2--;
            } while(true);
            if(i2 == bg1)
                break;
            int j3 = i2 != vector.lastElement() ? 0 : 16;
            if(((bg) (i2)).j > (k4 - j1) + j3)
            {
                int i4;
                i2.j -= i4 = (k4 - j1) + j3;
                for(int l4 = x.c(vector1); --l4 >= 0;)
                {
                    Object obj6;
                    if(!((obj6 = vector1.elementAt(l4)) instanceof int[]))
                        break;
                    ((int[])obj6)[0] -= i4;
                }

                break;
            }
            j4 = ((bg) (i2)).j;
            int i5 = ((bg) (i2)).k;
            x.a(vector1, i2);
            Object obj7;
            int ai1[];
            if((obj7 = vector1.lastElement()) instanceof int[])
            {
                ai1 = (int[])obj7;
                for(k2 = x.c(vector1); --k2 >= 0;)
                {
                    Object obj3;
                    if(!((obj3 = vector1.elementAt(k2)) instanceof int[]))
                        break;
                    ((int[])obj3)[0] -= j4;
                }

            } else
            {
                vector1.addElement(ai1 = x.a(i5, 246));
                j4 -= 16;
            }
            if(((bg) (i2)).c == 36 && z.aj() && t.g(67))
            {
                vector1.addElement(x.a(i5 + 16, 16385));
                j4 -= 16;
            }
            ba ba1;
            if(((bg) (i2)).c == 4 && r.a(ba1 = ((bg) (i2)).d))
                if(ai1[1] == 246)
                {
                    vector1.addElement(x.a(i5 + 16, r.b(ba1)));
                    j4 -= 16;
                } else
                if((i2 = ((int[])vector1.elementAt(((int) (obj3 = x.c(vector1) - 2))))[1]) != 16384 && i2 != 16386)
                {
                    vector1.insertElementAt(x.a(i5 + 16, r.b(ba1)), obj3 + 1);
                    ai1[0] += 16;
                    j4 -= 16;
                }
        }

        Object obj;
        if((obj = vector1.lastElement()) instanceof bg)
            ba1 = (((bg) (obj = (bg)obj)).k + ((bg) (obj)).j) - 20;
        else
            ba1 = ((int[])obj)[0] + -4;
        if(ba1 > j1)
        {
            int j2;
            bg1.j -= j2 = ba1 - j1;
            for(int k3 = x.c(vector1); --k3 >= 0;)
            {
                Object obj5;
                if(!((obj5 = vector1.elementAt(k3)) instanceof int[]))
                    break;
                ((int[])obj5)[0] -= j2;
            }

        }
    }

    public static final void a(ar ar1)
    {
        bg bg1 = (bg)t.n(1208).elementAt(b);
        Vector vector;
        Object obj;
        for(int i1 = x.c(vector = t.n(1207)); --i1 >= 0;)
            if((obj = vector.elementAt(i1)) instanceof bg)
            {
                ((bg)obj).a(ar1, obj == bg1 && !a);
            } else
            {
                int j1;
                int l1;
                int ai[];
                ar1.b(j1 = (ai = (int[])obj)[0], l1 = 4 + aw.m(), 16, 16);
                ar1.a(ai[1], j1, l1);
            }

        ar1.b(0, 0, 1000, 1000);
        int k1 = t.p(1) + 7;
        ar1.c(26);
        ar1.c(0, k1, t.f(1509) - 1, k1);
    }

    private final int c(int i1)
    {
        if(i1 == 240 && z.aj())
            return 16385;
        if(i1 != 240 && i1 != 264 && t.n(1205).size() > 0)
        {
            if((i1 = r.b(d)) == 16384 || i1 == 16386)
                return i1;
            else
                return 16384;
        } else
        {
            return i1;
        }
    }

    private final void a(ar ar1, boolean flag)
    {
        int i1;
        ar1.b(k, 2, j, (i1 = t.p(1) + 7) - 2);
        ar1.a(flag ? ar.a() : ar.b());
        ar1.c(k + 3, 3, (k + j) - 4, 3);
        ar1.c(k + 2, 4, (k + j) - 3, 4);
        ar1.c(flag ? 26 : 27);
        ar1.c(k + 4, 3, (k + j) - 5, 3);
        ar1.c(k + 3, 4, (k + j) - 4, 4);
        ar1.a(t.l(flag ? 1 : 0));
        for(int j1 = flag ? i1 : i1 - 1; --j1 >= 5;)
            ar1.c(k + 2, j1, (k + j) - 3, j1);

        ar1.a(d != null ? r.b(d) : c(i), k + 4, 4 + aw.m()).c(flag ? 28 : 29).b(k, 2, j - 3, i1 - 2).a(h, k + 6 + 16, 4, 20);
    }

    public static final Object b(int i1, int j1)
    {
        Vector vector;
        Object obj;
        int l1;
        for(int k1 = (vector = t.n(1207)).size(); --k1 >= 0;)
            if((obj = vector.elementAt(k1)) instanceof int[])
            {
                obj = (int[])obj;
                if(i1 >= obj[0] && i1 < obj[0] + 16 && j1 >= 0 && j1 <= 22)
                    return obj;
            } else
            if(i1 >= (l1 = ((bg) (obj = (bg)obj)).k) && j1 >= 0 && i1 <= l1 + ((bg) (obj)).j && j1 <= 22)
                return obj;

        return null;
    }

    private int k()
    {
        if(l != null)
        {
            Object obj = null;
            i1 = ((ad)l.lastElement()).a;
            if(t.g(1370))
            {
                boolean flag = false;
                t.c(1370, 0);
                t.d(m);
                Vector vector;
                synchronized(vector = t.n(1234))
                {
                    vector.removeAllElements();
                    x.a(l, vector);
                }
            }
            m = null;
            bh.a(l);
            l = null;
            if(t.g(1370))
            {
                boolean flag1 = false;
                t.c(1370, 0);
                return i1;
            }
        }
        Object obj1 = null;
        return c;
    }

    public static void i()
    {
        for(int i1 = 0; i1 < t.n(1208).size(); i1++)
            ((bg)t.n(1208).elementAt(i1)).l();

    }

    private void l()
    {
        if(l != null)
        {
            Vector vector = bh.q();
            x.a(t.n(1234), vector);
            t.n(1234).removeAllElements();
            x.a(l, t.n(1234));
            for(; t.n(1234).size() > 0; bd.e());
            bh.a(l);
            l = null;
            m = null;
            x.a(vector, t.n(1234));
        }
    }

    private static boolean m()
    {
        int i1;
        return (i1 = aw.c().a) == 36 || i1 == 38 || i1 == 43 || i1 == 52;
    }

    private static void n()
    {
        if(m() && aw.h() > 1)
        {
            bi bi = t.n();
            Vector vector = bh.q();
            x.a(t.n(1234), vector);
            t.n(1234).removeAllElements();
            bd.a(36);
            bg bg1;
            (bg1 = g()).l = vector;
            bg1.m = bi;
        }
    }

    public static boolean a;
    public static int b;
    private String h;
    private int i;
    private int j;
    private int k;
    public int c;
    private Vector l;
    private Object m;
    public final ba d;
    public String e;
    public int f;
    public static ba g;
}