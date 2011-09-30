// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 30.09.2011 23:18:42
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 

package main;

import as;
import javax.microedition.midlet.MIDlet;

public final class Midlet extends MIDlet
{

    public Midlet()
    {
    }

    public final void startApp()
    {
        if(!a)
        {
            a = true;
            new as(this, true);
        }
    }

    public final void pauseApp()
    {
        notifyPaused();
    }

    public final void destroyApp(boolean flag)
    {
        new as(null, false);
        notifyDestroyed();
    }

    private boolean a;
}