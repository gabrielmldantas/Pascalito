/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AMenorOperadorRelacional extends POperadorRelacional
{
    private TMenor _menor_;

    public AMenorOperadorRelacional()
    {
        // Constructor
    }

    public AMenorOperadorRelacional(
        @SuppressWarnings("hiding") TMenor _menor_)
    {
        // Constructor
        setMenor(_menor_);

    }

    @Override
    public Object clone()
    {
        return new AMenorOperadorRelacional(
            cloneNode(this._menor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenorOperadorRelacional(this);
    }

    public TMenor getMenor()
    {
        return this._menor_;
    }

    public void setMenor(TMenor node)
    {
        if(this._menor_ != null)
        {
            this._menor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._menor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._menor_ == child)
        {
            this._menor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._menor_ == oldChild)
        {
            setMenor((TMenor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
