/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class ADeclaracaoLabels extends PDeclaracaoLabels
{
    private TLabel _label_;
    private PLabels _labels_;
    private TPontoEVirgula _pontoEVirgula_;

    public ADeclaracaoLabels()
    {
        // Constructor
    }

    public ADeclaracaoLabels(
        @SuppressWarnings("hiding") TLabel _label_,
        @SuppressWarnings("hiding") PLabels _labels_,
        @SuppressWarnings("hiding") TPontoEVirgula _pontoEVirgula_)
    {
        // Constructor
        setLabel(_label_);

        setLabels(_labels_);

        setPontoEVirgula(_pontoEVirgula_);

    }

    @Override
    public Object clone()
    {
        return new ADeclaracaoLabels(
            cloneNode(this._label_),
            cloneNode(this._labels_),
            cloneNode(this._pontoEVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclaracaoLabels(this);
    }

    public TLabel getLabel()
    {
        return this._label_;
    }

    public void setLabel(TLabel node)
    {
        if(this._label_ != null)
        {
            this._label_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._label_ = node;
    }

    public PLabels getLabels()
    {
        return this._labels_;
    }

    public void setLabels(PLabels node)
    {
        if(this._labels_ != null)
        {
            this._labels_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._labels_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._label_)
            + toString(this._labels_)
            + toString(this._pontoEVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._label_ == child)
        {
            this._label_ = null;
            return;
        }

        if(this._labels_ == child)
        {
            this._labels_ = null;
            return;
        }

        if(this._pontoEVirgula_ == child)
        {
            this._pontoEVirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._label_ == oldChild)
        {
            setLabel((TLabel) newChild);
            return;
        }

        if(this._labels_ == oldChild)
        {
            setLabels((PLabels) newChild);
            return;
        }

        if(this._pontoEVirgula_ == oldChild)
        {
            setPontoEVirgula((TPontoEVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}