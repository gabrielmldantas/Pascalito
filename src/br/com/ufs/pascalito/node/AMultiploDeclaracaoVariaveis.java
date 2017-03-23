/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AMultiploDeclaracaoVariaveis extends PDeclaracaoVariaveis
{
    private PDeclaracaoVariaveis _declaracaoVariaveis_;
    private TPontoEVirgula _pontoEVirgula_;
    private PDeclaracaoVariavel _declaracaoVariavel_;

    public AMultiploDeclaracaoVariaveis()
    {
        // Constructor
    }

    public AMultiploDeclaracaoVariaveis(
        @SuppressWarnings("hiding") PDeclaracaoVariaveis _declaracaoVariaveis_,
        @SuppressWarnings("hiding") TPontoEVirgula _pontoEVirgula_,
        @SuppressWarnings("hiding") PDeclaracaoVariavel _declaracaoVariavel_)
    {
        // Constructor
        setDeclaracaoVariaveis(_declaracaoVariaveis_);

        setPontoEVirgula(_pontoEVirgula_);

        setDeclaracaoVariavel(_declaracaoVariavel_);

    }

    @Override
    public Object clone()
    {
        return new AMultiploDeclaracaoVariaveis(
            cloneNode(this._declaracaoVariaveis_),
            cloneNode(this._pontoEVirgula_),
            cloneNode(this._declaracaoVariavel_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiploDeclaracaoVariaveis(this);
    }

    public PDeclaracaoVariaveis getDeclaracaoVariaveis()
    {
        return this._declaracaoVariaveis_;
    }

    public void setDeclaracaoVariaveis(PDeclaracaoVariaveis node)
    {
        if(this._declaracaoVariaveis_ != null)
        {
            this._declaracaoVariaveis_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declaracaoVariaveis_ = node;
    }

    public TPontoEVirgula getPontoEVirgula()
    {
        return this._pontoEVirgula_;
    }

    public void setPontoEVirgula(TPontoEVirgula node)
    {
        if(this._pontoEVirgula_ != null)
        {
            this._pontoEVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoEVirgula_ = node;
    }

    public PDeclaracaoVariavel getDeclaracaoVariavel()
    {
        return this._declaracaoVariavel_;
    }

    public void setDeclaracaoVariavel(PDeclaracaoVariavel node)
    {
        if(this._declaracaoVariavel_ != null)
        {
            this._declaracaoVariavel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declaracaoVariavel_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declaracaoVariaveis_)
            + toString(this._pontoEVirgula_)
            + toString(this._declaracaoVariavel_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declaracaoVariaveis_ == child)
        {
            this._declaracaoVariaveis_ = null;
            return;
        }

        if(this._pontoEVirgula_ == child)
        {
            this._pontoEVirgula_ = null;
            return;
        }

        if(this._declaracaoVariavel_ == child)
        {
            this._declaracaoVariavel_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._declaracaoVariaveis_ == oldChild)
        {
            setDeclaracaoVariaveis((PDeclaracaoVariaveis) newChild);
            return;
        }

        if(this._pontoEVirgula_ == oldChild)
        {
            setPontoEVirgula((TPontoEVirgula) newChild);
            return;
        }

        if(this._declaracaoVariavel_ == oldChild)
        {
            setDeclaracaoVariavel((PDeclaracaoVariavel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}