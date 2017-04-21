/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import java.util.*;
import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ATipoEnumerado extends PTipoEnumerado
{
    private final LinkedList<PId> _id_ = new LinkedList<PId>();

    public ATipoEnumerado()
    {
        // Constructor
    }

    public ATipoEnumerado(
        @SuppressWarnings("hiding") List<?> _id_)
    {
        // Constructor
        setId(_id_);

    }

    @Override
    public Object clone()
    {
        return new ATipoEnumerado(
            cloneList(this._id_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoEnumerado(this);
    }

    public LinkedList<PId> getId()
    {
        return this._id_;
    }

    public void setId(List<?> list)
    {
        for(PId e : this._id_)
        {
            e.parent(null);
        }
        this._id_.clear();

        for(Object obj_e : list)
        {
            PId e = (PId) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._id_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PId> i = this._id_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PId) newChild);
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
