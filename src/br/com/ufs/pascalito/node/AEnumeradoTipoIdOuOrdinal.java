/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AEnumeradoTipoIdOuOrdinal extends PTipoIdOuOrdinal
{
    private PTipoEnumerado _tipoEnumerado_;

    public AEnumeradoTipoIdOuOrdinal()
    {
        // Constructor
    }

    public AEnumeradoTipoIdOuOrdinal(
        @SuppressWarnings("hiding") PTipoEnumerado _tipoEnumerado_)
    {
        // Constructor
        setTipoEnumerado(_tipoEnumerado_);

    }

    @Override
    public Object clone()
    {
        return new AEnumeradoTipoIdOuOrdinal(
            cloneNode(this._tipoEnumerado_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnumeradoTipoIdOuOrdinal(this);
    }

    public PTipoEnumerado getTipoEnumerado()
    {
        return this._tipoEnumerado_;
    }

    public void setTipoEnumerado(PTipoEnumerado node)
    {
        if(this._tipoEnumerado_ != null)
        {
            this._tipoEnumerado_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoEnumerado_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoEnumerado_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoEnumerado_ == child)
        {
            this._tipoEnumerado_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoEnumerado_ == oldChild)
        {
            setTipoEnumerado((PTipoEnumerado) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
