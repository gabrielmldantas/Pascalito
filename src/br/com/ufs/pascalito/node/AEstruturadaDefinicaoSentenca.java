/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AEstruturadaDefinicaoSentenca extends PDefinicaoSentenca
{
    private PSentencaEstruturada _sentencaEstruturada_;

    public AEstruturadaDefinicaoSentenca()
    {
        // Constructor
    }

    public AEstruturadaDefinicaoSentenca(
        @SuppressWarnings("hiding") PSentencaEstruturada _sentencaEstruturada_)
    {
        // Constructor
        setSentencaEstruturada(_sentencaEstruturada_);

    }

    @Override
    public Object clone()
    {
        return new AEstruturadaDefinicaoSentenca(
            cloneNode(this._sentencaEstruturada_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEstruturadaDefinicaoSentenca(this);
    }

    public PSentencaEstruturada getSentencaEstruturada()
    {
        return this._sentencaEstruturada_;
    }

    public void setSentencaEstruturada(PSentencaEstruturada node)
    {
        if(this._sentencaEstruturada_ != null)
        {
            this._sentencaEstruturada_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sentencaEstruturada_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._sentencaEstruturada_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._sentencaEstruturada_ == child)
        {
            this._sentencaEstruturada_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._sentencaEstruturada_ == oldChild)
        {
            setSentencaEstruturada((PSentencaEstruturada) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
