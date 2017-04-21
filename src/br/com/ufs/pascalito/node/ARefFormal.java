/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import java.util.*;
import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ARefFormal extends PRefFormal
{
    private final LinkedList<PId> _id_ = new LinkedList<PId>();
    private PTipoIdOuPrimitivo _tipoIdOuPrimitivo_;

    public ARefFormal()
    {
        // Constructor
    }

    public ARefFormal(
        @SuppressWarnings("hiding") List<?> _id_,
        @SuppressWarnings("hiding") PTipoIdOuPrimitivo _tipoIdOuPrimitivo_)
    {
        // Constructor
        setId(_id_);

        setTipoIdOuPrimitivo(_tipoIdOuPrimitivo_);

    }

    @Override
    public Object clone()
    {
        return new ARefFormal(
            cloneList(this._id_),
            cloneNode(this._tipoIdOuPrimitivo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARefFormal(this);
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

    public PTipoIdOuPrimitivo getTipoIdOuPrimitivo()
    {
        return this._tipoIdOuPrimitivo_;
    }

    public void setTipoIdOuPrimitivo(PTipoIdOuPrimitivo node)
    {
        if(this._tipoIdOuPrimitivo_ != null)
        {
            this._tipoIdOuPrimitivo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoIdOuPrimitivo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._tipoIdOuPrimitivo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_.remove(child))
        {
            return;
        }

        if(this._tipoIdOuPrimitivo_ == child)
        {
            this._tipoIdOuPrimitivo_ = null;
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

        if(this._tipoIdOuPrimitivo_ == oldChild)
        {
            setTipoIdOuPrimitivo((PTipoIdOuPrimitivo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
