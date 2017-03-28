/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AWhileSentencaEstruturadaFechada extends PSentencaEstruturadaFechada
{
    private PSentencaWhileFechada _sentencaWhileFechada_;

    public AWhileSentencaEstruturadaFechada()
    {
        // Constructor
    }

    public AWhileSentencaEstruturadaFechada(
        @SuppressWarnings("hiding") PSentencaWhileFechada _sentencaWhileFechada_)
    {
        // Constructor
        setSentencaWhileFechada(_sentencaWhileFechada_);

    }

    @Override
    public Object clone()
    {
        return new AWhileSentencaEstruturadaFechada(
            cloneNode(this._sentencaWhileFechada_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWhileSentencaEstruturadaFechada(this);
    }

    public PSentencaWhileFechada getSentencaWhileFechada()
    {
        return this._sentencaWhileFechada_;
    }

    public void setSentencaWhileFechada(PSentencaWhileFechada node)
    {
        if(this._sentencaWhileFechada_ != null)
        {
            this._sentencaWhileFechada_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sentencaWhileFechada_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._sentencaWhileFechada_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._sentencaWhileFechada_ == child)
        {
            this._sentencaWhileFechada_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._sentencaWhileFechada_ == oldChild)
        {
            setSentencaWhileFechada((PSentencaWhileFechada) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}