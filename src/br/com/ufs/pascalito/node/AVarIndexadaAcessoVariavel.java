/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AVarIndexadaAcessoVariavel extends PAcessoVariavel
{
    private PVariavelIndexada _variavelIndexada_;

    public AVarIndexadaAcessoVariavel()
    {
        // Constructor
    }

    public AVarIndexadaAcessoVariavel(
        @SuppressWarnings("hiding") PVariavelIndexada _variavelIndexada_)
    {
        // Constructor
        setVariavelIndexada(_variavelIndexada_);

    }

    @Override
    public Object clone()
    {
        return new AVarIndexadaAcessoVariavel(
            cloneNode(this._variavelIndexada_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarIndexadaAcessoVariavel(this);
    }

    public PVariavelIndexada getVariavelIndexada()
    {
        return this._variavelIndexada_;
    }

    public void setVariavelIndexada(PVariavelIndexada node)
    {
        if(this._variavelIndexada_ != null)
        {
            this._variavelIndexada_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._variavelIndexada_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._variavelIndexada_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._variavelIndexada_ == child)
        {
            this._variavelIndexada_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._variavelIndexada_ == oldChild)
        {
            setVariavelIndexada((PVariavelIndexada) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
