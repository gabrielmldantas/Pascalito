/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AInteiroConstante extends PConstante
{
    private PSinal _sinal_;
    private TConstInteiro _constInteiro_;

    public AInteiroConstante()
    {
        // Constructor
    }

    public AInteiroConstante(
        @SuppressWarnings("hiding") PSinal _sinal_,
        @SuppressWarnings("hiding") TConstInteiro _constInteiro_)
    {
        // Constructor
        setSinal(_sinal_);

        setConstInteiro(_constInteiro_);

    }

    @Override
    public Object clone()
    {
        return new AInteiroConstante(
            cloneNode(this._sinal_),
            cloneNode(this._constInteiro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInteiroConstante(this);
    }

    public PSinal getSinal()
    {
        return this._sinal_;
    }

    public void setSinal(PSinal node)
    {
        if(this._sinal_ != null)
        {
            this._sinal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sinal_ = node;
    }

    public TConstInteiro getConstInteiro()
    {
        return this._constInteiro_;
    }

    public void setConstInteiro(TConstInteiro node)
    {
        if(this._constInteiro_ != null)
        {
            this._constInteiro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._constInteiro_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._sinal_)
            + toString(this._constInteiro_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._sinal_ == child)
        {
            this._sinal_ = null;
            return;
        }

        if(this._constInteiro_ == child)
        {
            this._constInteiro_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._sinal_ == oldChild)
        {
            setSinal((PSinal) newChild);
            return;
        }

        if(this._constInteiro_ == oldChild)
        {
            setConstInteiro((TConstInteiro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
