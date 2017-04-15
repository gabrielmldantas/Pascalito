/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import java.util.*;
import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ATipoEnumerado extends PTipoEnumerado
{
    private final LinkedList<PString> _string_ = new LinkedList<PString>();

    public ATipoEnumerado()
    {
        // Constructor
    }

    public ATipoEnumerado(
        @SuppressWarnings("hiding") List<?> _string_)
    {
        // Constructor
        setString(_string_);

    }

    @Override
    public Object clone()
    {
        return new ATipoEnumerado(
            cloneList(this._string_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoEnumerado(this);
    }

    public LinkedList<PString> getString()
    {
        return this._string_;
    }

    public void setString(List<?> list)
    {
        for(PString e : this._string_)
        {
            e.parent(null);
        }
        this._string_.clear();

        for(Object obj_e : list)
        {
            PString e = (PString) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._string_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._string_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._string_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PString> i = this._string_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PString) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
