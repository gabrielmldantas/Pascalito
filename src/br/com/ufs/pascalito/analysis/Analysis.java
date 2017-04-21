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
    void caseAId(AId node);
    void caseAInteiroConstante(AInteiroConstante node);
    void caseAStringConstante(AStringConstante node);
    void caseABooleanConstante(ABooleanConstante node);
    void caseABloco(ABloco node);
    void caseANumeroSemSinal(ANumeroSemSinal node);
    void caseADefinicaoTipo(ADefinicaoTipo node);
    void caseAPrimitivoDenotadorTipo(APrimitivoDenotadorTipo node);
    void caseAIdOuOrdinalDenotadorTipo(AIdOuOrdinalDenotadorTipo node);
    void caseAArrayDenotadorTipo(AArrayDenotadorTipo node);
    void caseAIntegerTipoPrimitivo(AIntegerTipoPrimitivo node);
    void caseAStringTipoPrimitivo(AStringTipoPrimitivo node);
    void caseABooleanTipoPrimitivo(ABooleanTipoPrimitivo node);
    void caseAIdTipoIdOuOrdinal(AIdTipoIdOuOrdinal node);
    void caseAEnumeradoTipoIdOuOrdinal(AEnumeradoTipoIdOuOrdinal node);
    void caseASubrangeTipoIdOuOrdinal(ASubrangeTipoIdOuOrdinal node);
    void caseAIdTipoIdOuPrimitivo(AIdTipoIdOuPrimitivo node);
    void caseAPrimitivoTipoIdOuPrimitivo(APrimitivoTipoIdOuPrimitivo node);
    void caseATipoIdentificador(ATipoIdentificador node);
    void caseATipoEnumerado(ATipoEnumerado node);
    void caseATipoSubrange(ATipoSubrange node);
    void caseATipoArray(ATipoArray node);
    void caseAMaisSinal(AMaisSinal node);
    void caseAMenosSinal(AMenosSinal node);
    void caseADeclaracaoVariavel(ADeclaracaoVariavel node);
    void caseAProcedureDeclaracaoProcOuFuncao(AProcedureDeclaracaoProcOuFuncao node);
    void caseAFuncaoDeclaracaoProcOuFuncao(AFuncaoDeclaracaoProcOuFuncao node);
    void caseADeclaracaoProcedure(ADeclaracaoProcedure node);
    void caseAValorParametroFormal(AValorParametroFormal node);
    void caseARefParametroFormal(ARefParametroFormal node);
    void caseAValorFormal(AValorFormal node);
    void caseARefFormal(ARefFormal node);
    void caseADeclaracaoFuncao(ADeclaracaoFuncao node);
    void caseAVaziaSentenca(AVaziaSentenca node);
    void caseAAtribuicaoSentenca(AAtribuicaoSentenca node);
    void caseAProcedureSentenca(AProcedureSentenca node);
    void caseAGotoSentenca(AGotoSentenca node);
    void caseAIfSentenca(AIfSentenca node);
    void caseAWhileSentenca(AWhileSentenca node);
    void caseACompostaSentenca(ACompostaSentenca node);
    void caseAVariavelAcessoVariavel(AVariavelAcessoVariavel node);
    void caseAVarIndexadaAcessoVariavel(AVarIndexadaAcessoVariavel node);
    void caseAVariavel(AVariavel node);
    void caseAVariavelIndexada(AVariavelIndexada node);
    void caseAVariavelExpressao(AVariavelExpressao node);
    void caseAExpBinAritExpressao(AExpBinAritExpressao node);
    void caseAExpBinBooleanExpressao(AExpBinBooleanExpressao node);
    void caseAExpRelacionalExpressao(AExpRelacionalExpressao node);
    void caseASignedExpressao(ASignedExpressao node);
    void caseANotExpressao(ANotExpressao node);
    void caseAFuncaoExpressao(AFuncaoExpressao node);
    void caseAConstanteExpressao(AConstanteExpressao node);
    void caseADivOperadorAritmeticoBinario(ADivOperadorAritmeticoBinario node);
    void caseAModOperadorAritmeticoBinario(AModOperadorAritmeticoBinario node);
    void caseASomaSubOperadorAritmeticoBinario(ASomaSubOperadorAritmeticoBinario node);
    void caseAMultiplicacaoOperadorAritmeticoBinario(AMultiplicacaoOperadorAritmeticoBinario node);
    void caseADivisaoOperadorAritmeticoBinario(ADivisaoOperadorAritmeticoBinario node);
    void caseAAndOperadorBooleanoBinario(AAndOperadorBooleanoBinario node);
    void caseAOrOperadorBooleanoBinario(AOrOperadorBooleanoBinario node);
    void caseAIgualOperadorRelacional(AIgualOperadorRelacional node);
    void caseADiferenteOperadorRelacional(ADiferenteOperadorRelacional node);
    void caseAMaiorOperadorRelacional(AMaiorOperadorRelacional node);
    void caseAMaiorIgualOperadorRelacional(AMaiorIgualOperadorRelacional node);
    void caseAMenorOperadorRelacional(AMenorOperadorRelacional node);
    void caseAMenorIgualOperadorRelacional(AMenorIgualOperadorRelacional node);

    void caseTInteger(TInteger node);
    void caseTString(TString node);
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
    void caseTGoto(TGoto node);
    void caseTConstBooleana(TConstBooleana node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTNot(TNot node);
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
    void caseTBlank(TBlank node);
    void caseTMenor(TMenor node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTMaior(TMaior node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTDiferente(TDiferente node);
    void caseTIgual(TIgual node);
    void caseTSoma(TSoma node);
    void caseTSubtracao(TSubtracao node);
    void caseTMultiplicacao(TMultiplicacao node);
    void caseTDivisao(TDivisao node);
    void caseTComentLinha(TComentLinha node);
    void caseTComentBloco(TComentBloco node);
    void caseTComentBlocoFim(TComentBlocoFim node);
    void caseTComentBlocoCorpo(TComentBlocoCorpo node);
    void caseTAsterico(TAsterico node);
    void caseTBarra(TBarra node);
    void caseTConstString(TConstString node);
    void caseTConstStringCorpo(TConstStringCorpo node);
    void caseTAspaSimples(TAspaSimples node);
    void caseTNewline(TNewline node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
