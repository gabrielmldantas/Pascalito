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
        if(node.getPonto() != null)
        {
            node.getPonto().apply(this);
        }
        if(node.getBloco() != null)
        {
            node.getBloco().apply(this);
        }
        if(node.getPontoEVirgula() != null)
        {
            node.getPontoEVirgula().apply(this);
        }
        if(node.getCabecalhoPrograma() != null)
        {
            node.getCabecalhoPrograma().apply(this);
        }
        outAProgram(node);
    }

    public void inAUnicoCabecalhoPrograma(AUnicoCabecalhoPrograma node)
    {
        defaultIn(node);
    }

    public void outAUnicoCabecalhoPrograma(AUnicoCabecalhoPrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnicoCabecalhoPrograma(AUnicoCabecalhoPrograma node)
    {
        inAUnicoCabecalhoPrograma(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        outAUnicoCabecalhoPrograma(node);
    }

    public void inAMultiploCabecalhoPrograma(AMultiploCabecalhoPrograma node)
    {
        defaultIn(node);
    }

    public void outAMultiploCabecalhoPrograma(AMultiploCabecalhoPrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiploCabecalhoPrograma(AMultiploCabecalhoPrograma node)
    {
        inAMultiploCabecalhoPrograma(node);
        if(node.getFechaParenteses() != null)
        {
            node.getFechaParenteses().apply(this);
        }
        if(node.getIdentificadores() != null)
        {
            node.getIdentificadores().apply(this);
        }
        if(node.getAbreParenteses() != null)
        {
            node.getAbreParenteses().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        outAMultiploCabecalhoPrograma(node);
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
        if(node.getDeclaracaoTipos() != null)
        {
            node.getDeclaracaoTipos().apply(this);
        }
        if(node.getDeclaracaoLabels() != null)
        {
            node.getDeclaracaoLabels().apply(this);
        }
        outABloco(node);
    }

    public void inAUnicoIdentificadores(AUnicoIdentificadores node)
    {
        defaultIn(node);
    }

    public void outAUnicoIdentificadores(AUnicoIdentificadores node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnicoIdentificadores(AUnicoIdentificadores node)
    {
        inAUnicoIdentificadores(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAUnicoIdentificadores(node);
    }

    public void inAMultiploIdentificadores(AMultiploIdentificadores node)
    {
        defaultIn(node);
    }

    public void outAMultiploIdentificadores(AMultiploIdentificadores node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiploIdentificadores(AMultiploIdentificadores node)
    {
        inAMultiploIdentificadores(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getIdentificadores() != null)
        {
            node.getIdentificadores().apply(this);
        }
        outAMultiploIdentificadores(node);
    }

    public void inADeclaracaoLabels(ADeclaracaoLabels node)
    {
        defaultIn(node);
    }

    public void outADeclaracaoLabels(ADeclaracaoLabels node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracaoLabels(ADeclaracaoLabels node)
    {
        inADeclaracaoLabels(node);
        if(node.getPontoEVirgula() != null)
        {
            node.getPontoEVirgula().apply(this);
        }
        if(node.getLabels() != null)
        {
            node.getLabels().apply(this);
        }
        if(node.getLabel() != null)
        {
            node.getLabel().apply(this);
        }
        outADeclaracaoLabels(node);
    }

    public void inAEmptyDeclaracaoLabels(AEmptyDeclaracaoLabels node)
    {
        defaultIn(node);
    }

    public void outAEmptyDeclaracaoLabels(AEmptyDeclaracaoLabels node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmptyDeclaracaoLabels(AEmptyDeclaracaoLabels node)
    {
        inAEmptyDeclaracaoLabels(node);
        outAEmptyDeclaracaoLabels(node);
    }

    public void inAUnicoLabels(AUnicoLabels node)
    {
        defaultIn(node);
    }

    public void outAUnicoLabels(AUnicoLabels node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnicoLabels(AUnicoLabels node)
    {
        inAUnicoLabels(node);
        if(node.getLabel() != null)
        {
            node.getLabel().apply(this);
        }
        outAUnicoLabels(node);
    }

    public void inAMultiploLabels(AMultiploLabels node)
    {
        defaultIn(node);
    }

    public void outAMultiploLabels(AMultiploLabels node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiploLabels(AMultiploLabels node)
    {
        inAMultiploLabels(node);
        if(node.getLabel() != null)
        {
            node.getLabel().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getLabels() != null)
        {
            node.getLabels().apply(this);
        }
        outAMultiploLabels(node);
    }

    public void inALabel(ALabel node)
    {
        defaultIn(node);
    }

    public void outALabel(ALabel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALabel(ALabel node)
    {
        inALabel(node);
        if(node.getConstInteiro() != null)
        {
            node.getConstInteiro().apply(this);
        }
        outALabel(node);
    }

    public void inADeclaracaoTipos(ADeclaracaoTipos node)
    {
        defaultIn(node);
    }

    public void outADeclaracaoTipos(ADeclaracaoTipos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracaoTipos(ADeclaracaoTipos node)
    {
        inADeclaracaoTipos(node);
        if(node.getPontoEVirgula() != null)
        {
            node.getPontoEVirgula().apply(this);
        }
        if(node.getDefinicaoTipos() != null)
        {
            node.getDefinicaoTipos().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outADeclaracaoTipos(node);
    }

    public void inAEmptyDeclaracaoTipos(AEmptyDeclaracaoTipos node)
    {
        defaultIn(node);
    }

    public void outAEmptyDeclaracaoTipos(AEmptyDeclaracaoTipos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmptyDeclaracaoTipos(AEmptyDeclaracaoTipos node)
    {
        inAEmptyDeclaracaoTipos(node);
        outAEmptyDeclaracaoTipos(node);
    }

    public void inAUnicoDefinicaoTipos(AUnicoDefinicaoTipos node)
    {
        defaultIn(node);
    }

    public void outAUnicoDefinicaoTipos(AUnicoDefinicaoTipos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnicoDefinicaoTipos(AUnicoDefinicaoTipos node)
    {
        inAUnicoDefinicaoTipos(node);
        if(node.getDenotadorTipo() != null)
        {
            node.getDenotadorTipo().apply(this);
        }
        if(node.getIgual() != null)
        {
            node.getIgual().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAUnicoDefinicaoTipos(node);
    }

    public void inAMultiploDefinicaoTipos(AMultiploDefinicaoTipos node)
    {
        defaultIn(node);
    }

    public void outAMultiploDefinicaoTipos(AMultiploDefinicaoTipos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiploDefinicaoTipos(AMultiploDefinicaoTipos node)
    {
        inAMultiploDefinicaoTipos(node);
        if(node.getDenotadorTipo() != null)
        {
            node.getDenotadorTipo().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getDefinicaoTipos() != null)
        {
            node.getDefinicaoTipos().apply(this);
        }
        outAMultiploDefinicaoTipos(node);
    }

    public void inAExistenteDenotadorTipo(AExistenteDenotadorTipo node)
    {
        defaultIn(node);
    }

    public void outAExistenteDenotadorTipo(AExistenteDenotadorTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExistenteDenotadorTipo(AExistenteDenotadorTipo node)
    {
        inAExistenteDenotadorTipo(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAExistenteDenotadorTipo(node);
    }

    public void inANovoDenotadorTipo(ANovoDenotadorTipo node)
    {
        defaultIn(node);
    }

    public void outANovoDenotadorTipo(ANovoDenotadorTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANovoDenotadorTipo(ANovoDenotadorTipo node)
    {
        inANovoDenotadorTipo(node);
        if(node.getNovoTipo() != null)
        {
            node.getNovoTipo().apply(this);
        }
        outANovoDenotadorTipo(node);
    }

    public void inAOrdinalNovoTipo(AOrdinalNovoTipo node)
    {
        defaultIn(node);
    }

    public void outAOrdinalNovoTipo(AOrdinalNovoTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrdinalNovoTipo(AOrdinalNovoTipo node)
    {
        inAOrdinalNovoTipo(node);
        if(node.getNovoTipoOrdinal() != null)
        {
            node.getNovoTipoOrdinal().apply(this);
        }
        outAOrdinalNovoTipo(node);
    }

    public void inAArrayNovoTipo(AArrayNovoTipo node)
    {
        defaultIn(node);
    }

    public void outAArrayNovoTipo(AArrayNovoTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayNovoTipo(AArrayNovoTipo node)
    {
        inAArrayNovoTipo(node);
        if(node.getTipoArray() != null)
        {
            node.getTipoArray().apply(this);
        }
        outAArrayNovoTipo(node);
    }

    public void inATipoArray(ATipoArray node)
    {
        defaultIn(node);
    }

    public void outATipoArray(ATipoArray node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoArray(ATipoArray node)
    {
        inATipoArray(node);
        if(node.getDenotadorTipo() != null)
        {
            node.getDenotadorTipo().apply(this);
        }
        if(node.getOf() != null)
        {
            node.getOf().apply(this);
        }
        if(node.getFechaColchete() != null)
        {
            node.getFechaColchete().apply(this);
        }
        if(node.getTiposOrdinais() != null)
        {
            node.getTiposOrdinais().apply(this);
        }
        if(node.getAbreColchete() != null)
        {
            node.getAbreColchete().apply(this);
        }
        if(node.getArray() != null)
        {
            node.getArray().apply(this);
        }
        outATipoArray(node);
    }

    public void inAUnicoTiposOrdinais(AUnicoTiposOrdinais node)
    {
        defaultIn(node);
    }

    public void outAUnicoTiposOrdinais(AUnicoTiposOrdinais node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnicoTiposOrdinais(AUnicoTiposOrdinais node)
    {
        inAUnicoTiposOrdinais(node);
        if(node.getTipoOrdinal() != null)
        {
            node.getTipoOrdinal().apply(this);
        }
        outAUnicoTiposOrdinais(node);
    }

    public void inAMultiploTiposOrdinais(AMultiploTiposOrdinais node)
    {
        defaultIn(node);
    }

    public void outAMultiploTiposOrdinais(AMultiploTiposOrdinais node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiploTiposOrdinais(AMultiploTiposOrdinais node)
    {
        inAMultiploTiposOrdinais(node);
        if(node.getTipoOrdinal() != null)
        {
            node.getTipoOrdinal().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getTiposOrdinais() != null)
        {
            node.getTiposOrdinais().apply(this);
        }
        outAMultiploTiposOrdinais(node);
    }

    public void inANovoTipoOrdinal(ANovoTipoOrdinal node)
    {
        defaultIn(node);
    }

    public void outANovoTipoOrdinal(ANovoTipoOrdinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANovoTipoOrdinal(ANovoTipoOrdinal node)
    {
        inANovoTipoOrdinal(node);
        if(node.getNovoTipoOrdinal() != null)
        {
            node.getNovoTipoOrdinal().apply(this);
        }
        outANovoTipoOrdinal(node);
    }

    public void inAExistenteTipoOrdinal(AExistenteTipoOrdinal node)
    {
        defaultIn(node);
    }

    public void outAExistenteTipoOrdinal(AExistenteTipoOrdinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExistenteTipoOrdinal(AExistenteTipoOrdinal node)
    {
        inAExistenteTipoOrdinal(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAExistenteTipoOrdinal(node);
    }

    public void inAEnumeradoNovoTipoOrdinal(AEnumeradoNovoTipoOrdinal node)
    {
        defaultIn(node);
    }

    public void outAEnumeradoNovoTipoOrdinal(AEnumeradoNovoTipoOrdinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnumeradoNovoTipoOrdinal(AEnumeradoNovoTipoOrdinal node)
    {
        inAEnumeradoNovoTipoOrdinal(node);
        if(node.getTipoEnumerado() != null)
        {
            node.getTipoEnumerado().apply(this);
        }
        outAEnumeradoNovoTipoOrdinal(node);
    }

    public void inASubrangeNovoTipoOrdinal(ASubrangeNovoTipoOrdinal node)
    {
        defaultIn(node);
    }

    public void outASubrangeNovoTipoOrdinal(ASubrangeNovoTipoOrdinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubrangeNovoTipoOrdinal(ASubrangeNovoTipoOrdinal node)
    {
        inASubrangeNovoTipoOrdinal(node);
        if(node.getTipoSubrange() != null)
        {
            node.getTipoSubrange().apply(this);
        }
        outASubrangeNovoTipoOrdinal(node);
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
        if(node.getFechaParenteses() != null)
        {
            node.getFechaParenteses().apply(this);
        }
        if(node.getIdentificadores() != null)
        {
            node.getIdentificadores().apply(this);
        }
        if(node.getAbreParenteses() != null)
        {
            node.getAbreParenteses().apply(this);
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
        if(node.getFim() != null)
        {
            node.getFim().apply(this);
        }
        if(node.getPontoPonto() != null)
        {
            node.getPontoPonto().apply(this);
        }
        if(node.getInicio() != null)
        {
            node.getInicio().apply(this);
        }
        outATipoSubrange(node);
    }
}
