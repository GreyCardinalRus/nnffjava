// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:41
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

import java.util.*;

public final class d
{

    public d()
    {
        c = new Hashtable();
        d = bh.q();
        b = 27;
    }

    public d(int i)
    {
        c = new Hashtable();
        d = bh.q();
        b = i;
    }

    private final void b()
    {
        if(d.isEmpty())
        {
            return;
        } else
        {
            Object obj = d.lastElement();
            d.removeElement(obj);
            c.remove(obj);
            a--;
            return;
        }
    }

    private final void c(Object obj)
    {
        d.removeElement(obj);
        d.insertElementAt(obj, 0);
    }

    public final synchronized void a(Object obj, Object obj1)
    {
        if(a >= b)
            b();
        if(!c.containsKey(obj))
        {
            c.put(obj, obj1);
            d.insertElementAt(obj, 0);
            a++;
            return;
        } else
        {
            c.put(obj, obj1);
            c(obj);
            return;
        }
    }

    public final synchronized Object a(Object obj)
    {
        Object obj1;
        if((obj1 = c.get(obj)) != null)
        {
            e++;
            c(obj);
        } else
        {
            f++;
        }
        return obj1;
    }

    public final synchronized void b(Object obj)
    {
        if(d.contains(obj))
        {
            d.removeElement(obj);
            c.remove(obj);
            a--;
        }
    }

    public final synchronized Enumeration a()
    {
        return d.elements();
    }

    private int a;
    private int b;
    private Hashtable c;
    private Vector d;
    private long e;
    private long f;
}