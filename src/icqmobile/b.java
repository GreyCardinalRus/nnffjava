// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:40
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.Vector;
import javax.microedition.lcdui.*;

public final class b extends Canvas
    implements CommandListener
{

    public b(int i1, int j1)
    {
        g = i1;
        h = j1;
        i = getWidth();
        j = getHeight();
        c = new ar();
        b();
        t.f(f(), e());
        t.b(this);
    }

    public static int a()
    {
        return !v.F(3) ? 25 : 500;
    }

    private int e()
    {
        if(m)
            return h;
        else
            return j;
    }

    private int f()
    {
        if(m)
            return g;
        else
            return i;
    }

    public final void hideNotify()
    {
        f = false;
        bh.f();
        v.a[0] = 0L;
    }

    public final void showNotify()
    {
        f = true;
        bh.f();
        v.a(0, v.aq());
    }

    public final boolean isShown()
    {
        return f && super.isShown();
    }

    public final void b()
    {
        boolean flag;
        if(flag = t.g(71))
        {
            if(a != null)
            {
                removeCommand(a);
                a = null;
            }
            if(b != null)
            {
                removeCommand(b);
                b = null;
            }
        }
        setFullScreenMode(flag);
        m = flag;
        t.f(f(), e());
    }

    public final void paint(Graphics g1)
    {
        Graphics g2 = g1;
        g1 = c;
        c.b = g2;
        bf.a(g1);
    }

    public final void keyPressed(int i1)
    {
        a(i1, 0);
    }

    public final void keyRepeated(int i1)
    {
        if(t.n(1228).size() < 3)
            a(i1, 1);
    }

    public final void keyReleased(int i1)
    {
        v.a(3, 10000L);
        bh.f();
    }

    private final String a(int i1)
    {
        try
        {
            return getKeyName(i1).toUpperCase();
        }
        catch(Throwable _ex)
        {
            return t.i();
        }
    }

    private final void a(int i1, int j1)
    {
        v.E(0x7fffffff);
        v.a(0, v.aq());
        v.a(3, 10000L);
        int k1 = 0;
        boolean flag = t.g(1485);
        try
        {
            k1 = getGameAction(i1);
        }
        catch(Throwable _ex) { }
        if(k1 == 1 || k1 == 2 || k1 == 5 || k1 == 6)
        {
            bh.a(i1, k1, j1);
            return;
        }
        if(k1 == 8 && (i1 == -6 || i1 == -7 || i1 == -1 || i1 == -4))
            k1 = 0;
        if(k1 == 8)
            if(flag)
            {
                t.a(218, false);
                bh.c();
                return;
            } else
            {
                bh.e();
                return;
            }
        if(i1 >= 48 && i1 <= 57 || i1 == 42 || i1 == 35)
        {
            bh.a(i1, k1, j1);
            return;
        }
        try
        {
            if(j1 == 0 && t.g(71))
            {
                j1 = a(i1);
                if(i1 == -6 || j1.indexOf("SEND") >= 0 || j1.indexOf("SOFT1") >= 0 || j1.equals("SOFTKEY 1"))
                {
                    bh.c();
                    return;
                }
                if(i1 == -7 || i1 == 11 || j1.indexOf("CLEAR") >= 0 || j1.indexOf("SOFT2") >= 0 || j1.equals("SOFTKEY 4"))
                {
                    if(flag)
                        t.a(218, false);
                    bh.d();
                    return;
                }
                if(flag)
                {
                    t.a(218, false);
                    bh.c();
                    return;
                }
            }
            return;
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    public final void pointerPressed(int i1, int j1)
    {
        k = i1;
        l = j1;
        v.a(3, 10000L);
        v.a(0, v.aq());
        bh.a(i1, j1);
        n = System.currentTimeMillis();
        o = false;
        v.E(0x7fffffff);
    }

    public final void pointerDragged(int i1, int j1)
    {
        if(x.d(i1 - k) > 5 || x.d(j1 - l) > 5)
        {
            bh.a(i1, j1, k, l);
            o = true;
        }
    }

    public final void pointerReleased(int i1, int j1)
    {
        bh.a(i1, j1, k, l, o);
        n = 0L;
    }

    private static final void g()
    {
        if(!o && n != 0L && System.currentTimeMillis() - n > 600L)
        {
            bh.b(k, l);
            n = 0L;
        }
    }

    public static final void c()
    {
        g();
    }

    public final void commandAction(Command command, Displayable displayable)
    {
        v.a(3, 10000L);
        if(command != null)
        {
            if(command == a)
            {
                bh.c();
                return;
            }
            if(command == b)
                bh.d();
        }
    }

    public final b d()
    {
        String s = d;
        d = null;
        String s1 = e;
        e = null;
        a(s, s1);
        return this;
    }

    public final void a(String s, String s1)
    {
        if(d == s && e == s1)
            return;
        d = s;
        e = s1;
        if(a != null)
            removeCommand(a);
        if(b != null)
            removeCommand(b);
        boolean flag = t.g(65);
        if(s != null)
            addCommand(a = new Command(s, flag ? 3 : 4, 1));
        if(s1 != null)
            addCommand(b = new Command(s1, flag ? 4 : 3, 1));
        setCommandListener(this);
        bf.c = true;
    }

    private Command a;
    private Command b;
    private ar c;
    private String d;
    private String e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private static int k;
    private static int l;
    private boolean m;
    private static long n;
    private static boolean o;
}