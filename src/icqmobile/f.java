// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:41
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import javax.microedition.lcdui.*;

public final class f
    implements Runnable, CommandListener
{

    public f(Object obj, int i, int j)
    {
        if(obj != null)
        {
            bf.a(obj, i, j);
            return;
        } else
        {
            bf.a();
            return;
        }
    }

    public f()
    {
    }

    public f(ad ad1, av av1)
    {
        Object aobj[] = (Object[])av1.d;
        b = ((Object) (x.a(ad1, av1)));
        av1 = ((av) (aobj[0]));
        v.i();
        ad1 = (String)av1;
        av1 = ((av) (aobj[1]));
        v.i();
        av1 = ((Integer)av1).intValue();
        if(ad1.length() > av1)
            ad1 = ab.b(ad1, av1);
        av1 = ((av) (aobj[2]));
        v.i();
        av1 = ((av) (aobj[3]));
        v.i();
        ay.a(t.i(), ad1, av1, ((Integer)av1).intValue(), (String)av1, 1022, this);
    }

    public final void commandAction(Command command, Displayable displayable)
    {
        if(b == null)
        {
            String s;
            t.a(1241, s = ab.a((TextBox)displayable));
            t.a(1425, !ab.a(s));
            if(command.getPriority() == 0)
            {
                bh.c();
                return;
            } else
            {
                bh.d();
                return;
            }
        }
        Object aobj[];
        if(command.getPriority() == 0)
            ((av)(aobj = (Object[])b)[1]).a((ad)aobj[0], ((TextBox)displayable).getString());
        t.b(t.d().d());
    }

    public f(int i)
    {
        this(i, null);
    }

    public f(int i, Object obj)
    {
        a = i;
        b = obj;
        (c = new Thread(this)).start();
    }

    public final Thread a()
    {
        return c;
    }

    public final void run()
    {
        try
        {
            switch(a)
            {
            case 0: // '\0'
                bf.b();
                return;

            case 1: // '\001'
                r.a((Object[])b);
                return;

            case 2: // '\002'
                z.g((Object[])b);
                return;

            case 3: // '\003'
                r.Y();
                return;

            case 4: // '\004'
                bh.b((Object[])b);
                return;

            case 5: // '\005'
                u.b((Object[])b);
                return;

            case 6: // '\006'
                v.bt();
                return;

            case 7: // '\007'
                r.l(b);
                return;

            case 8: // '\b'
                ab.B();
                return;

            case 9: // '\t'
                z.r(b);
                return;

            case 10: // '\n'
                v.bv();
                return;

            case 11: // '\013'
                Object obj = b;
                v.i();
                z.g((String)obj);
                return;

            case 12: // '\f'
                Object _tmp = b;
                return;

            case 13: // '\r'
                a.I();
                return;

            case 14: // '\016'
                Object obj1 = b;
                v.i();
                v.j((String)obj1);
                return;

            case 15: // '\017'
                Object obj2 = b;
                v.i();
                v.l((String)obj2);
                return;

            case 16: // '\020'
                Object obj3 = b;
                v.i();
                v.h((String)obj3);
                return;

            case 17: // '\021'
                a.a(b);
                return;

            case 18: // '\022'
                bh.a((String)b);
                return;

            case 19: // '\023'
                z.f((Object[])b);
                return;

            case 20: // '\024'
                r.c((Object[])b);
                return;

            case 21: // '\025'
                z.e((Object[])b);
                return;

            case 22: // '\026'
                r.d((Object[])b);
                return;

            case 23: // '\027'
                Object obj4 = b;
                v.i();
                ay.d((String)obj4);
                return;

            case 24: // '\030'
                bh.c((Object[])b);
                return;

            case 25: // '\031'
                Object _tmp1 = b;
                return;

            case 26: // '\032'
                Object _tmp2 = b;
                return;

            case 27: // '\033'
                v.b((Object[])b);
                return;

            case 28: // '\034'
                Object _tmp3 = b;
                return;

            case 29: // '\035'
                z.b((Object[])b);
                return;

            case 30: // '\036'
                a.a((Object[])b);
                return;

            case 31: // '\037'
                ab.b((Object[])b);
                return;

            case 32: // ' '
                return;

            case 33: // '!'
                ac.a((Object[])b);
                return;

            case 34: // '"'
                a.b((Object[])b);
                return;

            case 35: // '#'
                ac.b((Object[])b);
                return;

            case 36: // '$'
                Object _tmp4 = b;
                v.k();
                return;

            case 37: // '%'
                ae.a((Object[])b);
                return;

            case 38: // '&'
                at.a((Object[])b);
                // fall through

            case 39: // '\''
            default:
                return;
            }
        }
        catch(Throwable _ex)
        {
            return;
        }
    }

    private int a;
    private Object b;
    private Thread c;
}