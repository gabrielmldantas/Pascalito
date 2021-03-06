/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import java.util.*;
import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ADeclaracaoFuncao extends PDeclaracaoFuncao
{
    private PId _id_;
    private final LinkedList<PParametroFormal> _parametroFormal_ = new LinkedList<PParametroFormal>();
    private PTipoIdOuPrimitivo _tipoIdOuPrimitivo_;
    private PBloco _bloco_;

    public ADeclaracaoFuncao()
    {
        // Constructor
    }

    public ADeclaracaoFuncao(
        @SuppressWarnings("hiding") PId _id_,
        @SuppressWarnings("hiding") List<?> _parametroFormal_,
        @SuppressWarnings("hiding") PTipoIdOuPrimitivo _tipoIdOuPrimitivo_,
        @SuppressWarnings("hiding") PBloco _bloco_)
    {
        // Constructor
        setId(_id_);

        setParametroFormal(_parametroFormal_);

        setTipoIdOuPrimitivo(_tipoIdOuPrimitivo_);

        setBloco(_bloco_);

    }

    @Override
    public Object clone()
    {
        return new ADeclaracaoFuncao(
            cloneNode(this._id_),
            cloneList(this._parametroFormal_),
            cloneNode(this._tipoIdOuPrimitivo_),
            cloneNode(this._bloco_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclaracaoFuncao(this);
    }

    public PId getId()
    {
        return this._id_;
    }

    public void setId(PId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
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
            + toString(this._id_)
            + toString(this._parametroFormal_)
            + toString(this._tipoIdOuPrimitivo_)
            + toString(this._bloco_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._parametroFormal_.remove(child))
        {
            return;
        }

        if(this._tipoIdOuPrimitivo_ == child)
        {
            this._tipoIdOuPrimitivo_ = null;
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
        if(this._id_ == oldChild)
        {
            setId((PId) newChild);
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

        if(this._tipoIdOuPrimitivo_ == oldChild)
        {
            setTipoIdOuPrimitivo((PTipoIdOuPrimitivo) newChild);
            return;
        }

        if(this._bloco_ == oldChild)
        {
            setBloco((PBloco) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
