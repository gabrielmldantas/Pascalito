/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ATipoSubrange extends PTipoSubrange
{
    private PConstante _inicio_;
    private PConstante _fim_;

    public ATipoSubrange()
    {
        // Constructor
    }

    public ATipoSubrange(
        @SuppressWarnings("hiding") PConstante _inicio_,
        @SuppressWarnings("hiding") PConstante _fim_)
    {
        // Constructor
        setInicio(_inicio_);

        setFim(_fim_);

    }

    @Override
    public Object clone()
    {
        return new ATipoSubrange(
            cloneNode(this._inicio_),
            cloneNode(this._fim_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoSubrange(this);
    }

    public PConstante getInicio()
    {
        return this._inicio_;
    }

    public void setInicio(PConstante node)
    {
        if(this._inicio_ != null)
        {
            this._inicio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inicio_ = node;
    }

    public PConstante getFim()
    {
        return this._fim_;
    }

    public void setFim(PConstante node)
    {
        if(this._fim_ != null)
        {
            this._fim_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fim_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inicio_)
            + toString(this._fim_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inicio_ == child)
        {
            this._inicio_ = null;
            return;
        }

        if(this._fim_ == child)
        {
            this._fim_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inicio_ == oldChild)
        {
            setInicio((PConstante) newChild);
            return;
        }

        if(this._fim_ == oldChild)
        {
            setFim((PConstante) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
