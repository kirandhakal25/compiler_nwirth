

/* --------------------------Usercode Section------------------------ */
package src;
import java_cup.runtime.*;

%%

/* -----------------Options and Declarations Section----------------- */

/*
   The name of the class JFlex will create will be Lexer.
   Will write the code to the file Lexer.java.
*/
%class Lexer

/*
  The current line number can be accessed with the variable yyline
  and the current column number with the variable yycolumn.
*/
%line
%column

/*
   Will switch to a CUP compatibility mode to interface with a CUP
   generated parser.
*/
%cup

/*
  Declarations

  Code between %{ and %}, both of which must be at the beginning of a
  line, will be copied letter to letter into the lexer class source.
  Here you declare member variables and functions that are used inside
  scanner actions.
*/
%{
    /* To create a new java_cup.runtime.Symbol with information about
       the current token, the token will have no value in this
       case. */

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    /* Also creates a new java_cup.runtime.Symbol with information
       about the current token, but this object has a value. */

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    private void debug(String type) {
        if(type == "SEPARATOR")
            System.out.println("<"+ type + ">");
        else
            System.out.print("<"+ type + ">");
    }

    private void debug(String type, String text) {
        System.out.print("<"+ type + "," + text + ">");
    }

%}


/*
  Macro Declarations

  These declarations are regular expressions that will be used latter
  in the Lexical Rules Section.
*/

/* A line terminator is a \r (carriage return), \n (line feed), or \r\n. */

LineTerminator = \r|\n|\r\n

/* White space is a line terminator, space, tab, or line feed. */

WhiteSpace     = {LineTerminator} | [ \t\f]

/* A literal integer is is a number beginning with a number between
   one and nine followed by zero or more numbers between zero and nine
   or just a zero.  */

dot = "."
int = 0 | [1-9][0-9]*
float = [0-9]+{dot}[0-9]+
char = \'[a-zA-Z0-9]\'
string = \"([^\"\\\\]|\\.)*\"

/* string = \"{alphabet}{special_chars}{digit}\" */

digit = [0-9]*
alphabet = [a-zA-Z ]*
special_chars = [!@#$%\^&*()_+,.?<>/\[\]{}\\;\:`~]*

identifier = [a-zA-Z_][a-zA-Z0-9_]*
boolean = true|false

%%
/* ------------------------Lexical Rules Section---------------------- */

/*
   This section contains regular expressions and actions, i.e. Java
   code, that will be executed when the scanner matches the associated
   regular expression. */


    "+"        { debug("PLUS"); return symbol(sym.PLUS); }
    "-"        { debug("MINUS"); return symbol(sym.MINUS); }
    "*"        { debug("TIMES"); return symbol(sym.TIMES); }
    "/"        { debug("DIVIDE"); return symbol(sym.DIVIDE); }
    "%"        { debug("MOD"); return symbol(sym.MOD); }
    "="        { debug("EQ"); return symbol(sym.EQ); }
    "\^"       { debug("EXP"); return symbol(sym.EXP); }
    "("        { debug("LPAREN"); return symbol(sym.LPAREN); }
    ")"        { debug("RPAREN"); return symbol(sym.RPAREN); }
    "NOPRINT"  { debug("NOPRINT"); return symbol(sym.NOPRINT); }
    "PRINT"    { debug("PRINT"); return symbol(sym.PRINT); }
    ";"        { debug("SEMI"); return symbol(sym.SEMI); }
    "AND"      { debug("AND"); return symbol(sym.AND); }
    "OR"       { debug("OR"); return symbol(sym.OR); }
    "<"        { debug("LT"); return symbol(sym.LT); }
    ">"        { debug("GT"); return symbol(sym.GT); }
    "<="       { debug("LTE"); return symbol(sym.LTE); }
    ">="       { debug("GTE"); return symbol(sym.GTE); }
    "=="       { debug("EQUAL"); return symbol(sym.EQUAL); }
    "!="       { debug("NOTEQUAL"); return symbol(sym.NOTEQUAL); }
    "INT"      { debug("INT"); return symbol(sym.INT); }
    "KIR"      { debug("KIR"); return symbol(sym.KIR); }
    "FLOAT"    { debug("FLOAT"); return symbol(sym.FLOAT); }
    "CHAR"     { debug("CHAR"); return symbol(sym.CHAR); }
    "STRING"   { debug("STRING"); return symbol(sym.STRING); }
    "BOOLEAN"  { debug("BOOLEAN"); return symbol(sym.BOOLEAN); }
    "IF"       { debug("IF"); return symbol(sym.IF); }
    "ELSE"     { debug("ELSE"); return symbol(sym.ELSE); }
    "ELSEIF"   { debug("ELSEIF"); return symbol(sym.ELSEIF); }
    "WHILE"    { debug("WHILE"); return symbol(sym.WHILE); }
    "DO"       { debug("DO"); return symbol(sym.DO); }
    "{"        { debug("LCURLY"); return symbol(sym.LCURLY); }
    "}"        { debug("RCURLY"); return symbol(sym.RCURLY); }
    
    {int}      { debug("INTEGER_LITERAL",yytext()); return symbol(sym.INTEGER_LITERAL, new Integer(yytext())); }
    {float}    { debug("FLOAT_LITERAL",yytext()); return symbol(sym.FLOAT_LITERAL, new Float(yytext())); }
    {char}     { debug("CHAR_LITERAL",yytext()); return symbol(sym.CHAR_LITERAL, new Character(yytext().substring(1,yylength() -1).charAt(0))); }
    {string}   { debug("STRING_LITERAL",yytext()); return symbol(sym.STRING_LITERAL, new String(yytext().substring(1,yylength() -1))); }
    {boolean}  { debug("BOOLEAN_LITERAL", yytext()); return symbol(sym.BOOLEAN_LITERAL, new Boolean(yytext())); }
    /* Don't do anything if whitespace is found */

    {identifier}    { debug("ID"); return symbol(sym.ID, new String(yytext())); }

    {WhiteSpace}       { /* just skip what was found, do nothing */ }


/* No token was found for the input so through an error.  Print out an
   Illegal character message with the illegal character that was found. */

[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
