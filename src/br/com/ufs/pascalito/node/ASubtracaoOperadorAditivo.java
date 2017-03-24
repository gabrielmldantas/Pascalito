/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ASubtracaoOperadorAditivo extends POperadorAditivo
{
    private TSubtracao _subtracao_;

    public ASubtracaoOperadorAditivo()
    {
        // Constructor
    }

    public ASubtracaoOperadorAditivo(
        @SuppressWarnings("hiding") TSubtracao _subtracao_)
    {
        // Constructor
        setSubtracao(_subtracao_);

    }

    @Override
    public Object clone()
    {
        return new ASubtracaoOperadorAditivo(
            cloneNode(this._subtracao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASubtracaoOperadorAditivo(this);
    }

    public TSubtracao getSubtracao()
    {
        return this._subtracao_;
    }

    public void setSubtracao(TSubtracao node)
    {
        if(this._subtracao_ != null)
        {
            this._subtracao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._subtracao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._subtracao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._subtracao_ == child)
        {
            this._subtracao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._subtracao_ == oldChild)
        {
            setSubtracao((TSubtracao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
