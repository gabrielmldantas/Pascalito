/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.analysis;

import java.util.*;
import br.com.ufs.pascalito.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
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
        node.getPProgram().apply(this);
        node.getEOF().apply(this);
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
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PString> copy = new ArrayList<PString>(node.getIds());
            for(PString e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getBloco() != null)
        {
            node.getBloco().apply(this);
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

    public void inAInteiroConstante(AInteiroConstante node)
    {
        defaultIn(node);
    }

    public void outAInteiroConstante(AInteiroConstante node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInteiroConstante(AInteiroConstante node)
    {
        inAInteiroConstante(node);
        if(node.getSinal() != null)
        {
            node.getSinal().apply(this);
        }
        if(node.getConstInteiro() != null)
        {
            node.getConstInteiro().apply(this);
        }
        outAInteiroConstante(node);
    }

    public void inAStringConstante(AStringConstante node)
    {
        defaultIn(node);
    }

    public void outAStringConstante(AStringConstante node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringConstante(AStringConstante node)
    {
        inAStringConstante(node);
        if(node.getConstString() != null)
        {
            node.getConstString().apply(this);
        }
        outAStringConstante(node);
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
            for(PNumeroSemSinal e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PDefinicaoTipo> copy = new ArrayList<PDefinicaoTipo>(node.getDefinicaoTipo());
            for(PDefinicaoTipo e : copy)
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

    public void inADefinicaoTipo(ADefinicaoTipo node)
    {
        defaultIn(node);
    }

    public void outADefinicaoTipo(ADefinicaoTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADefinicaoTipo(ADefinicaoTipo node)
    {
        inADefinicaoTipo(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        if(node.getDenotadorTipo() != null)
        {
            node.getDenotadorTipo().apply(this);
        }
        outADefinicaoTipo(node);
    }

    public void inAPrimitivoDenotadorTipo(APrimitivoDenotadorTipo node)
    {
        defaultIn(node);
    }

    public void outAPrimitivoDenotadorTipo(APrimitivoDenotadorTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrimitivoDenotadorTipo(APrimitivoDenotadorTipo node)
    {
        inAPrimitivoDenotadorTipo(node);
        if(node.getTipoPrimitivo() != null)
        {
            node.getTipoPrimitivo().apply(this);
        }
        outAPrimitivoDenotadorTipo(node);
    }

    public void inAIdOuOrdinalDenotadorTipo(AIdOuOrdinalDenotadorTipo node)
    {
        defaultIn(node);
    }

    public void outAIdOuOrdinalDenotadorTipo(AIdOuOrdinalDenotadorTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdOuOrdinalDenotadorTipo(AIdOuOrdinalDenotadorTipo node)
    {
        inAIdOuOrdinalDenotadorTipo(node);
        if(node.getTipoIdOuOrdinal() != null)
        {
            node.getTipoIdOuOrdinal().apply(this);
        }
        outAIdOuOrdinalDenotadorTipo(node);
    }

    public void inAIntegerTipoPrimitivo(AIntegerTipoPrimitivo node)
    {
        defaultIn(node);
    }

    public void outAIntegerTipoPrimitivo(AIntegerTipoPrimitivo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntegerTipoPrimitivo(AIntegerTipoPrimitivo node)
    {
        inAIntegerTipoPrimitivo(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        outAIntegerTipoPrimitivo(node);
    }

    public void inAStringTipoPrimitivo(AStringTipoPrimitivo node)
    {
        defaultIn(node);
    }

    public void outAStringTipoPrimitivo(AStringTipoPrimitivo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringTipoPrimitivo(AStringTipoPrimitivo node)
    {
        inAStringTipoPrimitivo(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringTipoPrimitivo(node);
    }

    public void inABooleanTipoPrimitivo(ABooleanTipoPrimitivo node)
    {
        defaultIn(node);
    }

    public void outABooleanTipoPrimitivo(ABooleanTipoPrimitivo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooleanTipoPrimitivo(ABooleanTipoPrimitivo node)
    {
        inABooleanTipoPrimitivo(node);
        if(node.getBoolean() != null)
        {
            node.getBoolean().apply(this);
        }
        outABooleanTipoPrimitivo(node);
    }

    public void inAIdTipoIdOuOrdinal(AIdTipoIdOuOrdinal node)
    {
        defaultIn(node);
    }

    public void outAIdTipoIdOuOrdinal(AIdTipoIdOuOrdinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdTipoIdOuOrdinal(AIdTipoIdOuOrdinal node)
    {
        inAIdTipoIdOuOrdinal(node);
        if(node.getTipoIdentificador() != null)
        {
            node.getTipoIdentificador().apply(this);
        }
        outAIdTipoIdOuOrdinal(node);
    }

    public void inAEnumeradoTipoIdOuOrdinal(AEnumeradoTipoIdOuOrdinal node)
    {
        defaultIn(node);
    }

    public void outAEnumeradoTipoIdOuOrdinal(AEnumeradoTipoIdOuOrdinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnumeradoTipoIdOuOrdinal(AEnumeradoTipoIdOuOrdinal node)
    {
        inAEnumeradoTipoIdOuOrdinal(node);
        if(node.getTipoEnumerado() != null)
        {
            node.getTipoEnumerado().apply(this);
        }
        outAEnumeradoTipoIdOuOrdinal(node);
    }

    public void inASubrangeTipoIdOuOrdinal(ASubrangeTipoIdOuOrdinal node)
    {
        defaultIn(node);
    }

    public void outASubrangeTipoIdOuOrdinal(ASubrangeTipoIdOuOrdinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubrangeTipoIdOuOrdinal(ASubrangeTipoIdOuOrdinal node)
    {
        inASubrangeTipoIdOuOrdinal(node);
        if(node.getTipoSubrange() != null)
        {
            node.getTipoSubrange().apply(this);
        }
        outASubrangeTipoIdOuOrdinal(node);
    }

    public void inATipoIdentificador(ATipoIdentificador node)
    {
        defaultIn(node);
    }

    public void outATipoIdentificador(ATipoIdentificador node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoIdentificador(ATipoIdentificador node)
    {
        inATipoIdentificador(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outATipoIdentificador(node);
    }

    public void inATipoEnumerado(ATipoEnumerado node)
    {
        defaultIn(node);
    }

    public void outATipoEnumerado(ATipoEnumerado node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoEnumerado(ATipoEnumerado node)
    {
        inATipoEnumerado(node);
        {
            List<PString> copy = new ArrayList<PString>(node.getString());
            for(PString e : copy)
            {
                e.apply(this);
            }
        }
        outATipoEnumerado(node);
    }

    public void inATipoSubrange(ATipoSubrange node)
    {
        defaultIn(node);
    }

    public void outATipoSubrange(ATipoSubrange node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoSubrange(ATipoSubrange node)
    {
        inATipoSubrange(node);
        if(node.getInicio() != null)
        {
            node.getInicio().apply(this);
        }
        if(node.getFim() != null)
        {
            node.getFim().apply(this);
        }
        outATipoSubrange(node);
    }
}
