/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AUnicoSecaoParametrosFormais extends PSecaoParametrosFormais
{
    private PSecaoParametroFormal _secaoParametroFormal_;

    public AUnicoSecaoParametrosFormais()
    {
        // Constructor
    }

    public AUnicoSecaoParametrosFormais(
        @SuppressWarnings("hiding") PSecaoParametroFormal _secaoParametroFormal_)
    {
        // Constructor
        setSecaoParametroFormal(_secaoParametroFormal_);

    }

    @Override
    public Object clone()
    {
        return new AUnicoSecaoParametrosFormais(
            cloneNode(this._secaoParametroFormal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnicoSecaoParametrosFormais(this);
    }

    public PSecaoParametroFormal getSecaoParametroFormal()
    {
        return this._secaoParametroFormal_;
    }

    public void setSecaoParametroFormal(PSecaoParametroFormal node)
    {
        if(this._secaoParametroFormal_ != null)
        {
            this._secaoParametroFormal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._secaoParametroFormal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._secaoParametroFormal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._secaoParametroFormal_ == child)
        {
            this._secaoParametroFormal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._secaoParametroFormal_ == oldChild)
        {
            setSecaoParametroFormal((PSecaoParametroFormal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
