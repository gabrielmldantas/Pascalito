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

    public void inABooleanConstante(ABooleanConstante node)
    {
        defaultIn(node);
    }

    public void outABooleanConstante(ABooleanConstante node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooleanConstante(ABooleanConstante node)
    {
        inABooleanConstante(node);
        if(node.getConstBooleana() != null)
        {
            node.getConstBooleana().apply(this);
        }
        outABooleanConstante(node);
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
        {
            List<PDeclaracaoVariavel> copy = new ArrayList<PDeclaracaoVariavel>(node.getDeclaracaoVariavel());
            for(PDeclaracaoVariavel e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PDeclaracaoProcOuFuncao> copy = new ArrayList<PDeclaracaoProcOuFuncao>(node.getDeclaracaoProcOuFuncao());
            for(PDeclaracaoProcOuFuncao e : copy)
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

    public void inAArrayDenotadorTipo(AArrayDenotadorTipo node)
    {
        defaultIn(node);
    }

    public void outAArrayDenotadorTipo(AArrayDenotadorTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayDenotadorTipo(AArrayDenotadorTipo node)
    {
        inAArrayDenotadorTipo(node);
        if(node.getTipoArray() != null)
        {
            node.getTipoArray().apply(this);
        }
        outAArrayDenotadorTipo(node);
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

    public void inAIdTipoIdOuPrimitivo(AIdTipoIdOuPrimitivo node)
    {
        defaultIn(node);
    }

    public void outAIdTipoIdOuPrimitivo(AIdTipoIdOuPrimitivo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdTipoIdOuPrimitivo(AIdTipoIdOuPrimitivo node)
    {
        inAIdTipoIdOuPrimitivo(node);
        if(node.getTipoIdentificador() != null)
        {
            node.getTipoIdentificador().apply(this);
        }
        outAIdTipoIdOuPrimitivo(node);
    }

    public void inAPrimitivoTipoIdOuPrimitivo(APrimitivoTipoIdOuPrimitivo node)
    {
        defaultIn(node);
    }

    public void outAPrimitivoTipoIdOuPrimitivo(APrimitivoTipoIdOuPrimitivo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrimitivoTipoIdOuPrimitivo(APrimitivoTipoIdOuPrimitivo node)
    {
        inAPrimitivoTipoIdOuPrimitivo(node);
        if(node.getTipoPrimitivo() != null)
        {
            node.getTipoPrimitivo().apply(this);
        }
        outAPrimitivoTipoIdOuPrimitivo(node);
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
        {
            List<PTipoIdOuOrdinal> copy = new ArrayList<PTipoIdOuOrdinal>(node.getTipoIdOuOrdinal());
            for(PTipoIdOuOrdinal e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getDenotadorTipo() != null)
        {
            node.getDenotadorTipo().apply(this);
        }
        outATipoArray(node);
    }

    public void inAMaisSinal(AMaisSinal node)
    {
        defaultIn(node);
    }

    public void outAMaisSinal(AMaisSinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaisSinal(AMaisSinal node)
    {
        inAMaisSinal(node);
        if(node.getSoma() != null)
        {
            node.getSoma().apply(this);
        }
        outAMaisSinal(node);
    }

    public void inAMenosSinal(AMenosSinal node)
    {
        defaultIn(node);
    }

    public void outAMenosSinal(AMenosSinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosSinal(AMenosSinal node)
    {
        inAMenosSinal(node);
        if(node.getSubtracao() != null)
        {
            node.getSubtracao().apply(this);
        }
        outAMenosSinal(node);
    }

    public void inADeclaracaoVariavel(ADeclaracaoVariavel node)
    {
        defaultIn(node);
    }

    public void outADeclaracaoVariavel(ADeclaracaoVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracaoVariavel(ADeclaracaoVariavel node)
    {
        inADeclaracaoVariavel(node);
        {
            List<PString> copy = new ArrayList<PString>(node.getString());
            for(PString e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getDenotadorTipo() != null)
        {
            node.getDenotadorTipo().apply(this);
        }
        outADeclaracaoVariavel(node);
    }

    public void inAProcedureDeclaracaoProcOuFuncao(AProcedureDeclaracaoProcOuFuncao node)
    {
        defaultIn(node);
    }

    public void outAProcedureDeclaracaoProcOuFuncao(AProcedureDeclaracaoProcOuFuncao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProcedureDeclaracaoProcOuFuncao(AProcedureDeclaracaoProcOuFuncao node)
    {
        inAProcedureDeclaracaoProcOuFuncao(node);
        if(node.getDeclaracaoProcedure() != null)
        {
            node.getDeclaracaoProcedure().apply(this);
        }
        outAProcedureDeclaracaoProcOuFuncao(node);
    }

    public void inAFuncaoDeclaracaoProcOuFuncao(AFuncaoDeclaracaoProcOuFuncao node)
    {
        defaultIn(node);
    }

    public void outAFuncaoDeclaracaoProcOuFuncao(AFuncaoDeclaracaoProcOuFuncao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncaoDeclaracaoProcOuFuncao(AFuncaoDeclaracaoProcOuFuncao node)
    {
        inAFuncaoDeclaracaoProcOuFuncao(node);
        if(node.getDeclaracaoFuncao() != null)
        {
            node.getDeclaracaoFuncao().apply(this);
        }
        outAFuncaoDeclaracaoProcOuFuncao(node);
    }

    public void inADeclaracaoProcedure(ADeclaracaoProcedure node)
    {
        defaultIn(node);
    }

    public void outADeclaracaoProcedure(ADeclaracaoProcedure node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracaoProcedure(ADeclaracaoProcedure node)
    {
        inADeclaracaoProcedure(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        {
            List<PParametroFormal> copy = new ArrayList<PParametroFormal>(node.getParametroFormal());
            for(PParametroFormal e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getBloco() != null)
        {
            node.getBloco().apply(this);
        }
        outADeclaracaoProcedure(node);
    }

    public void inAValorParametroFormal(AValorParametroFormal node)
    {
        defaultIn(node);
    }

    public void outAValorParametroFormal(AValorParametroFormal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorParametroFormal(AValorParametroFormal node)
    {
        inAValorParametroFormal(node);
        {
            List<PValorFormal> copy = new ArrayList<PValorFormal>(node.getValorFormal());
            for(PValorFormal e : copy)
            {
                e.apply(this);
            }
        }
        outAValorParametroFormal(node);
    }

    public void inARefParametroFormal(ARefParametroFormal node)
    {
        defaultIn(node);
    }

    public void outARefParametroFormal(ARefParametroFormal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARefParametroFormal(ARefParametroFormal node)
    {
        inARefParametroFormal(node);
        {
            List<PRefFormal> copy = new ArrayList<PRefFormal>(node.getRefFormal());
            for(PRefFormal e : copy)
            {
                e.apply(this);
            }
        }
        outARefParametroFormal(node);
    }

    public void inAValorFormal(AValorFormal node)
    {
        defaultIn(node);
    }

    public void outAValorFormal(AValorFormal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorFormal(AValorFormal node)
    {
        inAValorFormal(node);
        {
            List<PString> copy = new ArrayList<PString>(node.getString());
            for(PString e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getTipoIdOuPrimitivo() != null)
        {
            node.getTipoIdOuPrimitivo().apply(this);
        }
        outAValorFormal(node);
    }

    public void inARefFormal(ARefFormal node)
    {
        defaultIn(node);
    }

    public void outARefFormal(ARefFormal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARefFormal(ARefFormal node)
    {
        inARefFormal(node);
        {
            List<PString> copy = new ArrayList<PString>(node.getString());
            for(PString e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getTipoIdOuPrimitivo() != null)
        {
            node.getTipoIdOuPrimitivo().apply(this);
        }
        outARefFormal(node);
    }

    public void inADeclaracaoFuncao(ADeclaracaoFuncao node)
    {
        defaultIn(node);
    }

    public void outADeclaracaoFuncao(ADeclaracaoFuncao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracaoFuncao(ADeclaracaoFuncao node)
    {
        inADeclaracaoFuncao(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        {
            List<PParametroFormal> copy = new ArrayList<PParametroFormal>(node.getParametroFormal());
            for(PParametroFormal e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getTipoIdOuPrimitivo() != null)
        {
            node.getTipoIdOuPrimitivo().apply(this);
        }
        if(node.getBloco() != null)
        {
            node.getBloco().apply(this);
        }
        outADeclaracaoFuncao(node);
    }

    public void inAVaziaSentenca(AVaziaSentenca node)
    {
        defaultIn(node);
    }

    public void outAVaziaSentenca(AVaziaSentenca node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVaziaSentenca(AVaziaSentenca node)
    {
        inAVaziaSentenca(node);
        outAVaziaSentenca(node);
    }

    public void inAAtribuicaoSentenca(AAtribuicaoSentenca node)
    {
        defaultIn(node);
    }

    public void outAAtribuicaoSentenca(AAtribuicaoSentenca node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicaoSentenca(AAtribuicaoSentenca node)
    {
        inAAtribuicaoSentenca(node);
        if(node.getAcessoVariavel() != null)
        {
            node.getAcessoVariavel().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAAtribuicaoSentenca(node);
    }

    public void inAProcedureSentenca(AProcedureSentenca node)
    {
        defaultIn(node);
    }

    public void outAProcedureSentenca(AProcedureSentenca node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProcedureSentenca(AProcedureSentenca node)
    {
        inAProcedureSentenca(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        {
            List<PExpressao> copy = new ArrayList<PExpressao>(node.getExpressao());
            for(PExpressao e : copy)
            {
                e.apply(this);
            }
        }
        outAProcedureSentenca(node);
    }

    public void inAGotoSentenca(AGotoSentenca node)
    {
        defaultIn(node);
    }

    public void outAGotoSentenca(AGotoSentenca node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGotoSentenca(AGotoSentenca node)
    {
        inAGotoSentenca(node);
        if(node.getNumeroSemSinal() != null)
        {
            node.getNumeroSemSinal().apply(this);
        }
        outAGotoSentenca(node);
    }

    public void inAIfSentenca(AIfSentenca node)
    {
        defaultIn(node);
    }

    public void outAIfSentenca(AIfSentenca node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfSentenca(AIfSentenca node)
    {
        inAIfSentenca(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        outAIfSentenca(node);
    }

    public void inAWhileSentenca(AWhileSentenca node)
    {
        defaultIn(node);
    }

    public void outAWhileSentenca(AWhileSentenca node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileSentenca(AWhileSentenca node)
    {
        inAWhileSentenca(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getSentenca() != null)
        {
            node.getSentenca().apply(this);
        }
        outAWhileSentenca(node);
    }

    public void inACompostaSentenca(ACompostaSentenca node)
    {
        defaultIn(node);
    }

    public void outACompostaSentenca(ACompostaSentenca node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompostaSentenca(ACompostaSentenca node)
    {
        inACompostaSentenca(node);
        {
            List<PSentenca> copy = new ArrayList<PSentenca>(node.getSentenca());
            for(PSentenca e : copy)
            {
                e.apply(this);
            }
        }
        outACompostaSentenca(node);
    }

    public void inAVariavelAcessoVariavel(AVariavelAcessoVariavel node)
    {
        defaultIn(node);
    }

    public void outAVariavelAcessoVariavel(AVariavelAcessoVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelAcessoVariavel(AVariavelAcessoVariavel node)
    {
        inAVariavelAcessoVariavel(node);
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        outAVariavelAcessoVariavel(node);
    }

    public void inAVarIndexadaAcessoVariavel(AVarIndexadaAcessoVariavel node)
    {
        defaultIn(node);
    }

    public void outAVarIndexadaAcessoVariavel(AVarIndexadaAcessoVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarIndexadaAcessoVariavel(AVarIndexadaAcessoVariavel node)
    {
        inAVarIndexadaAcessoVariavel(node);
        if(node.getVariavelIndexada() != null)
        {
            node.getVariavelIndexada().apply(this);
        }
        outAVarIndexadaAcessoVariavel(node);
    }

    public void inAVariavel(AVariavel node)
    {
        defaultIn(node);
    }

    public void outAVariavel(AVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavel(AVariavel node)
    {
        inAVariavel(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAVariavel(node);
    }

    public void inAVariavelIndexada(AVariavelIndexada node)
    {
        defaultIn(node);
    }

    public void outAVariavelIndexada(AVariavelIndexada node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelIndexada(AVariavelIndexada node)
    {
        inAVariavelIndexada(node);
        if(node.getAcessoVariavel() != null)
        {
            node.getAcessoVariavel().apply(this);
        }
        {
            List<PExpressao> copy = new ArrayList<PExpressao>(node.getExpressao());
            for(PExpressao e : copy)
            {
                e.apply(this);
            }
        }
        outAVariavelIndexada(node);
    }

    public void inAVariavelExpressao(AVariavelExpressao node)
    {
        defaultIn(node);
    }

    public void outAVariavelExpressao(AVariavelExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelExpressao(AVariavelExpressao node)
    {
        inAVariavelExpressao(node);
        if(node.getAcessoVariavel() != null)
        {
            node.getAcessoVariavel().apply(this);
        }
        outAVariavelExpressao(node);
    }

    public void inAExpBinAritExpressao(AExpBinAritExpressao node)
    {
        defaultIn(node);
    }

    public void outAExpBinAritExpressao(AExpBinAritExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpBinAritExpressao(AExpBinAritExpressao node)
    {
        inAExpBinAritExpressao(node);
        if(node.getOperadorAritmeticoBinario() != null)
        {
            node.getOperadorAritmeticoBinario().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAExpBinAritExpressao(node);
    }

    public void inAExpBinBooleanExpressao(AExpBinBooleanExpressao node)
    {
        defaultIn(node);
    }

    public void outAExpBinBooleanExpressao(AExpBinBooleanExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpBinBooleanExpressao(AExpBinBooleanExpressao node)
    {
        inAExpBinBooleanExpressao(node);
        if(node.getOperadorBooleanoBinario() != null)
        {
            node.getOperadorBooleanoBinario().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAExpBinBooleanExpressao(node);
    }

    public void inAExpRelacionalExpressao(AExpRelacionalExpressao node)
    {
        defaultIn(node);
    }

    public void outAExpRelacionalExpressao(AExpRelacionalExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpRelacionalExpressao(AExpRelacionalExpressao node)
    {
        inAExpRelacionalExpressao(node);
        if(node.getOperadorRelacional() != null)
        {
            node.getOperadorRelacional().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAExpRelacionalExpressao(node);
    }

    public void inASignedExpressao(ASignedExpressao node)
    {
        defaultIn(node);
    }

    public void outASignedExpressao(ASignedExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASignedExpressao(ASignedExpressao node)
    {
        inASignedExpressao(node);
        {
            List<PSinal> copy = new ArrayList<PSinal>(node.getSinal());
            for(PSinal e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outASignedExpressao(node);
    }

    public void inANotExpressao(ANotExpressao node)
    {
        defaultIn(node);
    }

    public void outANotExpressao(ANotExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotExpressao(ANotExpressao node)
    {
        inANotExpressao(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outANotExpressao(node);
    }

    public void inAFuncaoExpressao(AFuncaoExpressao node)
    {
        defaultIn(node);
    }

    public void outAFuncaoExpressao(AFuncaoExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncaoExpressao(AFuncaoExpressao node)
    {
        inAFuncaoExpressao(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        {
            List<PExpressao> copy = new ArrayList<PExpressao>(node.getExpressao());
            for(PExpressao e : copy)
            {
                e.apply(this);
            }
        }
        outAFuncaoExpressao(node);
    }

    public void inAConstanteExpressao(AConstanteExpressao node)
    {
        defaultIn(node);
    }

    public void outAConstanteExpressao(AConstanteExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstanteExpressao(AConstanteExpressao node)
    {
        inAConstanteExpressao(node);
        if(node.getConstante() != null)
        {
            node.getConstante().apply(this);
        }
        outAConstanteExpressao(node);
    }

    public void inADivOperadorAritmeticoBinario(ADivOperadorAritmeticoBinario node)
    {
        defaultIn(node);
    }

    public void outADivOperadorAritmeticoBinario(ADivOperadorAritmeticoBinario node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivOperadorAritmeticoBinario(ADivOperadorAritmeticoBinario node)
    {
        inADivOperadorAritmeticoBinario(node);
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        outADivOperadorAritmeticoBinario(node);
    }

    public void inAModOperadorAritmeticoBinario(AModOperadorAritmeticoBinario node)
    {
        defaultIn(node);
    }

    public void outAModOperadorAritmeticoBinario(AModOperadorAritmeticoBinario node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModOperadorAritmeticoBinario(AModOperadorAritmeticoBinario node)
    {
        inAModOperadorAritmeticoBinario(node);
        if(node.getMod() != null)
        {
            node.getMod().apply(this);
        }
        outAModOperadorAritmeticoBinario(node);
    }

    public void inASomaSubOperadorAritmeticoBinario(ASomaSubOperadorAritmeticoBinario node)
    {
        defaultIn(node);
    }

    public void outASomaSubOperadorAritmeticoBinario(ASomaSubOperadorAritmeticoBinario node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomaSubOperadorAritmeticoBinario(ASomaSubOperadorAritmeticoBinario node)
    {
        inASomaSubOperadorAritmeticoBinario(node);
        if(node.getSinal() != null)
        {
            node.getSinal().apply(this);
        }
        outASomaSubOperadorAritmeticoBinario(node);
    }

    public void inAMultiplicacaoOperadorAritmeticoBinario(AMultiplicacaoOperadorAritmeticoBinario node)
    {
        defaultIn(node);
    }

    public void outAMultiplicacaoOperadorAritmeticoBinario(AMultiplicacaoOperadorAritmeticoBinario node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplicacaoOperadorAritmeticoBinario(AMultiplicacaoOperadorAritmeticoBinario node)
    {
        inAMultiplicacaoOperadorAritmeticoBinario(node);
        if(node.getMultiplicacao() != null)
        {
            node.getMultiplicacao().apply(this);
        }
        outAMultiplicacaoOperadorAritmeticoBinario(node);
    }

    public void inADivisaoOperadorAritmeticoBinario(ADivisaoOperadorAritmeticoBinario node)
    {
        defaultIn(node);
    }

    public void outADivisaoOperadorAritmeticoBinario(ADivisaoOperadorAritmeticoBinario node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivisaoOperadorAritmeticoBinario(ADivisaoOperadorAritmeticoBinario node)
    {
        inADivisaoOperadorAritmeticoBinario(node);
        if(node.getDivisao() != null)
        {
            node.getDivisao().apply(this);
        }
        outADivisaoOperadorAritmeticoBinario(node);
    }

    public void inAAndOperadorBooleanoBinario(AAndOperadorBooleanoBinario node)
    {
        defaultIn(node);
    }

    public void outAAndOperadorBooleanoBinario(AAndOperadorBooleanoBinario node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndOperadorBooleanoBinario(AAndOperadorBooleanoBinario node)
    {
        inAAndOperadorBooleanoBinario(node);
        if(node.getAnd() != null)
        {
            node.getAnd().apply(this);
        }
        outAAndOperadorBooleanoBinario(node);
    }

    public void inAOrOperadorBooleanoBinario(AOrOperadorBooleanoBinario node)
    {
        defaultIn(node);
    }

    public void outAOrOperadorBooleanoBinario(AOrOperadorBooleanoBinario node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrOperadorBooleanoBinario(AOrOperadorBooleanoBinario node)
    {
        inAOrOperadorBooleanoBinario(node);
        if(node.getOr() != null)
        {
            node.getOr().apply(this);
        }
        outAOrOperadorBooleanoBinario(node);
    }

    public void inAIgualOperadorRelacional(AIgualOperadorRelacional node)
    {
        defaultIn(node);
    }

    public void outAIgualOperadorRelacional(AIgualOperadorRelacional node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualOperadorRelacional(AIgualOperadorRelacional node)
    {
        inAIgualOperadorRelacional(node);
        if(node.getIgual() != null)
        {
            node.getIgual().apply(this);
        }
        outAIgualOperadorRelacional(node);
    }

    public void inADiferenteOperadorRelacional(ADiferenteOperadorRelacional node)
    {
        defaultIn(node);
    }

    public void outADiferenteOperadorRelacional(ADiferenteOperadorRelacional node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiferenteOperadorRelacional(ADiferenteOperadorRelacional node)
    {
        inADiferenteOperadorRelacional(node);
        if(node.getDiferente() != null)
        {
            node.getDiferente().apply(this);
        }
        outADiferenteOperadorRelacional(node);
    }

    public void inAMaiorOperadorRelacional(AMaiorOperadorRelacional node)
    {
        defaultIn(node);
    }

    public void outAMaiorOperadorRelacional(AMaiorOperadorRelacional node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorOperadorRelacional(AMaiorOperadorRelacional node)
    {
        inAMaiorOperadorRelacional(node);
        if(node.getMaior() != null)
        {
            node.getMaior().apply(this);
        }
        outAMaiorOperadorRelacional(node);
    }

    public void inAMaiorIgualOperadorRelacional(AMaiorIgualOperadorRelacional node)
    {
        defaultIn(node);
    }

    public void outAMaiorIgualOperadorRelacional(AMaiorIgualOperadorRelacional node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorIgualOperadorRelacional(AMaiorIgualOperadorRelacional node)
    {
        inAMaiorIgualOperadorRelacional(node);
        if(node.getMaiorIgual() != null)
        {
            node.getMaiorIgual().apply(this);
        }
        outAMaiorIgualOperadorRelacional(node);
    }

    public void inAMenorOperadorRelacional(AMenorOperadorRelacional node)
    {
        defaultIn(node);
    }

    public void outAMenorOperadorRelacional(AMenorOperadorRelacional node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorOperadorRelacional(AMenorOperadorRelacional node)
    {
        inAMenorOperadorRelacional(node);
        if(node.getMenor() != null)
        {
            node.getMenor().apply(this);
        }
        outAMenorOperadorRelacional(node);
    }

    public void inAMenorIgualOperadorRelacional(AMenorIgualOperadorRelacional node)
    {
        defaultIn(node);
    }

    public void outAMenorIgualOperadorRelacional(AMenorIgualOperadorRelacional node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorIgualOperadorRelacional(AMenorIgualOperadorRelacional node)
    {
        inAMenorIgualOperadorRelacional(node);
        if(node.getMenorIgual() != null)
        {
            node.getMenorIgual().apply(this);
        }
        outAMenorIgualOperadorRelacional(node);
    }
}
