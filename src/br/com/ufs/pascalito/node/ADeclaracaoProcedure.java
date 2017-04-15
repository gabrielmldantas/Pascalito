/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import java.util.*;
import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ADeclaracaoProcedure extends PDeclaracaoProcedure
{
    private PString _string_;
    private final LinkedList<PParametroFormal> _parametroFormal_ = new LinkedList<PParametroFormal>();
    private PBloco _bloco_;

    public ADeclaracaoProcedure()
    {
        // Constructor
    }

    public ADeclaracaoProcedure(
        @SuppressWarnings("hiding") PString _string_,
        @SuppressWarnings("hiding") List<?> _parametroFormal_,
        @SuppressWarnings("hiding") PBloco _bloco_)
    {
        // Constructor
        setString(_string_);

        setParametroFormal(_parametroFormal_);

        setBloco(_bloco_);

    }

    @Override
    public Object clone()
    {
        return new ADeclaracaoProcedure(
            cloneNode(this._string_),
            cloneList(this._parametroFormal_),
            cloneNode(this._bloco_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclaracaoProcedure(this);
    }

    public PString getString()
    {
        return this._string_;
    }

    public void setString(PString node)
    {
        if(this._string_ != null)
        {
            this._string_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._string_ = node;
    }

    public LinkedList<PParametroFormal> getParametroFormal()
    {
        return this._parametroFormal_;
    }

    public void setParametroFormal(List<?> list)
    {
        for(PParametroFormal e : this._parametroFormal_)
        {
            e.parent(null);
        }
        this._parametroFormal_.clear();

        for(Object obj_e : list)
        {
            PParametroFormal e = (PParametroFormal) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._parametroFormal_.add(e);
        }
    }

    public PBloco getBloco()
    {
        return this._bloco_;
    }

    public void setBloco(PBloco node)
    {
        if(this._bloco_ != null)
        {
            this._bloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bloco_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._string_)
            + toString(this._parametroFormal_)
            + toString(this._bloco_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._string_ == child)
        {
            this._string_ = null;
            return;
        }

        if(this._parametroFormal_.remove(child))
        {
            return;
        }

        if(this._bloco_ == child)
        {
            this._bloco_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._string_ == oldChild)
        {
            setString((PString) newChild);
            return;
        }

        for(ListIterator<PParametroFormal> i = this._parametroFormal_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParametroFormal) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._bloco_ == oldChild)
        {
            setBloco((PBloco) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
