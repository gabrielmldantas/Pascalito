/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AUnicoDefinicaoParametrosReais extends PDefinicaoParametrosReais
{
    private PParametroReal _parametroReal_;

    public AUnicoDefinicaoParametrosReais()
    {
        // Constructor
    }

    public AUnicoDefinicaoParametrosReais(
        @SuppressWarnings("hiding") PParametroReal _parametroReal_)
    {
        // Constructor
        setParametroReal(_parametroReal_);

    }

    @Override
    public Object clone()
    {
        return new AUnicoDefinicaoParametrosReais(
            cloneNode(this._parametroReal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnicoDefinicaoParametrosReais(this);
    }

    public PParametroReal getParametroReal()
    {
        return this._parametroReal_;
    }

    public void setParametroReal(PParametroReal node)
    {
        if(this._parametroReal_ != null)
        {
            this._parametroReal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametroReal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parametroReal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parametroReal_ == child)
        {
            this._parametroReal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parametroReal_ == oldChild)
        {
            setParametroReal((PParametroReal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
