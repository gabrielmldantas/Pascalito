/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ARealTermo extends PTermo
{
    private TConstReal _constReal_;

    public ARealTermo()
    {
        // Constructor
    }

    public ARealTermo(
        @SuppressWarnings("hiding") TConstReal _constReal_)
    {
        // Constructor
        setConstReal(_constReal_);

    }

    @Override
    public Object clone()
    {
        return new ARealTermo(
            cloneNode(this._constReal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARealTermo(this);
    }

    public TConstReal getConstReal()
    {
        return this._constReal_;
    }

    public void setConstReal(TConstReal node)
    {
        if(this._constReal_ != null)
        {
            this._constReal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._constReal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._constReal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._constReal_ == child)
        {
            this._constReal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._constReal_ == oldChild)
        {
            setConstReal((TConstReal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
