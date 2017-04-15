/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ATipoIdentificador extends PTipoIdentificador
{
    private PString _string_;

    public ATipoIdentificador()
    {
        // Constructor
    }

    public ATipoIdentificador(
        @SuppressWarnings("hiding") PString _string_)
    {
        // Constructor
        setString(_string_);

    }

    @Override
    public Object clone()
    {
        return new ATipoIdentificador(
            cloneNode(this._string_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoIdentificador(this);
    }

    public PString getString()
    {
        return this._string_;
    }

    public void setString(PString node)
    {
        if(this._string_ != null)
        {
            this._string_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._string_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._string_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._string_ == child)
        {
            this._string_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._string_ == oldChild)
        {
            setString((PString) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
