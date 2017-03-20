/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ALabel extends PLabel
{
    private TConstInteiro _constInteiro_;

    public ALabel()
    {
        // Constructor
    }

    public ALabel(
        @SuppressWarnings("hiding") TConstInteiro _constInteiro_)
    {
        // Constructor
        setConstInteiro(_constInteiro_);

    }

    @Override
    public Object clone()
    {
        return new ALabel(
            cloneNode(this._constInteiro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALabel(this);
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
            + toString(this._constInteiro_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
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
        if(this._constInteiro_ == oldChild)
        {
            setConstInteiro((TConstInteiro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
