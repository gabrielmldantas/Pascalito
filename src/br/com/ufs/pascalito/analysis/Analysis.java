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
    void caseADeclaracaoLabels(ADeclaracaoLabels node);
    void caseAEmptyDeclaracaoLabels(AEmptyDeclaracaoLabels node);
    void caseAUnicoLabels(AUnicoLabels node);
    void caseAMultiploLabels(AMultiploLabels node);
    void caseALabel(ALabel node);

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