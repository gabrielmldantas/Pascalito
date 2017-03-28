/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ACompostaSentencaEstruturadaFechada extends PSentencaEstruturadaFechada
{
    private PSentencaComposta _sentencaComposta_;

    public ACompostaSentencaEstruturadaFechada()
    {
        // Constructor
    }

    public ACompostaSentencaEstruturadaFechada(
        @SuppressWarnings("hiding") PSentencaComposta _sentencaComposta_)
    {
        // Constructor
        setSentencaComposta(_sentencaComposta_);

    }

    @Override
    public Object clone()
    {
        return new ACompostaSentencaEstruturadaFechada(
            cloneNode(this._sentencaComposta_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACompostaSentencaEstruturadaFechada(this);
    }

    public PSentencaComposta getSentencaComposta()
    {
        return this._sentencaComposta_;
    }

    public void setSentencaComposta(PSentencaComposta node)
    {
        if(this._sentencaComposta_ != null)
        {
            this._sentencaComposta_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sentencaComposta_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._sentencaComposta_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._sentencaComposta_ == child)
        {
            this._sentencaComposta_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._sentencaComposta_ == oldChild)
        {
            setSentencaComposta((PSentencaComposta) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
