/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ASentencaIfFechada extends PSentencaIfFechada
{
    private PDefinicaoSentencaFechada _definicaoSentencaFechada_;

    public ASentencaIfFechada()
    {
        // Constructor
    }

    public ASentencaIfFechada(
        @SuppressWarnings("hiding") PDefinicaoSentencaFechada _definicaoSentencaFechada_)
    {
        // Constructor
        setDefinicaoSentencaFechada(_definicaoSentencaFechada_);

    }

    @Override
    public Object clone()
    {
        return new ASentencaIfFechada(
            cloneNode(this._definicaoSentencaFechada_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASentencaIfFechada(this);
    }

    public PDefinicaoSentencaFechada getDefinicaoSentencaFechada()
    {
        return this._definicaoSentencaFechada_;
    }

    public void setDefinicaoSentencaFechada(PDefinicaoSentencaFechada node)
    {
        if(this._definicaoSentencaFechada_ != null)
        {
            this._definicaoSentencaFechada_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._definicaoSentencaFechada_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._definicaoSentencaFechada_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._definicaoSentencaFechada_ == child)
        {
            this._definicaoSentencaFechada_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._definicaoSentencaFechada_ == oldChild)
        {
            setDefinicaoSentencaFechada((PDefinicaoSentencaFechada) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}