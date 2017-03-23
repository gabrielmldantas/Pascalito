/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AParametrosReais extends PParametrosReais
{
    private TAbreParenteses _abreParenteses_;
    private PDefinicaoParametrosReais _definicaoParametrosReais_;
    private TFechaParenteses _fechaParenteses_;

    public AParametrosReais()
    {
        // Constructor
    }

    public AParametrosReais(
        @SuppressWarnings("hiding") TAbreParenteses _abreParenteses_,
        @SuppressWarnings("hiding") PDefinicaoParametrosReais _definicaoParametrosReais_,
        @SuppressWarnings("hiding") TFechaParenteses _fechaParenteses_)
    {
        // Constructor
        setAbreParenteses(_abreParenteses_);

        setDefinicaoParametrosReais(_definicaoParametrosReais_);

        setFechaParenteses(_fechaParenteses_);

    }

    @Override
    public Object clone()
    {
        return new AParametrosReais(
            cloneNode(this._abreParenteses_),
            cloneNode(this._definicaoParametrosReais_),
            cloneNode(this._fechaParenteses_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParametrosReais(this);
    }

    public TAbreParenteses getAbreParenteses()
    {
        return this._abreParenteses_;
    }

    public void setAbreParenteses(TAbreParenteses node)
    {
        if(this._abreParenteses_ != null)
        {
            this._abreParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreParenteses_ = node;
    }

    public PDefinicaoParametrosReais getDefinicaoParametrosReais()
    {
        return this._definicaoParametrosReais_;
    }

    public void setDefinicaoParametrosReais(PDefinicaoParametrosReais node)
    {
        if(this._definicaoParametrosReais_ != null)
        {
            this._definicaoParametrosReais_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._definicaoParametrosReais_ = node;
    }

    public TFechaParenteses getFechaParenteses()
    {
        return this._fechaParenteses_;
    }

    public void setFechaParenteses(TFechaParenteses node)
    {
        if(this._fechaParenteses_ != null)
        {
            this._fechaParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaParenteses_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._abreParenteses_)
            + toString(this._definicaoParametrosReais_)
            + toString(this._fechaParenteses_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._abreParenteses_ == child)
        {
            this._abreParenteses_ = null;
            return;
        }

        if(this._definicaoParametrosReais_ == child)
        {
            this._definicaoParametrosReais_ = null;
            return;
        }

        if(this._fechaParenteses_ == child)
        {
            this._fechaParenteses_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._abreParenteses_ == oldChild)
        {
            setAbreParenteses((TAbreParenteses) newChild);
            return;
        }

        if(this._definicaoParametrosReais_ == oldChild)
        {
            setDefinicaoParametrosReais((PDefinicaoParametrosReais) newChild);
            return;
        }

        if(this._fechaParenteses_ == oldChild)
        {
            setFechaParenteses((TFechaParenteses) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}