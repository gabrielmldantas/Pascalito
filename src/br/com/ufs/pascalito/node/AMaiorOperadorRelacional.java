/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AMaiorOperadorRelacional extends POperadorRelacional
{
    private TMaior _maior_;

    public AMaiorOperadorRelacional()
    {
        // Constructor
    }

    public AMaiorOperadorRelacional(
        @SuppressWarnings("hiding") TMaior _maior_)
    {
        // Constructor
        setMaior(_maior_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorOperadorRelacional(
            cloneNode(this._maior_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorOperadorRelacional(this);
    }

    public TMaior getMaior()
    {
        return this._maior_;
    }

    public void setMaior(TMaior node)
    {
        if(this._maior_ != null)
        {
            this._maior_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maior_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._maior_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._maior_ == child)
        {
            this._maior_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._maior_ == oldChild)
        {
            setMaior((TMaior) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
