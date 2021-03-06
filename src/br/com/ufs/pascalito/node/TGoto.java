/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class TGoto extends Token
{
    public TGoto(String text)
    {
        setText(text);
    }

    public TGoto(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TGoto(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTGoto(this);
    }
}
