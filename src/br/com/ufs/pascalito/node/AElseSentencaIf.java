/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AElseSentencaIf extends PSentencaIf
{
    private TIf _if_;
    private PExpressao _expressao_;
    private TThen _then_;
    private PSentencaIfFechada _sentencaIfFechada_;
    private TElse _else_;
    private PSentenca _sentenca_;

    public AElseSentencaIf()
    {
        // Constructor
    }

    public AElseSentencaIf(
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") PExpressao _expressao_,
        @SuppressWarnings("hiding") TThen _then_,
        @SuppressWarnings("hiding") PSentencaIfFechada _sentencaIfFechada_,
        @SuppressWarnings("hiding") TElse _else_,
        @SuppressWarnings("hiding") PSentenca _sentenca_)
    {
        // Constructor
        setIf(_if_);

        setExpressao(_expressao_);

        setThen(_then_);

        setSentencaIfFechada(_sentencaIfFechada_);

        setElse(_else_);

        setSentenca(_sentenca_);

    }

    @Override
    public Object clone()
    {
        return new AElseSentencaIf(
            cloneNode(this._if_),
            cloneNode(this._expressao_),
            cloneNode(this._then_),
            cloneNode(this._sentencaIfFechada_),
            cloneNode(this._else_),
            cloneNode(this._sentenca_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAElseSentencaIf(this);
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
    }

    public PExpressao getExpressao()
    {
        return this._expressao_;
    }

    public void setExpressao(PExpressao node)
    {
        if(this._expressao_ != null)
        {
            this._expressao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressao_ = node;
    }

    public TThen getThen()
    {
        return this._then_;
    }

    public void setThen(TThen node)
    {
        if(this._then_ != null)
        {
            this._then_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._then_ = node;
    }

    public PSentencaIfFechada getSentencaIfFechada()
    {
        return this._sentencaIfFechada_;
    }

    public void setSentencaIfFechada(PSentencaIfFechada node)
    {
        if(this._sentencaIfFechada_ != null)
        {
            this._sentencaIfFechada_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sentencaIfFechada_ = node;
    }

    public TElse getElse()
    {
        return this._else_;
    }

    public void setElse(TElse node)
    {
        if(this._else_ != null)
        {
            this._else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._else_ = node;
    }

    public PSentenca getSentenca()
    {
        return this._sentenca_;
    }

    public void setSentenca(PSentenca node)
    {
        if(this._sentenca_ != null)
        {
            this._sentenca_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sentenca_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._if_)
            + toString(this._expressao_)
            + toString(this._then_)
            + toString(this._sentencaIfFechada_)
            + toString(this._else_)
            + toString(this._sentenca_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._expressao_ == child)
        {
            this._expressao_ = null;
            return;
        }

        if(this._then_ == child)
        {
            this._then_ = null;
            return;
        }

        if(this._sentencaIfFechada_ == child)
        {
            this._sentencaIfFechada_ = null;
            return;
        }

        if(this._else_ == child)
        {
            this._else_ = null;
            return;
        }

        if(this._sentenca_ == child)
        {
            this._sentenca_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._expressao_ == oldChild)
        {
            setExpressao((PExpressao) newChild);
            return;
        }

        if(this._then_ == oldChild)
        {
            setThen((TThen) newChild);
            return;
        }

        if(this._sentencaIfFechada_ == oldChild)
        {
            setSentencaIfFechada((PSentencaIfFechada) newChild);
            return;
        }

        if(this._else_ == oldChild)
        {
            setElse((TElse) newChild);
            return;
        }

        if(this._sentenca_ == oldChild)
        {
            setSentenca((PSentenca) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
