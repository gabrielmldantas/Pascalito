/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AProcedureDeclaracaoProcOuFuncao extends PDeclaracaoProcOuFuncao
{
    private PDeclaracaoProcedure _declaracaoProcedure_;

    public AProcedureDeclaracaoProcOuFuncao()
    {
        // Constructor
    }

    public AProcedureDeclaracaoProcOuFuncao(
        @SuppressWarnings("hiding") PDeclaracaoProcedure _declaracaoProcedure_)
    {
        // Constructor
        setDeclaracaoProcedure(_declaracaoProcedure_);

    }

    @Override
    public Object clone()
    {
        return new AProcedureDeclaracaoProcOuFuncao(
            cloneNode(this._declaracaoProcedure_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProcedureDeclaracaoProcOuFuncao(this);
    }

    public PDeclaracaoProcedure getDeclaracaoProcedure()
    {
        return this._declaracaoProcedure_;
    }

    public void setDeclaracaoProcedure(PDeclaracaoProcedure node)
    {
        if(this._declaracaoProcedure_ != null)
        {
            this._declaracaoProcedure_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declaracaoProcedure_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declaracaoProcedure_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declaracaoProcedure_ == child)
        {
            this._declaracaoProcedure_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._declaracaoProcedure_ == oldChild)
        {
            setDeclaracaoProcedure((PDeclaracaoProcedure) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
