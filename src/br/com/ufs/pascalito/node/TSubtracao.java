/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class TSubtracao extends Token
{
    public TSubtracao()
    {
        super.setText("-");
    }

    public TSubtracao(int line, int pos)
    {
        super.setText("-");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSubtracao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSubtracao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSubtracao text.");
    }
}
