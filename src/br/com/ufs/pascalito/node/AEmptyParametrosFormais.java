/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AEmptyParametrosFormais extends PParametrosFormais
{

    public AEmptyParametrosFormais()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AEmptyParametrosFormais();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEmptyParametrosFormais(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}
