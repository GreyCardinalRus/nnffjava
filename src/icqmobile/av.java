// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:17:31
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class av
{

    public static final void a()
    {
        o = new Object();
    }

    private static final boolean b(Object obj)
    {
        return obj == o;
    }

    private static final boolean c(Object obj)
    {
        return obj == t.m(1329);
    }

    private static final boolean d(Object obj)
    {
        return obj instanceof Integer;
    }

    private static final boolean e(Object obj)
    {
        return c(obj) || b(obj);
    }

    public final av a(int i1, int j1)
    {
        j1 = z.i(j1);
        while(--i1 >= 0) 
            l.addElement(j1);
        return this;
    }

    private av(int i1, String s1)
    {
        i = -1;
        s = 5;
        t = 5;
        v.b();
        a = i1;
        l = bh.q();
        m = new int[16];
        b = s1;
        c = 200;
    }

    private av(String s1, int i1)
    {
        this(1, s1);
        v.b();
        c = i1;
    }

    public final av b()
    {
        l.removeAllElements();
        m[0] = 0;
        j = 0;
        k = 0;
        return this;
    }

    private void a(int i1, Object obj)
    {
        v.i();
        l.setElementAt(obj, i1);
    }

    public final boolean c()
    {
        return a != 0;
    }

    public static final av d()
    {
        return new av(1, t.c(1006));
    }

    public static final av a(String s1)
    {
        v.b();
        return new av(1, s1);
    }

    public static final av b(String s1)
    {
        v.b();
        return new av(13, s1);
    }

    public static final av a(String s1, int i1)
    {
        v.b();
        return new av(s1, i1);
    }

    public static final av c(String s1)
    {
        v.b();
        return new av(0, s1);
    }

    public static final av e()
    {
        return new av(0, t.i());
    }

    public static final av f()
    {
        return new av(14, t.i());
    }

    public static final av d(String s1)
    {
        v.b();
        return (new av(2, s1)).h(s1).h().a(375).o();
    }

    public static final av a(String s1, String s2, boolean flag)
    {
        v.b();
        v.b();
        av av1;
        (av1 = new av(2, t.c(1006))).u = true;
        if(flag)
        {
            av1.a(s1, 1, 18).h();
            av1.a(394);
            s1 = 19;
        } else
        {
            av1.a(s1, 0, 20).h();
            av1.a(395);
            s1 = 21;
        }
        av1.h(t.c(0x10031)).a(s2, 0, s1).a(z.a(flag));
        av1.a(1, 24);
        return av1;
    }

    public static final av a(String s1, boolean flag)
    {
        v.b();
        return (new av(2, s1)).h(s1).h().a(flag ? 25 : 24).o().a(z.a(flag));
    }

    public static final av a(Object obj, String s1, int i1, int j1, String s2)
    {
        v.i();
        v.b();
        v.b();
        String s3;
        if(obj instanceof String)
        {
            Object obj1 = obj;
            v.i();
            s3 = (String)obj1;
        } else
        {
            s3 = t.i();
        }
        return (new av(15, s3)).a(obj, s1, z.i(i1), z.i(j1), s2);
    }

    public final av e(String s1)
    {
        v.b();
        Object aobj[] = (Object[])d;
        return b().a(aobj[4], s1, aobj[1], aobj[2], aobj[3]);
    }

    public final boolean g()
    {
        Object obj;
        if((obj = ((Object[])d)[4]) instanceof String)
        {
            v.i();
            if(ab.a((String)obj))
                return true;
        }
        return false;
    }

    private final av a(Object obj, String s1, Object obj1, Object obj2, Object obj3)
    {
        v.i();
        v.b();
        v.i();
        v.i();
        String s2 = x.n(s1) ? s1 : null;
        if(obj instanceof String)
        {
            h(x.i(b));
        } else
        {
            Object obj4 = obj;
            v.i();
            a(((Integer)obj4).intValue());
        }
        Object obj5 = obj2;
        v.i();
        int i1 = ((Integer)obj5).intValue();
        if(s2 != null)
            a(i1 == 0x10000 ? x.e(s2) : s2, 1, 7);
        else
            e(i1 != 4 ? t.f(1419) : 140);
        if(i1 == 4)
            a(50, 0);
        return a(((Object) (x.a(s1, obj1, obj2, obj3, obj))));
    }

    public final void a(ad ad1, String s1)
    {
        if(!ab.a(s1 = ab.e(x.h(s1)), ((Object[])d)[0]))
        {
            e(s1);
            ad1.u();
        }
    }

    public final av a(Vector vector, int i1, String s1)
    {
        v.i();
        v.b();
        int j1;
        String as[] = new String[j1 = vector.size()];
        while(--j1 >= 0) 
        {
            Object obj = vector.elementAt(j1);
            v.i();
            as[j1] = (String)obj;
        }
        bh.a(vector);
        String s2 = as[i1];
        v.b();
        return b().h(x.i(s1)).a(s2, 1, 7).a(247).a(((Object) (x.a(z.i(i1), as))));
    }

    public static final av b(Vector vector, int i1, String s1)
    {
        v.i();
        return (new av(9, s1)).a(vector, i1, s1);
    }

    private av b(String s1, String s2, String s3)
    {
        v.b();
        v.b();
        v.b();
        b().a(x.a(s1, s2, s3));
        if(!x.n(s3))
            return a(221).a(x.n(s2) ? s2 : s1, 1, 7);
        else
            return b(5).a(s3, 1, 0).h().a(221).o();
    }

    private av o()
    {
        return h(t.c(0x10031));
    }

    public static final av a(String s1, String s2, String s3)
    {
        v.b();
        v.b();
        v.b();
        return (new av(4, ((String) (null)))).b(s1, s2, s3);
    }

    private av i(String s1)
    {
        v.b();
        b();
        a(219);
        int i1;
        if(x.n(s1))
            a((i1 = s1.indexOf('\0')) >= 0 ? ab.b(s1, i1) : s1, 1, 7);
        else
            e(t.f(1419));
        return a(s1);
    }

    public static final av f(String s1)
    {
        v.b();
        return (new av(5, ((String) (null)))).i(s1);
    }

    public static final av a(ar ar1)
    {
        av av1;
        (av1 = (new av(11, t.i())).a(ar1)).j = ar1.a.getWidth();
        av1.k = ar1.a.getHeight() + 5;
        return av1;
    }

    public final av a(Object obj)
    {
        v.i();
        d = obj;
        return this;
    }

    public final int a(ad ad1)
    {
        if(a == 2)
        {
            if(d != null)
            {
                ad1 = 0;
                for(int i1 = x.c(l); ad1 < i1; ad1++)
                {
                    Object obj;
                    if(((obj = l.elementAt(ad1)) instanceof int[]) && ((int[])obj).length == 3)
                        break;
                }

                boolean flag = ((Boolean)(d = z.a((Boolean)d))).booleanValue();
                a(ad1, f(u ? flag ? 394 : 395 : ((int) (flag ? 25 : 24))));
            }
            bh.a(this);
            return 0;
        }
        if(a == 15)
        {
            new f(ad1, this);
            return 0;
        }
        if(a == 9)
        {
            r.a(ad1, this);
            return 0;
        }
        if(a == 4)
        {
            v.n(x.h(t.c(1338)).length() <= 0 ? 427 : 426);
            return 0;
        }
        if(a == 5)
        {
            v.n(428);
            return 0;
        } else
        {
            return -1;
        }
    }

    private final av e(int i1)
    {
        return f(x.a(16, i1));
    }

    public final av a(int i1)
    {
        if(i1 >= 0)
            return f(f(i1));
        else
            return this;
    }

    public final av a(int i1, boolean flag)
    {
        if(flag)
            i = l.size();
        if(i1 >= 0)
            return f(f(i1));
        else
            return this;
    }

    private static Object f(int i1)
    {
        return x.a(ar.d(i1), 16, i1);
    }

    public final av g(String s1)
    {
        v.b();
        return a(-1, s1, 1, 44);
    }

    public final av h(String s1)
    {
        v.b();
        return a(-1, s1, 0, 0);
    }

    public final av a(int i1, String s1, int j1, int k1)
    {
        v.b();
        if(i1 >= 0)
            a(i1);
        return a(s1, j1, k1);
    }

    public final av a(String s1, int i1, int j1)
    {
        v.b();
        return a(s1, i1, j1, -1);
    }

    public final av a(String s1, int i1, int j1, int k1)
    {
        v.b();
        if(s1 != null)
        {
            i1 = x.c(s1 = a(bh.q(), s1, 0, s1.length(), i1, j1, k1));
            for(j1 = 0; j1 < i1; j1++)
                f(s1.elementAt(j1));

            bh.a(s1);
        }
        return this;
    }

    public final av b(int i1)
    {
        s = 5;
        t = i1;
        return this;
    }

    public final av h()
    {
        l.addElement(o);
        return this;
    }

    private av f(Object obj)
    {
        l.addElement(obj);
        m = v.a(m, j, 0);
        j += g(obj);
        if(k < (obj = h(obj)))
            k = ((int) (obj));
        return this;
    }

    private static int g(Object obj)
    {
        if(e(obj))
            return 0;
        if(obj instanceof int[])
            return ((int[])obj)[0] + 2;
        else
            return ((int[])((Object[])obj)[1])[0];
    }

    private static int h(Object obj)
    {
        if(e(obj))
            return 0;
        if(obj instanceof int[])
            return ((int[])obj)[1];
        else
            return ((int[])((Object[])obj)[1])[1];
    }

    private final void a(Vector vector, String s1, ar ar1, int i1, int j1, int k1, int l1, 
            int i2)
    {
        do
        {
            int j2;
            if((j2 = ar1.a(s1, j1, k1)) < (t.f(1509) << 2) / 5)
            {
                vector.addElement(((Object) (x.a(s1, x.a(j2, i1, j1, k1, l1, i2)))));
                return;
            }
            for(j2 = 0; j2 < k1 - 1; j2++)
            {
                if(!a(s1.charAt(j1 + j2)))
                    continue;
                a(vector, s1, ar1, i1, j1, j2 + 1, l1, i2);
                a(vector, s1, ar1, i1, j1 + j2 + 1, k1 - j2 - 1, l1, i2);
                break;
            }

            if(j2 == k1 - 1)
            {
                int k2;
                a(vector, s1, ar1, i1, j1, k2 = k1 >> 1, l1, i2);
                k1 -= k2;
                j1 = j1 + k2;
                i1 = i1;
                ar1 = ar1;
                s1 = s1;
                vector = vector;
                this = this;
            } else
            {
                return;
            }
        } while(true);
    }

    private static final boolean a(char c1)
    {
        return c1 >= ' ' && c1 <= '/' || c1 >= ':' && c1 <= '@' || c1 >= '[' && c1 <= '`' || c1 >= '{' && c1 <= '~';
    }

    private final Vector a(Vector vector, String s1, int i1, int j1, int k1, int l1, int i2)
    {
        if(i1 < j1)
            if(i2 == 1)
            {
                i2 = -1;
                int j2 = -1;
                for(int j3 = 0; j3 < 43; j3++)
                {
                    int j4;
                    String s2;
                    if(null != (s2 = t.c(j3 + 1110)) && (j4 = s1.indexOf(s2, i1)) >= 0 && (j4 < i2 || i2 == -1))
                    {
                        i2 = j4;
                        j2 = j3;
                    }
                }

                if(i2 >= 0 && i2 < j1)
                {
                    a(vector, s1, i1, i2, k1, l1, -1);
                    vector.addElement(x.a(16, 16, j2 + 110));
                    a(vector, s1, i2 + t.c(j2 + 1110).length(), j1, k1, l1, 1);
                } else
                {
                    a(vector, s1, i1, j1, k1, l1, -1);
                }
            } else
            if(i2 == 2 || i2 == 3 || i2 == 4)
            {
                i2 = -1;
                int k2 = -1;
                for(int k3 = 0; k3 < 37; k3++)
                {
                    int k4;
                    String s3;
                    if(null != (s3 = t.c(k3 + 1153)) && (k4 = s1.indexOf(s3, i1)) >= 0 && (k4 < i2 || i2 == -1))
                    {
                        i2 = k4;
                        k2 = k3;
                    }
                }

                if(i2 >= 0 && i2 < j1)
                {
                    a(vector, s1, i1, i2, k1, l1, -1);
                    vector.addElement(x.a(16, 16, k2 + 318));
                    a(vector, s1, i2 + t.c(k2 + 1153).length(), j1, k1, l1, 2);
                } else
                {
                    a(vector, s1, i1, j1, k1, l1, -1);
                }
            } else
            if(i2 == 0)
            {
                i2 = -1;
                int l2 = -1;
                for(int l3 = 0; l3 < 78; l3++)
                {
                    int l4;
                    if((l4 = s1.indexOf(t.c(l3 + 1032), i1)) >= 0 && (l4 < i2 || i2 == -1))
                    {
                        i2 = l4;
                        l2 = l3;
                    }
                }

                if(i2 >= 0 && i2 < j1)
                {
                    a(vector, s1, i1, i2, k1, l1, -1);
                    vector.addElement(x.a(16, 16, l2 >= 74 ? ((int) (l2 != 74 ? ((int) (l2 != 75 ? ((int) (l2 != 76 ? 205 : 210)) : 137)) : 142)) : l2 + 36));
                    a(vector, s1, i2 + t.c(l2 + 1032).length(), j1, k1, l1, 0);
                } else
                {
                    a(vector, s1, i1, j1, k1, l1, -1);
                }
            } else
            if(s1 == t.c(1005))
            {
                i2 = s1.length();
                vector.addElement(((Object) (x.a(s1, x.a(t.l(k1).a(s1, 0, i2), t.p(k1), 0, i2, k1, l1)))));
            } else
            {
                i2 = t.l(k1);
                int i3 = t.p(k1);
                int i4 = i1;
                for(int i5 = i1; i5 <= j1; i5++)
                {
                    if(i5 == j1)
                    {
                        int j5;
                        if((j5 = i5 - i4) > 0)
                            a(vector, s1, i2, i3, i4, j5, k1, l1);
                        break;
                    }
                    char c1;
                    if((c1 = s1.charAt(i5)) == ' ')
                    {
                        if((i1 = (i5 - i4) + 1) > 1)
                            a(vector, s1, i2, i3, i4, i1, k1, l1);
                        i4 = i5 + 1;
                    } else
                    if(c1 == '\r' || c1 == '\n')
                    {
                        if((i1 = i5 - i4) > 0)
                            a(vector, s1, i2, i3, i4, i1, k1, l1);
                        vector.addElement(t.m(1329));
                        i4 = i5 + 1;
                    }
                }

            }
        return vector;
    }

    public final av b(int i1, int j1)
    {
        if(i1 > 1)
            n = j1;
        return this;
    }

    public final boolean i()
    {
        if(t.g(299))
            return r;
        else
            return false;
    }

    public final av j()
    {
        if(t.g(299))
            r = true;
        return this;
    }

    public final av c(int i1, int j1)
    {
        if(t.g(299))
        {
            p = ar.b(i1);
            q = ar.b(j1);
        } else
        {
            p = q = ar.b(i1);
        }
        return this;
    }

    public final av c(int i1)
    {
        c(i1, i1);
        return this;
    }

    public final av d(int i1)
    {
        if(a == 11)
            return this;
        m[0] = 0;
        Vector vector;
        int j1 = x.c(vector = l);
        int k1 = s;
        int l1 = 0;
        int i2 = 0;
        k = 0;
        for(int j2 = 0; j2 < j1; j2++)
        {
            int k2;
            if(d(k2 = ((int) (vector.elementAt(j2)))))
            {
                l1 += i2;
                k += i2;
                m = v.a(m, 0, l1);
                i2 = 1;
                k1 = i1;
            } else
            if(b(k2))
            {
                int l2 = 0;
                k2 = j2;
                while(!c(k1 = ((int) (vector.elementAt(++k2))))) 
                    l2 += g(k1);
                m = v.a(m, 0, 0);
                k1 = i1 - l2 - t;
            } else
            if(c(k2))
            {
                k1 = s;
                l1 += i2;
                k += i2;
                i2 = 0;
                m = v.a(m, 0, 0);
            } else
            {
                int i3 = g(k2);
                k2 = h(k2);
                if(n == 0 && k1 + i3 > i1)
                {
                    k1 = s;
                    l1 += i2;
                    k += i2;
                    i2 = 0;
                }
                m = v.a(m, k1, l1);
                i2 = x.b(i2, k2);
                k1 += i3;
            }
        }

        k += i2;
        return this;
    }

    public final int k()
    {
        int i1 = 0;
        Vector vector;
        for(int j1 = x.c(vector = l); --j1 >= 0;)
            i1 = x.b(i1, m[(j1 << 1) + 1] + g(vector.elementAt(j1)));

        return i1 + 4;
    }

    public final int l()
    {
        if(n != 0)
            return n;
        else
            return j + 4;
    }

    public final int m()
    {
        if(g)
            return k;
        else
            return x.b(k, t.f(1419)) + 4;
    }

    public final void a(ar ar1, int i1, int j1, int k1, boolean flag)
    {
        if(a == 11)
        {
            ar1.a((ar)d, i1, j1);
            return;
        }
        if(!flag && p != 0 && q != 0)
            ar1.a(i1, j1, k1, k + 4, p, q, false);
        flag = x.c(l);
        for(int l1 = 0; l1 < flag; l1++)
        {
            int i2;
            c(i2 = ((int) (l.elementAt(l1))));
            if(d(i2))
            {
                v.i();
                if((i2 = ((Integer)i2).intValue()) != 0)
                {
                    ar1.c(i2);
                    ar1.e(i1, j1 + 4 + m[(l1 << 1) + 1 + 1], k1, 0);
                }
            } else
            if(!b(i2))
                a(ar1, i2, i1 + 2, m[(l1 << 1) + 1], j1 + 2 + m[(l1 << 1) + 1 + 1], k1);
        }

    }

    private final void a(ar ar1, Object obj, int i1, int j1, int k1, int l1)
    {
        j1 = i1 + j1;
        if(obj instanceof int[])
        {
            int ai[];
            if((ai = (int[])obj).length == 3)
            {
                ar1.a(ai[2], ai[2] == 244 ? (i1 + l1) - 16 : j1, k1 + aw.m() + (u ? t.f(1419) / 2 : 0));
                return;
            }
            if(ai.length == 2)
            {
                ar1.c(13).e(j1, k1, l1 - j1 - 3, ai[1]);
                return;
            }
        } else
        {
            String s1 = (String)((Object[])obj)[0];
            obj = (int[])((Object[])obj)[1];
            ar1.a(l1 = t.l(i1 = obj[4])).c(obj[5]).a(s1, obj[2], obj[3], j1, k1);
            if(i1 == 3)
            {
                ar1.e(j1, k1 + (t.f(1419) >> 1), l1.a(s1, obj[2], obj[3]), 0);
                return;
            }
            if(i1 == 5)
                ar1.e(j1, k1 + t.f(1419), l1.a(s1, obj[2], obj[3]), 0);
        }
    }

    public final void a(ar ar1, int i1, int j1)
    {
        int k1 = 15;
        boolean flag = false;
        for(int l1 = 0; l1 < l.size(); l1++)
        {
            Object obj = l.elementAt(l1);
            if(!flag)
                flag = b(obj);
            else
                k1 += g(obj);
        }

        if(k1 > 0)
        {
            i1 = (i1 + t.f(1509)) - k1;
            ar1.c(12);
            ar1.d(i1, j1, k1, m());
        }
    }

    public final void n()
    {
        if(-1 != i)
        {
            int ai[];
            int i1 = (ai = (int[])l.elementAt(i))[2];
            ai[2] = i1 != 24 ? 24 : 25;
        }
    }

    private int i;
    public final int a;
    public String b;
    public int c;
    private int j;
    private int k;
    private Vector l;
    private int m[];
    public Object d;
    public boolean e;
    public boolean f;
    private int n;
    private static Object o;
    private int p;
    private int q;
    private boolean r;
    private int s;
    private int t;
    public boolean g;
    public boolean h;
    private boolean u;
}