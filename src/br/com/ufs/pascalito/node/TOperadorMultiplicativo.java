/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class TOperadorMultiplicativo extends Token
{
    public TOperadorMultiplicativo(String text)
    {
        setText(text);
    }

    public TOperadorMultiplicativo(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOperadorMultiplicativo(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOperadorMultiplicativo(this);
    }
}
