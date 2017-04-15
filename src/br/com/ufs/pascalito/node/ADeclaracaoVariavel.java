/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import java.util.*;
import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ADeclaracaoVariavel extends PDeclaracaoVariavel
{
    private final LinkedList<PString> _string_ = new LinkedList<PString>();
    private PDenotadorTipo _denotadorTipo_;

    public ADeclaracaoVariavel()
    {
        // Constructor
    }

    public ADeclaracaoVariavel(
        @SuppressWarnings("hiding") List<?> _string_,
        @SuppressWarnings("hiding") PDenotadorTipo _denotadorTipo_)
    {
        // Constructor
        setString(_string_);

        setDenotadorTipo(_denotadorTipo_);

    }

    @Override
    public Object clone()
    {
        return new ADeclaracaoVariavel(
            cloneList(this._string_),
            cloneNode(this._denotadorTipo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclaracaoVariavel(this);
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
            + toString(this._string_)
            + toString(this._denotadorTipo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._string_.remove(child))
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

        if(this._denotadorTipo_ == oldChild)
        {
            setDenotadorTipo((PDenotadorTipo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}