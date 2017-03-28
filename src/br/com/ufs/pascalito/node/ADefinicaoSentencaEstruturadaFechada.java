/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ADefinicaoSentencaEstruturadaFechada extends PDefinicaoSentencaEstruturadaFechada
{
    private PLabelSentenca _labelSentenca_;
    private PSentencaEstruturadaFechada _sentencaEstruturadaFechada_;

    public ADefinicaoSentencaEstruturadaFechada()
    {
        // Constructor
    }

    public ADefinicaoSentencaEstruturadaFechada(
        @SuppressWarnings("hiding") PLabelSentenca _labelSentenca_,
        @SuppressWarnings("hiding") PSentencaEstruturadaFechada _sentencaEstruturadaFechada_)
    {
        // Constructor
        setLabelSentenca(_labelSentenca_);

        setSentencaEstruturadaFechada(_sentencaEstruturadaFechada_);

    }

    @Override
    public Object clone()
    {
        return new ADefinicaoSentencaEstruturadaFechada(
            cloneNode(this._labelSentenca_),
            cloneNode(this._sentencaEstruturadaFechada_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADefinicaoSentencaEstruturadaFechada(this);
    }

    public PLabelSentenca getLabelSentenca()
    {
        return this._labelSentenca_;
    }

    public void setLabelSentenca(PLabelSentenca node)
    {
        if(this._labelSentenca_ != null)
        {
            this._labelSentenca_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._labelSentenca_ = node;
    }

    public PSentencaEstruturadaFechada getSentencaEstruturadaFechada()
    {
        return this._sentencaEstruturadaFechada_;
    }

    public void setSentencaEstruturadaFechada(PSentencaEstruturadaFechada node)
    {
        if(this._sentencaEstruturadaFechada_ != null)
        {
            this._sentencaEstruturadaFechada_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sentencaEstruturadaFechada_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._labelSentenca_)
            + toString(this._sentencaEstruturadaFechada_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._labelSentenca_ == child)
        {
            this._labelSentenca_ = null;
            return;
        }

        if(this._sentencaEstruturadaFechada_ == child)
        {
            this._sentencaEstruturadaFechada_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._labelSentenca_ == oldChild)
        {
            setLabelSentenca((PLabelSentenca) newChild);
            return;
        }

        if(this._sentencaEstruturadaFechada_ == oldChild)
        {
            setSentencaEstruturadaFechada((PSentencaEstruturadaFechada) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
