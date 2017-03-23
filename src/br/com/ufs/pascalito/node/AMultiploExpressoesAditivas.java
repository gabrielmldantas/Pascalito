/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AMultiploExpressoesAditivas extends PExpressoesAditivas
{
    private TOperadorAditivo _operadorAditivo_;
    private PTermo _termo_;

    public AMultiploExpressoesAditivas()
    {
        // Constructor
    }

    public AMultiploExpressoesAditivas(
        @SuppressWarnings("hiding") TOperadorAditivo _operadorAditivo_,
        @SuppressWarnings("hiding") PTermo _termo_)
    {
        // Constructor
        setOperadorAditivo(_operadorAditivo_);

        setTermo(_termo_);

    }

    @Override
    public Object clone()
    {
        return new AMultiploExpressoesAditivas(
            cloneNode(this._operadorAditivo_),
            cloneNode(this._termo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiploExpressoesAditivas(this);
    }

    public TOperadorAditivo getOperadorAditivo()
    {
        return this._operadorAditivo_;
    }

    public void setOperadorAditivo(TOperadorAditivo node)
    {
        if(this._operadorAditivo_ != null)
        {
            this._operadorAditivo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operadorAditivo_ = node;
    }

    public PTermo getTermo()
    {
        return this._termo_;
    }

    public void setTermo(PTermo node)
    {
        if(this._termo_ != null)
        {
            this._termo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._operadorAditivo_)
            + toString(this._termo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._operadorAditivo_ == child)
        {
            this._operadorAditivo_ = null;
            return;
        }

        if(this._termo_ == child)
        {
            this._termo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._operadorAditivo_ == oldChild)
        {
            setOperadorAditivo((TOperadorAditivo) newChild);
            return;
        }

        if(this._termo_ == oldChild)
        {
            setTermo((PTermo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}