// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:41
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.io.IOException;
import javax.microedition.io.ConnectionNotFoundException;

public final class g
{

    public g(int i)
    {
        this(t.c(i));
    }

    public g(String s1)
    {
        f = s1;
        b = new s();
        c = new s();
        a = 1;
        r.a(this);
    }

    public final int a()
    {
        if(d != null)
            throw d;
        else
            return a;
    }

    public final void a(s s1)
    {
        if(d != null)
        {
            throw new RuntimeException();
        } else
        {
            c.h(s1);
            return;
        }
    }

    public final void b(s s1)
    {
        synchronized(e)
        {
            if(b.b > 0)
                b.g(s1);
            else
            if(d != null)
                throw d;
        }
    }

    public final void b()
    {
        switch(a)
        {
        case 1: // '\001'
            f();
            return;

        case 2: // '\002'
            g();
            h();
            return;

        case 3: // '\003'
            g();
            h();
            bh.a(e, false);
            a = 0;
            return;
        }
        r.b(this);
    }

    private final void f()
    {
        try
        {
            e = bh.a(bh.f(0x9135f).f(f).d(), t.g(112));
            if(a == 1)
                a = 2;
            f = null;
            return;
        }
        catch(Throwable throwable)
        {
            a = -1;
            d = throwable;
            bh.a(e, false);
            return;
        }
    }

    private final void g()
    {
        try
        {
            if(a == 2)
                b.b(e);
            return;
        }
        catch(Throwable throwable)
        {
            a = -1;
            d = throwable;
            bh.a(e, false);
            return;
        }
    }

    private final void h()
    {
        try
        {
            if(a == 2)
                c.a(e);
            return;
        }
        catch(Throwable throwable)
        {
            a = -1;
            d = throwable;
            bh.a(e, false);
            return;
        }
    }

    public final String c()
    {
        return bh.b(bh.r().append(d).append('\n').append(t.c(917)));
    }

    public final boolean d()
    {
        return d != null && (d instanceof IOException);
    }

    public final String e()
    {
        Throwable throwable;
        if((throwable = d) == null)
            return t.c(916);
        else
            return bh.b(bh.r().append(throwable).append(t.c(911)).append(t.c((throwable instanceof IllegalArgumentException) ? 912 : ((int) ((throwable instanceof ConnectionNotFoundException) ? 913 : ((int) ((throwable instanceof IOException) ? 914 : ((int) ((throwable instanceof SecurityException) ? 915 : 461)))))))));
    }

    private s b;
    private s c;
    private Throwable d;
    public int a;
    private Object e[];
    private String f;
}