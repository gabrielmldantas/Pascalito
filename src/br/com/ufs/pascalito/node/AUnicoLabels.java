/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AUnicoLabels extends PLabels
{
    private PLabel _label_;

    public AUnicoLabels()
    {
        // Constructor
    }

    public AUnicoLabels(
        @SuppressWarnings("hiding") PLabel _label_)
    {
        // Constructor
        setLabel(_label_);

    }

    @Override
    public Object clone()
    {
        return new AUnicoLabels(
            cloneNode(this._label_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnicoLabels(this);
    }

    public PLabel getLabel()
    {
        return this._label_;
    }

    public void setLabel(PLabel node)
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._label_);
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

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._label_ == oldChild)
        {
            setLabel((PLabel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
