/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AProgram extends PProgram
{
    private PCabecalhoPrograma _cabecalhoPrograma_;
    private TPontoEVirgula _pontoEVirgula_;
    private PBloco _bloco_;
    private TPonto _ponto_;

    public AProgram()
    {
        // Constructor
    }

    public AProgram(
        @SuppressWarnings("hiding") PCabecalhoPrograma _cabecalhoPrograma_,
        @SuppressWarnings("hiding") TPontoEVirgula _pontoEVirgula_,
        @SuppressWarnings("hiding") PBloco _bloco_,
        @SuppressWarnings("hiding") TPonto _ponto_)
    {
        // Constructor
        setCabecalhoPrograma(_cabecalhoPrograma_);

        setPontoEVirgula(_pontoEVirgula_);

        setBloco(_bloco_);

        setPonto(_ponto_);

    }

    @Override
    public Object clone()
    {
        return new AProgram(
            cloneNode(this._cabecalhoPrograma_),
            cloneNode(this._pontoEVirgula_),
            cloneNode(this._bloco_),
            cloneNode(this._ponto_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgram(this);
    }

    public PCabecalhoPrograma getCabecalhoPrograma()
    {
        return this._cabecalhoPrograma_;
    }

    public void setCabecalhoPrograma(PCabecalhoPrograma node)
    {
        if(this._cabecalhoPrograma_ != null)
        {
            this._cabecalhoPrograma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cabecalhoPrograma_ = node;
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

    public PBloco getBloco()
    {
        return this._bloco_;
    }

    public void setBloco(PBloco node)
    {
        if(this._bloco_ != null)
        {
            this._bloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bloco_ = node;
    }

    public TPonto getPonto()
    {
        return this._ponto_;
    }

    public void setPonto(TPonto node)
    {
        if(this._ponto_ != null)
        {
            this._ponto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ponto_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cabecalhoPrograma_)
            + toString(this._pontoEVirgula_)
            + toString(this._bloco_)
            + toString(this._ponto_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cabecalhoPrograma_ == child)
        {
            this._cabecalhoPrograma_ = null;
            return;
        }

        if(this._pontoEVirgula_ == child)
        {
            this._pontoEVirgula_ = null;
            return;
        }

        if(this._bloco_ == child)
        {
            this._bloco_ = null;
            return;
        }

        if(this._ponto_ == child)
        {
            this._ponto_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cabecalhoPrograma_ == oldChild)
        {
            setCabecalhoPrograma((PCabecalhoPrograma) newChild);
            return;
        }

        if(this._pontoEVirgula_ == oldChild)
        {
            setPontoEVirgula((TPontoEVirgula) newChild);
            return;
        }

        if(this._bloco_ == oldChild)
        {
            setBloco((PBloco) newChild);
            return;
        }

        if(this._ponto_ == oldChild)
        {
            setPonto((TPonto) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
