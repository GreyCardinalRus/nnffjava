// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:10:29
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.*;
import javax.microedition.io.Datagram;
import javax.microedition.io.DatagramConnection;

public final class ac
    implements al
{

    public ac(byte byte0)
    {
        d = 5;
        c = true;
        a = bh.q();
        e = new am();
    }

    public final void a(al al1)
    {
        a.addElement(al1);
        e.a = -1;
    }

    public final int t_()
    {
        return d;
    }

    public final boolean u_()
    {
        return c && a.size() > 0;
    }

    public final void c()
    {
        c = false;
    }

    public final void d()
    {
        c = true;
    }

    private final al c(int i)
    {
        return (al)a.elementAt(i);
    }

    public final int e()
    {
        long l1 = 0L;
        int i;
        for(int i1 = i = a.size(); --i1 >= 0;)
            l1 += c(i1).e();

        return (int)(l1 / (long)i);
    }

    public final int f()
    {
        long l1 = 0L;
        int i;
        for(int i1 = i = a.size(); --i1 >= 0;)
            l1 += c(i1).f();

        return (int)(l1 / (long)i);
    }

    public final int a(int i)
    {
        return e.a(i, this);
    }

    public final int b(int i)
    {
        return e.b(i, this);
    }

    public final String v_()
    {
        StringBuffer stringbuffer = bh.r();
        int i = a.size();
        if(d == 5)
            stringbuffer.append(t.c(444)).append(i);
        else
            stringbuffer.append(((al)a.firstElement()).v_()).append(t.c(445)).append(--i).append(t.c(441 + x.k(i)));
        return bh.b(stringbuffer);
    }

    public final int h()
    {
        return 10;
    }

    public final boolean x_()
    {
        return true;
    }

    public ac()
    {
    }

    public static Object[] a(az az1)
    {
        new f(33, az1 = ((az) (x.a(az1))));
        return az1;
    }

    public static void a(Object aobj[])
    {
        Object obj;
        az az1;
        try
        {
            if((obj = a(((ba) ((az)aobj[0])).i)) != null && ((String) (obj)).indexOf(':') > 0)
            {
                obj = x.b(((String) (obj)), ':');
                ((az)aobj[0]).c(x.a(((Vector) (obj)), 0), Integer.parseInt(x.a(((Vector) (obj)), 1)));
                bh.a(((Vector) (obj)));
                return;
            } else
            {
                az1 = (az)aobj[0];
                az1.c(az1.c(), 5222);
                return;
            }
        }
        catch(Throwable throwable)
        {
            ((az)aobj[0]).a(throwable);
        }
    }

    private static String a(String s1)
    {
        return b(ab.b(0x121bea, ab.c(s1, ab.d(s1) + 1)));
    }

    private static String b(String s1)
    {
        DatagramConnection datagramconnection = null;
        String s3;
        DatagramConnection datagramconnection1;
        v.bS();
        s1 = x.b(s1, '.');
        s s2 = (new s()).c(0xc1c18);
        for(int i = 0; i < x.c(s1); i++)
            s2.j(x.a(s1, i));

        bh.a(s1);
        s2.c(0x51c24);
        datagramconnection1 = (DatagramConnection)a.c(t.c(0x1c1bfc));
        datagramconnection = datagramconnection1;
        datagramconnection1.send(datagramconnection1.newDatagram(s2.a, s2.b));
        s2.c();
        datagramconnection.receive(s1 = datagramconnection.newDatagram(512));
        s3 = a(s1.getData());
        a.a(datagramconnection);
        v.bT();
        return s3;
        Exception exception;
        exception;
        a.a(datagramconnection);
        v.bT();
        throw exception;
    }

    private static String a(byte abyte0[])
    {
        (abyte0 = (new s()).b(abyte0)).g(6);
        if(abyte0.x() <= 0)
            return null;
        abyte0.g();
        int i;
        while((i = abyte0.t()) != 0) 
            while(--i >= 0) 
                abyte0.t();
        abyte0.g(20);
        i = abyte0.x();
        s s1 = new s();
        int i1 = abyte0.t();
        do
        {
            while(--i1 >= 0) 
                s1.f(abyte0.t());
            if((i1 = abyte0.t()) != 0)
                s1.f(46);
            else
                return s1.f(58).v(i).d();
        } while(true);
    }

    public static final void j()
    {
        t.a(1254, ((Object) (new Object[] {
            null, z.h[0]
        })));
    }

    public static final void b(Object aobj[])
    {
        try
        {
            if(aobj == null)
            {
                m();
                return;
            }
            switch(((Integer)aobj[0]).intValue())
            {
            case 1: // '\001'
                return;

            case 3: // '\003'
                c(aobj);
                return;

            case 4: // '\004'
                d(aobj);
                // fall through

            case 2: // '\002'
            default:
                return;
            }
        }
        catch(Throwable _ex)
        {
            a(t.c(914));
        }
        u.a();
    }

    private static void m()
    {
        Vector vector = x.b(t.i(), ' ');
        Vector vector1 = new Vector();
        Vector vector2 = new Vector();
        if(vector.size() > 0)
        {
            for(Enumeration enumeration = vector.elements(); enumeration.hasMoreElements(); enumeration.nextElement())
                vector1.addElement(new Integer(0));

        } else
        {
            vector = null;
            vector1 = null;
        }
        Integer integer = new Integer(vector != null && vector.size() != 0 ? 1 : 3);
        Object aobj[] = {
            integer, null, vector, vector1, vector2, null, x.n(t.c(1369)) ? t.c(1369) : ab.b(x.f(), 8), new Integer(0), new String(), null
        };
        new f(35, ((Object) (aobj)));
    }

    private static final void a(Object obj)
    {
        v.i();
        Object aobj[];
        if((aobj = (Object[])t.m(1254)) != null)
            aobj[0] = obj;
    }

    public static final Object k()
    {
        Object aobj[];
        if((aobj = (Object[])t.m(1254)) == null)
            return null;
        else
            return aobj[0];
    }

    public static final Object l()
    {
        Object aobj[];
        if((aobj = (Object[])t.m(1254)) == null)
            return null;
        else
            return aobj[1];
    }

    private static boolean b(Object obj)
    {
        return (obj instanceof String) && ab.a(0x60ee3, (String)obj);
    }

    private static void c(Object aobj[])
    {
        w w1;
        v.bS();
        w1 = u.a;
        int i;
        Object obj1;
        Object obj4;
        byte abyte0[];
        boolean flag = false;
        Object obj = t.c(0x220a75);
        obj = bh.r().append(((String) (obj))).append(t.c(0x100be3)).append(t.c(0xc0cff));
        if(t.g(1560))
            ((StringBuffer) (obj)).append(t.c(0x1b0c87)).append(t.c(0x80cb7));
        else
            ((StringBuffer) (obj)).append(t.c(0xf0cbf)).append(t.c(0x70d7e));
        ((StringBuffer) (obj)).append(t.c(0x120afe));
        ((StringBuffer) (obj1 = bh.r())).append(t.c(0x90d85)).append(aobj[6]);
        if(b != null)
        {
            ((StringBuffer) (obj1)).append(t.c(0x150efa)).append(b);
            b = null;
        }
        ((StringBuffer) (obj1)).append(t.c(0x60d8e)).append(ay.d(x.h(t.c(1313)))).append(t.c(0x90d94)).append(ay.d(x.h(t.c(1312)))).append(t.c(0x40d9d)).append(ay.d(x.h(t.c(1311))));
        if(x.n(t.c(1368)))
            ((StringBuffer) (obj)).append(t.c(0x80ddf)).append(t.c(1368));
        if(x.n(t.c(1367)))
            ((StringBuffer) (obj)).append(t.c(0x90dd6)).append(t.c(1367));
        if(x.n(t.c(1366)))
            ((StringBuffer) (obj)).append(t.c(0xb0dcb)).append(t.c(1366));
        t.h(1366);
        t.h(1367);
        t.h(1368);
        t.h(1369);
        if(t.g(1560))
        {
            Object obj2 = null;
            v.by().h = true;
        }
        if(w1 == null)
        {
            Object obj3 = null;
            u.a = w1 = w.a(bh.b(((StringBuffer) (obj))), 1);
        } else
        {
            w1.a(bh.b(((StringBuffer) (obj))));
        }
        obj = new Hashtable();
        obj4 = t.c(0x301d91);
        long l1 = ((StringBuffer) (obj1)).length();
        bi bi1;
        if((bi1 = t.n()) != null && null != bi1.k())
            ((Hashtable) (obj)).put(t.c(0x6106a), bi1.k());
        ((Hashtable) (obj)).put(t.c(0xc1005), obj4);
        ((Hashtable) (obj)).put(t.c(0xe1022), ab.e(Long.toString(l1)));
        obj4 = 0;
        w1.a(w1, bh.a(0x54534f50L), ((Hashtable) (obj)));
        w1.a(abyte0 = ((StringBuffer) (obj1)).toString().getBytes(), abyte0.length);
        if((i = w1.b()) != 200)
            break MISSING_BLOCK_LABEL_711;
        obj4 = null;
        ((Vector)(i = ((int) (ab.b(w1.c()))))).size();
        obj1 = ab.e(i, 1);
        obj4 = ab.d(i, 2);
        if(!b(obj1))
            break MISSING_BLOCK_LABEL_596;
        aobj[0] = new Integer(4);
        new f(35, ((Object) (aobj)));
        if(w1.f())
        {
            i = w1;
            try
            {
                i.a();
            }
            catch(Throwable _ex) { }
            obj4 = null;
            u.a = null;
        }
        v.bT();
        return;
        aobj = ab.b(obj4, 0x51d58) == null ? ((Object []) (t.i())) : ((Object []) (ab.b(obj4, 0x51d58)));
        i = ((int) (ab.d(i, 2)));
        i = null == ab.a(i, t.c(0x111e00)) ? 0 : ab.b(i, t.c(0x111e00));
        if(ab.a(0x20b30, ((String) (obj1))))
        {
            if(((String) (aobj)).length() == 0)
                a(t.c(0x41cf2));
            else
            if(i == 1)
                a(t.c(0x71df9));
            else
                a(((Object) (aobj)));
        } else
        {
            throw new Throwable();
        }
        break MISSING_BLOCK_LABEL_726;
        new Integer(i);
        throw new Throwable();
        if(w1.f())
        {
            w w2 = w1;
            try
            {
                w2.a();
            }
            catch(Throwable _ex) { }
            Object obj5 = null;
            u.a = null;
        }
        v.bT();
        return;
        Exception exception;
        exception;
        if(w1.f())
        {
            w w3 = w1;
            try
            {
                w3.a();
            }
            catch(Throwable _ex) { }
            Object obj6 = null;
            u.a = null;
        }
        v.bT();
        throw exception;
    }

    private static void d(Object aobj[])
    {
        Integer integer;
        if((integer = (Integer)aobj[9]) == null)
            integer = new Integer(0);
        else
            integer = new Integer(integer.intValue() + 1);
        aobj[9] = integer;
        if(integer.intValue() > 3)
        {
            throw new Throwable();
        } else
        {
            u.a(t.n());
            aobj[0] = new Integer(1);
            new f(35, ((Object) (aobj)));
            return;
        }
    }

    private boolean c;
    public Vector a;
    private int d;
    private am e;
    public static String b;
}