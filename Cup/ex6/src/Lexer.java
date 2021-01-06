/* The following code was generated by JFlex 1.4_pre3 on 5/9/20 7:57 PM */



/* --------------------------Usercode Section------------------------ */
package src;
import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4_pre3
 * on 5/9/20 7:57 PM from the specification file
 * <tt>file:/home/kirandhakal25/Documents/AIT/Sem Two/PLC/Kiran_Compiler_Project/Cup/ex6/flex/lcalc.flex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int YY_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final char [] yycmap = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  2,  0,  3,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 40,  9,  0,  0, 24,  0,  7, 27, 28, 22, 20,  0, 21,  4, 23, 
     5,  6,  6,  6,  6,  6,  6,  6,  6,  6,  0, 35, 38, 25, 39,  0, 
     0, 36, 47, 43, 37, 48, 41, 46, 44, 33,  8,  8, 42,  8, 29, 30, 
    31,  8, 32, 45, 34,  8,  8, 49,  8,  8,  8,  0, 10,  0, 26, 11, 
     0, 17,  8,  8,  8, 15, 16,  8,  8,  8,  8,  8, 18,  8,  8,  8, 
     8,  8, 13, 19, 12, 14,  8,  8,  8,  8,  8, 50,  0, 51,  0,  0
  };


  /** 
   * Translates a state to a row index in the transition table (packed version)
   */
  final private static String yy_rowMap_packed = 
    "\0\0\0\64\0\150\0\64\0\234\0\320\0\u0104\0\u0138\0\u016c\0\u01a0"+
    "\0\u01d4\0\64\0\64\0\64\0\64\0\64\0\u0208\0\64\0\64\0\64"+
    "\0\u023c\0\u0270\0\u02a4\0\u02d8\0\64\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc"+
    "\0\u0410\0\u0444\0\u0478\0\u04ac\0\u04e0\0\u0514\0\64\0\64\0\u0548\0\234"+
    "\0\u057c\0\u016c\0\64\0\u05b0\0\u05e4\0\u0618\0\64\0\u064c\0\u0138\0\u0680"+
    "\0\u06b4\0\u0138\0\u06e8\0\u0138\0\64\0\64\0\64\0\u071c\0\u0750\0\u0784"+
    "\0\u07b8\0\u07ec\0\u0820\0\u0548\0\64\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0138"+
    "\0\u0138\0\u0924\0\u0958\0\u098c\0\u09c0\0\u09f4\0\u0a28\0\u0138\0\u0a5c\0\u0a90"+
    "\0\u0ac4\0\u0138\0\u0af8\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0138\0\u0138\0\u0bfc"+
    "\0\u0c30\0\u0c64\0\u0138\0\u0c98\0\u0138\0\u0ccc\0\u0138\0\u0138\0\u0138";

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int [] yy_rowMap = yy_unpack_rowMap(yy_rowMap_packed);


  /** 
   * Unpacks the compressed row translation table.
   *
   * @param packed   the packed row translation table
   * @return         the unpacked row translation table
   */
  private static int [] yy_unpack_rowMap(String packed) {
    int [] map = new int[198];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 198) {
      int high = ((int) packed.charAt(i++)) << 16;
      map[j++] = high | packed.charAt(i++);
    }
    return map;
  }
  /** 
   * The packed transition table of the DFA (part 0)
   */
  private static final String yy_packed0 = 
    "\1\2\1\3\2\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\11\1\2\1\10\1\12\3\10\1\13\3\10\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\10\1\30\1\10\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\10\1\40\1\10"+
    "\1\41\1\10\1\42\1\43\1\44\1\45\1\46\66\0"+
    "\1\4\65\0\1\47\2\50\61\0\1\47\2\6\62\0"+
    "\2\51\1\0\1\51\3\0\10\51\11\0\6\51\1\0"+
    "\2\51\3\0\11\51\7\0\2\10\1\0\1\10\2\0"+
    "\11\10\11\0\6\10\1\0\2\10\3\0\11\10\2\0"+
    "\11\52\1\53\1\54\51\52\5\0\2\10\1\0\1\10"+
    "\2\0\2\10\1\55\6\10\11\0\6\10\1\0\2\10"+
    "\3\0\11\10\7\0\2\10\1\0\1\10\2\0\6\10"+
    "\1\56\2\10\11\0\6\10\1\0\2\10\3\0\11\10"+
    "\33\0\1\57\37\0\2\10\1\0\1\10\2\0\11\10"+
    "\11\0\1\10\1\60\4\10\1\0\2\10\3\0\11\10"+
    "\7\0\2\10\1\0\1\10\2\0\11\10\11\0\3\10"+
    "\1\61\2\10\1\0\2\10\3\0\11\10\7\0\2\10"+
    "\1\0\1\10\2\0\11\10\11\0\3\10\1\62\2\10"+
    "\1\0\2\10\3\0\11\10\7\0\2\10\1\0\1\10"+
    "\2\0\11\10\11\0\1\63\5\10\1\0\2\10\3\0"+
    "\1\64\10\10\7\0\2\10\1\0\1\10\2\0\11\10"+
    "\11\0\1\65\5\10\1\0\2\10\3\0\11\10\7\0"+
    "\2\10\1\0\1\10\2\0\11\10\11\0\1\10\1\66"+
    "\4\10\1\0\2\10\3\0\11\10\33\0\1\67\63\0"+
    "\1\70\63\0\1\71\37\0\2\10\1\0\1\10\2\0"+
    "\11\10\11\0\6\10\1\0\2\10\3\0\1\10\1\72"+
    "\7\10\7\0\2\10\1\0\1\10\2\0\11\10\11\0"+
    "\6\10\1\0\2\10\3\0\3\10\1\73\5\10\7\0"+
    "\2\10\1\0\1\10\2\0\11\10\11\0\5\10\1\74"+
    "\1\0\2\10\3\0\11\10\7\0\2\10\1\0\1\10"+
    "\2\0\11\10\11\0\1\10\1\75\4\10\1\0\2\10"+
    "\3\0\11\10\7\0\2\10\1\0\1\10\2\0\11\10"+
    "\11\0\6\10\1\0\2\10\3\0\1\10\1\76\7\10"+
    "\7\0\2\10\1\0\1\10\2\0\11\10\11\0\6\10"+
    "\1\0\2\10\3\0\3\10\1\77\5\10\7\0\2\100"+
    "\64\0\1\101\54\0\2\52\1\0\61\52\5\0\2\10"+
    "\1\0\1\10\2\0\3\10\1\102\5\10\11\0\6\10"+
    "\1\0\2\10\3\0\11\10\7\0\2\10\1\0\1\10"+
    "\2\0\7\10\1\103\1\10\11\0\6\10\1\0\2\10"+
    "\3\0\11\10\7\0\2\10\1\0\1\10\2\0\11\10"+
    "\11\0\2\10\1\104\3\10\1\0\2\10\3\0\11\10"+
    "\7\0\2\10\1\0\1\10\2\0\11\10\11\0\4\10"+
    "\1\105\1\10\1\0\2\10\3\0\11\10\7\0\2\10"+
    "\1\0\1\10\2\0\11\10\11\0\5\10\1\106\1\0"+
    "\2\10\3\0\11\10\7\0\2\10\1\0\1\10\2\0"+
    "\11\10\11\0\6\10\1\0\1\10\1\107\3\0\11\10"+
    "\7\0\2\10\1\0\1\10\2\0\11\10\11\0\1\10"+
    "\1\110\4\10\1\0\2\10\3\0\11\10\7\0\2\10"+
    "\1\0\1\10\2\0\11\10\11\0\6\10\1\0\1\111"+
    "\1\10\3\0\11\10\7\0\2\10\1\0\1\10\2\0"+
    "\11\10\11\0\3\10\1\112\2\10\1\0\2\10\3\0"+
    "\11\10\7\0\2\10\1\0\1\10\2\0\11\10\11\0"+
    "\1\10\1\113\4\10\1\0\2\10\3\0\11\10\7\0"+
    "\2\10\1\0\1\10\2\0\11\10\11\0\6\10\1\0"+
    "\2\10\3\0\4\10\1\114\4\10\7\0\2\10\1\0"+
    "\1\10\2\0\11\10\11\0\4\10\1\115\1\10\1\0"+
    "\2\10\3\0\11\10\7\0\2\10\1\0\1\10\2\0"+
    "\4\10\1\116\4\10\11\0\6\10\1\0\2\10\3\0"+
    "\11\10\7\0\2\10\1\0\1\10\2\0\10\10\1\102"+
    "\11\0\6\10\1\0\2\10\3\0\11\10\7\0\2\10"+
    "\1\0\1\10\2\0\11\10\11\0\3\10\1\117\2\10"+
    "\1\0\2\10\3\0\11\10\7\0\2\10\1\0\1\10"+
    "\2\0\11\10\11\0\1\120\5\10\1\0\2\10\3\0"+
    "\11\10\7\0\2\10\1\0\1\10\2\0\11\10\11\0"+
    "\6\10\1\0\1\121\1\10\3\0\11\10\7\0\2\10"+
    "\1\0\1\10\2\0\11\10\11\0\3\10\1\122\2\10"+
    "\1\0\2\10\3\0\11\10\7\0\2\10\1\0\1\10"+
    "\2\0\11\10\11\0\4\10\1\123\1\10\1\0\2\10"+
    "\3\0\11\10\7\0\2\10\1\0\1\10\2\0\11\10"+
    "\11\0\6\10\1\0\2\10\3\0\1\10\1\124\7\10"+
    "\7\0\2\10\1\0\1\10\2\0\11\10\11\0\6\10"+
    "\1\0\2\10\3\0\7\10\1\125\1\10\7\0\2\10"+
    "\1\0\1\10\2\0\11\10\11\0\6\10\1\0\2\10"+
    "\3\0\1\10\1\126\7\10\7\0\2\10\1\0\1\10"+
    "\2\0\11\10\11\0\4\10\1\127\1\10\1\0\2\10"+
    "\3\0\11\10\7\0\2\10\1\0\1\10\2\0\11\10"+
    "\11\0\5\10\1\130\1\0\2\10\3\0\11\10\7\0"+
    "\2\10\1\0\1\10\2\0\11\10\11\0\5\10\1\131"+
    "\1\0\2\10\3\0\11\10\7\0\2\10\1\0\1\10"+
    "\2\0\11\10\11\0\1\132\5\10\1\0\2\10\3\0"+
    "\11\10\7\0\2\10\1\0\1\10\2\0\11\10\11\0"+
    "\6\10\1\0\2\10\3\0\7\10\1\133\1\10\7\0"+
    "\2\10\1\0\1\10\2\0\11\10\11\0\4\10\1\134"+
    "\1\10\1\0\2\10\3\0\11\10\7\0\2\10\1\0"+
    "\1\10\2\0\11\10\11\0\6\10\1\0\2\10\3\0"+
    "\7\10\1\135\1\10\7\0\2\10\1\0\1\10\2\0"+
    "\11\10\11\0\1\136\5\10\1\0\2\10\3\0\11\10"+
    "\7\0\2\10\1\0\1\10\2\0\11\10\11\0\6\10"+
    "\1\0\2\10\3\0\5\10\1\137\3\10\7\0\2\10"+
    "\1\0\1\10\2\0\11\10\11\0\6\10\1\0\1\140"+
    "\1\10\3\0\11\10\7\0\2\10\1\0\1\10\2\0"+
    "\11\10\11\0\6\10\1\0\2\10\3\0\1\141\10\10"+
    "\7\0\2\10\1\0\1\10\2\0\11\10\11\0\5\10"+
    "\1\142\1\0\2\10\3\0\11\10\7\0\2\10\1\0"+
    "\1\10\2\0\11\10\11\0\1\143\5\10\1\0\2\10"+
    "\3\0\11\10\2\0";

  /** 
   * The transition table of the DFA
   */
  private static final int yytrans [] = yy_unpack();


  /* error codes */
  private static final int YY_UNKNOWN_ERROR = 0;
  private static final int YY_ILLEGAL_STATE = 1;
  private static final int YY_NO_MATCH = 2;
  private static final int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  private static final String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final byte YY_ATTRIBUTE[] = {
     0,  9,  1,  9,  1,  1,  1,  1,  1,  1,  1,  9,  9,  9,  9,  9, 
     1,  9,  9,  9,  1,  1,  1,  1,  9,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  9,  9,  0,  0,  0,  0,  9,  0,  1,  1,  9,  1, 
     1,  1,  1,  1,  1,  1,  9,  9,  9,  1,  1,  1,  1,  1,  1,  1, 
     9,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
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



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[3328];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 2: 
        case 3: 
          {  /* just skip what was found, do nothing */  }
        case 100: break;
        case 64: 
          {  debug("CHAR_LITERAL",yytext()); return symbol(sym.CHAR_LITERAL, new Character(yytext().substring(1,yylength() -1).charAt(0)));  }
        case 101: break;
        case 7: 
        case 9: 
        case 10: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
        case 25: 
        case 26: 
        case 30: 
        case 31: 
        case 32: 
        case 33: 
        case 34: 
        case 35: 
        case 44: 
        case 45: 
        case 47: 
        case 49: 
        case 50: 
        case 52: 
        case 57: 
        case 58: 
        case 59: 
        case 60: 
        case 61: 
        case 62: 
        case 65: 
        case 66: 
        case 67: 
        case 68: 
        case 71: 
        case 72: 
        case 73: 
        case 74: 
        case 75: 
        case 76: 
        case 78: 
        case 79: 
        case 80: 
        case 82: 
        case 83: 
        case 85: 
        case 86: 
        case 89: 
        case 90: 
        case 91: 
        case 93: 
        case 95: 
          {  debug("ID"); return symbol(sym.ID, new String(yytext()));  }
        case 102: break;
        case 98: 
          {  debug("BOOLEAN"); return symbol(sym.BOOLEAN);  }
        case 103: break;
        case 97: 
          {  debug("NOPRINT"); return symbol(sym.NOPRINT);  }
        case 104: break;
        case 96: 
          {  debug("ELSEIF"); return symbol(sym.ELSEIF);  }
        case 105: break;
        case 94: 
          {  debug("STRING"); return symbol(sym.STRING);  }
        case 106: break;
        case 92: 
          {  debug("WHILE"); return symbol(sym.WHILE);  }
        case 107: break;
        case 36: 
          {  debug("LCURLY"); return symbol(sym.LCURLY);  }
        case 108: break;
        case 28: 
          {  debug("GT"); return symbol(sym.GT);  }
        case 109: break;
        case 27: 
          {  debug("LT"); return symbol(sym.LT);  }
        case 110: break;
        case 24: 
          {  debug("SEMI"); return symbol(sym.SEMI);  }
        case 111: break;
        case 19: 
          {  debug("RPAREN"); return symbol(sym.RPAREN);  }
        case 112: break;
        case 18: 
          {  debug("LPAREN"); return symbol(sym.LPAREN);  }
        case 113: break;
        case 17: 
          {  debug("EXP"); return symbol(sym.EXP);  }
        case 114: break;
        case 16: 
          {  debug("EQ"); return symbol(sym.EQ);  }
        case 115: break;
        case 15: 
          {  debug("MOD"); return symbol(sym.MOD);  }
        case 116: break;
        case 11: 
          {  debug("PLUS"); return symbol(sym.PLUS);  }
        case 117: break;
        case 12: 
          {  debug("MINUS"); return symbol(sym.MINUS);  }
        case 118: break;
        case 13: 
          {  debug("TIMES"); return symbol(sym.TIMES);  }
        case 119: break;
        case 14: 
          {  debug("DIVIDE"); return symbol(sym.DIVIDE);  }
        case 120: break;
        case 37: 
          {  debug("RCURLY"); return symbol(sym.RCURLY);  }
        case 121: break;
        case 46: 
          {  debug("EQUAL"); return symbol(sym.EQUAL);  }
        case 122: break;
        case 48: 
          {  debug("OR"); return symbol(sym.OR);  }
        case 123: break;
        case 51: 
          {  debug("IF"); return symbol(sym.IF);  }
        case 124: break;
        case 53: 
          {  debug("DO"); return symbol(sym.DO);  }
        case 125: break;
        case 54: 
          {  debug("LTE"); return symbol(sym.LTE);  }
        case 126: break;
        case 55: 
          {  debug("GTE"); return symbol(sym.GTE);  }
        case 127: break;
        case 56: 
          {  debug("NOTEQUAL"); return symbol(sym.NOTEQUAL);  }
        case 128: break;
        case 69: 
          {  debug("INT"); return symbol(sym.INT);  }
        case 129: break;
        case 70: 
          {  debug("AND"); return symbol(sym.AND);  }
        case 130: break;
        case 81: 
          {  debug("CHAR"); return symbol(sym.CHAR);  }
        case 131: break;
        case 84: 
          {  debug("ELSE"); return symbol(sym.ELSE);  }
        case 132: break;
        case 87: 
          {  debug("PRINT"); return symbol(sym.PRINT);  }
        case 133: break;
        case 88: 
          {  debug("FLOAT"); return symbol(sym.FLOAT);  }
        case 134: break;
        case 4: 
        case 5: 
          {  debug("INTEGER_LITERAL",yytext()); return symbol(sym.INTEGER_LITERAL, new Integer(yytext()));  }
        case 135: break;
        case 77: 
          {  debug("BOOLEAN_LITERAL", yytext()); return symbol(sym.BOOLEAN_LITERAL, new Boolean(yytext()));  }
        case 136: break;
        case 1: 
        case 6: 
        case 8: 
        case 29: 
          {  throw new Error("Illegal character <"+yytext()+">");  }
        case 137: break;
        case 63: 
          {  debug("FLOAT_LITERAL",yytext()); return symbol(sym.FLOAT_LITERAL, new Float(yytext()));  }
        case 138: break;
        case 42: 
          {  debug("STRING_LITERAL",yytext()); return symbol(sym.STRING_LITERAL, new String(yytext().substring(1,yylength() -1)));  }
        case 139: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}