/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.parser;

import br.com.ufs.pascalito.node.*;
import br.com.ufs.pascalito.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTInteger(@SuppressWarnings("unused") TInteger node)
    {
        this.index = 0;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 1;
    }

    @Override
    public void caseTReal(@SuppressWarnings("unused") TReal node)
    {
        this.index = 2;
    }

    @Override
    public void caseTBoolean(@SuppressWarnings("unused") TBoolean node)
    {
        this.index = 3;
    }

    @Override
    public void caseTArray(@SuppressWarnings("unused") TArray node)
    {
        this.index = 4;
    }

    @Override
    public void caseTIf(@SuppressWarnings("unused") TIf node)
    {
        this.index = 5;
    }

    @Override
    public void caseTThen(@SuppressWarnings("unused") TThen node)
    {
        this.index = 6;
    }

    @Override
    public void caseTElse(@SuppressWarnings("unused") TElse node)
    {
        this.index = 7;
    }

    @Override
    public void caseTWhile(@SuppressWarnings("unused") TWhile node)
    {
        this.index = 8;
    }

    @Override
    public void caseTFor(@SuppressWarnings("unused") TFor node)
    {
        this.index = 9;
    }

    @Override
    public void caseTCase(@SuppressWarnings("unused") TCase node)
    {
        this.index = 10;
    }

    @Override
    public void caseTOf(@SuppressWarnings("unused") TOf node)
    {
        this.index = 11;
    }

    @Override
    public void caseTBegin(@SuppressWarnings("unused") TBegin node)
    {
        this.index = 12;
    }

    @Override
    public void caseTEnd(@SuppressWarnings("unused") TEnd node)
    {
        this.index = 13;
    }

    @Override
    public void caseTProgram(@SuppressWarnings("unused") TProgram node)
    {
        this.index = 14;
    }

    @Override
    public void caseTVar(@SuppressWarnings("unused") TVar node)
    {
        this.index = 15;
    }

    @Override
    public void caseTFunction(@SuppressWarnings("unused") TFunction node)
    {
        this.index = 16;
    }

    @Override
    public void caseTLabel(@SuppressWarnings("unused") TLabel node)
    {
        this.index = 17;
    }

    @Override
    public void caseTProcedure(@SuppressWarnings("unused") TProcedure node)
    {
        this.index = 18;
    }

    @Override
    public void caseTDo(@SuppressWarnings("unused") TDo node)
    {
        this.index = 19;
    }

    @Override
    public void caseTConstBooleana(@SuppressWarnings("unused") TConstBooleana node)
    {
        this.index = 20;
    }

    @Override
    public void caseTIdentificador(@SuppressWarnings("unused") TIdentificador node)
    {
        this.index = 21;
    }

    @Override
    public void caseTPontoEVirgula(@SuppressWarnings("unused") TPontoEVirgula node)
    {
        this.index = 22;
    }

    @Override
    public void caseTPonto(@SuppressWarnings("unused") TPonto node)
    {
        this.index = 23;
    }

    @Override
    public void caseTPontoPonto(@SuppressWarnings("unused") TPontoPonto node)
    {
        this.index = 24;
    }

    @Override
    public void caseTAbreParenteses(@SuppressWarnings("unused") TAbreParenteses node)
    {
        this.index = 25;
    }

    @Override
    public void caseTFechaParenteses(@SuppressWarnings("unused") TFechaParenteses node)
    {
        this.index = 26;
    }

    @Override
    public void caseTVirgula(@SuppressWarnings("unused") TVirgula node)
    {
        this.index = 27;
    }

    @Override
    public void caseTAtribuicao(@SuppressWarnings("unused") TAtribuicao node)
    {
        this.index = 28;
    }

    @Override
    public void caseTDoisPontos(@SuppressWarnings("unused") TDoisPontos node)
    {
        this.index = 29;
    }

    @Override
    public void caseTAbreColchete(@SuppressWarnings("unused") TAbreColchete node)
    {
        this.index = 30;
    }

    @Override
    public void caseTFechaColchete(@SuppressWarnings("unused") TFechaColchete node)
    {
        this.index = 31;
    }

    @Override
    public void caseTConstInteiro(@SuppressWarnings("unused") TConstInteiro node)
    {
        this.index = 32;
    }

    @Override
    public void caseTConstReal(@SuppressWarnings("unused") TConstReal node)
    {
        this.index = 33;
    }

    @Override
    public void caseTConstString(@SuppressWarnings("unused") TConstString node)
    {
        this.index = 34;
    }

    @Override
    public void caseTOperadorRelacional(@SuppressWarnings("unused") TOperadorRelacional node)
    {
        this.index = 35;
    }

    @Override
    public void caseTOperadorLogico(@SuppressWarnings("unused") TOperadorLogico node)
    {
        this.index = 36;
    }

    @Override
    public void caseTOperadorAritmetico(@SuppressWarnings("unused") TOperadorAritmetico node)
    {
        this.index = 37;
    }

    @Override
    public void caseTComentBlocoFim(@SuppressWarnings("unused") TComentBlocoFim node)
    {
        this.index = 38;
    }

    @Override
    public void caseTComentBlocoCorpo(@SuppressWarnings("unused") TComentBlocoCorpo node)
    {
        this.index = 39;
    }

    @Override
    public void caseTAsterico(@SuppressWarnings("unused") TAsterico node)
    {
        this.index = 40;
    }

    @Override
    public void caseTBarra(@SuppressWarnings("unused") TBarra node)
    {
        this.index = 41;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 42;
    }
}