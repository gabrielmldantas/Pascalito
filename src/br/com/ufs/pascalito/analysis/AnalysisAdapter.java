/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.analysis;

import java.util.*;
import br.com.ufs.pascalito.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoCabecalhoPrograma(AUnicoCabecalhoPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploCabecalhoPrograma(AMultiploCabecalhoPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABloco(ABloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoIdentificadores(AUnicoIdentificadores node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploIdentificadores(AMultiploIdentificadores node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntegerIdentificadorTipoOrdinal(AIntegerIdentificadorTipoOrdinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringIdentificadorTipoOrdinal(AStringIdentificadorTipoOrdinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanIdentificadorTipoOrdinal(ABooleanIdentificadorTipoOrdinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentificadorIdentificadorTipo(AIdentificadorIdentificadorTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrdinalIdentificadorTipo(AOrdinalIdentificadorTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoLabels(ADeclaracaoLabels node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyDeclaracaoLabels(AEmptyDeclaracaoLabels node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoLabels(AUnicoLabels node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploLabels(AMultiploLabels node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALabel(ALabel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstNumeroSemSinal(AConstNumeroSemSinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoTipos(ADeclaracaoTipos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyDeclaracaoTipos(AEmptyDeclaracaoTipos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoDefinicaoTipos(AUnicoDefinicaoTipos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploDefinicaoTipos(AMultiploDefinicaoTipos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExistenteDenotadorTipo(AExistenteDenotadorTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANovoDenotadorTipo(ANovoDenotadorTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrdinalDenotadorTipo(AOrdinalDenotadorTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrdinalNovoTipo(AOrdinalNovoTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayNovoTipo(AArrayNovoTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoArray(ATipoArray node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoTiposOrdinais(AUnicoTiposOrdinais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploTiposOrdinais(AMultiploTiposOrdinais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANovoTipoOrdinal(ANovoTipoOrdinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExistenteTipoOrdinal(AExistenteTipoOrdinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnumeradoNovoTipoOrdinal(AEnumeradoNovoTipoOrdinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubrangeNovoTipoOrdinal(ASubrangeNovoTipoOrdinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoEnumerado(ATipoEnumerado node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoSubrange(ATipoSubrange node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroConstante(ANumeroConstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringConstante(AStringConstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroConstanteSemSinal(ANumeroConstanteSemSinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringConstanteSemSinal(AStringConstanteSemSinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracoesVariaveis(ADeclaracoesVariaveis node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyDeclaracoesVariaveis(AEmptyDeclaracoesVariaveis node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoDeclaracaoVariaveis(AUnicoDeclaracaoVariaveis node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploDeclaracaoVariaveis(AMultiploDeclaracaoVariaveis node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoVariavel(ADeclaracaoVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracoesProcFuncoes(ADeclaracoesProcFuncoes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyDeclaracoesProcFuncoes(AEmptyDeclaracoesProcFuncoes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoDeclaracaoProcFuncoes(AUnicoDeclaracaoProcFuncoes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploDeclaracaoProcFuncoes(AMultiploDeclaracaoProcFuncoes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProcedureDeclaracaoProcFuncao(AProcedureDeclaracaoProcFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncaoDeclaracaoProcFuncao(AFuncaoDeclaracaoProcFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoProcedure(ADeclaracaoProcedure node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoFuncao(ADeclaracaoFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACabecalhoProcedure(ACabecalhoProcedure node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACabecalhoFuncao(ACabecalhoFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametrosFormais(AParametrosFormais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyParametrosFormais(AEmptyParametrosFormais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoSecaoParametrosFormais(AUnicoSecaoParametrosFormais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploSecaoParametrosFormais(AMultiploSecaoParametrosFormais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorSecaoParametroFormal(AValorSecaoParametroFormal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelSecaoParametroFormal(AVariavelSecaoParametroFormal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArraySecaoParametroFormal(AArraySecaoParametroFormal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASpecParamValor(ASpecParamValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASpecParamVariavel(ASpecParamVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorSpecParamArray(AValorSpecParamArray node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelSpecParamArray(AVariavelSpecParamArray node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASpecParamArrayValor(ASpecParamArrayValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASpecParamArrayVariavel(ASpecParamArrayVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASchemaArray(ASchemaArray node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoSpecTiposIndices(AUnicoSpecTiposIndices node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploSpecTiposIndices(AMultiploSpecTiposIndices node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASpecTipoIndice(ASpecTipoIndice node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentificadorIdentificadorSchemaArray(AIdentificadorIdentificadorSchemaArray node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayIdentificadorSchemaArray(AArrayIdentificadorSchemaArray node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExistenteTipoResultado(AExistenteTipoResultado node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrdinalTipoResultado(AOrdinalTipoResultado node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASentencaComposta(ASentencaComposta node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoSequenciaSentencas(AUnicoSequenciaSentencas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploSequenciaSentencas(AMultiploSequenciaSentencas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimplesSentenca(ASimplesSentenca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEstruturadaSentenca(AEstruturadaSentenca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALabelSentenca(ALabelSentenca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyLabelSentenca(AEmptyLabelSentenca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimplesDefinicaoSentenca(ASimplesDefinicaoSentenca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEstruturadaDefinicaoSentenca(AEstruturadaDefinicaoSentenca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEstruturadaFechadaDefinicaoSentenca(AEstruturadaFechadaDefinicaoSentenca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimplesDefinicaoSentencaFechada(ASimplesDefinicaoSentencaFechada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEstruturadaDefinicaoSentencaFechada(AEstruturadaDefinicaoSentencaFechada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefinicaoSentencaSimples(ADefinicaoSentencaSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefinicaoSentencaEstruturada(ADefinicaoSentencaEstruturada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefinicaoSentencaEstruturadaFechada(ADefinicaoSentencaEstruturadaFechada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoSentencaSimples(AAtribuicaoSentencaSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProcedureSentencaSimples(AProcedureSentencaSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGotoSentencaSimples(AGotoSentencaSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptySentencaSimples(AEmptySentencaSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASentencaAtribuicao(ASentencaAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASentencaProcFuncao(ASentencaProcFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametrosReais(AParametrosReais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyParametrosReais(AEmptyParametrosReais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoDefinicaoParametrosReais(AUnicoDefinicaoParametrosReais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploDefinicaoParametrosReais(AMultiploDefinicaoParametrosReais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACompostaSentencaEstruturada(ACompostaSentencaEstruturada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileSentencaEstruturada(AWhileSentencaEstruturada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfSentencaEstruturada(AIfSentencaEstruturada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACompostaSentencaEstruturadaFechada(ACompostaSentencaEstruturadaFechada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileSentencaEstruturadaFechada(AWhileSentencaEstruturadaFechada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASentencaWhile(ASentencaWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEstruturadaSentencaWhile(AEstruturadaSentencaWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASentencaWhileFechada(ASentencaWhileFechada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASentencaGoto(ASentencaGoto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASentencaIf(ASentencaIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElseSentencaIf(AElseSentencaIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfSentencaIfFechada(AIfSentencaIfFechada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASentencaIfFechada(ASentencaIfFechada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAcessoVariavel(AAcessoVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIndexadaAcessoVariavel(AIndexadaAcessoVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelIndexada(AVariavelIndexada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoExpressoes(AUnicoExpressoes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploExpressoes(AMultiploExpressoes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressao(AExpressao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressaoRelacional(AExpressaoRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyExpressaoRelacional(AEmptyExpressaoRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoComSinalExpressaoSimples(AUnicoComSinalExpressaoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoSemSinalExpressaoSimples(AUnicoSemSinalExpressaoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploSemSinalExpressaoSimples(AMultiploSemSinalExpressaoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploComSinalExpressaoSimples(AMultiploComSinalExpressaoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoTermo(AUnicoTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiploTermo(AMultiploTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstanteSemSinalFator(AConstanteSemSinalFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressaoFator(AExpressaoFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotFator(ANotFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncaoOuVariavelFator(AFuncaoOuVariavelFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarIndexadaFator(AVarIndexadaFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorOperadorRelacional(AMenorOperadorRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorIgualOperadorRelacional(AMenorIgualOperadorRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorOperadorRelacional(AMaiorOperadorRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorIgualOperadorRelacional(AMaiorIgualOperadorRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualOperadorRelacional(AIgualOperadorRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiferenteOperadorRelacional(ADiferenteOperadorRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaSubOperadorAditivo(ASomaSubOperadorAditivo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrOperadorAditivo(AOrOperadorAditivo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplicacaoOperadorMultiplicativo(AMultiplicacaoOperadorMultiplicativo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisaoOperadorMultiplicativo(ADivisaoOperadorMultiplicativo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAndOperadorMultiplicativo(AAndOperadorMultiplicativo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivOperadorMultiplicativo(ADivOperadorMultiplicativo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModOperadorMultiplicativo(AModOperadorMultiplicativo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteger(TInteger node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBoolean(TBoolean node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTArray(TArray node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTThen(TThen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFor(TFor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCase(TCase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOf(TOf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBegin(TBegin node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnd(TEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgram(TProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVar(TVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFunction(TFunction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLabel(TLabel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProcedure(TProcedure node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDo(TDo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTType(TType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGoto(TGoto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstBooleana(TConstBooleana node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentificador(TIdentificador node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoEVirgula(TPontoEVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoPonto(TPontoPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreParenteses(TAbreParenteses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaParenteses(TFechaParenteses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreColchete(TAbreColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaColchete(TFechaColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstInteiro(TConstInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSinal(TSinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMultiplicacao(TMultiplicacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivisao(TDivisao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentLinha(TComentLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentBloco(TComentBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentBlocoFim(TComentBlocoFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentBlocoCorpo(TComentBlocoCorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAsterico(TAsterico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarra(TBarra node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstString(TConstString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstStringCorpo(TConstStringCorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAspaSimples(TAspaSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNewline(TNewline node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
