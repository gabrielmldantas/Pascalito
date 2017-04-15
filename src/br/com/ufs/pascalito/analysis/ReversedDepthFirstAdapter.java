/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.analysis;

import java.util.*;
import br.com.ufs.pascalito.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPProgram().apply(this);
        outStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        if(node.getBloco() != null)
        {
            node.getBloco().apply(this);
        }
        {
            List<PString> copy = new ArrayList<PString>(node.getIds());
            Collections.reverse(copy);
            for(PString e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAProgram(node);
    }

    public void inAString(AString node)
    {
        defaultIn(node);
    }

    public void outAString(AString node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAString(AString node)
    {
        inAString(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAString(node);
    }

    public void inABloco(ABloco node)
    {
        defaultIn(node);
    }

    public void outABloco(ABloco node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABloco(ABloco node)
    {
        inABloco(node);
        {
            List<PNumeroSemSinal> copy = new ArrayList<PNumeroSemSinal>(node.getNumeroSemSinal());
            Collections.reverse(copy);
            for(PNumeroSemSinal e : copy)
            {
                e.apply(this);
            }
        }
        outABloco(node);
    }

    public void inANumeroSemSinal(ANumeroSemSinal node)
    {
        defaultIn(node);
    }

    public void outANumeroSemSinal(ANumeroSemSinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroSemSinal(ANumeroSemSinal node)
    {
        inANumeroSemSinal(node);
        if(node.getConstInteiro() != null)
        {
            node.getConstInteiro().apply(this);
        }
        outANumeroSemSinal(node);
    }
}
