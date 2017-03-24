/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AMultiplicacaoOperadorMultiplicativo extends POperadorMultiplicativo
{
    private TMultiplicacao _multiplicacao_;

    public AMultiplicacaoOperadorMultiplicativo()
    {
        // Constructor
    }

    public AMultiplicacaoOperadorMultiplicativo(
        @SuppressWarnings("hiding") TMultiplicacao _multiplicacao_)
    {
        // Constructor
        setMultiplicacao(_multiplicacao_);

    }

    @Override
    public Object clone()
    {
        return new AMultiplicacaoOperadorMultiplicativo(
            cloneNode(this._multiplicacao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiplicacaoOperadorMultiplicativo(this);
    }

    public TMultiplicacao getMultiplicacao()
    {
        return this._multiplicacao_;
    }

    public void setMultiplicacao(TMultiplicacao node)
    {
        if(this._multiplicacao_ != null)
        {
            this._multiplicacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multiplicacao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._multiplicacao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._multiplicacao_ == child)
        {
            this._multiplicacao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._multiplicacao_ == oldChild)
        {
            setMultiplicacao((TMultiplicacao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
