/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.pascalito.parser;

import br.com.ufs.pascalito.lexer.*;
import br.com.ufs.pascalito.node.*;
import br.com.ufs.pascalito.analysis.*;
import java.util.*;

import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

@SuppressWarnings("nls")
public class Parser
{
    public final Analysis ignoredTokens = new AnalysisAdapter();

    protected ArrayList<Object> nodeList;

    private final Lexer lexer;
    private final ListIterator<Object> stack = new LinkedList<Object>().listIterator();
    private int last_pos;
    private int last_line;
    private Token last_token;
    private final TokenIndex converter = new TokenIndex();
    private final int[] action = new int[2];

    private final static int SHIFT = 0;
    private final static int REDUCE = 1;
    private final static int ACCEPT = 2;
    private final static int ERROR = 3;

    public Parser(@SuppressWarnings("hiding") Lexer lexer)
    {
        this.lexer = lexer;
    }

    protected void filter() throws ParserException, LexerException, IOException
    {
        // Empty body
    }

    private void push(int numstate, ArrayList<Object> listNode, boolean hidden) throws ParserException, LexerException, IOException
    {
        this.nodeList = listNode;

        if(!hidden)
        {
            filter();
        }

        if(!this.stack.hasNext())
        {
            this.stack.add(new State(numstate, this.nodeList));
            return;
        }

        State s = (State) this.stack.next();
        s.state = numstate;
        s.nodes = this.nodeList;
    }

    private int goTo(int index)
    {
        int state = state();
        int low = 1;
        int high = gotoTable[index].length - 1;
        int value = gotoTable[index][0][1];

        while(low <= high)
        {
            // int middle = (low + high) / 2;
            int middle = (low + high) >>> 1;

            if(state < gotoTable[index][middle][0])
            {
                high = middle - 1;
            }
            else if(state > gotoTable[index][middle][0])
            {
                low = middle + 1;
            }
            else
            {
                value = gotoTable[index][middle][1];
                break;
            }
        }

        return value;
    }

    private int state()
    {
        State s = (State) this.stack.previous();
        this.stack.next();
        return s.state;
    }

    private ArrayList<Object> pop()
    {
        return ((State) this.stack.previous()).nodes;
    }

    private int index(Switchable token)
    {
        this.converter.index = -1;
        token.apply(this.converter);
        return this.converter.index;
    }

    @SuppressWarnings("unchecked")
    public Start parse() throws ParserException, LexerException, IOException
    {
        push(0, null, true);
        List<Node> ign = null;
        while(true)
        {
            while(index(this.lexer.peek()) == -1)
            {
                if(ign == null)
                {
                    ign = new LinkedList<Node>();
                }

                ign.add(this.lexer.next());
            }

            if(ign != null)
            {
                this.ignoredTokens.setIn(this.lexer.peek(), ign);
                ign = null;
            }

            this.last_pos = this.lexer.peek().getPos();
            this.last_line = this.lexer.peek().getLine();
            this.last_token = this.lexer.peek();

            int index = index(this.lexer.peek());
            this.action[0] = Parser.actionTable[state()][0][1];
            this.action[1] = Parser.actionTable[state()][0][2];

            int low = 1;
            int high = Parser.actionTable[state()].length - 1;

            while(low <= high)
            {
                int middle = (low + high) / 2;

                if(index < Parser.actionTable[state()][middle][0])
                {
                    high = middle - 1;
                }
                else if(index > Parser.actionTable[state()][middle][0])
                {
                    low = middle + 1;
                }
                else
                {
                    this.action[0] = Parser.actionTable[state()][middle][1];
                    this.action[1] = Parser.actionTable[state()][middle][2];
                    break;
                }
            }

            switch(this.action[0])
            {
                case SHIFT:
		    {
		        ArrayList<Object> list = new ArrayList<Object>();
		        list.add(this.lexer.next());
                        push(this.action[1], list, false);
                    }
		    break;
                case REDUCE:
                    {
                        int reduction = this.action[1];
                        if(reduction < 500) reduce_0(reduction);
                    }
                    break;
                case ACCEPT:
                    {
                        EOF node2 = (EOF) this.lexer.next();
                        PProgram node1 = (PProgram) pop().get(0);
                        Start node = new Start(node1, node2);
                        return node;
                    }
                case ERROR:
                    throw new ParserException(this.last_token,
                        "[" + this.last_line + "," + this.last_pos + "] " +
                        Parser.errorMessages[Parser.errors[this.action[1]]]);
            }
        }
    }

    private void reduce_0(int reduction) throws IOException, LexerException, ParserException
    {
        switch(reduction)
        {
            case 0: /* reduce AProgram */
            {
                ArrayList<Object> list = new0();
                push(goTo(0), list, false);
            }
            break;
            case 1: /* reduce AUnicoCabecalhoPrograma */
            {
                ArrayList<Object> list = new1();
                push(goTo(1), list, false);
            }
            break;
            case 2: /* reduce AMultiploCabecalhoPrograma */
            {
                ArrayList<Object> list = new2();
                push(goTo(1), list, false);
            }
            break;
            case 3: /* reduce ABloco */
            {
                ArrayList<Object> list = new3();
                push(goTo(2), list, false);
            }
            break;
            case 4: /* reduce AUnicoIdentificadores */
            {
                ArrayList<Object> list = new4();
                push(goTo(3), list, false);
            }
            break;
            case 5: /* reduce AMultiploIdentificadores */
            {
                ArrayList<Object> list = new5();
                push(goTo(3), list, false);
            }
            break;
            case 6: /* reduce ATerminal$Num */
            {
                ArrayList<Object> list = new6();
                push(goTo(4), list, true);
            }
            break;
            case 7: /* reduce ANonTerminal$Num */
            {
                ArrayList<Object> list = new7();
                push(goTo(4), list, true);
            }
            break;
        }
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new0() /* reduce AProgram */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PProgram pprogramNode1;
        {
            // Block
        PCabecalhoPrograma pcabecalhoprogramaNode2;
        TPontoEVirgula tpontoevirgulaNode3;
        PBloco pblocoNode4;
        TPonto tpontoNode5;
        pcabecalhoprogramaNode2 = (PCabecalhoPrograma)nodeArrayList1.get(0);
        tpontoevirgulaNode3 = (TPontoEVirgula)nodeArrayList2.get(0);
        pblocoNode4 = (PBloco)nodeArrayList3.get(0);
        tpontoNode5 = (TPonto)nodeArrayList4.get(0);

        pprogramNode1 = new AProgram(pcabecalhoprogramaNode2, tpontoevirgulaNode3, pblocoNode4, tpontoNode5);
        }
	nodeList.add(pprogramNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new1() /* reduce AUnicoCabecalhoPrograma */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PCabecalhoPrograma pcabecalhoprogramaNode1;
        {
            // Block
        TProgram tprogramNode2;
        TIdentificador tidentificadorNode3;
        tprogramNode2 = (TProgram)nodeArrayList1.get(0);
        tidentificadorNode3 = (TIdentificador)nodeArrayList2.get(0);

        pcabecalhoprogramaNode1 = new AUnicoCabecalhoPrograma(tprogramNode2, tidentificadorNode3);
        }
	nodeList.add(pcabecalhoprogramaNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new2() /* reduce AMultiploCabecalhoPrograma */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList5 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PCabecalhoPrograma pcabecalhoprogramaNode1;
        {
            // Block
        TProgram tprogramNode2;
        TIdentificador tidentificadorNode3;
        TAbreParenteses tabreparentesesNode4;
        PIdentificadores pidentificadoresNode5;
        TFechaParenteses tfechaparentesesNode6;
        tprogramNode2 = (TProgram)nodeArrayList1.get(0);
        tidentificadorNode3 = (TIdentificador)nodeArrayList2.get(0);
        tabreparentesesNode4 = (TAbreParenteses)nodeArrayList3.get(0);
        pidentificadoresNode5 = (PIdentificadores)nodeArrayList4.get(0);
        tfechaparentesesNode6 = (TFechaParenteses)nodeArrayList5.get(0);

        pcabecalhoprogramaNode1 = new AMultiploCabecalhoPrograma(tprogramNode2, tidentificadorNode3, tabreparentesesNode4, pidentificadoresNode5, tfechaparentesesNode6);
        }
	nodeList.add(pcabecalhoprogramaNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new3() /* reduce ABloco */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PBloco pblocoNode1;
        {
            // Block
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        listNode2 = (LinkedList)nodeArrayList1.get(0);
	if(listNode2 != null)
	{
	  listNode3.addAll(listNode2);
	}
        }

        pblocoNode1 = new ABloco(listNode3);
        }
	nodeList.add(pblocoNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new4() /* reduce AUnicoIdentificadores */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PIdentificadores pidentificadoresNode1;
        {
            // Block
        TIdentificador tidentificadorNode2;
        tidentificadorNode2 = (TIdentificador)nodeArrayList1.get(0);

        pidentificadoresNode1 = new AUnicoIdentificadores(tidentificadorNode2);
        }
	nodeList.add(pidentificadoresNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new5() /* reduce AMultiploIdentificadores */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PIdentificadores pidentificadoresNode1;
        {
            // Block
        PIdentificadores pidentificadoresNode2;
        TVirgula tvirgulaNode3;
        TIdentificador tidentificadorNode4;
        pidentificadoresNode2 = (PIdentificadores)nodeArrayList1.get(0);
        tvirgulaNode3 = (TVirgula)nodeArrayList2.get(0);
        tidentificadorNode4 = (TIdentificador)nodeArrayList3.get(0);

        pidentificadoresNode1 = new AMultiploIdentificadores(pidentificadoresNode2, tvirgulaNode3, tidentificadorNode4);
        }
	nodeList.add(pidentificadoresNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new6() /* reduce ATerminal$Num */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        {
            // Block
        TNum tnumNode1;
        tnumNode1 = (TNum)nodeArrayList1.get(0);
	if(tnumNode1 != null)
	{
	  listNode2.add(tnumNode1);
	}
        }
	nodeList.add(listNode2);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new7() /* reduce ANonTerminal$Num */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        LinkedList<Object> listNode1 = new LinkedList<Object>();
        TNum tnumNode2;
        listNode1 = (LinkedList)nodeArrayList1.get(0);
        tnumNode2 = (TNum)nodeArrayList2.get(0);
	if(listNode1 != null)
	{
	  listNode3.addAll(listNode1);
	}
	if(tnumNode2 != null)
	{
	  listNode3.add(tnumNode2);
	}
        }
	nodeList.add(listNode3);
        return nodeList;
    }



    private static int[][][] actionTable;
/*      {
			{{-1, ERROR, 0}, {14, SHIFT, 1}, },
			{{-1, ERROR, 1}, {21, SHIFT, 4}, },
			{{-1, ERROR, 2}, {41, ACCEPT, -1}, },
			{{-1, ERROR, 3}, {22, SHIFT, 5}, },
			{{-1, REDUCE, 1}, {25, SHIFT, 6}, },
			{{-1, ERROR, 5}, {32, SHIFT, 7}, },
			{{-1, ERROR, 6}, {21, SHIFT, 10}, },
			{{-1, REDUCE, 6}, },
			{{-1, ERROR, 8}, {23, SHIFT, 12}, },
			{{-1, REDUCE, 3}, {32, SHIFT, 13}, },
			{{-1, REDUCE, 4}, },
			{{-1, ERROR, 11}, {26, SHIFT, 14}, {27, SHIFT, 15}, },
			{{-1, REDUCE, 0}, },
			{{-1, REDUCE, 7}, },
			{{-1, REDUCE, 2}, },
			{{-1, ERROR, 15}, {21, SHIFT, 16}, },
			{{-1, REDUCE, 5}, },
        };*/
    private static int[][][] gotoTable;
/*      {
			{{-1, 2}, },
			{{-1, 3}, },
			{{-1, 8}, },
			{{-1, 11}, },
			{{-1, 9}, },
        };*/
    private static String[] errorMessages;
/*      {
			"expecting: program",
			"expecting: identificador",
			"expecting: EOF",
			"expecting: ';'",
			"expecting: ';', '('",
			"expecting: num",
			"expecting: '.', num",
			"expecting: '.'",
			"expecting: ')', ','",
        };*/
    private static int[] errors;
/*      {
			0, 1, 2, 3, 4, 5, 1, 6, 7, 6, 8, 8, 2, 6, 3, 1, 8, 
        };*/

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Parser.class.getResourceAsStream("parser.dat")));

            // read actionTable
            int length = s.readInt();
            Parser.actionTable = new int[length][][];
            for(int i = 0; i < Parser.actionTable.length; i++)
            {
                length = s.readInt();
                Parser.actionTable[i] = new int[length][3];
                for(int j = 0; j < Parser.actionTable[i].length; j++)
                {
                for(int k = 0; k < 3; k++)
                {
                    Parser.actionTable[i][j][k] = s.readInt();
                }
                }
            }

            // read gotoTable
            length = s.readInt();
            gotoTable = new int[length][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][2];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                for(int k = 0; k < 2; k++)
                {
                    gotoTable[i][j][k] = s.readInt();
                }
                }
            }

            // read errorMessages
            length = s.readInt();
            errorMessages = new String[length];
            for(int i = 0; i < errorMessages.length; i++)
            {
                length = s.readInt();
                StringBuffer buffer = new StringBuffer();

                for(int j = 0; j < length; j++)
                {
                buffer.append(s.readChar());
                }
                errorMessages[i] = buffer.toString();
            }

            // read errors
            length = s.readInt();
            errors = new int[length];
            for(int i = 0; i < errors.length; i++)
            {
                errors[i] = s.readInt();
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"parser.dat\" is either missing or corrupted.");
        }
    }
}
