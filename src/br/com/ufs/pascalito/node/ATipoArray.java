/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import java.util.*;
import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ATipoArray extends PTipoArray
{
    private final LinkedList<PTipoIdOuOrdinal> _tipoIdOuOrdinal_ = new LinkedList<PTipoIdOuOrdinal>();
    private PDenotadorTipo _denotadorTipo_;

    public ATipoArray()
    {
        // Constructor
    }

    public ATipoArray(
        @SuppressWarnings("hiding") List<?> _tipoIdOuOrdinal_,
        @SuppressWarnings("hiding") PDenotadorTipo _denotadorTipo_)
    {
        // Constructor
        setTipoIdOuOrdinal(_tipoIdOuOrdinal_);

        setDenotadorTipo(_denotadorTipo_);

    }

    @Override
    public Object clone()
    {
        return new ATipoArray(
            cloneList(this._tipoIdOuOrdinal_),
            cloneNode(this._denotadorTipo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoArray(this);
    }

    public LinkedList<PTipoIdOuOrdinal> getTipoIdOuOrdinal()
    {
        return this._tipoIdOuOrdinal_;
    }

    public void setTipoIdOuOrdinal(List<?> list)
    {
        for(PTipoIdOuOrdinal e : this._tipoIdOuOrdinal_)
        {
            e.parent(null);
        }
        this._tipoIdOuOrdinal_.clear();

        for(Object obj_e : list)
        {
            PTipoIdOuOrdinal e = (PTipoIdOuOrdinal) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._tipoIdOuOrdinal_.add(e);
        }
    }

    public PDenotadorTipo getDenotadorTipo()
    {
        return this._denotadorTipo_;
    }

    public void setDenotadorTipo(PDenotadorTipo node)
    {
        if(this._denotadorTipo_ != null)
        {
            this._denotadorTipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._denotadorTipo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoIdOuOrdinal_)
            + toString(this._denotadorTipo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoIdOuOrdinal_.remove(child))
        {
            return;
        }

        if(this._denotadorTipo_ == child)
        {
            this._denotadorTipo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PTipoIdOuOrdinal> i = this._tipoIdOuOrdinal_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PTipoIdOuOrdinal) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._denotadorTipo_ == oldChild)
        {
            setDenotadorTipo((PDenotadorTipo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
