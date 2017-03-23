/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.analysis;

import br.com.ufs.pascalito.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgram(AProgram node);
    void caseAUnicoCabecalhoPrograma(AUnicoCabecalhoPrograma node);
    void caseAMultiploCabecalhoPrograma(AMultiploCabecalhoPrograma node);
    void caseABloco(ABloco node);
    void caseAUnicoIdentificadores(AUnicoIdentificadores node);
    void caseAMultiploIdentificadores(AMultiploIdentificadores node);
    void caseAIntegerIdentificadorTipoOrdinal(AIntegerIdentificadorTipoOrdinal node);
    void caseAStringIdentificadorTipoOrdinal(AStringIdentificadorTipoOrdinal node);
    void caseARealIdentificadorTipoOrdinal(ARealIdentificadorTipoOrdinal node);
    void caseABooleanIdentificadorTipoOrdinal(ABooleanIdentificadorTipoOrdinal node);
    void caseADeclaracaoLabels(ADeclaracaoLabels node);
    void caseAEmptyDeclaracaoLabels(AEmptyDeclaracaoLabels node);
    void caseAUnicoLabels(AUnicoLabels node);
    void caseAMultiploLabels(AMultiploLabels node);
    void caseALabel(ALabel node);
    void caseADeclaracaoTipos(ADeclaracaoTipos node);
    void caseAEmptyDeclaracaoTipos(AEmptyDeclaracaoTipos node);
    void caseAUnicoDefinicaoTipos(AUnicoDefinicaoTipos node);
    void caseAMultiploDefinicaoTipos(AMultiploDefinicaoTipos node);
    void caseAExistenteDenotadorTipo(AExistenteDenotadorTipo node);
    void caseANovoDenotadorTipo(ANovoDenotadorTipo node);
    void caseAOrdinalDenotadorTipo(AOrdinalDenotadorTipo node);
    void caseAOrdinalNovoTipo(AOrdinalNovoTipo node);
    void caseAArrayNovoTipo(AArrayNovoTipo node);
    void caseATipoArray(ATipoArray node);
    void caseAUnicoTiposOrdinais(AUnicoTiposOrdinais node);
    void caseAMultiploTiposOrdinais(AMultiploTiposOrdinais node);
    void caseANovoTipoOrdinal(ANovoTipoOrdinal node);
    void caseAExistenteTipoOrdinal(AExistenteTipoOrdinal node);
    void caseAEnumeradoNovoTipoOrdinal(AEnumeradoNovoTipoOrdinal node);
    void caseASubrangeNovoTipoOrdinal(ASubrangeNovoTipoOrdinal node);
    void caseATipoEnumerado(ATipoEnumerado node);
    void caseATipoSubrange(ATipoSubrange node);
    void caseAInteiroConstante(AInteiroConstante node);
    void caseAStringConstante(AStringConstante node);
    void caseADeclaracoesVariaveis(ADeclaracoesVariaveis node);
    void caseAEmptyDeclaracoesVariaveis(AEmptyDeclaracoesVariaveis node);
    void caseAUnicoDeclaracaoVariaveis(AUnicoDeclaracaoVariaveis node);
    void caseAMultiploDeclaracaoVariaveis(AMultiploDeclaracaoVariaveis node);
    void caseADeclaracaoVariavel(ADeclaracaoVariavel node);
    void caseAProcedureDeclaracaoProcFuncoes(AProcedureDeclaracaoProcFuncoes node);
    void caseAFuncaoDeclaracaoProcFuncoes(AFuncaoDeclaracaoProcFuncoes node);
    void caseADeclaracaoProcedure(ADeclaracaoProcedure node);
    void caseADeclaracaoFuncao(ADeclaracaoFuncao node);
    void caseACabecalhoProcedure(ACabecalhoProcedure node);
    void caseACabecalhoFuncao(ACabecalhoFuncao node);
    void caseAParametrosFormais(AParametrosFormais node);
    void caseAEmptyParametrosFormais(AEmptyParametrosFormais node);
    void caseAUnicoSecaoParametrosFormais(AUnicoSecaoParametrosFormais node);
    void caseAMultiploSecaoParametrosFormais(AMultiploSecaoParametrosFormais node);
    void caseAValorSecaoParametroFormal(AValorSecaoParametroFormal node);
    void caseAVariavelSecaoParametroFormal(AVariavelSecaoParametroFormal node);
    void caseAArraySecaoParametroFormal(AArraySecaoParametroFormal node);
    void caseASpecParamValor(ASpecParamValor node);
    void caseASpecParamVariavel(ASpecParamVariavel node);
    void caseAValorSpecParamArray(AValorSpecParamArray node);
    void caseAVariavelSpecParamArray(AVariavelSpecParamArray node);
    void caseASpecParamArrayValor(ASpecParamArrayValor node);
    void caseASpecParamArrayVariavel(ASpecParamArrayVariavel node);
    void caseASchemaArray(ASchemaArray node);
    void caseAUnicoSpecTiposIndices(AUnicoSpecTiposIndices node);
    void caseAMultiploSpecTiposIndices(AMultiploSpecTiposIndices node);
    void caseASpecTipoIndice(ASpecTipoIndice node);
    void caseAIdentificadorIdentificadorSchemaArray(AIdentificadorIdentificadorSchemaArray node);
    void caseAArrayIdentificadorSchemaArray(AArrayIdentificadorSchemaArray node);
    void caseAExistenteTipoResultado(AExistenteTipoResultado node);
    void caseAOrdinalTipoResultado(AOrdinalTipoResultado node);

    void caseTInteger(TInteger node);
    void caseTString(TString node);
    void caseTReal(TReal node);
    void caseTBoolean(TBoolean node);
    void caseTArray(TArray node);
    void caseTIf(TIf node);
    void caseTThen(TThen node);
    void caseTElse(TElse node);
    void caseTWhile(TWhile node);
    void caseTFor(TFor node);
    void caseTCase(TCase node);
    void caseTOf(TOf node);
    void caseTBegin(TBegin node);
    void caseTEnd(TEnd node);
    void caseTProgram(TProgram node);
    void caseTVar(TVar node);
    void caseTFunction(TFunction node);
    void caseTLabel(TLabel node);
    void caseTProcedure(TProcedure node);
    void caseTDo(TDo node);
    void caseTType(TType node);
    void caseTConstBooleana(TConstBooleana node);
    void caseTIdentificador(TIdentificador node);
    void caseTPontoEVirgula(TPontoEVirgula node);
    void caseTPonto(TPonto node);
    void caseTPontoPonto(TPontoPonto node);
    void caseTAbreParenteses(TAbreParenteses node);
    void caseTFechaParenteses(TFechaParenteses node);
    void caseTVirgula(TVirgula node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTAbreColchete(TAbreColchete node);
    void caseTFechaColchete(TFechaColchete node);
    void caseTConstInteiro(TConstInteiro node);
    void caseTConstReal(TConstReal node);
    void caseTBlank(TBlank node);
    void caseTConstString(TConstString node);
    void caseTOperadorRelacional(TOperadorRelacional node);
    void caseTIgual(TIgual node);
    void caseTOperadorLogico(TOperadorLogico node);
    void caseTOperadorAritmetico(TOperadorAritmetico node);
    void caseTComentLinha(TComentLinha node);
    void caseTComentBloco(TComentBloco node);
    void caseTComentBlocoFim(TComentBlocoFim node);
    void caseTComentBlocoCorpo(TComentBlocoCorpo node);
    void caseTAsterico(TAsterico node);
    void caseTBarra(TBarra node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
