/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.node;

import br.com.ufs.pascalito.analysis.*;

@SuppressWarnings("nls")
public final class AEmptyParametrosReais extends PParametrosReais
{

    public AEmptyParametrosReais()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AEmptyParametrosReais();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEmptyParametrosReais(this);
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