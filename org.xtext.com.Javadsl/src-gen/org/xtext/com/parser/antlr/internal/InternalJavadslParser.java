package org.xtext.com.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.com.services.JavadslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJavadslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_NUMBER_SUFFIX", "RULE_HEXA", "RULE_ZERO_TO_SEVEN", "RULE_FLOAT_SUFFIX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'*'", "'class'", "'extends'", "'implements'", "'{'", "'}'", "'interface'", "'static'", "'('", "')'", "'['", "']'", "','", "'='", "'-'", "'++'", "'--'", "'+'", "'+='", "'-='", "'*='", "'/'", "'/='", "'%'", "'%='", "'~'", "'>>='", "'<<'", "'>>'", "'>>>'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'!'", "'&'", "'&='", "'|'", "'|='", "'^'", "'^='", "'&&'", "'||='", "'||'", "'?'", "':'", "'true'", "'false'", "'instanceof'", "'new'", "'null'", "'super'", "'this'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'public'", "'private'", "'protected'", "'final'", "'native'", "'synchronized'", "'abstract'", "'threadsafe'", "'transient'", "'do'", "'while'", "'0..9e'", "'0x'", "'0X'", "'for'", "'if'", "'else'", "'return'", "'throw'", "'break'", "'continue'", "'switch'", "'case'", "'default'", "'try'", "'catch'", "'finally'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_HEXA=8;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_ZERO_TO_SEVEN=9;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_FLOAT_SUFFIX=10;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_NUMBER_SUFFIX=7;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalJavadslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJavadslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[261+1];
             
             
        }
        

    public String[] getTokenNames() { return InternalJavadslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private JavadslGrammarAccess grammarAccess;
     	
        public InternalJavadslParser(TokenStream input, JavadslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Head";	
       	}
       	
       	@Override
       	protected JavadslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleHead"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:74:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;
        int entryRuleHead_StartIndex = input.index();
        EObject iv_ruleHead = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:75:2: (iv_ruleHead= ruleHead EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:76:2: iv_ruleHead= ruleHead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeadRule()); 
            }
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead88);
            iv_ruleHead=ruleHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHead; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead98); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, entryRuleHead_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:83:1: ruleHead returns [EObject current=null] : ( (lv_java_0_0= ruleCompilationUnit ) ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;
        int ruleHead_StartIndex = input.index();
        EObject lv_java_0_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:86:28: ( ( (lv_java_0_0= ruleCompilationUnit ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:87:1: ( (lv_java_0_0= ruleCompilationUnit ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:87:1: ( (lv_java_0_0= ruleCompilationUnit ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:88:1: (lv_java_0_0= ruleCompilationUnit )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:88:1: (lv_java_0_0= ruleCompilationUnit )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:89:3: lv_java_0_0= ruleCompilationUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHeadAccess().getJavaCompilationUnitParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompilationUnit_in_ruleHead143);
            lv_java_0_0=ruleCompilationUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHeadRule());
              	        }
                     		add(
                     			current, 
                     			"java",
                      		lv_java_0_0, 
                      		"CompilationUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, ruleHead_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleCompilationUnit"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:113:1: entryRuleCompilationUnit returns [EObject current=null] : iv_ruleCompilationUnit= ruleCompilationUnit EOF ;
    public final EObject entryRuleCompilationUnit() throws RecognitionException {
        EObject current = null;
        int entryRuleCompilationUnit_StartIndex = input.index();
        EObject iv_ruleCompilationUnit = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:114:2: (iv_ruleCompilationUnit= ruleCompilationUnit EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:115:2: iv_ruleCompilationUnit= ruleCompilationUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompilationUnitRule()); 
            }
            pushFollow(FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit178);
            iv_ruleCompilationUnit=ruleCompilationUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompilationUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilationUnit188); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleCompilationUnit_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCompilationUnit"


    // $ANTLR start "ruleCompilationUnit"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:122:1: ruleCompilationUnit returns [EObject current=null] : ( () ( (lv_package_1_0= rulePackageStatement ) )? ( (lv_imports_2_0= ruleImportStatement ) )* ( (lv_type_declarations_3_0= ruleTypeDeclaration ) )* ) ;
    public final EObject ruleCompilationUnit() throws RecognitionException {
        EObject current = null;
        int ruleCompilationUnit_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_package_1_0 = null;

        AntlrDatatypeRuleToken lv_imports_2_0 = null;

        EObject lv_type_declarations_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:125:28: ( ( () ( (lv_package_1_0= rulePackageStatement ) )? ( (lv_imports_2_0= ruleImportStatement ) )* ( (lv_type_declarations_3_0= ruleTypeDeclaration ) )* ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:126:1: ( () ( (lv_package_1_0= rulePackageStatement ) )? ( (lv_imports_2_0= ruleImportStatement ) )* ( (lv_type_declarations_3_0= ruleTypeDeclaration ) )* )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:126:1: ( () ( (lv_package_1_0= rulePackageStatement ) )? ( (lv_imports_2_0= ruleImportStatement ) )* ( (lv_type_declarations_3_0= ruleTypeDeclaration ) )* )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:126:2: () ( (lv_package_1_0= rulePackageStatement ) )? ( (lv_imports_2_0= ruleImportStatement ) )* ( (lv_type_declarations_3_0= ruleTypeDeclaration ) )*
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:126:2: ()
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:127:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompilationUnitAccess().getCompilationUnitAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:135:2: ( (lv_package_1_0= rulePackageStatement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:136:1: (lv_package_1_0= rulePackageStatement )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:136:1: (lv_package_1_0= rulePackageStatement )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:137:3: lv_package_1_0= rulePackageStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompilationUnitAccess().getPackagePackageStatementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackageStatement_in_ruleCompilationUnit246);
                    lv_package_1_0=rulePackageStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
                      	        }
                             		set(
                             			current, 
                             			"package",
                              		lv_package_1_0, 
                              		"PackageStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:153:3: ( (lv_imports_2_0= ruleImportStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:154:1: (lv_imports_2_0= ruleImportStatement )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:154:1: (lv_imports_2_0= ruleImportStatement )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:155:3: lv_imports_2_0= ruleImportStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilationUnitAccess().getImportsImportStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportStatement_in_ruleCompilationUnit268);
            	    lv_imports_2_0=ruleImportStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"ImportStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:171:3: ( (lv_type_declarations_3_0= ruleTypeDeclaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20||(LA3_0>=25 && LA3_0<=26)||(LA3_0>=82 && LA3_0<=90)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:172:1: (lv_type_declarations_3_0= ruleTypeDeclaration )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:172:1: (lv_type_declarations_3_0= ruleTypeDeclaration )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:173:3: lv_type_declarations_3_0= ruleTypeDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilationUnitAccess().getType_declarationsTypeDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypeDeclaration_in_ruleCompilationUnit290);
            	    lv_type_declarations_3_0=ruleTypeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"type_declarations",
            	              		lv_type_declarations_3_0, 
            	              		"TypeDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, ruleCompilationUnit_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCompilationUnit"


    // $ANTLR start "entryRulePackageStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:197:1: entryRulePackageStatement returns [String current=null] : iv_rulePackageStatement= rulePackageStatement EOF ;
    public final String entryRulePackageStatement() throws RecognitionException {
        String current = null;
        int entryRulePackageStatement_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_rulePackageStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:198:2: (iv_rulePackageStatement= rulePackageStatement EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:199:2: iv_rulePackageStatement= rulePackageStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageStatementRule()); 
            }
            pushFollow(FOLLOW_rulePackageStatement_in_entryRulePackageStatement328);
            iv_rulePackageStatement=rulePackageStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageStatement339); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, entryRulePackageStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePackageStatement"


    // $ANTLR start "rulePackageStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:206:1: rulePackageStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' this_ObjectName_1= ruleObjectName kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulePackageStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int rulePackageStatement_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_ObjectName_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:209:28: ( (kw= 'package' this_ObjectName_1= ruleObjectName kw= ';' ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:210:1: (kw= 'package' this_ObjectName_1= ruleObjectName kw= ';' )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:210:1: (kw= 'package' this_ObjectName_1= ruleObjectName kw= ';' )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:211:2: kw= 'package' this_ObjectName_1= ruleObjectName kw= ';'
            {
            kw=(Token)match(input,15,FOLLOW_15_in_rulePackageStatement377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPackageStatementAccess().getPackageKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackageStatementAccess().getObjectNameParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleObjectName_in_rulePackageStatement399);
            this_ObjectName_1=ruleObjectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ObjectName_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,16,FOLLOW_16_in_rulePackageStatement417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPackageStatementAccess().getSemicolonKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, rulePackageStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePackageStatement"


    // $ANTLR start "entryRuleImportStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:241:1: entryRuleImportStatement returns [String current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final String entryRuleImportStatement() throws RecognitionException {
        String current = null;
        int entryRuleImportStatement_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleImportStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:242:2: (iv_ruleImportStatement= ruleImportStatement EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:243:2: iv_ruleImportStatement= ruleImportStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportStatementRule()); 
            }
            pushFollow(FOLLOW_ruleImportStatement_in_entryRuleImportStatement458);
            iv_ruleImportStatement=ruleImportStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportStatement469); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, entryRuleImportStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleImportStatement"


    // $ANTLR start "ruleImportStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:250:1: ruleImportStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' this_ImportStatement__1= ruleImportStatement_ ) ;
    public final AntlrDatatypeRuleToken ruleImportStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleImportStatement_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_ImportStatement__1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:253:28: ( (kw= 'import' this_ImportStatement__1= ruleImportStatement_ ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:254:1: (kw= 'import' this_ImportStatement__1= ruleImportStatement_ )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:254:1: (kw= 'import' this_ImportStatement__1= ruleImportStatement_ )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:255:2: kw= 'import' this_ImportStatement__1= ruleImportStatement_
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleImportStatement507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getImportStatementAccess().getImportKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImportStatementAccess().getImportStatement_ParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleImportStatement__in_ruleImportStatement529);
            this_ImportStatement__1=ruleImportStatement_();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ImportStatement__1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, ruleImportStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleImportStatement"


    // $ANTLR start "entryRuleImportStatement_"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:279:1: entryRuleImportStatement_ returns [String current=null] : iv_ruleImportStatement_= ruleImportStatement_ EOF ;
    public final String entryRuleImportStatement_() throws RecognitionException {
        String current = null;
        int entryRuleImportStatement__StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleImportStatement_ = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:280:2: (iv_ruleImportStatement_= ruleImportStatement_ EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:281:2: iv_ruleImportStatement_= ruleImportStatement_ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportStatement_Rule()); 
            }
            pushFollow(FOLLOW_ruleImportStatement__in_entryRuleImportStatement_575);
            iv_ruleImportStatement_=ruleImportStatement_();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportStatement_.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportStatement_586); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, entryRuleImportStatement__StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleImportStatement_"


    // $ANTLR start "ruleImportStatement_"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:288:1: ruleImportStatement_ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ObjectName_0= ruleObjectName (kw= '.' kw= '*' )? kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleImportStatement_() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleImportStatement__StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_ObjectName_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:291:28: ( (this_ObjectName_0= ruleObjectName (kw= '.' kw= '*' )? kw= ';' ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:292:1: (this_ObjectName_0= ruleObjectName (kw= '.' kw= '*' )? kw= ';' )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:292:1: (this_ObjectName_0= ruleObjectName (kw= '.' kw= '*' )? kw= ';' )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:293:5: this_ObjectName_0= ruleObjectName (kw= '.' kw= '*' )? kw= ';'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImportStatement_Access().getObjectNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleObjectName_in_ruleImportStatement_633);
            this_ObjectName_0=ruleObjectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ObjectName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:303:1: (kw= '.' kw= '*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:304:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleImportStatement_652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getImportStatement_Access().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleImportStatement_665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getImportStatement_Access().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,16,FOLLOW_16_in_ruleImportStatement_680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getImportStatement_Access().getSemicolonKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, ruleImportStatement__StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleImportStatement_"


    // $ANTLR start "entryRuleObjectName"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:329:1: entryRuleObjectName returns [String current=null] : iv_ruleObjectName= ruleObjectName EOF ;
    public final String entryRuleObjectName() throws RecognitionException {
        String current = null;
        int entryRuleObjectName_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleObjectName = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:330:2: (iv_ruleObjectName= ruleObjectName EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:331:2: iv_ruleObjectName= ruleObjectName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectNameRule()); 
            }
            pushFollow(FOLLOW_ruleObjectName_in_entryRuleObjectName721);
            iv_ruleObjectName=ruleObjectName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectName732); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, entryRuleObjectName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectName"


    // $ANTLR start "ruleObjectName"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:338:1: ruleObjectName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleObjectName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleObjectName_StartIndex = input.index();
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:341:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:342:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:342:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:342:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectName772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getObjectNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:349:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_ID) ) {
                        int LA5_3 = input.LA(3);

                        if ( (synpred5_InternalJavadsl()) ) {
                            alt5=1;
                        }


                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:350:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleObjectName791); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getObjectNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectName806); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getObjectNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, ruleObjectName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleObjectName"


    // $ANTLR start "entryRuleTypeDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:370:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleTypeDeclaration_StartIndex = input.index();
        EObject iv_ruleTypeDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:371:2: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:372:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration853);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDeclaration863); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, entryRuleTypeDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:379:1: ruleTypeDeclaration returns [EObject current=null] : ( ( ( (lv_class_declaration_0_0= ruleClassDeclaration ) ) | ( (lv_interface_declaration_1_0= ruleInterfaceDeclaration ) ) ) otherlv_2= ';' ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleTypeDeclaration_StartIndex = input.index();
        Token otherlv_2=null;
        EObject lv_class_declaration_0_0 = null;

        EObject lv_interface_declaration_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:382:28: ( ( ( ( (lv_class_declaration_0_0= ruleClassDeclaration ) ) | ( (lv_interface_declaration_1_0= ruleInterfaceDeclaration ) ) ) otherlv_2= ';' ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:383:1: ( ( ( (lv_class_declaration_0_0= ruleClassDeclaration ) ) | ( (lv_interface_declaration_1_0= ruleInterfaceDeclaration ) ) ) otherlv_2= ';' )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:383:1: ( ( ( (lv_class_declaration_0_0= ruleClassDeclaration ) ) | ( (lv_interface_declaration_1_0= ruleInterfaceDeclaration ) ) ) otherlv_2= ';' )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:383:2: ( ( (lv_class_declaration_0_0= ruleClassDeclaration ) ) | ( (lv_interface_declaration_1_0= ruleInterfaceDeclaration ) ) ) otherlv_2= ';'
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:383:2: ( ( (lv_class_declaration_0_0= ruleClassDeclaration ) ) | ( (lv_interface_declaration_1_0= ruleInterfaceDeclaration ) ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:383:3: ( (lv_class_declaration_0_0= ruleClassDeclaration ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:383:3: ( (lv_class_declaration_0_0= ruleClassDeclaration ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:384:1: (lv_class_declaration_0_0= ruleClassDeclaration )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:384:1: (lv_class_declaration_0_0= ruleClassDeclaration )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:385:3: lv_class_declaration_0_0= ruleClassDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDeclarationAccess().getClass_declarationClassDeclarationParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClassDeclaration_in_ruleTypeDeclaration910);
                    lv_class_declaration_0_0=ruleClassDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"class_declaration",
                              		lv_class_declaration_0_0, 
                              		"ClassDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:402:6: ( (lv_interface_declaration_1_0= ruleInterfaceDeclaration ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:402:6: ( (lv_interface_declaration_1_0= ruleInterfaceDeclaration ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:403:1: (lv_interface_declaration_1_0= ruleInterfaceDeclaration )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:403:1: (lv_interface_declaration_1_0= ruleInterfaceDeclaration )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:404:3: lv_interface_declaration_1_0= ruleInterfaceDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDeclarationAccess().getInterface_declarationInterfaceDeclarationParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterfaceDeclaration_in_ruleTypeDeclaration937);
                    lv_interface_declaration_1_0=ruleInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"interface_declaration",
                              		lv_interface_declaration_1_0, 
                              		"InterfaceDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleTypeDeclaration950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeDeclarationAccess().getSemicolonKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, ruleTypeDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleClassDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:432:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleClassDeclaration_StartIndex = input.index();
        EObject iv_ruleClassDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:433:2: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:434:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleClassDeclaration_in_entryRuleClassDeclaration986);
            iv_ruleClassDeclaration=ruleClassDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDeclaration996); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, entryRuleClassDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:441:1: ruleClassDeclaration returns [EObject current=null] : ( () ( (lv_modifiers_1_0= ruleModifier ) )* otherlv_2= 'class' this_ID_3= RULE_ID (otherlv_4= 'extends' ruleObjectName )? (otherlv_6= 'implements' ruleObjectName (otherlv_8= '.' ruleObjectName )* )? otherlv_10= '{' ( (lv_field_declarations_11_0= ruleFieldDeclaration ) )* otherlv_12= '}' ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleClassDeclaration_StartIndex = input.index();
        Token otherlv_2=null;
        Token this_ID_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_modifiers_1_0 = null;

        EObject lv_field_declarations_11_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:444:28: ( ( () ( (lv_modifiers_1_0= ruleModifier ) )* otherlv_2= 'class' this_ID_3= RULE_ID (otherlv_4= 'extends' ruleObjectName )? (otherlv_6= 'implements' ruleObjectName (otherlv_8= '.' ruleObjectName )* )? otherlv_10= '{' ( (lv_field_declarations_11_0= ruleFieldDeclaration ) )* otherlv_12= '}' ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:445:1: ( () ( (lv_modifiers_1_0= ruleModifier ) )* otherlv_2= 'class' this_ID_3= RULE_ID (otherlv_4= 'extends' ruleObjectName )? (otherlv_6= 'implements' ruleObjectName (otherlv_8= '.' ruleObjectName )* )? otherlv_10= '{' ( (lv_field_declarations_11_0= ruleFieldDeclaration ) )* otherlv_12= '}' )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:445:1: ( () ( (lv_modifiers_1_0= ruleModifier ) )* otherlv_2= 'class' this_ID_3= RULE_ID (otherlv_4= 'extends' ruleObjectName )? (otherlv_6= 'implements' ruleObjectName (otherlv_8= '.' ruleObjectName )* )? otherlv_10= '{' ( (lv_field_declarations_11_0= ruleFieldDeclaration ) )* otherlv_12= '}' )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:445:2: () ( (lv_modifiers_1_0= ruleModifier ) )* otherlv_2= 'class' this_ID_3= RULE_ID (otherlv_4= 'extends' ruleObjectName )? (otherlv_6= 'implements' ruleObjectName (otherlv_8= '.' ruleObjectName )* )? otherlv_10= '{' ( (lv_field_declarations_11_0= ruleFieldDeclaration ) )* otherlv_12= '}'
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:445:2: ()
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:446:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClassDeclarationAccess().getClassDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:454:2: ( (lv_modifiers_1_0= ruleModifier ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26||(LA7_0>=82 && LA7_0<=90)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:455:1: (lv_modifiers_1_0= ruleModifier )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:455:1: (lv_modifiers_1_0= ruleModifier )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:456:3: lv_modifiers_1_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getModifiersModifierParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleClassDeclaration1054);
            	    lv_modifiers_1_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_1_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleClassDeclaration1067); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getClassDeclarationAccess().getClassKeyword_2());
                  
            }
            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassDeclaration1078); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_3, grammarAccess.getClassDeclarationAccess().getIDTerminalRuleCall_3()); 
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:480:1: (otherlv_4= 'extends' ruleObjectName )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:480:3: otherlv_4= 'extends' ruleObjectName
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleClassDeclaration1090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getExtendsKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassDeclarationAccess().getObjectNameParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectName_in_ruleClassDeclaration1109);
                    ruleObjectName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:495:3: (otherlv_6= 'implements' ruleObjectName (otherlv_8= '.' ruleObjectName )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:495:5: otherlv_6= 'implements' ruleObjectName (otherlv_8= '.' ruleObjectName )*
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleClassDeclaration1123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getClassDeclarationAccess().getImplementsKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassDeclarationAccess().getObjectNameParserRuleCall_5_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectName_in_ruleClassDeclaration1142);
                    ruleObjectName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:510:1: (otherlv_8= '.' ruleObjectName )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:510:3: otherlv_8= '.' ruleObjectName
                    	    {
                    	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleClassDeclaration1154); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getClassDeclarationAccess().getFullStopKeyword_5_2_0());
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getClassDeclarationAccess().getObjectNameParserRuleCall_5_2_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleObjectName_in_ruleClassDeclaration1173);
                    	    ruleObjectName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleClassDeclaration1188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:529:1: ( (lv_field_declarations_11_0= ruleFieldDeclaration ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==16||LA11_0==26||(LA11_0>=74 && LA11_0<=90)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:530:1: (lv_field_declarations_11_0= ruleFieldDeclaration )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:530:1: (lv_field_declarations_11_0= ruleFieldDeclaration )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:531:3: lv_field_declarations_11_0= ruleFieldDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getField_declarationsFieldDeclarationParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFieldDeclaration_in_ruleClassDeclaration1209);
            	    lv_field_declarations_11_0=ruleFieldDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"field_declarations",
            	              		lv_field_declarations_11_0, 
            	              		"FieldDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleClassDeclaration1222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, ruleClassDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleInterfaceDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:559:1: entryRuleInterfaceDeclaration returns [EObject current=null] : iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF ;
    public final EObject entryRuleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleInterfaceDeclaration_StartIndex = input.index();
        EObject iv_ruleInterfaceDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:560:2: (iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:561:2: iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration1258);
            iv_ruleInterfaceDeclaration=ruleInterfaceDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDeclaration1268); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, entryRuleInterfaceDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceDeclaration"


    // $ANTLR start "ruleInterfaceDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:568:1: ruleInterfaceDeclaration returns [EObject current=null] : ( () ( ruleModifier )* otherlv_2= 'interface' this_ID_3= RULE_ID (otherlv_4= 'extends' ruleObjectName (otherlv_6= '.' ruleObjectName )* )? otherlv_8= '{' ( (lv_field_declarations_9_0= ruleFieldDeclaration ) )* otherlv_10= '}' ) ;
    public final EObject ruleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleInterfaceDeclaration_StartIndex = input.index();
        Token otherlv_2=null;
        Token this_ID_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_field_declarations_9_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:571:28: ( ( () ( ruleModifier )* otherlv_2= 'interface' this_ID_3= RULE_ID (otherlv_4= 'extends' ruleObjectName (otherlv_6= '.' ruleObjectName )* )? otherlv_8= '{' ( (lv_field_declarations_9_0= ruleFieldDeclaration ) )* otherlv_10= '}' ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:572:1: ( () ( ruleModifier )* otherlv_2= 'interface' this_ID_3= RULE_ID (otherlv_4= 'extends' ruleObjectName (otherlv_6= '.' ruleObjectName )* )? otherlv_8= '{' ( (lv_field_declarations_9_0= ruleFieldDeclaration ) )* otherlv_10= '}' )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:572:1: ( () ( ruleModifier )* otherlv_2= 'interface' this_ID_3= RULE_ID (otherlv_4= 'extends' ruleObjectName (otherlv_6= '.' ruleObjectName )* )? otherlv_8= '{' ( (lv_field_declarations_9_0= ruleFieldDeclaration ) )* otherlv_10= '}' )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:572:2: () ( ruleModifier )* otherlv_2= 'interface' this_ID_3= RULE_ID (otherlv_4= 'extends' ruleObjectName (otherlv_6= '.' ruleObjectName )* )? otherlv_8= '{' ( (lv_field_declarations_9_0= ruleFieldDeclaration ) )* otherlv_10= '}'
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:572:2: ()
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:573:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceDeclarationAccess().getInterfaceDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:581:2: ( ruleModifier )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26||(LA12_0>=82 && LA12_0<=90)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:582:2: ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getModifierParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleInterfaceDeclaration1325);
            	    ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleInterfaceDeclaration1338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInterfaceDeclarationAccess().getInterfaceKeyword_2());
                  
            }
            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceDeclaration1349); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_3, grammarAccess.getInterfaceDeclarationAccess().getIDTerminalRuleCall_3()); 
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:600:1: (otherlv_4= 'extends' ruleObjectName (otherlv_6= '.' ruleObjectName )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:600:3: otherlv_4= 'extends' ruleObjectName (otherlv_6= '.' ruleObjectName )*
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleInterfaceDeclaration1361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInterfaceDeclarationAccess().getExtendsKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getObjectNameParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectName_in_ruleInterfaceDeclaration1380);
                    ruleObjectName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:615:1: (otherlv_6= '.' ruleObjectName )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:615:3: otherlv_6= '.' ruleObjectName
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleInterfaceDeclaration1392); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getInterfaceDeclarationAccess().getFullStopKeyword_4_2_0());
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getObjectNameParserRuleCall_4_2_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleObjectName_in_ruleInterfaceDeclaration1411);
                    	    ruleObjectName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleInterfaceDeclaration1426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getInterfaceDeclarationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:634:1: ( (lv_field_declarations_9_0= ruleFieldDeclaration ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==16||LA15_0==26||(LA15_0>=74 && LA15_0<=90)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:635:1: (lv_field_declarations_9_0= ruleFieldDeclaration )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:635:1: (lv_field_declarations_9_0= ruleFieldDeclaration )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:636:3: lv_field_declarations_9_0= ruleFieldDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getField_declarationsFieldDeclarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFieldDeclaration_in_ruleInterfaceDeclaration1447);
            	    lv_field_declarations_9_0=ruleFieldDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"field_declarations",
            	              		lv_field_declarations_9_0, 
            	              		"FieldDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleInterfaceDeclaration1460); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getInterfaceDeclarationAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, ruleInterfaceDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceDeclaration"


    // $ANTLR start "entryRuleFieldDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:664:1: entryRuleFieldDeclaration returns [EObject current=null] : iv_ruleFieldDeclaration= ruleFieldDeclaration EOF ;
    public final EObject entryRuleFieldDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleFieldDeclaration_StartIndex = input.index();
        EObject iv_ruleFieldDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:665:2: (iv_ruleFieldDeclaration= ruleFieldDeclaration EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:666:2: iv_ruleFieldDeclaration= ruleFieldDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFieldDeclaration_in_entryRuleFieldDeclaration1496);
            iv_ruleFieldDeclaration=ruleFieldDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldDeclaration1506); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, entryRuleFieldDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldDeclaration"


    // $ANTLR start "ruleFieldDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:673:1: ruleFieldDeclaration returns [EObject current=null] : ( ( ( (lv_declaration_0_1= ruleMethodDeclaration | lv_declaration_0_2= ruleConstructorDeclaration | lv_declaration_0_3= ruleVariableDeclaration ) ) ) | this_StaticInitializer_1= ruleStaticInitializer | ( () otherlv_3= ';' ) ) ;
    public final EObject ruleFieldDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleFieldDeclaration_StartIndex = input.index();
        Token otherlv_3=null;
        EObject lv_declaration_0_1 = null;

        EObject lv_declaration_0_2 = null;

        EObject lv_declaration_0_3 = null;

        EObject this_StaticInitializer_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:676:28: ( ( ( ( (lv_declaration_0_1= ruleMethodDeclaration | lv_declaration_0_2= ruleConstructorDeclaration | lv_declaration_0_3= ruleVariableDeclaration ) ) ) | this_StaticInitializer_1= ruleStaticInitializer | ( () otherlv_3= ';' ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:677:1: ( ( ( (lv_declaration_0_1= ruleMethodDeclaration | lv_declaration_0_2= ruleConstructorDeclaration | lv_declaration_0_3= ruleVariableDeclaration ) ) ) | this_StaticInitializer_1= ruleStaticInitializer | ( () otherlv_3= ';' ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:677:1: ( ( ( (lv_declaration_0_1= ruleMethodDeclaration | lv_declaration_0_2= ruleConstructorDeclaration | lv_declaration_0_3= ruleVariableDeclaration ) ) ) | this_StaticInitializer_1= ruleStaticInitializer | ( () otherlv_3= ';' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                {
                alt17=1;
                }
                break;
            case 26:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==RULE_ID||LA17_2==26||(LA17_2>=74 && LA17_2<=90)) ) {
                    alt17=1;
                }
                else if ( (LA17_2==23) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:677:2: ( ( (lv_declaration_0_1= ruleMethodDeclaration | lv_declaration_0_2= ruleConstructorDeclaration | lv_declaration_0_3= ruleVariableDeclaration ) ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:677:2: ( ( (lv_declaration_0_1= ruleMethodDeclaration | lv_declaration_0_2= ruleConstructorDeclaration | lv_declaration_0_3= ruleVariableDeclaration ) ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:678:1: ( (lv_declaration_0_1= ruleMethodDeclaration | lv_declaration_0_2= ruleConstructorDeclaration | lv_declaration_0_3= ruleVariableDeclaration ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:678:1: ( (lv_declaration_0_1= ruleMethodDeclaration | lv_declaration_0_2= ruleConstructorDeclaration | lv_declaration_0_3= ruleVariableDeclaration ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:679:1: (lv_declaration_0_1= ruleMethodDeclaration | lv_declaration_0_2= ruleConstructorDeclaration | lv_declaration_0_3= ruleVariableDeclaration )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:679:1: (lv_declaration_0_1= ruleMethodDeclaration | lv_declaration_0_2= ruleConstructorDeclaration | lv_declaration_0_3= ruleVariableDeclaration )
                    int alt16=3;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:680:3: lv_declaration_0_1= ruleMethodDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFieldDeclarationAccess().getDeclarationMethodDeclarationParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMethodDeclaration_in_ruleFieldDeclaration1554);
                            lv_declaration_0_1=ruleMethodDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFieldDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"declaration",
                                      		lv_declaration_0_1, 
                                      		"MethodDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:695:8: lv_declaration_0_2= ruleConstructorDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFieldDeclarationAccess().getDeclarationConstructorDeclarationParserRuleCall_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConstructorDeclaration_in_ruleFieldDeclaration1573);
                            lv_declaration_0_2=ruleConstructorDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFieldDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"declaration",
                                      		lv_declaration_0_2, 
                                      		"ConstructorDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:710:8: lv_declaration_0_3= ruleVariableDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFieldDeclarationAccess().getDeclarationVariableDeclarationParserRuleCall_0_0_2()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFieldDeclaration1592);
                            lv_declaration_0_3=ruleVariableDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFieldDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"declaration",
                                      		lv_declaration_0_3, 
                                      		"VariableDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:730:2: this_StaticInitializer_1= ruleStaticInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldDeclarationAccess().getStaticInitializerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStaticInitializer_in_ruleFieldDeclaration1626);
                    this_StaticInitializer_1=ruleStaticInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StaticInitializer_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:742:6: ( () otherlv_3= ';' )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:742:6: ( () otherlv_3= ';' )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:742:7: () otherlv_3= ';'
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:742:7: ()
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:743:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getFieldDeclarationAccess().getFieldDeclarationAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFieldDeclaration1656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFieldDeclarationAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, ruleFieldDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFieldDeclaration"


    // $ANTLR start "entryRuleStaticInitializer"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:763:1: entryRuleStaticInitializer returns [EObject current=null] : iv_ruleStaticInitializer= ruleStaticInitializer EOF ;
    public final EObject entryRuleStaticInitializer() throws RecognitionException {
        EObject current = null;
        int entryRuleStaticInitializer_StartIndex = input.index();
        EObject iv_ruleStaticInitializer = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:764:2: (iv_ruleStaticInitializer= ruleStaticInitializer EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:765:2: iv_ruleStaticInitializer= ruleStaticInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleStaticInitializer_in_entryRuleStaticInitializer1693);
            iv_ruleStaticInitializer=ruleStaticInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticInitializer1703); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, entryRuleStaticInitializer_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticInitializer"


    // $ANTLR start "ruleStaticInitializer"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:772:1: ruleStaticInitializer returns [EObject current=null] : (otherlv_0= 'static' this_StatementBlock_1= ruleStatementBlock ) ;
    public final EObject ruleStaticInitializer() throws RecognitionException {
        EObject current = null;
        int ruleStaticInitializer_StartIndex = input.index();
        Token otherlv_0=null;
        EObject this_StatementBlock_1 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:775:28: ( (otherlv_0= 'static' this_StatementBlock_1= ruleStatementBlock ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:776:1: (otherlv_0= 'static' this_StatementBlock_1= ruleStatementBlock )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:776:1: (otherlv_0= 'static' this_StatementBlock_1= ruleStatementBlock )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:776:3: otherlv_0= 'static' this_StatementBlock_1= ruleStatementBlock
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleStaticInitializer1740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStaticInitializerAccess().getStaticKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStaticInitializerAccess().getStatementBlockParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleStaticInitializer1765);
            this_StatementBlock_1=ruleStatementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_StatementBlock_1; 
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, ruleStaticInitializer_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStaticInitializer"


    // $ANTLR start "entryRuleMethodDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:800:1: entryRuleMethodDeclaration returns [EObject current=null] : iv_ruleMethodDeclaration= ruleMethodDeclaration EOF ;
    public final EObject entryRuleMethodDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleMethodDeclaration_StartIndex = input.index();
        EObject iv_ruleMethodDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:801:2: (iv_ruleMethodDeclaration= ruleMethodDeclaration EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:802:2: iv_ruleMethodDeclaration= ruleMethodDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleMethodDeclaration_in_entryRuleMethodDeclaration1800);
            iv_ruleMethodDeclaration=ruleMethodDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodDeclaration1810); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleMethodDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodDeclaration"


    // $ANTLR start "ruleMethodDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:809:1: ruleMethodDeclaration returns [EObject current=null] : ( ( ruleModifier )* this_Type_1= ruleType this_ID_2= RULE_ID otherlv_3= '(' (this_ParameterList_4= ruleParameterList )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statement_block_8_0= ruleStatementBlock ) ) | otherlv_9= ';' ) ) ;
    public final EObject ruleMethodDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleMethodDeclaration_StartIndex = input.index();
        Token this_ID_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_Type_1 = null;

        EObject this_ParameterList_4 = null;

        EObject lv_statement_block_8_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:812:28: ( ( ( ruleModifier )* this_Type_1= ruleType this_ID_2= RULE_ID otherlv_3= '(' (this_ParameterList_4= ruleParameterList )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statement_block_8_0= ruleStatementBlock ) ) | otherlv_9= ';' ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:813:1: ( ( ruleModifier )* this_Type_1= ruleType this_ID_2= RULE_ID otherlv_3= '(' (this_ParameterList_4= ruleParameterList )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statement_block_8_0= ruleStatementBlock ) ) | otherlv_9= ';' ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:813:1: ( ( ruleModifier )* this_Type_1= ruleType this_ID_2= RULE_ID otherlv_3= '(' (this_ParameterList_4= ruleParameterList )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statement_block_8_0= ruleStatementBlock ) ) | otherlv_9= ';' ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:813:2: ( ruleModifier )* this_Type_1= ruleType this_ID_2= RULE_ID otherlv_3= '(' (this_ParameterList_4= ruleParameterList )? otherlv_5= ')' (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statement_block_8_0= ruleStatementBlock ) ) | otherlv_9= ';' )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:813:2: ( ruleModifier )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26||(LA18_0>=82 && LA18_0<=90)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:814:2: ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getMethodDeclarationAccess().getModifierParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleMethodDeclaration1855);
            	    ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMethodDeclarationAccess().getTypeParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleType_in_ruleMethodDeclaration1881);
            this_Type_1=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Type_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodDeclaration1891); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getMethodDeclarationAccess().getIDTerminalRuleCall_2()); 
                  
            }
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleMethodDeclaration1902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMethodDeclarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:844:1: (this_ParameterList_4= ruleParameterList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||(LA19_0>=74 && LA19_0<=81)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:845:2: this_ParameterList_4= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodDeclarationAccess().getParameterListParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterList_in_ruleMethodDeclaration1928);
                    this_ParameterList_4=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParameterList_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleMethodDeclaration1941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMethodDeclarationAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:860:1: (otherlv_6= '[' otherlv_7= ']' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:860:3: otherlv_6= '[' otherlv_7= ']'
            	    {
            	    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleMethodDeclaration1954); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMethodDeclarationAccess().getLeftSquareBracketKeyword_6_0());
            	          
            	    }
            	    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleMethodDeclaration1966); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMethodDeclarationAccess().getRightSquareBracketKeyword_6_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:868:3: ( ( (lv_statement_block_8_0= ruleStatementBlock ) ) | otherlv_9= ';' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            else if ( (LA21_0==16) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:868:4: ( (lv_statement_block_8_0= ruleStatementBlock ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:868:4: ( (lv_statement_block_8_0= ruleStatementBlock ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:869:1: (lv_statement_block_8_0= ruleStatementBlock )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:869:1: (lv_statement_block_8_0= ruleStatementBlock )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:870:3: lv_statement_block_8_0= ruleStatementBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodDeclarationAccess().getStatement_blockStatementBlockParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementBlock_in_ruleMethodDeclaration1990);
                    lv_statement_block_8_0=ruleStatementBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"statement_block",
                              		lv_statement_block_8_0, 
                              		"StatementBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:887:7: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleMethodDeclaration2008); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getMethodDeclarationAccess().getSemicolonKeyword_7_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, ruleMethodDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMethodDeclaration"


    // $ANTLR start "entryRuleConstructorDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:899:1: entryRuleConstructorDeclaration returns [EObject current=null] : iv_ruleConstructorDeclaration= ruleConstructorDeclaration EOF ;
    public final EObject entryRuleConstructorDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleConstructorDeclaration_StartIndex = input.index();
        EObject iv_ruleConstructorDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:900:2: (iv_ruleConstructorDeclaration= ruleConstructorDeclaration EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:901:2: iv_ruleConstructorDeclaration= ruleConstructorDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructorDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleConstructorDeclaration_in_entryRuleConstructorDeclaration2045);
            iv_ruleConstructorDeclaration=ruleConstructorDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructorDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructorDeclaration2055); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, entryRuleConstructorDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleConstructorDeclaration"


    // $ANTLR start "ruleConstructorDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:908:1: ruleConstructorDeclaration returns [EObject current=null] : ( ( ruleModifier )* this_ID_1= RULE_ID otherlv_2= '(' (this_ParameterList_3= ruleParameterList )? otherlv_4= ')' ( (lv_statement_block_5_0= ruleStatementBlock ) ) ) ;
    public final EObject ruleConstructorDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleConstructorDeclaration_StartIndex = input.index();
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ParameterList_3 = null;

        EObject lv_statement_block_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:911:28: ( ( ( ruleModifier )* this_ID_1= RULE_ID otherlv_2= '(' (this_ParameterList_3= ruleParameterList )? otherlv_4= ')' ( (lv_statement_block_5_0= ruleStatementBlock ) ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:912:1: ( ( ruleModifier )* this_ID_1= RULE_ID otherlv_2= '(' (this_ParameterList_3= ruleParameterList )? otherlv_4= ')' ( (lv_statement_block_5_0= ruleStatementBlock ) ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:912:1: ( ( ruleModifier )* this_ID_1= RULE_ID otherlv_2= '(' (this_ParameterList_3= ruleParameterList )? otherlv_4= ')' ( (lv_statement_block_5_0= ruleStatementBlock ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:912:2: ( ruleModifier )* this_ID_1= RULE_ID otherlv_2= '(' (this_ParameterList_3= ruleParameterList )? otherlv_4= ')' ( (lv_statement_block_5_0= ruleStatementBlock ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:912:2: ( ruleModifier )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26||(LA22_0>=82 && LA22_0<=90)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:913:2: ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getConstructorDeclarationAccess().getModifierParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleConstructorDeclaration2100);
            	    ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructorDeclaration2112); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getConstructorDeclarationAccess().getIDTerminalRuleCall_1()); 
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleConstructorDeclaration2123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstructorDeclarationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:931:1: (this_ParameterList_3= ruleParameterList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=74 && LA23_0<=81)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:932:2: this_ParameterList_3= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstructorDeclarationAccess().getParameterListParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterList_in_ruleConstructorDeclaration2149);
                    this_ParameterList_3=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParameterList_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleConstructorDeclaration2162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstructorDeclarationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:947:1: ( (lv_statement_block_5_0= ruleStatementBlock ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:948:1: (lv_statement_block_5_0= ruleStatementBlock )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:948:1: (lv_statement_block_5_0= ruleStatementBlock )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:949:3: lv_statement_block_5_0= ruleStatementBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructorDeclarationAccess().getStatement_blockStatementBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleConstructorDeclaration2183);
            lv_statement_block_5_0=ruleStatementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstructorDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"statement_block",
                      		lv_statement_block_5_0, 
                      		"StatementBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, ruleConstructorDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleConstructorDeclaration"


    // $ANTLR start "entryRuleParameterList"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:973:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;
        int entryRuleParameterList_StartIndex = input.index();
        EObject iv_ruleParameterList = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:974:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:975:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList2219);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList2229); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, entryRuleParameterList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:982:1: ruleParameterList returns [EObject current=null] : (this_Parameter_0= ruleParameter (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;
        int ruleParameterList_StartIndex = input.index();
        Token otherlv_1=null;
        EObject this_Parameter_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:985:28: ( (this_Parameter_0= ruleParameter (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:986:1: (this_Parameter_0= ruleParameter (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:986:1: (this_Parameter_0= ruleParameter (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:987:2: this_Parameter_0= ruleParameter (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParameterListAccess().getParameterParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleParameter_in_ruleParameterList2279);
            this_Parameter_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Parameter_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:998:1: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:998:3: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleParameterList2291); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1002:1: ( (lv_parameters_2_0= ruleParameter ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1003:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1003:1: (lv_parameters_2_0= ruleParameter )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1004:3: lv_parameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameterList2312);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParameterListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_2_0, 
            	              		"Parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, ruleParameterList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1028:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;
        int entryRuleParameter_StartIndex = input.index();
        EObject iv_ruleParameter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1029:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1030:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2350);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2360); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, entryRuleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1037:1: ruleParameter returns [EObject current=null] : (this_Type_0= ruleType this_ID_1= RULE_ID (otherlv_2= '[' otherlv_3= ']' )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;
        int ruleParameter_StartIndex = input.index();
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Type_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1040:28: ( (this_Type_0= ruleType this_ID_1= RULE_ID (otherlv_2= '[' otherlv_3= ']' )* ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1041:1: (this_Type_0= ruleType this_ID_1= RULE_ID (otherlv_2= '[' otherlv_3= ']' )* )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1041:1: (this_Type_0= ruleType this_ID_1= RULE_ID (otherlv_2= '[' otherlv_3= ']' )* )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1042:2: this_Type_0= ruleType this_ID_1= RULE_ID (otherlv_2= '[' otherlv_3= ']' )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParameterAccess().getTypeParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleType_in_ruleParameter2410);
            this_Type_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Type_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2420); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getParameterAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1057:1: (otherlv_2= '[' otherlv_3= ']' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1057:3: otherlv_2= '[' otherlv_3= ']'
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleParameter2432); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleParameter2444); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, ruleParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleStatementBlock"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1073:1: entryRuleStatementBlock returns [EObject current=null] : iv_ruleStatementBlock= ruleStatementBlock EOF ;
    public final EObject entryRuleStatementBlock() throws RecognitionException {
        EObject current = null;
        int entryRuleStatementBlock_StartIndex = input.index();
        EObject iv_ruleStatementBlock = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1074:2: (iv_ruleStatementBlock= ruleStatementBlock EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1075:2: iv_ruleStatementBlock= ruleStatementBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementBlockRule()); 
            }
            pushFollow(FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock2482);
            iv_ruleStatementBlock=ruleStatementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementBlock2492); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, entryRuleStatementBlock_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementBlock"


    // $ANTLR start "ruleStatementBlock"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1082:1: ruleStatementBlock returns [EObject current=null] : (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleStatementBlock() throws RecognitionException {
        EObject current = null;
        int ruleStatementBlock_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1085:28: ( (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1086:1: (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1086:1: (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1086:3: otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleStatementBlock2529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1090:1: ()
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1091:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatementBlockAccess().getStatementBlockAction_1(),
                          current);
                  
            }

            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1099:2: ( (lv_statements_2_0= ruleStatement ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_ZERO_TO_SEVEN)||LA26_0==16||(LA26_0>=18 && LA26_0<=19)||LA26_0==23||(LA26_0>=26 && LA26_0<=27)||LA26_0==29||LA26_0==31||(LA26_0>=33 && LA26_0<=65)||(LA26_0>=67 && LA26_0<=92)||(LA26_0>=94 && LA26_0<=97)||(LA26_0>=99 && LA26_0<=103)||LA26_0==106) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1100:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1100:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1101:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatementBlock2562);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatementBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleStatementBlock2575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStatementBlockAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, ruleStatementBlock_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStatementBlock"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1129:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleVariableDeclaration_StartIndex = input.index();
        EObject iv_ruleVariableDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1130:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1131:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2611);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration2621); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, entryRuleVariableDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1138:1: ruleVariableDeclaration returns [EObject current=null] : ( ( ruleModifier )* ( (lv_type_1_0= ruleType ) )? ( (lv_variable_declarator_2_0= ruleVariableDeclarator ) ) (otherlv_3= ',' ( (lv_variable_declarators_4_0= ruleVariableDeclarator ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleVariableDeclaration_StartIndex = input.index();
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_1_0 = null;

        EObject lv_variable_declarator_2_0 = null;

        EObject lv_variable_declarators_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1141:28: ( ( ( ruleModifier )* ( (lv_type_1_0= ruleType ) )? ( (lv_variable_declarator_2_0= ruleVariableDeclarator ) ) (otherlv_3= ',' ( (lv_variable_declarators_4_0= ruleVariableDeclarator ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1142:1: ( ( ruleModifier )* ( (lv_type_1_0= ruleType ) )? ( (lv_variable_declarator_2_0= ruleVariableDeclarator ) ) (otherlv_3= ',' ( (lv_variable_declarators_4_0= ruleVariableDeclarator ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1142:1: ( ( ruleModifier )* ( (lv_type_1_0= ruleType ) )? ( (lv_variable_declarator_2_0= ruleVariableDeclarator ) ) (otherlv_3= ',' ( (lv_variable_declarators_4_0= ruleVariableDeclarator ) ) )* otherlv_5= ';' )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1142:2: ( ruleModifier )* ( (lv_type_1_0= ruleType ) )? ( (lv_variable_declarator_2_0= ruleVariableDeclarator ) ) (otherlv_3= ',' ( (lv_variable_declarators_4_0= ruleVariableDeclarator ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1142:2: ( ruleModifier )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==26||(LA27_0>=82 && LA27_0<=90)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1143:2: ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getModifierParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleVariableDeclaration2666);
            	    ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1153:3: ( (lv_type_1_0= ruleType ) )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1154:1: (lv_type_1_0= ruleType )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1154:1: (lv_type_1_0= ruleType )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1155:3: lv_type_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration2688);
                    lv_type_1_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_1_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1171:3: ( (lv_variable_declarator_2_0= ruleVariableDeclarator ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1172:1: (lv_variable_declarator_2_0= ruleVariableDeclarator )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1172:1: (lv_variable_declarator_2_0= ruleVariableDeclarator )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1173:3: lv_variable_declarator_2_0= ruleVariableDeclarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariable_declaratorVariableDeclaratorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclarator_in_ruleVariableDeclaration2710);
            lv_variable_declarator_2_0=ruleVariableDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"variable_declarator",
                      		lv_variable_declarator_2_0, 
                      		"VariableDeclarator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1189:2: (otherlv_3= ',' ( (lv_variable_declarators_4_0= ruleVariableDeclarator ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1189:4: otherlv_3= ',' ( (lv_variable_declarators_4_0= ruleVariableDeclarator ) )
            	    {
            	    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleVariableDeclaration2723); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1193:1: ( (lv_variable_declarators_4_0= ruleVariableDeclarator ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1194:1: (lv_variable_declarators_4_0= ruleVariableDeclarator )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1194:1: (lv_variable_declarators_4_0= ruleVariableDeclarator )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1195:3: lv_variable_declarators_4_0= ruleVariableDeclarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariable_declaratorsVariableDeclaratorParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclarator_in_ruleVariableDeclaration2744);
            	    lv_variable_declarators_4_0=ruleVariableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variable_declarators",
            	              		lv_variable_declarators_4_0, 
            	              		"VariableDeclarator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleVariableDeclaration2758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, ruleVariableDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableDeclarator"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1223:1: entryRuleVariableDeclarator returns [EObject current=null] : iv_ruleVariableDeclarator= ruleVariableDeclarator EOF ;
    public final EObject entryRuleVariableDeclarator() throws RecognitionException {
        EObject current = null;
        int entryRuleVariableDeclarator_StartIndex = input.index();
        EObject iv_ruleVariableDeclarator = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1224:2: (iv_ruleVariableDeclarator= ruleVariableDeclarator EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1225:2: iv_ruleVariableDeclarator= ruleVariableDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclaratorRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclarator_in_entryRuleVariableDeclarator2794);
            iv_ruleVariableDeclarator=ruleVariableDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclarator2804); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, entryRuleVariableDeclarator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclarator"


    // $ANTLR start "ruleVariableDeclarator"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1232:1: ruleVariableDeclarator returns [EObject current=null] : ( () this_ID_1= RULE_ID (otherlv_2= '[' otherlv_3= ']' )* (otherlv_4= '=' ( (lv_variable_initializer_5_0= ruleVariableInitializer ) ) )? ) ;
    public final EObject ruleVariableDeclarator() throws RecognitionException {
        EObject current = null;
        int ruleVariableDeclarator_StartIndex = input.index();
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_variable_initializer_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1235:28: ( ( () this_ID_1= RULE_ID (otherlv_2= '[' otherlv_3= ']' )* (otherlv_4= '=' ( (lv_variable_initializer_5_0= ruleVariableInitializer ) ) )? ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1236:1: ( () this_ID_1= RULE_ID (otherlv_2= '[' otherlv_3= ']' )* (otherlv_4= '=' ( (lv_variable_initializer_5_0= ruleVariableInitializer ) ) )? )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1236:1: ( () this_ID_1= RULE_ID (otherlv_2= '[' otherlv_3= ']' )* (otherlv_4= '=' ( (lv_variable_initializer_5_0= ruleVariableInitializer ) ) )? )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1236:2: () this_ID_1= RULE_ID (otherlv_2= '[' otherlv_3= ']' )* (otherlv_4= '=' ( (lv_variable_initializer_5_0= ruleVariableInitializer ) ) )?
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1236:2: ()
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1237:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDeclaratorAccess().getVariableDeclaratorAction_0(),
                          current);
                  
            }

            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclarator2852); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getVariableDeclaratorAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1249:1: (otherlv_2= '[' otherlv_3= ']' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1249:3: otherlv_2= '[' otherlv_3= ']'
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleVariableDeclarator2864); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVariableDeclaratorAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleVariableDeclarator2876); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariableDeclaratorAccess().getRightSquareBracketKeyword_2_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1257:3: (otherlv_4= '=' ( (lv_variable_initializer_5_0= ruleVariableInitializer ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1257:5: otherlv_4= '=' ( (lv_variable_initializer_5_0= ruleVariableInitializer ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleVariableDeclarator2891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariableDeclaratorAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1261:1: ( (lv_variable_initializer_5_0= ruleVariableInitializer ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1262:1: (lv_variable_initializer_5_0= ruleVariableInitializer )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1262:1: (lv_variable_initializer_5_0= ruleVariableInitializer )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1263:3: lv_variable_initializer_5_0= ruleVariableInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclaratorAccess().getVariable_initializerVariableInitializerParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableInitializer_in_ruleVariableDeclarator2912);
                    lv_variable_initializer_5_0=ruleVariableInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclaratorRule());
                      	        }
                             		set(
                             			current, 
                             			"variable_initializer",
                              		lv_variable_initializer_5_0, 
                              		"VariableInitializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, ruleVariableDeclarator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclarator"


    // $ANTLR start "entryRuleVariableInitializer"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1287:1: entryRuleVariableInitializer returns [EObject current=null] : iv_ruleVariableInitializer= ruleVariableInitializer EOF ;
    public final EObject entryRuleVariableInitializer() throws RecognitionException {
        EObject current = null;
        int entryRuleVariableInitializer_StartIndex = input.index();
        EObject iv_ruleVariableInitializer = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1288:2: (iv_ruleVariableInitializer= ruleVariableInitializer EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1289:2: iv_ruleVariableInitializer= ruleVariableInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleVariableInitializer_in_entryRuleVariableInitializer2950);
            iv_ruleVariableInitializer=ruleVariableInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableInitializer2960); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, entryRuleVariableInitializer_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableInitializer"


    // $ANTLR start "ruleVariableInitializer"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1296:1: ruleVariableInitializer returns [EObject current=null] : ( ( (lv_expr_0_0= ruleExpression ) ) | (otherlv_1= '{' ( ( (lv_variable_initializer_2_0= ruleVariableInitializer ) ) (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) ) ;
    public final EObject ruleVariableInitializer() throws RecognitionException {
        EObject current = null;
        int ruleVariableInitializer_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_expr_0_0 = null;

        EObject lv_variable_initializer_2_0 = null;

        EObject lv_variable_initializers_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1299:28: ( ( ( (lv_expr_0_0= ruleExpression ) ) | (otherlv_1= '{' ( ( (lv_variable_initializer_2_0= ruleVariableInitializer ) ) (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1300:1: ( ( (lv_expr_0_0= ruleExpression ) ) | (otherlv_1= '{' ( ( (lv_variable_initializer_2_0= ruleVariableInitializer ) ) (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1300:1: ( ( (lv_expr_0_0= ruleExpression ) ) | (otherlv_1= '{' ( ( (lv_variable_initializer_2_0= ruleVariableInitializer ) ) (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==EOF||(LA35_0>=RULE_ID && LA35_0<=RULE_ZERO_TO_SEVEN)||LA35_0==16||(LA35_0>=18 && LA35_0<=19)||LA35_0==24||(LA35_0>=27 && LA35_0<=31)||(LA35_0>=33 && LA35_0<=73)||(LA35_0>=94 && LA35_0<=95)) ) {
                alt35=1;
            }
            else if ( (LA35_0==23) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1300:2: ( (lv_expr_0_0= ruleExpression ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1300:2: ( (lv_expr_0_0= ruleExpression ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1301:1: (lv_expr_0_0= ruleExpression )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1301:1: (lv_expr_0_0= ruleExpression )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1302:3: lv_expr_0_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableInitializerAccess().getExprExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableInitializer3006);
                    lv_expr_0_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableInitializerRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_0_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1319:6: (otherlv_1= '{' ( ( (lv_variable_initializer_2_0= ruleVariableInitializer ) ) (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1319:6: (otherlv_1= '{' ( ( (lv_variable_initializer_2_0= ruleVariableInitializer ) ) (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}' )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1319:8: otherlv_1= '{' ( ( (lv_variable_initializer_2_0= ruleVariableInitializer ) ) (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )* (otherlv_5= ',' )? )? otherlv_6= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleVariableInitializer3025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableInitializerAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1323:1: ( ( (lv_variable_initializer_2_0= ruleVariableInitializer ) ) (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )* (otherlv_5= ',' )? )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_ZERO_TO_SEVEN)||(LA34_0>=18 && LA34_0<=19)||LA34_0==23||LA34_0==27||LA34_0==29||LA34_0==31||(LA34_0>=33 && LA34_0<=65)||(LA34_0>=67 && LA34_0<=73)||(LA34_0>=94 && LA34_0<=95)) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==24) ) {
                        int LA34_2 = input.LA(2);

                        if ( (synpred37_InternalJavadsl()) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1323:2: ( (lv_variable_initializer_2_0= ruleVariableInitializer ) ) (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )* (otherlv_5= ',' )?
                            {
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1323:2: ( (lv_variable_initializer_2_0= ruleVariableInitializer ) )
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1324:1: (lv_variable_initializer_2_0= ruleVariableInitializer )
                            {
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1324:1: (lv_variable_initializer_2_0= ruleVariableInitializer )
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1325:3: lv_variable_initializer_2_0= ruleVariableInitializer
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariableInitializerAccess().getVariable_initializerVariableInitializerParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariableInitializer_in_ruleVariableInitializer3047);
                            lv_variable_initializer_2_0=ruleVariableInitializer();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getVariableInitializerRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"variable_initializer",
                                      		lv_variable_initializer_2_0, 
                                      		"VariableInitializer");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1341:2: (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==31) ) {
                                    int LA32_1 = input.LA(2);

                                    if ( (synpred35_InternalJavadsl()) ) {
                                        alt32=1;
                                    }


                                }


                                switch (alt32) {
                            	case 1 :
                            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1341:4: otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) )
                            	    {
                            	    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleVariableInitializer3060); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getVariableInitializerAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1345:1: ( (lv_variable_initializers_4_0= ruleVariableInitializer ) )
                            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1346:1: (lv_variable_initializers_4_0= ruleVariableInitializer )
                            	    {
                            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1346:1: (lv_variable_initializers_4_0= ruleVariableInitializer )
                            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1347:3: lv_variable_initializers_4_0= ruleVariableInitializer
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getVariableInitializerAccess().getVariable_initializersVariableInitializerParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleVariableInitializer_in_ruleVariableInitializer3081);
                            	    lv_variable_initializers_4_0=ruleVariableInitializer();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getVariableInitializerRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"variable_initializers",
                            	              		lv_variable_initializers_4_0, 
                            	              		"VariableInitializer");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);

                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1363:4: (otherlv_5= ',' )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==31) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1363:6: otherlv_5= ','
                                    {
                                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleVariableInitializer3096); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_5, grammarAccess.getVariableInitializerAccess().getCommaKeyword_1_1_2());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleVariableInitializer3112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getVariableInitializerAccess().getRightCurlyBracketKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, ruleVariableInitializer_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleVariableInitializer"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1379:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;
        int entryRuleType_StartIndex = input.index();
        EObject iv_ruleType = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1380:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1381:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType3149);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType3159); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, entryRuleType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1388:1: ruleType returns [EObject current=null] : ( ( (lv_specifier_0_0= ruleTypeSpecifier ) ) (otherlv_1= '[' otherlv_2= ']' )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;
        int ruleType_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_specifier_0_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1391:28: ( ( ( (lv_specifier_0_0= ruleTypeSpecifier ) ) (otherlv_1= '[' otherlv_2= ']' )* ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1392:1: ( ( (lv_specifier_0_0= ruleTypeSpecifier ) ) (otherlv_1= '[' otherlv_2= ']' )* )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1392:1: ( ( (lv_specifier_0_0= ruleTypeSpecifier ) ) (otherlv_1= '[' otherlv_2= ']' )* )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1392:2: ( (lv_specifier_0_0= ruleTypeSpecifier ) ) (otherlv_1= '[' otherlv_2= ']' )*
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1392:2: ( (lv_specifier_0_0= ruleTypeSpecifier ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1393:1: (lv_specifier_0_0= ruleTypeSpecifier )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1393:1: (lv_specifier_0_0= ruleTypeSpecifier )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1394:3: lv_specifier_0_0= ruleTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getSpecifierTypeSpecifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleType3205);
            lv_specifier_0_0=ruleTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeRule());
              	        }
                     		set(
                     			current, 
                     			"specifier",
                      		lv_specifier_0_0, 
                      		"TypeSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1410:2: (otherlv_1= '[' otherlv_2= ']' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==29) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1410:4: otherlv_1= '[' otherlv_2= ']'
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleType3218); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleType3230); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, ruleType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1426:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleExpression_StartIndex = input.index();
        EObject iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1427:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1428:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3268);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3278); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1435:1: ruleExpression returns [EObject current=null] : this_NumericExpression_0= ruleNumericExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;
        int ruleExpression_StartIndex = input.index();
        EObject this_NumericExpression_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1438:28: (this_NumericExpression_0= ruleNumericExpression )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1440:2: this_NumericExpression_0= ruleNumericExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getNumericExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericExpression_in_ruleExpression3327);
            this_NumericExpression_0=ruleNumericExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNumericExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1459:1: entryRuleNumericExpression returns [EObject current=null] : iv_ruleNumericExpression= ruleNumericExpression EOF ;
    public final EObject entryRuleNumericExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleNumericExpression_StartIndex = input.index();
        EObject iv_ruleNumericExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1460:2: (iv_ruleNumericExpression= ruleNumericExpression EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1461:2: iv_ruleNumericExpression= ruleNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression3361);
            iv_ruleNumericExpression=ruleNumericExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericExpression3371); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, entryRuleNumericExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericExpression"


    // $ANTLR start "ruleNumericExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1468:1: ruleNumericExpression returns [EObject current=null] : ( ( (otherlv_0= '-' | otherlv_1= '++' | otherlv_2= '--' ) this_BitExpression_3= ruleBitExpression ) | (this_BitExpression_4= ruleBitExpression ( (otherlv_5= '++' | otherlv_6= '--' ) | ( () (otherlv_8= '+' | otherlv_9= '+=' | otherlv_10= '-' | otherlv_11= '-=' | otherlv_12= '*' | otherlv_13= '*=' | otherlv_14= '/' | otherlv_15= '/=' | otherlv_16= '%' | otherlv_17= '%=' ) ( (lv_right_18_0= ruleBitExpression ) ) )* ) ) ) ;
    public final EObject ruleNumericExpression() throws RecognitionException {
        EObject current = null;
        int ruleNumericExpression_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject this_BitExpression_3 = null;

        EObject this_BitExpression_4 = null;

        EObject lv_right_18_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1471:28: ( ( ( (otherlv_0= '-' | otherlv_1= '++' | otherlv_2= '--' ) this_BitExpression_3= ruleBitExpression ) | (this_BitExpression_4= ruleBitExpression ( (otherlv_5= '++' | otherlv_6= '--' ) | ( () (otherlv_8= '+' | otherlv_9= '+=' | otherlv_10= '-' | otherlv_11= '-=' | otherlv_12= '*' | otherlv_13= '*=' | otherlv_14= '/' | otherlv_15= '/=' | otherlv_16= '%' | otherlv_17= '%=' ) ( (lv_right_18_0= ruleBitExpression ) ) )* ) ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1472:1: ( ( (otherlv_0= '-' | otherlv_1= '++' | otherlv_2= '--' ) this_BitExpression_3= ruleBitExpression ) | (this_BitExpression_4= ruleBitExpression ( (otherlv_5= '++' | otherlv_6= '--' ) | ( () (otherlv_8= '+' | otherlv_9= '+=' | otherlv_10= '-' | otherlv_11= '-=' | otherlv_12= '*' | otherlv_13= '*=' | otherlv_14= '/' | otherlv_15= '/=' | otherlv_16= '%' | otherlv_17= '%=' ) ( (lv_right_18_0= ruleBitExpression ) ) )* ) ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1472:1: ( ( (otherlv_0= '-' | otherlv_1= '++' | otherlv_2= '--' ) this_BitExpression_3= ruleBitExpression ) | (this_BitExpression_4= ruleBitExpression ( (otherlv_5= '++' | otherlv_6= '--' ) | ( () (otherlv_8= '+' | otherlv_9= '+=' | otherlv_10= '-' | otherlv_11= '-=' | otherlv_12= '*' | otherlv_13= '*=' | otherlv_14= '/' | otherlv_15= '/=' | otherlv_16= '%' | otherlv_17= '%=' ) ( (lv_right_18_0= ruleBitExpression ) ) )* ) ) )
            int alt42=2;
            switch ( input.LA(1) ) {
            case 33:
                {
                int LA42_1 = input.LA(2);

                if ( (synpred41_InternalJavadsl()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA42_2 = input.LA(2);

                if ( (synpred41_InternalJavadsl()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA42_3 = input.LA(2);

                if ( (synpred41_InternalJavadsl()) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 3, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_NUMBER_SUFFIX:
            case RULE_HEXA:
            case RULE_ZERO_TO_SEVEN:
            case 16:
            case 18:
            case 19:
            case 24:
            case 27:
            case 28:
            case 29:
            case 31:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 94:
            case 95:
                {
                alt42=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1472:2: ( (otherlv_0= '-' | otherlv_1= '++' | otherlv_2= '--' ) this_BitExpression_3= ruleBitExpression )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1472:2: ( (otherlv_0= '-' | otherlv_1= '++' | otherlv_2= '--' ) this_BitExpression_3= ruleBitExpression )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1472:3: (otherlv_0= '-' | otherlv_1= '++' | otherlv_2= '--' ) this_BitExpression_3= ruleBitExpression
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1472:3: (otherlv_0= '-' | otherlv_1= '++' | otherlv_2= '--' )
                    int alt37=3;
                    switch ( input.LA(1) ) {
                    case 33:
                        {
                        alt37=1;
                        }
                        break;
                    case 34:
                        {
                        alt37=2;
                        }
                        break;
                    case 35:
                        {
                        alt37=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1472:5: otherlv_0= '-'
                            {
                            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleNumericExpression3410); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_0, grammarAccess.getNumericExpressionAccess().getHyphenMinusKeyword_0_0_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1477:7: otherlv_1= '++'
                            {
                            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleNumericExpression3428); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getNumericExpressionAccess().getPlusSignPlusSignKeyword_0_0_1());
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1482:7: otherlv_2= '--'
                            {
                            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleNumericExpression3446); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getNumericExpressionAccess().getHyphenMinusHyphenMinusKeyword_0_0_2());
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericExpressionAccess().getBitExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitExpression_in_ruleNumericExpression3472);
                    this_BitExpression_3=ruleBitExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BitExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1499:6: (this_BitExpression_4= ruleBitExpression ( (otherlv_5= '++' | otherlv_6= '--' ) | ( () (otherlv_8= '+' | otherlv_9= '+=' | otherlv_10= '-' | otherlv_11= '-=' | otherlv_12= '*' | otherlv_13= '*=' | otherlv_14= '/' | otherlv_15= '/=' | otherlv_16= '%' | otherlv_17= '%=' ) ( (lv_right_18_0= ruleBitExpression ) ) )* ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1499:6: (this_BitExpression_4= ruleBitExpression ( (otherlv_5= '++' | otherlv_6= '--' ) | ( () (otherlv_8= '+' | otherlv_9= '+=' | otherlv_10= '-' | otherlv_11= '-=' | otherlv_12= '*' | otherlv_13= '*=' | otherlv_14= '/' | otherlv_15= '/=' | otherlv_16= '%' | otherlv_17= '%=' ) ( (lv_right_18_0= ruleBitExpression ) ) )* ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1500:2: this_BitExpression_4= ruleBitExpression ( (otherlv_5= '++' | otherlv_6= '--' ) | ( () (otherlv_8= '+' | otherlv_9= '+=' | otherlv_10= '-' | otherlv_11= '-=' | otherlv_12= '*' | otherlv_13= '*=' | otherlv_14= '/' | otherlv_15= '/=' | otherlv_16= '%' | otherlv_17= '%=' ) ( (lv_right_18_0= ruleBitExpression ) ) )* )
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericExpressionAccess().getBitExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitExpression_in_ruleNumericExpression3504);
                    this_BitExpression_4=ruleBitExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BitExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1511:1: ( (otherlv_5= '++' | otherlv_6= '--' ) | ( () (otherlv_8= '+' | otherlv_9= '+=' | otherlv_10= '-' | otherlv_11= '-=' | otherlv_12= '*' | otherlv_13= '*=' | otherlv_14= '/' | otherlv_15= '/=' | otherlv_16= '%' | otherlv_17= '%=' ) ( (lv_right_18_0= ruleBitExpression ) ) )* )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=34 && LA41_0<=35)) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==EOF||LA41_0==16||LA41_0==19||LA41_0==24||LA41_0==28||LA41_0==31||LA41_0==33||(LA41_0>=36 && LA41_0<=43)||LA41_0==66) ) {
                        alt41=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1511:2: (otherlv_5= '++' | otherlv_6= '--' )
                            {
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1511:2: (otherlv_5= '++' | otherlv_6= '--' )
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==34) ) {
                                alt38=1;
                            }
                            else if ( (LA38_0==35) ) {
                                alt38=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 38, 0, input);

                                throw nvae;
                            }
                            switch (alt38) {
                                case 1 :
                                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1511:4: otherlv_5= '++'
                                    {
                                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleNumericExpression3517); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_5, grammarAccess.getNumericExpressionAccess().getPlusSignPlusSignKeyword_1_1_0_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1516:7: otherlv_6= '--'
                                    {
                                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleNumericExpression3535); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_6, grammarAccess.getNumericExpressionAccess().getHyphenMinusHyphenMinusKeyword_1_1_0_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1521:6: ( () (otherlv_8= '+' | otherlv_9= '+=' | otherlv_10= '-' | otherlv_11= '-=' | otherlv_12= '*' | otherlv_13= '*=' | otherlv_14= '/' | otherlv_15= '/=' | otherlv_16= '%' | otherlv_17= '%=' ) ( (lv_right_18_0= ruleBitExpression ) ) )*
                            {
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1521:6: ( () (otherlv_8= '+' | otherlv_9= '+=' | otherlv_10= '-' | otherlv_11= '-=' | otherlv_12= '*' | otherlv_13= '*=' | otherlv_14= '/' | otherlv_15= '/=' | otherlv_16= '%' | otherlv_17= '%=' ) ( (lv_right_18_0= ruleBitExpression ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==19||LA40_0==33||(LA40_0>=36 && LA40_0<=43)) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1521:7: () (otherlv_8= '+' | otherlv_9= '+=' | otherlv_10= '-' | otherlv_11= '-=' | otherlv_12= '*' | otherlv_13= '*=' | otherlv_14= '/' | otherlv_15= '/=' | otherlv_16= '%' | otherlv_17= '%=' ) ( (lv_right_18_0= ruleBitExpression ) )
                            	    {
                            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1521:7: ()
                            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1522:2: 
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	  /* */ 
                            	      	
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	              current = forceCreateModelElementAndSet(
                            	                  grammarAccess.getNumericExpressionAccess().getNumericLeftAction_1_1_1_0(),
                            	                  current);
                            	          
                            	    }

                            	    }

                            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1530:2: (otherlv_8= '+' | otherlv_9= '+=' | otherlv_10= '-' | otherlv_11= '-=' | otherlv_12= '*' | otherlv_13= '*=' | otherlv_14= '/' | otherlv_15= '/=' | otherlv_16= '%' | otherlv_17= '%=' )
                            	    int alt39=10;
                            	    switch ( input.LA(1) ) {
                            	    case 36:
                            	        {
                            	        alt39=1;
                            	        }
                            	        break;
                            	    case 37:
                            	        {
                            	        alt39=2;
                            	        }
                            	        break;
                            	    case 33:
                            	        {
                            	        alt39=3;
                            	        }
                            	        break;
                            	    case 38:
                            	        {
                            	        alt39=4;
                            	        }
                            	        break;
                            	    case 19:
                            	        {
                            	        alt39=5;
                            	        }
                            	        break;
                            	    case 39:
                            	        {
                            	        alt39=6;
                            	        }
                            	        break;
                            	    case 40:
                            	        {
                            	        alt39=7;
                            	        }
                            	        break;
                            	    case 41:
                            	        {
                            	        alt39=8;
                            	        }
                            	        break;
                            	    case 42:
                            	        {
                            	        alt39=9;
                            	        }
                            	        break;
                            	    case 43:
                            	        {
                            	        alt39=10;
                            	        }
                            	        break;
                            	    default:
                            	        if (state.backtracking>0) {state.failed=true; return current;}
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 39, 0, input);

                            	        throw nvae;
                            	    }

                            	    switch (alt39) {
                            	        case 1 :
                            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1530:4: otherlv_8= '+'
                            	            {
                            	            otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleNumericExpression3568); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	                  	newLeafNode(otherlv_8, grammarAccess.getNumericExpressionAccess().getPlusSignKeyword_1_1_1_1_0());
                            	                  
                            	            }

                            	            }
                            	            break;
                            	        case 2 :
                            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1535:7: otherlv_9= '+='
                            	            {
                            	            otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleNumericExpression3586); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	                  	newLeafNode(otherlv_9, grammarAccess.getNumericExpressionAccess().getPlusSignEqualsSignKeyword_1_1_1_1_1());
                            	                  
                            	            }

                            	            }
                            	            break;
                            	        case 3 :
                            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1540:7: otherlv_10= '-'
                            	            {
                            	            otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleNumericExpression3604); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	                  	newLeafNode(otherlv_10, grammarAccess.getNumericExpressionAccess().getHyphenMinusKeyword_1_1_1_1_2());
                            	                  
                            	            }

                            	            }
                            	            break;
                            	        case 4 :
                            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1545:7: otherlv_11= '-='
                            	            {
                            	            otherlv_11=(Token)match(input,38,FOLLOW_38_in_ruleNumericExpression3622); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	                  	newLeafNode(otherlv_11, grammarAccess.getNumericExpressionAccess().getHyphenMinusEqualsSignKeyword_1_1_1_1_3());
                            	                  
                            	            }

                            	            }
                            	            break;
                            	        case 5 :
                            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1550:7: otherlv_12= '*'
                            	            {
                            	            otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleNumericExpression3640); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	                  	newLeafNode(otherlv_12, grammarAccess.getNumericExpressionAccess().getAsteriskKeyword_1_1_1_1_4());
                            	                  
                            	            }

                            	            }
                            	            break;
                            	        case 6 :
                            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1555:7: otherlv_13= '*='
                            	            {
                            	            otherlv_13=(Token)match(input,39,FOLLOW_39_in_ruleNumericExpression3658); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	                  	newLeafNode(otherlv_13, grammarAccess.getNumericExpressionAccess().getAsteriskEqualsSignKeyword_1_1_1_1_5());
                            	                  
                            	            }

                            	            }
                            	            break;
                            	        case 7 :
                            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1560:7: otherlv_14= '/'
                            	            {
                            	            otherlv_14=(Token)match(input,40,FOLLOW_40_in_ruleNumericExpression3676); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	                  	newLeafNode(otherlv_14, grammarAccess.getNumericExpressionAccess().getSolidusKeyword_1_1_1_1_6());
                            	                  
                            	            }

                            	            }
                            	            break;
                            	        case 8 :
                            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1565:7: otherlv_15= '/='
                            	            {
                            	            otherlv_15=(Token)match(input,41,FOLLOW_41_in_ruleNumericExpression3694); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	                  	newLeafNode(otherlv_15, grammarAccess.getNumericExpressionAccess().getSolidusEqualsSignKeyword_1_1_1_1_7());
                            	                  
                            	            }

                            	            }
                            	            break;
                            	        case 9 :
                            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1570:7: otherlv_16= '%'
                            	            {
                            	            otherlv_16=(Token)match(input,42,FOLLOW_42_in_ruleNumericExpression3712); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	                  	newLeafNode(otherlv_16, grammarAccess.getNumericExpressionAccess().getPercentSignKeyword_1_1_1_1_8());
                            	                  
                            	            }

                            	            }
                            	            break;
                            	        case 10 :
                            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1575:7: otherlv_17= '%='
                            	            {
                            	            otherlv_17=(Token)match(input,43,FOLLOW_43_in_ruleNumericExpression3730); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	                  	newLeafNode(otherlv_17, grammarAccess.getNumericExpressionAccess().getPercentSignEqualsSignKeyword_1_1_1_1_9());
                            	                  
                            	            }

                            	            }
                            	            break;

                            	    }

                            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1579:2: ( (lv_right_18_0= ruleBitExpression ) )
                            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1580:1: (lv_right_18_0= ruleBitExpression )
                            	    {
                            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1580:1: (lv_right_18_0= ruleBitExpression )
                            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1581:3: lv_right_18_0= ruleBitExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getNumericExpressionAccess().getRightBitExpressionParserRuleCall_1_1_1_2_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleBitExpression_in_ruleNumericExpression3752);
                            	    lv_right_18_0=ruleBitExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getNumericExpressionRule());
                            	      	        }
                            	             		set(
                            	             			current, 
                            	             			"right",
                            	              		lv_right_18_0, 
                            	              		"BitExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, ruleNumericExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNumericExpression"


    // $ANTLR start "entryRuleBitExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1605:1: entryRuleBitExpression returns [EObject current=null] : iv_ruleBitExpression= ruleBitExpression EOF ;
    public final EObject entryRuleBitExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitExpression_StartIndex = input.index();
        EObject iv_ruleBitExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1606:2: (iv_ruleBitExpression= ruleBitExpression EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1607:2: iv_ruleBitExpression= ruleBitExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitExpression_in_entryRuleBitExpression3792);
            iv_ruleBitExpression=ruleBitExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitExpression3802); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, entryRuleBitExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitExpression"


    // $ANTLR start "ruleBitExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1614:1: ruleBitExpression returns [EObject current=null] : ( (otherlv_0= '~' this_LogicalExpression_1= ruleLogicalExpression ) | (this_LogicalExpression_2= ruleLogicalExpression ( () (otherlv_4= '>>=' | otherlv_5= '<<' | otherlv_6= '>>' | otherlv_7= '>>>' ) ( (lv_right_8_0= ruleLogicalExpression ) ) )* ) ) ;
    public final EObject ruleBitExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitExpression_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject this_LogicalExpression_1 = null;

        EObject this_LogicalExpression_2 = null;

        EObject lv_right_8_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1617:28: ( ( (otherlv_0= '~' this_LogicalExpression_1= ruleLogicalExpression ) | (this_LogicalExpression_2= ruleLogicalExpression ( () (otherlv_4= '>>=' | otherlv_5= '<<' | otherlv_6= '>>' | otherlv_7= '>>>' ) ( (lv_right_8_0= ruleLogicalExpression ) ) )* ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1618:1: ( (otherlv_0= '~' this_LogicalExpression_1= ruleLogicalExpression ) | (this_LogicalExpression_2= ruleLogicalExpression ( () (otherlv_4= '>>=' | otherlv_5= '<<' | otherlv_6= '>>' | otherlv_7= '>>>' ) ( (lv_right_8_0= ruleLogicalExpression ) ) )* ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1618:1: ( (otherlv_0= '~' this_LogicalExpression_1= ruleLogicalExpression ) | (this_LogicalExpression_2= ruleLogicalExpression ( () (otherlv_4= '>>=' | otherlv_5= '<<' | otherlv_6= '>>' | otherlv_7= '>>>' ) ( (lv_right_8_0= ruleLogicalExpression ) ) )* ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            else if ( (LA45_0==EOF||(LA45_0>=RULE_ID && LA45_0<=RULE_ZERO_TO_SEVEN)||LA45_0==16||(LA45_0>=18 && LA45_0<=19)||LA45_0==24||(LA45_0>=27 && LA45_0<=31)||(LA45_0>=33 && LA45_0<=43)||(LA45_0>=45 && LA45_0<=73)||(LA45_0>=94 && LA45_0<=95)) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1618:2: (otherlv_0= '~' this_LogicalExpression_1= ruleLogicalExpression )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1618:2: (otherlv_0= '~' this_LogicalExpression_1= ruleLogicalExpression )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1618:4: otherlv_0= '~' this_LogicalExpression_1= ruleLogicalExpression
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleBitExpression3840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getBitExpressionAccess().getTildeKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBitExpressionAccess().getLogicalExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLogicalExpression_in_ruleBitExpression3865);
                    this_LogicalExpression_1=ruleLogicalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LogicalExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1635:6: (this_LogicalExpression_2= ruleLogicalExpression ( () (otherlv_4= '>>=' | otherlv_5= '<<' | otherlv_6= '>>' | otherlv_7= '>>>' ) ( (lv_right_8_0= ruleLogicalExpression ) ) )* )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1635:6: (this_LogicalExpression_2= ruleLogicalExpression ( () (otherlv_4= '>>=' | otherlv_5= '<<' | otherlv_6= '>>' | otherlv_7= '>>>' ) ( (lv_right_8_0= ruleLogicalExpression ) ) )* )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1636:2: this_LogicalExpression_2= ruleLogicalExpression ( () (otherlv_4= '>>=' | otherlv_5= '<<' | otherlv_6= '>>' | otherlv_7= '>>>' ) ( (lv_right_8_0= ruleLogicalExpression ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBitExpressionAccess().getLogicalExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLogicalExpression_in_ruleBitExpression3897);
                    this_LogicalExpression_2=ruleLogicalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LogicalExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1647:1: ( () (otherlv_4= '>>=' | otherlv_5= '<<' | otherlv_6= '>>' | otherlv_7= '>>>' ) ( (lv_right_8_0= ruleLogicalExpression ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=45 && LA44_0<=48)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1647:2: () (otherlv_4= '>>=' | otherlv_5= '<<' | otherlv_6= '>>' | otherlv_7= '>>>' ) ( (lv_right_8_0= ruleLogicalExpression ) )
                    	    {
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1647:2: ()
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1648:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getBitExpressionAccess().getBitLeftAction_1_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1656:2: (otherlv_4= '>>=' | otherlv_5= '<<' | otherlv_6= '>>' | otherlv_7= '>>>' )
                    	    int alt43=4;
                    	    switch ( input.LA(1) ) {
                    	    case 45:
                    	        {
                    	        alt43=1;
                    	        }
                    	        break;
                    	    case 46:
                    	        {
                    	        alt43=2;
                    	        }
                    	        break;
                    	    case 47:
                    	        {
                    	        alt43=3;
                    	        }
                    	        break;
                    	    case 48:
                    	        {
                    	        alt43=4;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 43, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt43) {
                    	        case 1 :
                    	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1656:4: otherlv_4= '>>='
                    	            {
                    	            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleBitExpression3922); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_4, grammarAccess.getBitExpressionAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_1_1_0());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1661:7: otherlv_5= '<<'
                    	            {
                    	            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleBitExpression3940); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_5, grammarAccess.getBitExpressionAccess().getLessThanSignLessThanSignKeyword_1_1_1_1());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1666:7: otherlv_6= '>>'
                    	            {
                    	            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleBitExpression3958); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_6, grammarAccess.getBitExpressionAccess().getGreaterThanSignGreaterThanSignKeyword_1_1_1_2());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1671:7: otherlv_7= '>>>'
                    	            {
                    	            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleBitExpression3976); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_7, grammarAccess.getBitExpressionAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_1_1_3());
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1675:2: ( (lv_right_8_0= ruleLogicalExpression ) )
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1676:1: (lv_right_8_0= ruleLogicalExpression )
                    	    {
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1676:1: (lv_right_8_0= ruleLogicalExpression )
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1677:3: lv_right_8_0= ruleLogicalExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitExpressionAccess().getRightLogicalExpressionParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLogicalExpression_in_ruleBitExpression3998);
                    	    lv_right_8_0=ruleLogicalExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"right",
                    	              		lv_right_8_0, 
                    	              		"LogicalExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, ruleBitExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitExpression"


    // $ANTLR start "entryRuleTestingExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1701:1: entryRuleTestingExpression returns [EObject current=null] : iv_ruleTestingExpression= ruleTestingExpression EOF ;
    public final EObject entryRuleTestingExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleTestingExpression_StartIndex = input.index();
        EObject iv_ruleTestingExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1702:2: (iv_ruleTestingExpression= ruleTestingExpression EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1703:2: iv_ruleTestingExpression= ruleTestingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTestingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTestingExpression_in_entryRuleTestingExpression4037);
            iv_ruleTestingExpression=ruleTestingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTestingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestingExpression4047); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, entryRuleTestingExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTestingExpression"


    // $ANTLR start "ruleTestingExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1710:1: ruleTestingExpression returns [EObject current=null] : (this_ArgsExpression_0= ruleArgsExpression ( () (otherlv_2= '>' | otherlv_3= '<' | otherlv_4= '>=' | otherlv_5= '<=' | otherlv_6= '==' | otherlv_7= '!=' ) ( (lv_right_8_0= ruleArgsExpression ) ) )* ) ;
    public final EObject ruleTestingExpression() throws RecognitionException {
        EObject current = null;
        int ruleTestingExpression_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject this_ArgsExpression_0 = null;

        EObject lv_right_8_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1713:28: ( (this_ArgsExpression_0= ruleArgsExpression ( () (otherlv_2= '>' | otherlv_3= '<' | otherlv_4= '>=' | otherlv_5= '<=' | otherlv_6= '==' | otherlv_7= '!=' ) ( (lv_right_8_0= ruleArgsExpression ) ) )* ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1714:1: (this_ArgsExpression_0= ruleArgsExpression ( () (otherlv_2= '>' | otherlv_3= '<' | otherlv_4= '>=' | otherlv_5= '<=' | otherlv_6= '==' | otherlv_7= '!=' ) ( (lv_right_8_0= ruleArgsExpression ) ) )* )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1714:1: (this_ArgsExpression_0= ruleArgsExpression ( () (otherlv_2= '>' | otherlv_3= '<' | otherlv_4= '>=' | otherlv_5= '<=' | otherlv_6= '==' | otherlv_7= '!=' ) ( (lv_right_8_0= ruleArgsExpression ) ) )* )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1715:2: this_ArgsExpression_0= ruleArgsExpression ( () (otherlv_2= '>' | otherlv_3= '<' | otherlv_4= '>=' | otherlv_5= '<=' | otherlv_6= '==' | otherlv_7= '!=' ) ( (lv_right_8_0= ruleArgsExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTestingExpressionAccess().getArgsExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleArgsExpression_in_ruleTestingExpression4097);
            this_ArgsExpression_0=ruleArgsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ArgsExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1726:1: ( () (otherlv_2= '>' | otherlv_3= '<' | otherlv_4= '>=' | otherlv_5= '<=' | otherlv_6= '==' | otherlv_7= '!=' ) ( (lv_right_8_0= ruleArgsExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=49 && LA47_0<=54)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1726:2: () (otherlv_2= '>' | otherlv_3= '<' | otherlv_4= '>=' | otherlv_5= '<=' | otherlv_6= '==' | otherlv_7= '!=' ) ( (lv_right_8_0= ruleArgsExpression ) )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1726:2: ()
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1727:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTestingExpressionAccess().getTestingLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1735:2: (otherlv_2= '>' | otherlv_3= '<' | otherlv_4= '>=' | otherlv_5= '<=' | otherlv_6= '==' | otherlv_7= '!=' )
            	    int alt46=6;
            	    switch ( input.LA(1) ) {
            	    case 49:
            	        {
            	        alt46=1;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt46=2;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt46=3;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt46=4;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt46=5;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt46=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt46) {
            	        case 1 :
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1735:4: otherlv_2= '>'
            	            {
            	            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleTestingExpression4122); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getTestingExpressionAccess().getGreaterThanSignKeyword_1_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1740:7: otherlv_3= '<'
            	            {
            	            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleTestingExpression4140); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getTestingExpressionAccess().getLessThanSignKeyword_1_1_1());
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1745:7: otherlv_4= '>='
            	            {
            	            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleTestingExpression4158); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getTestingExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_1_2());
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1750:7: otherlv_5= '<='
            	            {
            	            otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleTestingExpression4176); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_5, grammarAccess.getTestingExpressionAccess().getLessThanSignEqualsSignKeyword_1_1_3());
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1755:7: otherlv_6= '=='
            	            {
            	            otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleTestingExpression4194); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getTestingExpressionAccess().getEqualsSignEqualsSignKeyword_1_1_4());
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1760:7: otherlv_7= '!='
            	            {
            	            otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleTestingExpression4212); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getTestingExpressionAccess().getExclamationMarkEqualsSignKeyword_1_1_5());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1764:2: ( (lv_right_8_0= ruleArgsExpression ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1765:1: (lv_right_8_0= ruleArgsExpression )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1765:1: (lv_right_8_0= ruleArgsExpression )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1766:3: lv_right_8_0= ruleArgsExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTestingExpressionAccess().getRightArgsExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArgsExpression_in_ruleTestingExpression4234);
            	    lv_right_8_0=ruleArgsExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTestingExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_8_0, 
            	              		"ArgsExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, ruleTestingExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTestingExpression"


    // $ANTLR start "entryRuleLogicalExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1790:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalExpression_StartIndex = input.index();
        EObject iv_ruleLogicalExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1791:2: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1792:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalExpression_in_entryRuleLogicalExpression4272);
            iv_ruleLogicalExpression=ruleLogicalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalExpression4282); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, entryRuleLogicalExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalExpression"


    // $ANTLR start "ruleLogicalExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1799:1: ruleLogicalExpression returns [EObject current=null] : ( (otherlv_0= '!' ( (lv_right_1_0= ruleTestingExpression ) ) ) | (this_TestingExpression_2= ruleTestingExpression ( ( () (otherlv_4= '&' | otherlv_5= '&=' | otherlv_6= '|' | otherlv_7= '|=' | otherlv_8= '^' | otherlv_9= '^=' | otherlv_10= '&&' | otherlv_11= '||=' | otherlv_12= '||' ) ( (lv_right_13_0= ruleTestingExpression ) ) ) | ( () otherlv_15= '?' ( (lv_right_16_0= ruleTestingExpression ) ) () otherlv_18= ':' ( (lv_ternary_end_19_0= ruleTestingExpression ) ) ) )* ) | ( () otherlv_21= 'true' ) | ( () otherlv_23= 'false' ) ) ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalExpression_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_right_1_0 = null;

        EObject this_TestingExpression_2 = null;

        EObject lv_right_13_0 = null;

        EObject lv_right_16_0 = null;

        EObject lv_ternary_end_19_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1802:28: ( ( (otherlv_0= '!' ( (lv_right_1_0= ruleTestingExpression ) ) ) | (this_TestingExpression_2= ruleTestingExpression ( ( () (otherlv_4= '&' | otherlv_5= '&=' | otherlv_6= '|' | otherlv_7= '|=' | otherlv_8= '^' | otherlv_9= '^=' | otherlv_10= '&&' | otherlv_11= '||=' | otherlv_12= '||' ) ( (lv_right_13_0= ruleTestingExpression ) ) ) | ( () otherlv_15= '?' ( (lv_right_16_0= ruleTestingExpression ) ) () otherlv_18= ':' ( (lv_ternary_end_19_0= ruleTestingExpression ) ) ) )* ) | ( () otherlv_21= 'true' ) | ( () otherlv_23= 'false' ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1803:1: ( (otherlv_0= '!' ( (lv_right_1_0= ruleTestingExpression ) ) ) | (this_TestingExpression_2= ruleTestingExpression ( ( () (otherlv_4= '&' | otherlv_5= '&=' | otherlv_6= '|' | otherlv_7= '|=' | otherlv_8= '^' | otherlv_9= '^=' | otherlv_10= '&&' | otherlv_11= '||=' | otherlv_12= '||' ) ( (lv_right_13_0= ruleTestingExpression ) ) ) | ( () otherlv_15= '?' ( (lv_right_16_0= ruleTestingExpression ) ) () otherlv_18= ':' ( (lv_ternary_end_19_0= ruleTestingExpression ) ) ) )* ) | ( () otherlv_21= 'true' ) | ( () otherlv_23= 'false' ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1803:1: ( (otherlv_0= '!' ( (lv_right_1_0= ruleTestingExpression ) ) ) | (this_TestingExpression_2= ruleTestingExpression ( ( () (otherlv_4= '&' | otherlv_5= '&=' | otherlv_6= '|' | otherlv_7= '|=' | otherlv_8= '^' | otherlv_9= '^=' | otherlv_10= '&&' | otherlv_11= '||=' | otherlv_12= '||' ) ( (lv_right_13_0= ruleTestingExpression ) ) ) | ( () otherlv_15= '?' ( (lv_right_16_0= ruleTestingExpression ) ) () otherlv_18= ':' ( (lv_ternary_end_19_0= ruleTestingExpression ) ) ) )* ) | ( () otherlv_21= 'true' ) | ( () otherlv_23= 'false' ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt50=1;
                }
                break;
            case EOF:
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_NUMBER_SUFFIX:
            case RULE_HEXA:
            case RULE_ZERO_TO_SEVEN:
            case 16:
            case 18:
            case 19:
            case 24:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 94:
            case 95:
                {
                alt50=2;
                }
                break;
            case 67:
                {
                alt50=3;
                }
                break;
            case 68:
                {
                alt50=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1803:2: (otherlv_0= '!' ( (lv_right_1_0= ruleTestingExpression ) ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1803:2: (otherlv_0= '!' ( (lv_right_1_0= ruleTestingExpression ) ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1803:4: otherlv_0= '!' ( (lv_right_1_0= ruleTestingExpression ) )
                    {
                    otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleLogicalExpression4320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getLogicalExpressionAccess().getExclamationMarkKeyword_0_0());
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1807:1: ( (lv_right_1_0= ruleTestingExpression ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1808:1: (lv_right_1_0= ruleTestingExpression )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1808:1: (lv_right_1_0= ruleTestingExpression )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1809:3: lv_right_1_0= ruleTestingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRightTestingExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTestingExpression_in_ruleLogicalExpression4341);
                    lv_right_1_0=ruleTestingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_1_0, 
                              		"TestingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1826:6: (this_TestingExpression_2= ruleTestingExpression ( ( () (otherlv_4= '&' | otherlv_5= '&=' | otherlv_6= '|' | otherlv_7= '|=' | otherlv_8= '^' | otherlv_9= '^=' | otherlv_10= '&&' | otherlv_11= '||=' | otherlv_12= '||' ) ( (lv_right_13_0= ruleTestingExpression ) ) ) | ( () otherlv_15= '?' ( (lv_right_16_0= ruleTestingExpression ) ) () otherlv_18= ':' ( (lv_ternary_end_19_0= ruleTestingExpression ) ) ) )* )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1826:6: (this_TestingExpression_2= ruleTestingExpression ( ( () (otherlv_4= '&' | otherlv_5= '&=' | otherlv_6= '|' | otherlv_7= '|=' | otherlv_8= '^' | otherlv_9= '^=' | otherlv_10= '&&' | otherlv_11= '||=' | otherlv_12= '||' ) ( (lv_right_13_0= ruleTestingExpression ) ) ) | ( () otherlv_15= '?' ( (lv_right_16_0= ruleTestingExpression ) ) () otherlv_18= ':' ( (lv_ternary_end_19_0= ruleTestingExpression ) ) ) )* )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1827:2: this_TestingExpression_2= ruleTestingExpression ( ( () (otherlv_4= '&' | otherlv_5= '&=' | otherlv_6= '|' | otherlv_7= '|=' | otherlv_8= '^' | otherlv_9= '^=' | otherlv_10= '&&' | otherlv_11= '||=' | otherlv_12= '||' ) ( (lv_right_13_0= ruleTestingExpression ) ) ) | ( () otherlv_15= '?' ( (lv_right_16_0= ruleTestingExpression ) ) () otherlv_18= ':' ( (lv_ternary_end_19_0= ruleTestingExpression ) ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalExpressionAccess().getTestingExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTestingExpression_in_ruleLogicalExpression4374);
                    this_TestingExpression_2=ruleTestingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TestingExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1838:1: ( ( () (otherlv_4= '&' | otherlv_5= '&=' | otherlv_6= '|' | otherlv_7= '|=' | otherlv_8= '^' | otherlv_9= '^=' | otherlv_10= '&&' | otherlv_11= '||=' | otherlv_12= '||' ) ( (lv_right_13_0= ruleTestingExpression ) ) ) | ( () otherlv_15= '?' ( (lv_right_16_0= ruleTestingExpression ) ) () otherlv_18= ':' ( (lv_ternary_end_19_0= ruleTestingExpression ) ) ) )*
                    loop49:
                    do {
                        int alt49=3;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0>=56 && LA49_0<=64)) ) {
                            alt49=1;
                        }
                        else if ( (LA49_0==65) ) {
                            alt49=2;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1838:2: ( () (otherlv_4= '&' | otherlv_5= '&=' | otherlv_6= '|' | otherlv_7= '|=' | otherlv_8= '^' | otherlv_9= '^=' | otherlv_10= '&&' | otherlv_11= '||=' | otherlv_12= '||' ) ( (lv_right_13_0= ruleTestingExpression ) ) )
                    	    {
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1838:2: ( () (otherlv_4= '&' | otherlv_5= '&=' | otherlv_6= '|' | otherlv_7= '|=' | otherlv_8= '^' | otherlv_9= '^=' | otherlv_10= '&&' | otherlv_11= '||=' | otherlv_12= '||' ) ( (lv_right_13_0= ruleTestingExpression ) ) )
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1838:3: () (otherlv_4= '&' | otherlv_5= '&=' | otherlv_6= '|' | otherlv_7= '|=' | otherlv_8= '^' | otherlv_9= '^=' | otherlv_10= '&&' | otherlv_11= '||=' | otherlv_12= '||' ) ( (lv_right_13_0= ruleTestingExpression ) )
                    	    {
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1838:3: ()
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1839:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getLogicalExpressionAccess().getLogicalLeftAction_1_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1847:2: (otherlv_4= '&' | otherlv_5= '&=' | otherlv_6= '|' | otherlv_7= '|=' | otherlv_8= '^' | otherlv_9= '^=' | otherlv_10= '&&' | otherlv_11= '||=' | otherlv_12= '||' )
                    	    int alt48=9;
                    	    switch ( input.LA(1) ) {
                    	    case 56:
                    	        {
                    	        alt48=1;
                    	        }
                    	        break;
                    	    case 57:
                    	        {
                    	        alt48=2;
                    	        }
                    	        break;
                    	    case 58:
                    	        {
                    	        alt48=3;
                    	        }
                    	        break;
                    	    case 59:
                    	        {
                    	        alt48=4;
                    	        }
                    	        break;
                    	    case 60:
                    	        {
                    	        alt48=5;
                    	        }
                    	        break;
                    	    case 61:
                    	        {
                    	        alt48=6;
                    	        }
                    	        break;
                    	    case 62:
                    	        {
                    	        alt48=7;
                    	        }
                    	        break;
                    	    case 63:
                    	        {
                    	        alt48=8;
                    	        }
                    	        break;
                    	    case 64:
                    	        {
                    	        alt48=9;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 48, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt48) {
                    	        case 1 :
                    	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1847:4: otherlv_4= '&'
                    	            {
                    	            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleLogicalExpression4400); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_4, grammarAccess.getLogicalExpressionAccess().getAmpersandKeyword_1_1_0_1_0());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1852:7: otherlv_5= '&='
                    	            {
                    	            otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleLogicalExpression4418); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_5, grammarAccess.getLogicalExpressionAccess().getAmpersandEqualsSignKeyword_1_1_0_1_1());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1857:7: otherlv_6= '|'
                    	            {
                    	            otherlv_6=(Token)match(input,58,FOLLOW_58_in_ruleLogicalExpression4436); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_6, grammarAccess.getLogicalExpressionAccess().getVerticalLineKeyword_1_1_0_1_2());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1862:7: otherlv_7= '|='
                    	            {
                    	            otherlv_7=(Token)match(input,59,FOLLOW_59_in_ruleLogicalExpression4454); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_7, grammarAccess.getLogicalExpressionAccess().getVerticalLineEqualsSignKeyword_1_1_0_1_3());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 5 :
                    	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1867:7: otherlv_8= '^'
                    	            {
                    	            otherlv_8=(Token)match(input,60,FOLLOW_60_in_ruleLogicalExpression4472); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_8, grammarAccess.getLogicalExpressionAccess().getCircumflexAccentKeyword_1_1_0_1_4());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 6 :
                    	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1872:7: otherlv_9= '^='
                    	            {
                    	            otherlv_9=(Token)match(input,61,FOLLOW_61_in_ruleLogicalExpression4490); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_9, grammarAccess.getLogicalExpressionAccess().getCircumflexAccentEqualsSignKeyword_1_1_0_1_5());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 7 :
                    	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1877:7: otherlv_10= '&&'
                    	            {
                    	            otherlv_10=(Token)match(input,62,FOLLOW_62_in_ruleLogicalExpression4508); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_10, grammarAccess.getLogicalExpressionAccess().getAmpersandAmpersandKeyword_1_1_0_1_6());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 8 :
                    	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1882:7: otherlv_11= '||='
                    	            {
                    	            otherlv_11=(Token)match(input,63,FOLLOW_63_in_ruleLogicalExpression4526); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_11, grammarAccess.getLogicalExpressionAccess().getVerticalLineVerticalLineEqualsSignKeyword_1_1_0_1_7());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 9 :
                    	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1887:7: otherlv_12= '||'
                    	            {
                    	            otherlv_12=(Token)match(input,64,FOLLOW_64_in_ruleLogicalExpression4544); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_12, grammarAccess.getLogicalExpressionAccess().getVerticalLineVerticalLineKeyword_1_1_0_1_8());
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1891:2: ( (lv_right_13_0= ruleTestingExpression ) )
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1892:1: (lv_right_13_0= ruleTestingExpression )
                    	    {
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1892:1: (lv_right_13_0= ruleTestingExpression )
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1893:3: lv_right_13_0= ruleTestingExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRightTestingExpressionParserRuleCall_1_1_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTestingExpression_in_ruleLogicalExpression4566);
                    	    lv_right_13_0=ruleTestingExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"right",
                    	              		lv_right_13_0, 
                    	              		"TestingExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1910:6: ( () otherlv_15= '?' ( (lv_right_16_0= ruleTestingExpression ) ) () otherlv_18= ':' ( (lv_ternary_end_19_0= ruleTestingExpression ) ) )
                    	    {
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1910:6: ( () otherlv_15= '?' ( (lv_right_16_0= ruleTestingExpression ) ) () otherlv_18= ':' ( (lv_ternary_end_19_0= ruleTestingExpression ) ) )
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1910:7: () otherlv_15= '?' ( (lv_right_16_0= ruleTestingExpression ) ) () otherlv_18= ':' ( (lv_ternary_end_19_0= ruleTestingExpression ) )
                    	    {
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1910:7: ()
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1911:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getLogicalExpressionAccess().getLogicalLeftAction_1_1_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_15=(Token)match(input,65,FOLLOW_65_in_ruleLogicalExpression4598); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_15, grammarAccess.getLogicalExpressionAccess().getQuestionMarkKeyword_1_1_1_1());
                    	          
                    	    }
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1923:1: ( (lv_right_16_0= ruleTestingExpression ) )
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1924:1: (lv_right_16_0= ruleTestingExpression )
                    	    {
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1924:1: (lv_right_16_0= ruleTestingExpression )
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1925:3: lv_right_16_0= ruleTestingExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRightTestingExpressionParserRuleCall_1_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTestingExpression_in_ruleLogicalExpression4619);
                    	    lv_right_16_0=ruleTestingExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"right",
                    	              		lv_right_16_0, 
                    	              		"TestingExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1941:2: ()
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1942:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getLogicalExpressionAccess().getLogicalTernaryAction_1_1_1_3(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_18=(Token)match(input,66,FOLLOW_66_in_ruleLogicalExpression4643); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_18, grammarAccess.getLogicalExpressionAccess().getColonKeyword_1_1_1_4());
                    	          
                    	    }
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1954:1: ( (lv_ternary_end_19_0= ruleTestingExpression ) )
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1955:1: (lv_ternary_end_19_0= ruleTestingExpression )
                    	    {
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1955:1: (lv_ternary_end_19_0= ruleTestingExpression )
                    	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1956:3: lv_ternary_end_19_0= ruleTestingExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalExpressionAccess().getTernary_endTestingExpressionParserRuleCall_1_1_1_5_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTestingExpression_in_ruleLogicalExpression4664);
                    	    lv_ternary_end_19_0=ruleTestingExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"ternary_end",
                    	              		lv_ternary_end_19_0, 
                    	              		"TestingExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1973:6: ( () otherlv_21= 'true' )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1973:6: ( () otherlv_21= 'true' )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1973:7: () otherlv_21= 'true'
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1973:7: ()
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1974:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalExpressionAccess().getLogicalExpressionAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_21=(Token)match(input,67,FOLLOW_67_in_ruleLogicalExpression4699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getLogicalExpressionAccess().getTrueKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1987:6: ( () otherlv_23= 'false' )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1987:6: ( () otherlv_23= 'false' )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1987:7: () otherlv_23= 'false'
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1987:7: ()
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1988:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalExpressionAccess().getLogicalExpressionAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_23=(Token)match(input,68,FOLLOW_68_in_ruleLogicalExpression4731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getLogicalExpressionAccess().getFalseKeyword_3_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, ruleLogicalExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalExpression"


    // $ANTLR start "entryRuleArgsExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2008:1: entryRuleArgsExpression returns [EObject current=null] : iv_ruleArgsExpression= ruleArgsExpression EOF ;
    public final EObject entryRuleArgsExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleArgsExpression_StartIndex = input.index();
        EObject iv_ruleArgsExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2009:2: (iv_ruleArgsExpression= ruleArgsExpression EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2010:2: iv_ruleArgsExpression= ruleArgsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgsExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArgsExpression_in_entryRuleArgsExpression4768);
            iv_ruleArgsExpression=ruleArgsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgsExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgsExpression4778); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, entryRuleArgsExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArgsExpression"


    // $ANTLR start "ruleArgsExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2017:1: ruleArgsExpression returns [EObject current=null] : (this_CastingExpression_0= ruleCastingExpression ( (otherlv_1= '(' ( (lv_arg_list_2_0= ruleArglist ) )? otherlv_3= ')' ) | ( () otherlv_5= '.' ( (lv_right_6_0= ruleCastingExpression ) ) ) | ( () otherlv_8= '[' ( (lv_right_9_0= ruleCastingExpression ) ) otherlv_10= ']' ) | ( () otherlv_12= ',' ( (lv_right_13_0= ruleCastingExpression ) ) ) | ( () otherlv_15= 'instanceof' ruleObjectName ) )* ) ;
    public final EObject ruleArgsExpression() throws RecognitionException {
        EObject current = null;
        int ruleArgsExpression_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        EObject this_CastingExpression_0 = null;

        EObject lv_arg_list_2_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_13_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2020:28: ( (this_CastingExpression_0= ruleCastingExpression ( (otherlv_1= '(' ( (lv_arg_list_2_0= ruleArglist ) )? otherlv_3= ')' ) | ( () otherlv_5= '.' ( (lv_right_6_0= ruleCastingExpression ) ) ) | ( () otherlv_8= '[' ( (lv_right_9_0= ruleCastingExpression ) ) otherlv_10= ']' ) | ( () otherlv_12= ',' ( (lv_right_13_0= ruleCastingExpression ) ) ) | ( () otherlv_15= 'instanceof' ruleObjectName ) )* ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2021:1: (this_CastingExpression_0= ruleCastingExpression ( (otherlv_1= '(' ( (lv_arg_list_2_0= ruleArglist ) )? otherlv_3= ')' ) | ( () otherlv_5= '.' ( (lv_right_6_0= ruleCastingExpression ) ) ) | ( () otherlv_8= '[' ( (lv_right_9_0= ruleCastingExpression ) ) otherlv_10= ']' ) | ( () otherlv_12= ',' ( (lv_right_13_0= ruleCastingExpression ) ) ) | ( () otherlv_15= 'instanceof' ruleObjectName ) )* )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2021:1: (this_CastingExpression_0= ruleCastingExpression ( (otherlv_1= '(' ( (lv_arg_list_2_0= ruleArglist ) )? otherlv_3= ')' ) | ( () otherlv_5= '.' ( (lv_right_6_0= ruleCastingExpression ) ) ) | ( () otherlv_8= '[' ( (lv_right_9_0= ruleCastingExpression ) ) otherlv_10= ']' ) | ( () otherlv_12= ',' ( (lv_right_13_0= ruleCastingExpression ) ) ) | ( () otherlv_15= 'instanceof' ruleObjectName ) )* )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2022:2: this_CastingExpression_0= ruleCastingExpression ( (otherlv_1= '(' ( (lv_arg_list_2_0= ruleArglist ) )? otherlv_3= ')' ) | ( () otherlv_5= '.' ( (lv_right_6_0= ruleCastingExpression ) ) ) | ( () otherlv_8= '[' ( (lv_right_9_0= ruleCastingExpression ) ) otherlv_10= ']' ) | ( () otherlv_12= ',' ( (lv_right_13_0= ruleCastingExpression ) ) ) | ( () otherlv_15= 'instanceof' ruleObjectName ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArgsExpressionAccess().getCastingExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCastingExpression_in_ruleArgsExpression4828);
            this_CastingExpression_0=ruleCastingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CastingExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2033:1: ( (otherlv_1= '(' ( (lv_arg_list_2_0= ruleArglist ) )? otherlv_3= ')' ) | ( () otherlv_5= '.' ( (lv_right_6_0= ruleCastingExpression ) ) ) | ( () otherlv_8= '[' ( (lv_right_9_0= ruleCastingExpression ) ) otherlv_10= ']' ) | ( () otherlv_12= ',' ( (lv_right_13_0= ruleCastingExpression ) ) ) | ( () otherlv_15= 'instanceof' ruleObjectName ) )*
            loop52:
            do {
                int alt52=6;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    int LA52_2 = input.LA(2);

                    if ( (synpred82_InternalJavadsl()) ) {
                        alt52=4;
                    }


                    }
                    break;
                case 27:
                    {
                    alt52=1;
                    }
                    break;
                case 18:
                    {
                    alt52=2;
                    }
                    break;
                case 29:
                    {
                    alt52=3;
                    }
                    break;
                case 69:
                    {
                    alt52=5;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2033:2: (otherlv_1= '(' ( (lv_arg_list_2_0= ruleArglist ) )? otherlv_3= ')' )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2033:2: (otherlv_1= '(' ( (lv_arg_list_2_0= ruleArglist ) )? otherlv_3= ')' )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2033:4: otherlv_1= '(' ( (lv_arg_list_2_0= ruleArglist ) )? otherlv_3= ')'
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleArgsExpression4841); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getArgsExpressionAccess().getLeftParenthesisKeyword_1_0_0());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2037:1: ( (lv_arg_list_2_0= ruleArglist ) )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_ZERO_TO_SEVEN)||LA51_0==18||LA51_0==27||LA51_0==31||(LA51_0>=70 && LA51_0<=73)||(LA51_0>=94 && LA51_0<=95)) ) {
            	        alt51=1;
            	    }
            	    else if ( (LA51_0==28) ) {
            	        int LA51_2 = input.LA(2);

            	        if ( (synpred78_InternalJavadsl()) ) {
            	            alt51=1;
            	        }
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2038:1: (lv_arg_list_2_0= ruleArglist )
            	            {
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2038:1: (lv_arg_list_2_0= ruleArglist )
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2039:3: lv_arg_list_2_0= ruleArglist
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getArgsExpressionAccess().getArg_listArglistParserRuleCall_1_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleArglist_in_ruleArgsExpression4862);
            	            lv_arg_list_2_0=ruleArglist();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getArgsExpressionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"arg_list",
            	                      		lv_arg_list_2_0, 
            	                      		"Arglist");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleArgsExpression4875); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getArgsExpressionAccess().getRightParenthesisKeyword_1_0_2());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2060:6: ( () otherlv_5= '.' ( (lv_right_6_0= ruleCastingExpression ) ) )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2060:6: ( () otherlv_5= '.' ( (lv_right_6_0= ruleCastingExpression ) ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2060:7: () otherlv_5= '.' ( (lv_right_6_0= ruleCastingExpression ) )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2060:7: ()
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2061:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getArgsExpressionAccess().getArgsLeftAction_1_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleArgsExpression4907); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getArgsExpressionAccess().getFullStopKeyword_1_1_1());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2073:1: ( (lv_right_6_0= ruleCastingExpression ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2074:1: (lv_right_6_0= ruleCastingExpression )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2074:1: (lv_right_6_0= ruleCastingExpression )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2075:3: lv_right_6_0= ruleCastingExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArgsExpressionAccess().getRightCastingExpressionParserRuleCall_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCastingExpression_in_ruleArgsExpression4928);
            	    lv_right_6_0=ruleCastingExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArgsExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_6_0, 
            	              		"CastingExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2092:6: ( () otherlv_8= '[' ( (lv_right_9_0= ruleCastingExpression ) ) otherlv_10= ']' )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2092:6: ( () otherlv_8= '[' ( (lv_right_9_0= ruleCastingExpression ) ) otherlv_10= ']' )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2092:7: () otherlv_8= '[' ( (lv_right_9_0= ruleCastingExpression ) ) otherlv_10= ']'
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2092:7: ()
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2093:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getArgsExpressionAccess().getArgsLeftAction_1_2_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleArgsExpression4960); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getArgsExpressionAccess().getLeftSquareBracketKeyword_1_2_1());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2105:1: ( (lv_right_9_0= ruleCastingExpression ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2106:1: (lv_right_9_0= ruleCastingExpression )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2106:1: (lv_right_9_0= ruleCastingExpression )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2107:3: lv_right_9_0= ruleCastingExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArgsExpressionAccess().getRightCastingExpressionParserRuleCall_1_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCastingExpression_in_ruleArgsExpression4981);
            	    lv_right_9_0=ruleCastingExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArgsExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_9_0, 
            	              		"CastingExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleArgsExpression4993); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getArgsExpressionAccess().getRightSquareBracketKeyword_1_2_3());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2128:6: ( () otherlv_12= ',' ( (lv_right_13_0= ruleCastingExpression ) ) )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2128:6: ( () otherlv_12= ',' ( (lv_right_13_0= ruleCastingExpression ) ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2128:7: () otherlv_12= ',' ( (lv_right_13_0= ruleCastingExpression ) )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2128:7: ()
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2129:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getArgsExpressionAccess().getArgsLeftAction_1_3_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleArgsExpression5025); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getArgsExpressionAccess().getCommaKeyword_1_3_1());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2141:1: ( (lv_right_13_0= ruleCastingExpression ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2142:1: (lv_right_13_0= ruleCastingExpression )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2142:1: (lv_right_13_0= ruleCastingExpression )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2143:3: lv_right_13_0= ruleCastingExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArgsExpressionAccess().getRightCastingExpressionParserRuleCall_1_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCastingExpression_in_ruleArgsExpression5046);
            	    lv_right_13_0=ruleCastingExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArgsExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_13_0, 
            	              		"CastingExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2160:6: ( () otherlv_15= 'instanceof' ruleObjectName )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2160:6: ( () otherlv_15= 'instanceof' ruleObjectName )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2160:7: () otherlv_15= 'instanceof' ruleObjectName
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2160:7: ()
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2161:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getArgsExpressionAccess().getArgsLeftAction_1_4_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_15=(Token)match(input,69,FOLLOW_69_in_ruleArgsExpression5078); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getArgsExpressionAccess().getInstanceofKeyword_1_4_1());
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getArgsExpressionAccess().getObjectNameParserRuleCall_1_4_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleObjectName_in_ruleArgsExpression5097);
            	    ruleObjectName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, ruleArgsExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArgsExpression"


    // $ANTLR start "entryRuleArglist"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2192:1: entryRuleArglist returns [EObject current=null] : iv_ruleArglist= ruleArglist EOF ;
    public final EObject entryRuleArglist() throws RecognitionException {
        EObject current = null;
        int entryRuleArglist_StartIndex = input.index();
        EObject iv_ruleArglist = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2193:2: (iv_ruleArglist= ruleArglist EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2194:2: iv_ruleArglist= ruleArglist EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArglistRule()); 
            }
            pushFollow(FOLLOW_ruleArglist_in_entryRuleArglist5135);
            iv_ruleArglist=ruleArglist();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArglist; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArglist5145); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, entryRuleArglist_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArglist"


    // $ANTLR start "ruleArglist"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2201:1: ruleArglist returns [EObject current=null] : ( ( (lv_arg_0_0= ruleCastingExpression ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleCastingExpression ) ) )* ) ;
    public final EObject ruleArglist() throws RecognitionException {
        EObject current = null;
        int ruleArglist_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_arg_0_0 = null;

        EObject lv_args_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2204:28: ( ( ( (lv_arg_0_0= ruleCastingExpression ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleCastingExpression ) ) )* ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2205:1: ( ( (lv_arg_0_0= ruleCastingExpression ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleCastingExpression ) ) )* )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2205:1: ( ( (lv_arg_0_0= ruleCastingExpression ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleCastingExpression ) ) )* )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2205:2: ( (lv_arg_0_0= ruleCastingExpression ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleCastingExpression ) ) )*
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2205:2: ( (lv_arg_0_0= ruleCastingExpression ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2206:1: (lv_arg_0_0= ruleCastingExpression )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2206:1: (lv_arg_0_0= ruleCastingExpression )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2207:3: lv_arg_0_0= ruleCastingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArglistAccess().getArgCastingExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCastingExpression_in_ruleArglist5191);
            lv_arg_0_0=ruleCastingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArglistRule());
              	        }
                     		set(
                     			current, 
                     			"arg",
                      		lv_arg_0_0, 
                      		"CastingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2223:2: (otherlv_1= ',' ( (lv_args_2_0= ruleCastingExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==31) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2223:4: otherlv_1= ',' ( (lv_args_2_0= ruleCastingExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleArglist5204); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getArglistAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2227:1: ( (lv_args_2_0= ruleCastingExpression ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2228:1: (lv_args_2_0= ruleCastingExpression )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2228:1: (lv_args_2_0= ruleCastingExpression )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2229:3: lv_args_2_0= ruleCastingExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArglistAccess().getArgsCastingExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCastingExpression_in_ruleArglist5225);
            	    lv_args_2_0=ruleCastingExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArglistRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"args",
            	              		lv_args_2_0, 
            	              		"CastingExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, ruleArglist_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArglist"


    // $ANTLR start "entryRuleCastingExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2253:1: entryRuleCastingExpression returns [EObject current=null] : iv_ruleCastingExpression= ruleCastingExpression EOF ;
    public final EObject entryRuleCastingExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleCastingExpression_StartIndex = input.index();
        EObject iv_ruleCastingExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2254:2: (iv_ruleCastingExpression= ruleCastingExpression EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2255:2: iv_ruleCastingExpression= ruleCastingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCastingExpression_in_entryRuleCastingExpression5263);
            iv_ruleCastingExpression=ruleCastingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCastingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastingExpression5273); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, entryRuleCastingExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCastingExpression"


    // $ANTLR start "ruleCastingExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2262:1: ruleCastingExpression returns [EObject current=null] : (this_CreatingExpression_0= ruleCreatingExpression ( () otherlv_2= '(' ( (lv_types_3_0= ruleType ) ) otherlv_4= ')' ( (lv_right_5_0= ruleCreatingExpression ) ) )* ) ;
    public final EObject ruleCastingExpression() throws RecognitionException {
        EObject current = null;
        int ruleCastingExpression_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_CreatingExpression_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2265:28: ( (this_CreatingExpression_0= ruleCreatingExpression ( () otherlv_2= '(' ( (lv_types_3_0= ruleType ) ) otherlv_4= ')' ( (lv_right_5_0= ruleCreatingExpression ) ) )* ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2266:1: (this_CreatingExpression_0= ruleCreatingExpression ( () otherlv_2= '(' ( (lv_types_3_0= ruleType ) ) otherlv_4= ')' ( (lv_right_5_0= ruleCreatingExpression ) ) )* )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2266:1: (this_CreatingExpression_0= ruleCreatingExpression ( () otherlv_2= '(' ( (lv_types_3_0= ruleType ) ) otherlv_4= ')' ( (lv_right_5_0= ruleCreatingExpression ) ) )* )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2267:2: this_CreatingExpression_0= ruleCreatingExpression ( () otherlv_2= '(' ( (lv_types_3_0= ruleType ) ) otherlv_4= ')' ( (lv_right_5_0= ruleCreatingExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCastingExpressionAccess().getCreatingExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCreatingExpression_in_ruleCastingExpression5323);
            this_CreatingExpression_0=ruleCreatingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CreatingExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2278:1: ( () otherlv_2= '(' ( (lv_types_3_0= ruleType ) ) otherlv_4= ')' ( (lv_right_5_0= ruleCreatingExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==27) ) {
                    int LA54_1 = input.LA(2);

                    if ( ((LA54_1>=74 && LA54_1<=81)) ) {
                        alt54=1;
                    }
                    else if ( (LA54_1==RULE_ID) ) {
                        int LA54_4 = input.LA(3);

                        if ( (LA54_4==28) ) {
                            int LA54_5 = input.LA(4);

                            if ( (synpred85_InternalJavadsl()) ) {
                                alt54=1;
                            }


                        }
                        else if ( (LA54_4==18||LA54_4==29) ) {
                            alt54=1;
                        }


                    }


                }


                switch (alt54) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2278:2: () otherlv_2= '(' ( (lv_types_3_0= ruleType ) ) otherlv_4= ')' ( (lv_right_5_0= ruleCreatingExpression ) )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2278:2: ()
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2279:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCastingExpressionAccess().getCastingLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleCastingExpression5347); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCastingExpressionAccess().getLeftParenthesisKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2291:1: ( (lv_types_3_0= ruleType ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2292:1: (lv_types_3_0= ruleType )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2292:1: (lv_types_3_0= ruleType )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2293:3: lv_types_3_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCastingExpressionAccess().getTypesTypeParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_in_ruleCastingExpression5368);
            	    lv_types_3_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCastingExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"types",
            	              		lv_types_3_0, 
            	              		"Type");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleCastingExpression5380); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getCastingExpressionAccess().getRightParenthesisKeyword_1_3());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2313:1: ( (lv_right_5_0= ruleCreatingExpression ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2314:1: (lv_right_5_0= ruleCreatingExpression )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2314:1: (lv_right_5_0= ruleCreatingExpression )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2315:3: lv_right_5_0= ruleCreatingExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCastingExpressionAccess().getRightCreatingExpressionParserRuleCall_1_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCreatingExpression_in_ruleCastingExpression5401);
            	    lv_right_5_0=ruleCreatingExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCastingExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"CreatingExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, ruleCastingExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCastingExpression"


    // $ANTLR start "entryRuleCreatingExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2339:1: entryRuleCreatingExpression returns [EObject current=null] : iv_ruleCreatingExpression= ruleCreatingExpression EOF ;
    public final EObject entryRuleCreatingExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleCreatingExpression_StartIndex = input.index();
        EObject iv_ruleCreatingExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2340:2: (iv_ruleCreatingExpression= ruleCreatingExpression EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2341:2: iv_ruleCreatingExpression= ruleCreatingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreatingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCreatingExpression_in_entryRuleCreatingExpression5439);
            iv_ruleCreatingExpression=ruleCreatingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreatingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreatingExpression5449); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, entryRuleCreatingExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCreatingExpression"


    // $ANTLR start "ruleCreatingExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2348:1: ruleCreatingExpression returns [EObject current=null] : (this_ParenthesisExpression_0= ruleParenthesisExpression (otherlv_1= 'new' ( ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' ) | ( ( (lv_type_specifiers_6_0= ruleTypeSpecifier ) ) (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )? (otherlv_10= '[' otherlv_11= ']' )* ) ) )* ) ;
    public final EObject ruleCreatingExpression() throws RecognitionException {
        EObject current = null;
        int ruleCreatingExpression_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject this_ParenthesisExpression_0 = null;

        EObject lv_arg_list_4_0 = null;

        EObject lv_type_specifiers_6_0 = null;

        EObject lv_parenthesis_8_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2351:28: ( (this_ParenthesisExpression_0= ruleParenthesisExpression (otherlv_1= 'new' ( ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' ) | ( ( (lv_type_specifiers_6_0= ruleTypeSpecifier ) ) (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )? (otherlv_10= '[' otherlv_11= ']' )* ) ) )* ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2352:1: (this_ParenthesisExpression_0= ruleParenthesisExpression (otherlv_1= 'new' ( ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' ) | ( ( (lv_type_specifiers_6_0= ruleTypeSpecifier ) ) (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )? (otherlv_10= '[' otherlv_11= ']' )* ) ) )* )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2352:1: (this_ParenthesisExpression_0= ruleParenthesisExpression (otherlv_1= 'new' ( ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' ) | ( ( (lv_type_specifiers_6_0= ruleTypeSpecifier ) ) (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )? (otherlv_10= '[' otherlv_11= ']' )* ) ) )* )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2353:2: this_ParenthesisExpression_0= ruleParenthesisExpression (otherlv_1= 'new' ( ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' ) | ( ( (lv_type_specifiers_6_0= ruleTypeSpecifier ) ) (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )? (otherlv_10= '[' otherlv_11= ']' )* ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCreatingExpressionAccess().getParenthesisExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleParenthesisExpression_in_ruleCreatingExpression5499);
            this_ParenthesisExpression_0=ruleParenthesisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ParenthesisExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2364:1: (otherlv_1= 'new' ( ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' ) | ( ( (lv_type_specifiers_6_0= ruleTypeSpecifier ) ) (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )? (otherlv_10= '[' otherlv_11= ']' )* ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==70) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2364:3: otherlv_1= 'new' ( ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' ) | ( ( (lv_type_specifiers_6_0= ruleTypeSpecifier ) ) (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )? (otherlv_10= '[' otherlv_11= ']' )* ) )
            	    {
            	    otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleCreatingExpression5511); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCreatingExpressionAccess().getNewKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2368:1: ( ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' ) | ( ( (lv_type_specifiers_6_0= ruleTypeSpecifier ) ) (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )? (otherlv_10= '[' otherlv_11= ']' )* ) )
            	    int alt58=2;
            	    alt58 = dfa58.predict(input);
            	    switch (alt58) {
            	        case 1 :
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2368:2: ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' )
            	            {
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2368:2: ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' )
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2369:2: ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')'
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                      newCompositeNode(grammarAccess.getCreatingExpressionAccess().getObjectNameParserRuleCall_1_1_0_0()); 
            	                  
            	            }
            	            pushFollow(FOLLOW_ruleObjectName_in_ruleCreatingExpression5532);
            	            ruleObjectName();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                      afterParserOrEnumRuleCall();
            	                  
            	            }
            	            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleCreatingExpression5543); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getCreatingExpressionAccess().getLeftParenthesisKeyword_1_1_0_1());
            	                  
            	            }
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2383:1: ( (lv_arg_list_4_0= ruleArglist ) )?
            	            int alt55=2;
            	            int LA55_0 = input.LA(1);

            	            if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_ZERO_TO_SEVEN)||LA55_0==18||LA55_0==27||LA55_0==31||(LA55_0>=70 && LA55_0<=73)||(LA55_0>=94 && LA55_0<=95)) ) {
            	                alt55=1;
            	            }
            	            else if ( (LA55_0==28) ) {
            	                int LA55_2 = input.LA(2);

            	                if ( (synpred86_InternalJavadsl()) ) {
            	                    alt55=1;
            	                }
            	            }
            	            switch (alt55) {
            	                case 1 :
            	                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2384:1: (lv_arg_list_4_0= ruleArglist )
            	                    {
            	                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2384:1: (lv_arg_list_4_0= ruleArglist )
            	                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2385:3: lv_arg_list_4_0= ruleArglist
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getCreatingExpressionAccess().getArg_listArglistParserRuleCall_1_1_0_2_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleArglist_in_ruleCreatingExpression5564);
            	                    lv_arg_list_4_0=ruleArglist();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getCreatingExpressionRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"arg_list",
            	                              		lv_arg_list_4_0, 
            	                              		"Arglist");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleCreatingExpression5577); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_5, grammarAccess.getCreatingExpressionAccess().getRightParenthesisKeyword_1_1_0_3());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2406:6: ( ( (lv_type_specifiers_6_0= ruleTypeSpecifier ) ) (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )? (otherlv_10= '[' otherlv_11= ']' )* )
            	            {
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2406:6: ( ( (lv_type_specifiers_6_0= ruleTypeSpecifier ) ) (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )? (otherlv_10= '[' otherlv_11= ']' )* )
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2406:7: ( (lv_type_specifiers_6_0= ruleTypeSpecifier ) ) (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )? (otherlv_10= '[' otherlv_11= ']' )*
            	            {
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2406:7: ( (lv_type_specifiers_6_0= ruleTypeSpecifier ) )
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2407:1: (lv_type_specifiers_6_0= ruleTypeSpecifier )
            	            {
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2407:1: (lv_type_specifiers_6_0= ruleTypeSpecifier )
            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2408:3: lv_type_specifiers_6_0= ruleTypeSpecifier
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCreatingExpressionAccess().getType_specifiersTypeSpecifierParserRuleCall_1_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleCreatingExpression5606);
            	            lv_type_specifiers_6_0=ruleTypeSpecifier();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCreatingExpressionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"type_specifiers",
            	                      		lv_type_specifiers_6_0, 
            	                      		"TypeSpecifier");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2424:2: (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )?
            	            int alt56=2;
            	            alt56 = dfa56.predict(input);
            	            switch (alt56) {
            	                case 1 :
            	                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2424:4: otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']'
            	                    {
            	                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleCreatingExpression5619); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                          	newLeafNode(otherlv_7, grammarAccess.getCreatingExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1_0());
            	                          
            	                    }
            	                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2428:1: ( (lv_parenthesis_8_0= ruleParenthesisExpression ) )
            	                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2429:1: (lv_parenthesis_8_0= ruleParenthesisExpression )
            	                    {
            	                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2429:1: (lv_parenthesis_8_0= ruleParenthesisExpression )
            	                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2430:3: lv_parenthesis_8_0= ruleParenthesisExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getCreatingExpressionAccess().getParenthesisParenthesisExpressionParserRuleCall_1_1_1_1_1_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleParenthesisExpression_in_ruleCreatingExpression5640);
            	                    lv_parenthesis_8_0=ruleParenthesisExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getCreatingExpressionRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"parenthesis",
            	                              		lv_parenthesis_8_0, 
            	                              		"ParenthesisExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleCreatingExpression5652); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                          	newLeafNode(otherlv_9, grammarAccess.getCreatingExpressionAccess().getRightSquareBracketKeyword_1_1_1_1_2());
            	                          
            	                    }

            	                    }
            	                    break;

            	            }

            	            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2450:3: (otherlv_10= '[' otherlv_11= ']' )*
            	            loop57:
            	            do {
            	                int alt57=2;
            	                int LA57_0 = input.LA(1);

            	                if ( (LA57_0==29) ) {
            	                    int LA57_2 = input.LA(2);

            	                    if ( (LA57_2==30) ) {
            	                        int LA57_3 = input.LA(3);

            	                        if ( (synpred89_InternalJavadsl()) ) {
            	                            alt57=1;
            	                        }


            	                    }


            	                }


            	                switch (alt57) {
            	            	case 1 :
            	            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2450:5: otherlv_10= '[' otherlv_11= ']'
            	            	    {
            	            	    otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleCreatingExpression5667); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_10, grammarAccess.getCreatingExpressionAccess().getLeftSquareBracketKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleCreatingExpression5679); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_11, grammarAccess.getCreatingExpressionAccess().getRightSquareBracketKeyword_1_1_1_2_1());
            	            	          
            	            	    }

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop57;
            	                }
            	            } while (true);


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, ruleCreatingExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCreatingExpression"


    // $ANTLR start "entryRuleParenthesisExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2466:1: entryRuleParenthesisExpression returns [EObject current=null] : iv_ruleParenthesisExpression= ruleParenthesisExpression EOF ;
    public final EObject entryRuleParenthesisExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleParenthesisExpression_StartIndex = input.index();
        EObject iv_ruleParenthesisExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2467:2: (iv_ruleParenthesisExpression= ruleParenthesisExpression EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2468:2: iv_ruleParenthesisExpression= ruleParenthesisExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesisExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression5721);
            iv_ruleParenthesisExpression=ruleParenthesisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesisExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisExpression5731); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleParenthesisExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesisExpression"


    // $ANTLR start "ruleParenthesisExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2475:1: ruleParenthesisExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression (otherlv_1= '(' ( (lv_parenthesis_2_0= rulePrimaryExpression ) ) otherlv_3= ')' )* ) ;
    public final EObject ruleParenthesisExpression() throws RecognitionException {
        EObject current = null;
        int ruleParenthesisExpression_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_parenthesis_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2478:28: ( (this_PrimaryExpression_0= rulePrimaryExpression (otherlv_1= '(' ( (lv_parenthesis_2_0= rulePrimaryExpression ) ) otherlv_3= ')' )* ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2479:1: (this_PrimaryExpression_0= rulePrimaryExpression (otherlv_1= '(' ( (lv_parenthesis_2_0= rulePrimaryExpression ) ) otherlv_3= ')' )* )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2479:1: (this_PrimaryExpression_0= rulePrimaryExpression (otherlv_1= '(' ( (lv_parenthesis_2_0= rulePrimaryExpression ) ) otherlv_3= ')' )* )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2480:2: this_PrimaryExpression_0= rulePrimaryExpression (otherlv_1= '(' ( (lv_parenthesis_2_0= rulePrimaryExpression ) ) otherlv_3= ')' )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesisExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleParenthesisExpression5781);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2491:1: (otherlv_1= '(' ( (lv_parenthesis_2_0= rulePrimaryExpression ) ) otherlv_3= ')' )*
            loop60:
            do {
                int alt60=2;
                alt60 = dfa60.predict(input);
                switch (alt60) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2491:3: otherlv_1= '(' ( (lv_parenthesis_2_0= rulePrimaryExpression ) ) otherlv_3= ')'
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleParenthesisExpression5793); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2495:1: ( (lv_parenthesis_2_0= rulePrimaryExpression ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2496:1: (lv_parenthesis_2_0= rulePrimaryExpression )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2496:1: (lv_parenthesis_2_0= rulePrimaryExpression )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2497:3: lv_parenthesis_2_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParenthesisExpressionAccess().getParenthesisPrimaryExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleParenthesisExpression5814);
            	    lv_parenthesis_2_0=rulePrimaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParenthesisExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parenthesis",
            	              		lv_parenthesis_2_0, 
            	              		"PrimaryExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleParenthesisExpression5826); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, ruleParenthesisExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParenthesisExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2525:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;
        int entryRulePrimaryExpression_StartIndex = input.index();
        EObject iv_rulePrimaryExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2526:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2527:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5864);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression5874); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, entryRulePrimaryExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2534:1: rulePrimaryExpression returns [EObject current=null] : ( () ( ( (lv_value_1_0= ruleLiteralExpression ) ) | otherlv_2= 'null' | otherlv_3= 'super' | otherlv_4= 'this' | this_ID_5= RULE_ID ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;
        int rulePrimaryExpression_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_ID_5=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2537:28: ( ( () ( ( (lv_value_1_0= ruleLiteralExpression ) ) | otherlv_2= 'null' | otherlv_3= 'super' | otherlv_4= 'this' | this_ID_5= RULE_ID ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2538:1: ( () ( ( (lv_value_1_0= ruleLiteralExpression ) ) | otherlv_2= 'null' | otherlv_3= 'super' | otherlv_4= 'this' | this_ID_5= RULE_ID ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2538:1: ( () ( ( (lv_value_1_0= ruleLiteralExpression ) ) | otherlv_2= 'null' | otherlv_3= 'super' | otherlv_4= 'this' | this_ID_5= RULE_ID ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2538:2: () ( ( (lv_value_1_0= ruleLiteralExpression ) ) | otherlv_2= 'null' | otherlv_3= 'super' | otherlv_4= 'this' | this_ID_5= RULE_ID )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2538:2: ()
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2539:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimaryExpressionAccess().getPrimaryExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2547:2: ( ( (lv_value_1_0= ruleLiteralExpression ) ) | otherlv_2= 'null' | otherlv_3= 'super' | otherlv_4= 'this' | this_ID_5= RULE_ID )
            int alt61=5;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_STRING:
            case RULE_INT:
            case RULE_NUMBER_SUFFIX:
            case RULE_HEXA:
            case RULE_ZERO_TO_SEVEN:
            case 16:
            case 18:
            case 19:
            case 24:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 69:
            case 70:
            case 94:
            case 95:
                {
                alt61=1;
                }
                break;
            case 71:
                {
                alt61=2;
                }
                break;
            case 72:
                {
                alt61=3;
                }
                break;
            case 73:
                {
                alt61=4;
                }
                break;
            case RULE_ID:
                {
                alt61=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2547:3: ( (lv_value_1_0= ruleLiteralExpression ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2547:3: ( (lv_value_1_0= ruleLiteralExpression ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2548:1: (lv_value_1_0= ruleLiteralExpression )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2548:1: (lv_value_1_0= ruleLiteralExpression )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2549:3: lv_value_1_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueLiteralExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralExpression_in_rulePrimaryExpression5933);
                    lv_value_1_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"LiteralExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2566:7: otherlv_2= 'null'
                    {
                    otherlv_2=(Token)match(input,71,FOLLOW_71_in_rulePrimaryExpression5951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getNullKeyword_1_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2571:7: otherlv_3= 'super'
                    {
                    otherlv_3=(Token)match(input,72,FOLLOW_72_in_rulePrimaryExpression5969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getSuperKeyword_1_2());
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2576:7: otherlv_4= 'this'
                    {
                    otherlv_4=(Token)match(input,73,FOLLOW_73_in_rulePrimaryExpression5987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getThisKeyword_1_3());
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2581:6: this_ID_5= RULE_ID
                    {
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression6004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_5, grammarAccess.getPrimaryExpressionAccess().getIDTerminalRuleCall_1_4()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, rulePrimaryExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2593:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLiteralExpression_StartIndex = input.index();
        EObject iv_ruleLiteralExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2594:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2595:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression6040);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpression6050); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleLiteralExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2602:1: ruleLiteralExpression returns [EObject current=null] : ( ( (lv_literal_value_0_1= ruleIntegerLiteral | lv_literal_value_0_2= ruleFloatLiteral | lv_literal_value_0_3= RULE_STRING | lv_literal_value_0_4= ruleCharacter ) ) ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;
        int ruleLiteralExpression_StartIndex = input.index();
        Token lv_literal_value_0_3=null;
        AntlrDatatypeRuleToken lv_literal_value_0_1 = null;

        AntlrDatatypeRuleToken lv_literal_value_0_2 = null;

        AntlrDatatypeRuleToken lv_literal_value_0_4 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2605:28: ( ( ( (lv_literal_value_0_1= ruleIntegerLiteral | lv_literal_value_0_2= ruleFloatLiteral | lv_literal_value_0_3= RULE_STRING | lv_literal_value_0_4= ruleCharacter ) ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2606:1: ( ( (lv_literal_value_0_1= ruleIntegerLiteral | lv_literal_value_0_2= ruleFloatLiteral | lv_literal_value_0_3= RULE_STRING | lv_literal_value_0_4= ruleCharacter ) ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2606:1: ( ( (lv_literal_value_0_1= ruleIntegerLiteral | lv_literal_value_0_2= ruleFloatLiteral | lv_literal_value_0_3= RULE_STRING | lv_literal_value_0_4= ruleCharacter ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2607:1: ( (lv_literal_value_0_1= ruleIntegerLiteral | lv_literal_value_0_2= ruleFloatLiteral | lv_literal_value_0_3= RULE_STRING | lv_literal_value_0_4= ruleCharacter ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2607:1: ( (lv_literal_value_0_1= ruleIntegerLiteral | lv_literal_value_0_2= ruleFloatLiteral | lv_literal_value_0_3= RULE_STRING | lv_literal_value_0_4= ruleCharacter ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2608:1: (lv_literal_value_0_1= ruleIntegerLiteral | lv_literal_value_0_2= ruleFloatLiteral | lv_literal_value_0_3= RULE_STRING | lv_literal_value_0_4= ruleCharacter )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2608:1: (lv_literal_value_0_1= ruleIntegerLiteral | lv_literal_value_0_2= ruleFloatLiteral | lv_literal_value_0_3= RULE_STRING | lv_literal_value_0_4= ruleCharacter )
            int alt62=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA62_1 = input.LA(2);

                if ( (synpred96_InternalJavadsl()) ) {
                    alt62=1;
                }
                else if ( (synpred97_InternalJavadsl()) ) {
                    alt62=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case RULE_NUMBER_SUFFIX:
            case RULE_HEXA:
            case RULE_ZERO_TO_SEVEN:
            case 16:
            case 19:
            case 24:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 69:
            case 70:
            case 94:
            case 95:
                {
                alt62=1;
                }
                break;
            case 18:
                {
                int LA62_3 = input.LA(2);

                if ( (LA62_3==RULE_INT) ) {
                    int LA62_6 = input.LA(3);

                    if ( (synpred96_InternalJavadsl()) ) {
                        alt62=1;
                    }
                    else if ( (synpred97_InternalJavadsl()) ) {
                        alt62=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA62_3==EOF||(LA62_3>=RULE_ID && LA62_3<=RULE_STRING)||(LA62_3>=RULE_NUMBER_SUFFIX && LA62_3<=RULE_ZERO_TO_SEVEN)||LA62_3==16||(LA62_3>=18 && LA62_3<=19)||LA62_3==24||(LA62_3>=27 && LA62_3<=29)||LA62_3==31||(LA62_3>=33 && LA62_3<=43)||(LA62_3>=45 && LA62_3<=54)||(LA62_3>=56 && LA62_3<=66)||(LA62_3>=69 && LA62_3<=73)||(LA62_3>=94 && LA62_3<=95)) ) {
                    alt62=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA62_4 = input.LA(2);

                if ( (synpred98_InternalJavadsl()) ) {
                    alt62=3;
                }
                else if ( (true) ) {
                    alt62=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2609:3: lv_literal_value_0_1= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteral_valueIntegerLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleLiteralExpression6097);
                    lv_literal_value_0_1=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literal_value",
                              		lv_literal_value_0_1, 
                              		"IntegerLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2624:8: lv_literal_value_0_2= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteral_valueFloatLiteralParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_ruleLiteralExpression6116);
                    lv_literal_value_0_2=ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literal_value",
                              		lv_literal_value_0_2, 
                              		"FloatLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2639:8: lv_literal_value_0_3= RULE_STRING
                    {
                    lv_literal_value_0_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralExpression6131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_literal_value_0_3, grammarAccess.getLiteralExpressionAccess().getLiteral_valueSTRINGTerminalRuleCall_0_2()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"literal_value",
                              		lv_literal_value_0_3, 
                              		"STRING");
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2654:8: lv_literal_value_0_4= ruleCharacter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteral_valueCharacterParserRuleCall_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCharacter_in_ruleLiteralExpression6155);
                    lv_literal_value_0_4=ruleCharacter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literal_value",
                              		lv_literal_value_0_4, 
                              		"Character");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, ruleLiteralExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleTypeSpecifier"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2680:1: entryRuleTypeSpecifier returns [EObject current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final EObject entryRuleTypeSpecifier() throws RecognitionException {
        EObject current = null;
        int entryRuleTypeSpecifier_StartIndex = input.index();
        EObject iv_ruleTypeSpecifier = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2681:2: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2682:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier6193);
            iv_ruleTypeSpecifier=ruleTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSpecifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecifier6203); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, entryRuleTypeSpecifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSpecifier"


    // $ANTLR start "ruleTypeSpecifier"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2689:1: ruleTypeSpecifier returns [EObject current=null] : ( ( (lv_name_0_1= 'boolean' | lv_name_0_2= 'byte' | lv_name_0_3= 'char' | lv_name_0_4= 'short' | lv_name_0_5= 'int' | lv_name_0_6= 'float' | lv_name_0_7= 'long' | lv_name_0_8= 'double' | lv_name_0_9= ruleObjectName ) ) ) ;
    public final EObject ruleTypeSpecifier() throws RecognitionException {
        EObject current = null;
        int ruleTypeSpecifier_StartIndex = input.index();
        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;
        Token lv_name_0_7=null;
        Token lv_name_0_8=null;
        AntlrDatatypeRuleToken lv_name_0_9 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2692:28: ( ( ( (lv_name_0_1= 'boolean' | lv_name_0_2= 'byte' | lv_name_0_3= 'char' | lv_name_0_4= 'short' | lv_name_0_5= 'int' | lv_name_0_6= 'float' | lv_name_0_7= 'long' | lv_name_0_8= 'double' | lv_name_0_9= ruleObjectName ) ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2693:1: ( ( (lv_name_0_1= 'boolean' | lv_name_0_2= 'byte' | lv_name_0_3= 'char' | lv_name_0_4= 'short' | lv_name_0_5= 'int' | lv_name_0_6= 'float' | lv_name_0_7= 'long' | lv_name_0_8= 'double' | lv_name_0_9= ruleObjectName ) ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2693:1: ( ( (lv_name_0_1= 'boolean' | lv_name_0_2= 'byte' | lv_name_0_3= 'char' | lv_name_0_4= 'short' | lv_name_0_5= 'int' | lv_name_0_6= 'float' | lv_name_0_7= 'long' | lv_name_0_8= 'double' | lv_name_0_9= ruleObjectName ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2694:1: ( (lv_name_0_1= 'boolean' | lv_name_0_2= 'byte' | lv_name_0_3= 'char' | lv_name_0_4= 'short' | lv_name_0_5= 'int' | lv_name_0_6= 'float' | lv_name_0_7= 'long' | lv_name_0_8= 'double' | lv_name_0_9= ruleObjectName ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2694:1: ( (lv_name_0_1= 'boolean' | lv_name_0_2= 'byte' | lv_name_0_3= 'char' | lv_name_0_4= 'short' | lv_name_0_5= 'int' | lv_name_0_6= 'float' | lv_name_0_7= 'long' | lv_name_0_8= 'double' | lv_name_0_9= ruleObjectName ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2695:1: (lv_name_0_1= 'boolean' | lv_name_0_2= 'byte' | lv_name_0_3= 'char' | lv_name_0_4= 'short' | lv_name_0_5= 'int' | lv_name_0_6= 'float' | lv_name_0_7= 'long' | lv_name_0_8= 'double' | lv_name_0_9= ruleObjectName )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2695:1: (lv_name_0_1= 'boolean' | lv_name_0_2= 'byte' | lv_name_0_3= 'char' | lv_name_0_4= 'short' | lv_name_0_5= 'int' | lv_name_0_6= 'float' | lv_name_0_7= 'long' | lv_name_0_8= 'double' | lv_name_0_9= ruleObjectName )
            int alt63=9;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt63=1;
                }
                break;
            case 75:
                {
                alt63=2;
                }
                break;
            case 76:
                {
                alt63=3;
                }
                break;
            case 77:
                {
                alt63=4;
                }
                break;
            case 78:
                {
                alt63=5;
                }
                break;
            case 79:
                {
                alt63=6;
                }
                break;
            case 80:
                {
                alt63=7;
                }
                break;
            case 81:
                {
                alt63=8;
                }
                break;
            case RULE_ID:
                {
                alt63=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2696:3: lv_name_0_1= 'boolean'
                    {
                    lv_name_0_1=(Token)match(input,74,FOLLOW_74_in_ruleTypeSpecifier6247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_1, grammarAccess.getTypeSpecifierAccess().getNameBooleanKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeSpecifierRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2708:8: lv_name_0_2= 'byte'
                    {
                    lv_name_0_2=(Token)match(input,75,FOLLOW_75_in_ruleTypeSpecifier6276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_2, grammarAccess.getTypeSpecifierAccess().getNameByteKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeSpecifierRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2720:8: lv_name_0_3= 'char'
                    {
                    lv_name_0_3=(Token)match(input,76,FOLLOW_76_in_ruleTypeSpecifier6305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_3, grammarAccess.getTypeSpecifierAccess().getNameCharKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeSpecifierRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2732:8: lv_name_0_4= 'short'
                    {
                    lv_name_0_4=(Token)match(input,77,FOLLOW_77_in_ruleTypeSpecifier6334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_4, grammarAccess.getTypeSpecifierAccess().getNameShortKeyword_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeSpecifierRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_4, null);
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2744:8: lv_name_0_5= 'int'
                    {
                    lv_name_0_5=(Token)match(input,78,FOLLOW_78_in_ruleTypeSpecifier6363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_5, grammarAccess.getTypeSpecifierAccess().getNameIntKeyword_0_4());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeSpecifierRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_5, null);
                      	    
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2756:8: lv_name_0_6= 'float'
                    {
                    lv_name_0_6=(Token)match(input,79,FOLLOW_79_in_ruleTypeSpecifier6392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_6, grammarAccess.getTypeSpecifierAccess().getNameFloatKeyword_0_5());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeSpecifierRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_6, null);
                      	    
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2768:8: lv_name_0_7= 'long'
                    {
                    lv_name_0_7=(Token)match(input,80,FOLLOW_80_in_ruleTypeSpecifier6421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_7, grammarAccess.getTypeSpecifierAccess().getNameLongKeyword_0_6());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeSpecifierRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_7, null);
                      	    
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2780:8: lv_name_0_8= 'double'
                    {
                    lv_name_0_8=(Token)match(input,81,FOLLOW_81_in_ruleTypeSpecifier6450); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_8, grammarAccess.getTypeSpecifierAccess().getNameDoubleKeyword_0_7());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeSpecifierRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_8, null);
                      	    
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2792:8: lv_name_0_9= ruleObjectName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeSpecifierAccess().getNameObjectNameParserRuleCall_0_8()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleObjectName_in_ruleTypeSpecifier6482);
                    lv_name_0_9=ruleObjectName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeSpecifierRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_0_9, 
                              		"ObjectName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, ruleTypeSpecifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypeSpecifier"


    // $ANTLR start "entryRuleModifier"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2818:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;
        int entryRuleModifier_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2819:2: (iv_ruleModifier= ruleModifier EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2820:2: iv_ruleModifier= ruleModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifierRule()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier6521);
            iv_ruleModifier=ruleModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier6532); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, entryRuleModifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2827:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'static' | kw= 'final' | kw= 'native' | kw= 'synchronized' | kw= 'abstract' | kw= 'threadsafe' | kw= 'transient' ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleModifier_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2830:28: ( (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'static' | kw= 'final' | kw= 'native' | kw= 'synchronized' | kw= 'abstract' | kw= 'threadsafe' | kw= 'transient' ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2831:1: (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'static' | kw= 'final' | kw= 'native' | kw= 'synchronized' | kw= 'abstract' | kw= 'threadsafe' | kw= 'transient' )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2831:1: (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'static' | kw= 'final' | kw= 'native' | kw= 'synchronized' | kw= 'abstract' | kw= 'threadsafe' | kw= 'transient' )
            int alt64=10;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt64=1;
                }
                break;
            case 83:
                {
                alt64=2;
                }
                break;
            case 84:
                {
                alt64=3;
                }
                break;
            case 26:
                {
                alt64=4;
                }
                break;
            case 85:
                {
                alt64=5;
                }
                break;
            case 86:
                {
                alt64=6;
                }
                break;
            case 87:
                {
                alt64=7;
                }
                break;
            case 88:
                {
                alt64=8;
                }
                break;
            case 89:
                {
                alt64=9;
                }
                break;
            case 90:
                {
                alt64=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2832:2: kw= 'public'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleModifier6570); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getModifierAccess().getPublicKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2839:2: kw= 'private'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleModifier6589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getModifierAccess().getPrivateKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2846:2: kw= 'protected'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleModifier6608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getModifierAccess().getProtectedKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2853:2: kw= 'static'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleModifier6627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getModifierAccess().getStaticKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2860:2: kw= 'final'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleModifier6646); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getModifierAccess().getFinalKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2867:2: kw= 'native'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleModifier6665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getModifierAccess().getNativeKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2874:2: kw= 'synchronized'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleModifier6684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getModifierAccess().getSynchronizedKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2881:2: kw= 'abstract'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleModifier6703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getModifierAccess().getAbstractKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2888:2: kw= 'threadsafe'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleModifier6722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getModifierAccess().getThreadsafeKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2895:2: kw= 'transient'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleModifier6741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getModifierAccess().getTransientKeyword_9()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, ruleModifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleCharacter"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2908:1: entryRuleCharacter returns [String current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final String entryRuleCharacter() throws RecognitionException {
        String current = null;
        int entryRuleCharacter_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleCharacter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2909:2: (iv_ruleCharacter= ruleCharacter EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2910:2: iv_ruleCharacter= ruleCharacter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharacterRule()); 
            }
            pushFollow(FOLLOW_ruleCharacter_in_entryRuleCharacter6782);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharacter.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacter6793); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, entryRuleCharacter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2917:1: ruleCharacter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCharacter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleCharacter_StartIndex = input.index();
        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2920:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2921:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharacter6832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_0, grammarAccess.getCharacterAccess().getSTRINGTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, ruleCharacter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuledecimal_digits"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2936:1: entryRuledecimal_digits returns [String current=null] : iv_ruledecimal_digits= ruledecimal_digits EOF ;
    public final String entryRuledecimal_digits() throws RecognitionException {
        String current = null;
        int entryRuledecimal_digits_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruledecimal_digits = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2937:2: (iv_ruledecimal_digits= ruledecimal_digits EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2938:2: iv_ruledecimal_digits= ruledecimal_digits EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimal_digitsRule()); 
            }
            pushFollow(FOLLOW_ruledecimal_digits_in_entryRuledecimal_digits6877);
            iv_ruledecimal_digits=ruledecimal_digits();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledecimal_digits.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledecimal_digits6888); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, entryRuledecimal_digits_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuledecimal_digits"


    // $ANTLR start "ruledecimal_digits"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2945:1: ruledecimal_digits returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (this_INT_1= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruledecimal_digits() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruledecimal_digits_StartIndex = input.index();
        Token this_INT_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2948:28: ( (this_INT_0= RULE_INT (this_INT_1= RULE_INT )* ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2949:1: (this_INT_0= RULE_INT (this_INT_1= RULE_INT )* )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2949:1: (this_INT_0= RULE_INT (this_INT_1= RULE_INT )* )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2949:6: this_INT_0= RULE_INT (this_INT_1= RULE_INT )*
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruledecimal_digits6928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getDecimal_digitsAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2956:1: (this_INT_1= RULE_INT )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_INT) ) {
                    int LA65_2 = input.LA(2);

                    if ( (synpred116_InternalJavadsl()) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2956:6: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruledecimal_digits6949); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_INT_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INT_1, grammarAccess.getDecimal_digitsAccess().getINTTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, ruledecimal_digits_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruledecimal_digits"


    // $ANTLR start "entryRuleDoStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2971:1: entryRuleDoStatement returns [EObject current=null] : iv_ruleDoStatement= ruleDoStatement EOF ;
    public final EObject entryRuleDoStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleDoStatement_StartIndex = input.index();
        EObject iv_ruleDoStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2972:2: (iv_ruleDoStatement= ruleDoStatement EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2973:2: iv_ruleDoStatement= ruleDoStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDoStatement_in_entryRuleDoStatement6996);
            iv_ruleDoStatement=ruleDoStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoStatement7006); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, entryRuleDoStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDoStatement"


    // $ANTLR start "ruleDoStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2980:1: ruleDoStatement returns [EObject current=null] : (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleDoStatement() throws RecognitionException {
        EObject current = null;
        int ruleDoStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_statement_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2983:28: ( (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2984:1: (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2984:1: (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2984:3: otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleDoStatement7043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDoStatementAccess().getDoKeyword_0());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2988:1: ( (lv_statement_1_0= ruleStatement ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2989:1: (lv_statement_1_0= ruleStatement )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2989:1: (lv_statement_1_0= ruleStatement )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2990:3: lv_statement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoStatementAccess().getStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleDoStatement7064);
            lv_statement_1_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoStatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_1_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,92,FOLLOW_92_in_ruleDoStatement7076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDoStatementAccess().getWhileKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleDoStatement7088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDoStatementAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3014:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3015:1: (lv_expression_4_0= ruleExpression )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3015:1: (lv_expression_4_0= ruleExpression )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3016:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoStatementAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleDoStatement7109);
            lv_expression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleDoStatement7121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDoStatementAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleDoStatement7133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDoStatementAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, ruleDoStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDoStatement"


    // $ANTLR start "entryRuleexponent_part"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3048:1: entryRuleexponent_part returns [String current=null] : iv_ruleexponent_part= ruleexponent_part EOF ;
    public final String entryRuleexponent_part() throws RecognitionException {
        String current = null;
        int entryRuleexponent_part_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleexponent_part = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3049:2: (iv_ruleexponent_part= ruleexponent_part EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3050:2: iv_ruleexponent_part= ruleexponent_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponent_partRule()); 
            }
            pushFollow(FOLLOW_ruleexponent_part_in_entryRuleexponent_part7170);
            iv_ruleexponent_part=ruleexponent_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexponent_part.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexponent_part7181); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, entryRuleexponent_part_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleexponent_part"


    // $ANTLR start "ruleexponent_part"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3057:1: ruleexponent_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '0..9e' ;
    public final AntlrDatatypeRuleToken ruleexponent_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleexponent_part_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3060:28: (kw= '0..9e' )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3062:2: kw= '0..9e'
            {
            kw=(Token)match(input,93,FOLLOW_93_in_ruleexponent_part7218); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getExponent_partAccess().getEKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, ruleexponent_part_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleexponent_part"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3075:1: entryRuleIntegerLiteral returns [String current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final String entryRuleIntegerLiteral() throws RecognitionException {
        String current = null;
        int entryRuleIntegerLiteral_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleIntegerLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3076:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3077:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral7258);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral7269); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, entryRuleIntegerLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3084:1: ruleIntegerLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_decimal_integer_literal_0= ruledecimal_integer_literal | this_hex_integer_literal_1= rulehex_integer_literal | this_octal_integer_literal_2= ruleoctal_integer_literal ) ;
    public final AntlrDatatypeRuleToken ruleIntegerLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleIntegerLiteral_StartIndex = input.index();
        AntlrDatatypeRuleToken this_decimal_integer_literal_0 = null;

        AntlrDatatypeRuleToken this_hex_integer_literal_1 = null;

        AntlrDatatypeRuleToken this_octal_integer_literal_2 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3087:28: ( (this_decimal_integer_literal_0= ruledecimal_integer_literal | this_hex_integer_literal_1= rulehex_integer_literal | this_octal_integer_literal_2= ruleoctal_integer_literal ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3088:1: (this_decimal_integer_literal_0= ruledecimal_integer_literal | this_hex_integer_literal_1= rulehex_integer_literal | this_octal_integer_literal_2= ruleoctal_integer_literal )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3088:1: (this_decimal_integer_literal_0= ruledecimal_integer_literal | this_hex_integer_literal_1= rulehex_integer_literal | this_octal_integer_literal_2= ruleoctal_integer_literal )
            int alt66=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt66=1;
                }
                break;
            case RULE_HEXA:
            case 94:
            case 95:
                {
                alt66=2;
                }
                break;
            case EOF:
            case RULE_NUMBER_SUFFIX:
            case RULE_ZERO_TO_SEVEN:
            case 16:
            case 18:
            case 19:
            case 24:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 69:
            case 70:
                {
                alt66=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3089:5: this_decimal_integer_literal_0= ruledecimal_integer_literal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIntegerLiteralAccess().getDecimal_integer_literalParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruledecimal_integer_literal_in_ruleIntegerLiteral7316);
                    this_decimal_integer_literal_0=ruledecimal_integer_literal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_decimal_integer_literal_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3101:5: this_hex_integer_literal_1= rulehex_integer_literal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIntegerLiteralAccess().getHex_integer_literalParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulehex_integer_literal_in_ruleIntegerLiteral7349);
                    this_hex_integer_literal_1=rulehex_integer_literal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_hex_integer_literal_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3113:5: this_octal_integer_literal_2= ruleoctal_integer_literal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIntegerLiteralAccess().getOctal_integer_literalParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleoctal_integer_literal_in_ruleIntegerLiteral7382);
                    this_octal_integer_literal_2=ruleoctal_integer_literal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_octal_integer_literal_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, ruleIntegerLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuledecimal_integer_literal"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3131:1: entryRuledecimal_integer_literal returns [String current=null] : iv_ruledecimal_integer_literal= ruledecimal_integer_literal EOF ;
    public final String entryRuledecimal_integer_literal() throws RecognitionException {
        String current = null;
        int entryRuledecimal_integer_literal_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruledecimal_integer_literal = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3132:2: (iv_ruledecimal_integer_literal= ruledecimal_integer_literal EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3133:2: iv_ruledecimal_integer_literal= ruledecimal_integer_literal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimal_integer_literalRule()); 
            }
            pushFollow(FOLLOW_ruledecimal_integer_literal_in_entryRuledecimal_integer_literal7428);
            iv_ruledecimal_integer_literal=ruledecimal_integer_literal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledecimal_integer_literal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledecimal_integer_literal7439); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, entryRuledecimal_integer_literal_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuledecimal_integer_literal"


    // $ANTLR start "ruledecimal_integer_literal"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3140:1: ruledecimal_integer_literal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_decimal_digits_0= ruledecimal_digits (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )? ) ;
    public final AntlrDatatypeRuleToken ruledecimal_integer_literal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruledecimal_integer_literal_StartIndex = input.index();
        Token this_NUMBER_SUFFIX_1=null;
        AntlrDatatypeRuleToken this_decimal_digits_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3143:28: ( (this_decimal_digits_0= ruledecimal_digits (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )? ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3144:1: (this_decimal_digits_0= ruledecimal_digits (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )? )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3144:1: (this_decimal_digits_0= ruledecimal_digits (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )? )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3145:5: this_decimal_digits_0= ruledecimal_digits (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDecimal_integer_literalAccess().getDecimal_digitsParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruledecimal_digits_in_ruledecimal_integer_literal7486);
            this_decimal_digits_0=ruledecimal_digits();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_decimal_digits_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3155:1: (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_NUMBER_SUFFIX) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3155:6: this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX
                    {
                    this_NUMBER_SUFFIX_1=(Token)match(input,RULE_NUMBER_SUFFIX,FOLLOW_RULE_NUMBER_SUFFIX_in_ruledecimal_integer_literal7507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_SUFFIX_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_SUFFIX_1, grammarAccess.getDecimal_integer_literalAccess().getNUMBER_SUFFIXTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, ruledecimal_integer_literal_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruledecimal_integer_literal"


    // $ANTLR start "entryRulehex_integer_literal"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3170:1: entryRulehex_integer_literal returns [String current=null] : iv_rulehex_integer_literal= rulehex_integer_literal EOF ;
    public final String entryRulehex_integer_literal() throws RecognitionException {
        String current = null;
        int entryRulehex_integer_literal_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_rulehex_integer_literal = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3171:2: (iv_rulehex_integer_literal= rulehex_integer_literal EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3172:2: iv_rulehex_integer_literal= rulehex_integer_literal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHex_integer_literalRule()); 
            }
            pushFollow(FOLLOW_rulehex_integer_literal_in_entryRulehex_integer_literal7555);
            iv_rulehex_integer_literal=rulehex_integer_literal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulehex_integer_literal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulehex_integer_literal7566); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, entryRulehex_integer_literal_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulehex_integer_literal"


    // $ANTLR start "rulehex_integer_literal"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3179:1: rulehex_integer_literal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_hexa_numeral_0= rulehexa_numeral (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )? ) ;
    public final AntlrDatatypeRuleToken rulehex_integer_literal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int rulehex_integer_literal_StartIndex = input.index();
        Token this_NUMBER_SUFFIX_1=null;
        AntlrDatatypeRuleToken this_hexa_numeral_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3182:28: ( (this_hexa_numeral_0= rulehexa_numeral (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )? ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3183:1: (this_hexa_numeral_0= rulehexa_numeral (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )? )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3183:1: (this_hexa_numeral_0= rulehexa_numeral (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )? )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3184:5: this_hexa_numeral_0= rulehexa_numeral (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getHex_integer_literalAccess().getHexa_numeralParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulehexa_numeral_in_rulehex_integer_literal7613);
            this_hexa_numeral_0=rulehexa_numeral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_hexa_numeral_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3194:1: (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_NUMBER_SUFFIX) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3194:6: this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX
                    {
                    this_NUMBER_SUFFIX_1=(Token)match(input,RULE_NUMBER_SUFFIX,FOLLOW_RULE_NUMBER_SUFFIX_in_rulehex_integer_literal7634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_SUFFIX_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_SUFFIX_1, grammarAccess.getHex_integer_literalAccess().getNUMBER_SUFFIXTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, rulehex_integer_literal_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulehex_integer_literal"


    // $ANTLR start "entryRulehexa_numeral"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3209:1: entryRulehexa_numeral returns [String current=null] : iv_rulehexa_numeral= rulehexa_numeral EOF ;
    public final String entryRulehexa_numeral() throws RecognitionException {
        String current = null;
        int entryRulehexa_numeral_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_rulehexa_numeral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3210:2: (iv_rulehexa_numeral= rulehexa_numeral EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3211:2: iv_rulehexa_numeral= rulehexa_numeral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexa_numeralRule()); 
            }
            pushFollow(FOLLOW_rulehexa_numeral_in_entryRulehexa_numeral7682);
            iv_rulehexa_numeral=rulehexa_numeral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulehexa_numeral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulehexa_numeral7693); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, entryRulehexa_numeral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulehexa_numeral"


    // $ANTLR start "rulehexa_numeral"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3218:1: rulehexa_numeral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '0x' | kw= '0X' ) this_HEXA_2= RULE_HEXA ) | this_HEXA_3= RULE_HEXA ) ;
    public final AntlrDatatypeRuleToken rulehexa_numeral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int rulehexa_numeral_StartIndex = input.index();
        Token kw=null;
        Token this_HEXA_2=null;
        Token this_HEXA_3=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3221:28: ( ( ( (kw= '0x' | kw= '0X' ) this_HEXA_2= RULE_HEXA ) | this_HEXA_3= RULE_HEXA ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3222:1: ( ( (kw= '0x' | kw= '0X' ) this_HEXA_2= RULE_HEXA ) | this_HEXA_3= RULE_HEXA )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3222:1: ( ( (kw= '0x' | kw= '0X' ) this_HEXA_2= RULE_HEXA ) | this_HEXA_3= RULE_HEXA )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=94 && LA70_0<=95)) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_HEXA) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3222:2: ( (kw= '0x' | kw= '0X' ) this_HEXA_2= RULE_HEXA )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3222:2: ( (kw= '0x' | kw= '0X' ) this_HEXA_2= RULE_HEXA )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3222:3: (kw= '0x' | kw= '0X' ) this_HEXA_2= RULE_HEXA
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3222:3: (kw= '0x' | kw= '0X' )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==94) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==95) ) {
                        alt69=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3223:2: kw= '0x'
                            {
                            kw=(Token)match(input,94,FOLLOW_94_in_rulehexa_numeral7733); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getHexa_numeralAccess().getXKeyword_0_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3230:2: kw= '0X'
                            {
                            kw=(Token)match(input,95,FOLLOW_95_in_rulehexa_numeral7752); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getHexa_numeralAccess().getXKeyword_0_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_HEXA_2=(Token)match(input,RULE_HEXA,FOLLOW_RULE_HEXA_in_rulehexa_numeral7768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEXA_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEXA_2, grammarAccess.getHexa_numeralAccess().getHEXATerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3243:10: this_HEXA_3= RULE_HEXA
                    {
                    this_HEXA_3=(Token)match(input,RULE_HEXA,FOLLOW_RULE_HEXA_in_rulehexa_numeral7795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEXA_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEXA_3, grammarAccess.getHexa_numeralAccess().getHEXATerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, rulehexa_numeral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulehexa_numeral"


    // $ANTLR start "entryRuleoctal_integer_literal"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3258:1: entryRuleoctal_integer_literal returns [String current=null] : iv_ruleoctal_integer_literal= ruleoctal_integer_literal EOF ;
    public final String entryRuleoctal_integer_literal() throws RecognitionException {
        String current = null;
        int entryRuleoctal_integer_literal_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleoctal_integer_literal = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3259:2: (iv_ruleoctal_integer_literal= ruleoctal_integer_literal EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3260:2: iv_ruleoctal_integer_literal= ruleoctal_integer_literal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOctal_integer_literalRule()); 
            }
            pushFollow(FOLLOW_ruleoctal_integer_literal_in_entryRuleoctal_integer_literal7841);
            iv_ruleoctal_integer_literal=ruleoctal_integer_literal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleoctal_integer_literal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleoctal_integer_literal7852); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, entryRuleoctal_integer_literal_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleoctal_integer_literal"


    // $ANTLR start "ruleoctal_integer_literal"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3267:1: ruleoctal_integer_literal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_octal_numeral_0= ruleoctal_numeral (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )? ) ;
    public final AntlrDatatypeRuleToken ruleoctal_integer_literal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleoctal_integer_literal_StartIndex = input.index();
        Token this_NUMBER_SUFFIX_1=null;
        AntlrDatatypeRuleToken this_octal_numeral_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3270:28: ( (this_octal_numeral_0= ruleoctal_numeral (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )? ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3271:1: (this_octal_numeral_0= ruleoctal_numeral (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )? )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3271:1: (this_octal_numeral_0= ruleoctal_numeral (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )? )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3272:5: this_octal_numeral_0= ruleoctal_numeral (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOctal_integer_literalAccess().getOctal_numeralParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleoctal_numeral_in_ruleoctal_integer_literal7899);
            this_octal_numeral_0=ruleoctal_numeral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_octal_numeral_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3282:1: (this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_NUMBER_SUFFIX) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3282:6: this_NUMBER_SUFFIX_1= RULE_NUMBER_SUFFIX
                    {
                    this_NUMBER_SUFFIX_1=(Token)match(input,RULE_NUMBER_SUFFIX,FOLLOW_RULE_NUMBER_SUFFIX_in_ruleoctal_integer_literal7920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_SUFFIX_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_SUFFIX_1, grammarAccess.getOctal_integer_literalAccess().getNUMBER_SUFFIXTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, ruleoctal_integer_literal_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleoctal_integer_literal"


    // $ANTLR start "entryRuleoctal_numeral"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3297:1: entryRuleoctal_numeral returns [String current=null] : iv_ruleoctal_numeral= ruleoctal_numeral EOF ;
    public final String entryRuleoctal_numeral() throws RecognitionException {
        String current = null;
        int entryRuleoctal_numeral_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleoctal_numeral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3298:2: (iv_ruleoctal_numeral= ruleoctal_numeral EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3299:2: iv_ruleoctal_numeral= ruleoctal_numeral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOctal_numeralRule()); 
            }
            pushFollow(FOLLOW_ruleoctal_numeral_in_entryRuleoctal_numeral7968);
            iv_ruleoctal_numeral=ruleoctal_numeral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleoctal_numeral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleoctal_numeral7979); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, entryRuleoctal_numeral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleoctal_numeral"


    // $ANTLR start "ruleoctal_numeral"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3306:1: ruleoctal_numeral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ZERO_TO_SEVEN_0= RULE_ZERO_TO_SEVEN )* ;
    public final AntlrDatatypeRuleToken ruleoctal_numeral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleoctal_numeral_StartIndex = input.index();
        Token this_ZERO_TO_SEVEN_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3309:28: ( (this_ZERO_TO_SEVEN_0= RULE_ZERO_TO_SEVEN )* )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3310:1: (this_ZERO_TO_SEVEN_0= RULE_ZERO_TO_SEVEN )*
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3310:1: (this_ZERO_TO_SEVEN_0= RULE_ZERO_TO_SEVEN )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_ZERO_TO_SEVEN) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3310:6: this_ZERO_TO_SEVEN_0= RULE_ZERO_TO_SEVEN
            	    {
            	    this_ZERO_TO_SEVEN_0=(Token)match(input,RULE_ZERO_TO_SEVEN,FOLLOW_RULE_ZERO_TO_SEVEN_in_ruleoctal_numeral8019); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ZERO_TO_SEVEN_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ZERO_TO_SEVEN_0, grammarAccess.getOctal_numeralAccess().getZERO_TO_SEVENTerminalRuleCall()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, ruleoctal_numeral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleoctal_numeral"


    // $ANTLR start "entryRuleFloatLiteral"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3325:1: entryRuleFloatLiteral returns [String current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final String entryRuleFloatLiteral() throws RecognitionException {
        String current = null;
        int entryRuleFloatLiteral_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFloatLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3326:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3327:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral8066);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral8077); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, entryRuleFloatLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3334:1: ruleFloatLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_decimal_digits_0= ruledecimal_digits (kw= '.' )? (this_decimal_digits_2= ruledecimal_digits )? (this_exponent_part_3= ruleexponent_part )? (this_FLOAT_SUFFIX_4= RULE_FLOAT_SUFFIX )? ) | (kw= '.' this_decimal_digits_6= ruledecimal_digits (this_exponent_part_7= ruleexponent_part )? (this_FLOAT_SUFFIX_8= RULE_FLOAT_SUFFIX )? ) ) ;
    public final AntlrDatatypeRuleToken ruleFloatLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFloatLiteral_StartIndex = input.index();
        Token kw=null;
        Token this_FLOAT_SUFFIX_4=null;
        Token this_FLOAT_SUFFIX_8=null;
        AntlrDatatypeRuleToken this_decimal_digits_0 = null;

        AntlrDatatypeRuleToken this_decimal_digits_2 = null;

        AntlrDatatypeRuleToken this_exponent_part_3 = null;

        AntlrDatatypeRuleToken this_decimal_digits_6 = null;

        AntlrDatatypeRuleToken this_exponent_part_7 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3337:28: ( ( (this_decimal_digits_0= ruledecimal_digits (kw= '.' )? (this_decimal_digits_2= ruledecimal_digits )? (this_exponent_part_3= ruleexponent_part )? (this_FLOAT_SUFFIX_4= RULE_FLOAT_SUFFIX )? ) | (kw= '.' this_decimal_digits_6= ruledecimal_digits (this_exponent_part_7= ruleexponent_part )? (this_FLOAT_SUFFIX_8= RULE_FLOAT_SUFFIX )? ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3338:1: ( (this_decimal_digits_0= ruledecimal_digits (kw= '.' )? (this_decimal_digits_2= ruledecimal_digits )? (this_exponent_part_3= ruleexponent_part )? (this_FLOAT_SUFFIX_4= RULE_FLOAT_SUFFIX )? ) | (kw= '.' this_decimal_digits_6= ruledecimal_digits (this_exponent_part_7= ruleexponent_part )? (this_FLOAT_SUFFIX_8= RULE_FLOAT_SUFFIX )? ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3338:1: ( (this_decimal_digits_0= ruledecimal_digits (kw= '.' )? (this_decimal_digits_2= ruledecimal_digits )? (this_exponent_part_3= ruleexponent_part )? (this_FLOAT_SUFFIX_4= RULE_FLOAT_SUFFIX )? ) | (kw= '.' this_decimal_digits_6= ruledecimal_digits (this_exponent_part_7= ruleexponent_part )? (this_FLOAT_SUFFIX_8= RULE_FLOAT_SUFFIX )? ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_INT) ) {
                alt79=1;
            }
            else if ( (LA79_0==18) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3338:2: (this_decimal_digits_0= ruledecimal_digits (kw= '.' )? (this_decimal_digits_2= ruledecimal_digits )? (this_exponent_part_3= ruleexponent_part )? (this_FLOAT_SUFFIX_4= RULE_FLOAT_SUFFIX )? )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3338:2: (this_decimal_digits_0= ruledecimal_digits (kw= '.' )? (this_decimal_digits_2= ruledecimal_digits )? (this_exponent_part_3= ruleexponent_part )? (this_FLOAT_SUFFIX_4= RULE_FLOAT_SUFFIX )? )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3339:5: this_decimal_digits_0= ruledecimal_digits (kw= '.' )? (this_decimal_digits_2= ruledecimal_digits )? (this_exponent_part_3= ruleexponent_part )? (this_FLOAT_SUFFIX_4= RULE_FLOAT_SUFFIX )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFloatLiteralAccess().getDecimal_digitsParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruledecimal_digits_in_ruleFloatLiteral8125);
                    this_decimal_digits_0=ruledecimal_digits();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_decimal_digits_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3349:1: (kw= '.' )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==18) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred125_InternalJavadsl()) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3350:2: kw= '.'
                            {
                            kw=(Token)match(input,18,FOLLOW_18_in_ruleFloatLiteral8144); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getFloatLiteralAccess().getFullStopKeyword_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3355:3: (this_decimal_digits_2= ruledecimal_digits )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_INT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3356:5: this_decimal_digits_2= ruledecimal_digits
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatLiteralAccess().getDecimal_digitsParserRuleCall_0_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruledecimal_digits_in_ruleFloatLiteral8169);
                            this_decimal_digits_2=ruledecimal_digits();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_decimal_digits_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3366:3: (this_exponent_part_3= ruleexponent_part )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==93) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3367:5: this_exponent_part_3= ruleexponent_part
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatLiteralAccess().getExponent_partParserRuleCall_0_3()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleexponent_part_in_ruleFloatLiteral8199);
                            this_exponent_part_3=ruleexponent_part();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_exponent_part_3);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3377:3: (this_FLOAT_SUFFIX_4= RULE_FLOAT_SUFFIX )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==RULE_FLOAT_SUFFIX) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3377:8: this_FLOAT_SUFFIX_4= RULE_FLOAT_SUFFIX
                            {
                            this_FLOAT_SUFFIX_4=(Token)match(input,RULE_FLOAT_SUFFIX,FOLLOW_RULE_FLOAT_SUFFIX_in_ruleFloatLiteral8222); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FLOAT_SUFFIX_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_FLOAT_SUFFIX_4, grammarAccess.getFloatLiteralAccess().getFLOAT_SUFFIXTerminalRuleCall_0_4()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3385:6: (kw= '.' this_decimal_digits_6= ruledecimal_digits (this_exponent_part_7= ruleexponent_part )? (this_FLOAT_SUFFIX_8= RULE_FLOAT_SUFFIX )? )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3385:6: (kw= '.' this_decimal_digits_6= ruledecimal_digits (this_exponent_part_7= ruleexponent_part )? (this_FLOAT_SUFFIX_8= RULE_FLOAT_SUFFIX )? )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3386:2: kw= '.' this_decimal_digits_6= ruledecimal_digits (this_exponent_part_7= ruleexponent_part )? (this_FLOAT_SUFFIX_8= RULE_FLOAT_SUFFIX )?
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleFloatLiteral8250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatLiteralAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFloatLiteralAccess().getDecimal_digitsParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruledecimal_digits_in_ruleFloatLiteral8272);
                    this_decimal_digits_6=ruledecimal_digits();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_decimal_digits_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3402:1: (this_exponent_part_7= ruleexponent_part )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==93) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3403:5: this_exponent_part_7= ruleexponent_part
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatLiteralAccess().getExponent_partParserRuleCall_1_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleexponent_part_in_ruleFloatLiteral8300);
                            this_exponent_part_7=ruleexponent_part();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_exponent_part_7);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3413:3: (this_FLOAT_SUFFIX_8= RULE_FLOAT_SUFFIX )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==RULE_FLOAT_SUFFIX) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3413:8: this_FLOAT_SUFFIX_8= RULE_FLOAT_SUFFIX
                            {
                            this_FLOAT_SUFFIX_8=(Token)match(input,RULE_FLOAT_SUFFIX,FOLLOW_RULE_FLOAT_SUFFIX_in_ruleFloatLiteral8323); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FLOAT_SUFFIX_8);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_FLOAT_SUFFIX_8, grammarAccess.getFloatLiteralAccess().getFLOAT_SUFFIXTerminalRuleCall_1_3()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, ruleFloatLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleForStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3428:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleForStatement_StartIndex = input.index();
        EObject iv_ruleForStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3429:2: (iv_ruleForStatement= ruleForStatement EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3430:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_ruleForStatement_in_entryRuleForStatement8371);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForStatement8381); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, entryRuleForStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3437:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_declaration_2_0= ruleVariableDeclaration ) ) | ( ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_for_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_for_expression3_8_0= ruleExpression ) )? otherlv_9= ';' otherlv_10= ')' ( (lv_statement_11_0= ruleStatement ) ) ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;
        int ruleForStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_variable_declaration_2_0 = null;

        EObject lv_for_expression1_3_0 = null;

        EObject lv_for_expression2_6_0 = null;

        EObject lv_for_expression3_8_0 = null;

        EObject lv_statement_11_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3440:28: ( (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_declaration_2_0= ruleVariableDeclaration ) ) | ( ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_for_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_for_expression3_8_0= ruleExpression ) )? otherlv_9= ';' otherlv_10= ')' ( (lv_statement_11_0= ruleStatement ) ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3441:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_declaration_2_0= ruleVariableDeclaration ) ) | ( ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_for_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_for_expression3_8_0= ruleExpression ) )? otherlv_9= ';' otherlv_10= ')' ( (lv_statement_11_0= ruleStatement ) ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3441:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_declaration_2_0= ruleVariableDeclaration ) ) | ( ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_for_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_for_expression3_8_0= ruleExpression ) )? otherlv_9= ';' otherlv_10= ')' ( (lv_statement_11_0= ruleStatement ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3441:3: otherlv_0= 'for' otherlv_1= '(' ( ( (lv_variable_declaration_2_0= ruleVariableDeclaration ) ) | ( ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';' ) | otherlv_5= ';' ) ( (lv_for_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_for_expression3_8_0= ruleExpression ) )? otherlv_9= ';' otherlv_10= ')' ( (lv_statement_11_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,96,FOLLOW_96_in_ruleForStatement8418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleForStatement8430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3449:1: ( ( (lv_variable_declaration_2_0= ruleVariableDeclaration ) ) | ( ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';' ) | otherlv_5= ';' )
            int alt80=3;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3449:2: ( (lv_variable_declaration_2_0= ruleVariableDeclaration ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3449:2: ( (lv_variable_declaration_2_0= ruleVariableDeclaration ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3450:1: (lv_variable_declaration_2_0= ruleVariableDeclaration )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3450:1: (lv_variable_declaration_2_0= ruleVariableDeclaration )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3451:3: lv_variable_declaration_2_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getVariable_declarationVariableDeclarationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleForStatement8452);
                    lv_variable_declaration_2_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"variable_declaration",
                              		lv_variable_declaration_2_0, 
                              		"VariableDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3468:6: ( ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';' )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3468:6: ( ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';' )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3468:7: ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';'
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3468:7: ( (lv_for_expression1_3_0= ruleExpression ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3469:1: (lv_for_expression1_3_0= ruleExpression )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3469:1: (lv_for_expression1_3_0= ruleExpression )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3470:3: lv_for_expression1_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getFor_expression1ExpressionParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForStatement8480);
                    lv_for_expression1_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"for_expression1",
                              		lv_for_expression1_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleForStatement8492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getSemicolonKeyword_2_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3491:7: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleForStatement8511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3495:2: ( (lv_for_expression2_6_0= ruleExpression ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=RULE_ID && LA81_0<=RULE_ZERO_TO_SEVEN)||(LA81_0>=18 && LA81_0<=19)||LA81_0==27||LA81_0==29||LA81_0==31||(LA81_0>=33 && LA81_0<=65)||(LA81_0>=67 && LA81_0<=73)||(LA81_0>=94 && LA81_0<=95)) ) {
                alt81=1;
            }
            else if ( (LA81_0==16) ) {
                int LA81_2 = input.LA(2);

                if ( (synpred134_InternalJavadsl()) ) {
                    alt81=1;
                }
            }
            switch (alt81) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3496:1: (lv_for_expression2_6_0= ruleExpression )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3496:1: (lv_for_expression2_6_0= ruleExpression )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3497:3: lv_for_expression2_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getFor_expression2ExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForStatement8533);
                    lv_for_expression2_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"for_expression2",
                              		lv_for_expression2_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleForStatement8546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getSemicolonKeyword_4());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3517:1: ( (lv_for_expression3_8_0= ruleExpression ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_ID && LA82_0<=RULE_ZERO_TO_SEVEN)||(LA82_0>=18 && LA82_0<=19)||LA82_0==27||LA82_0==29||LA82_0==31||(LA82_0>=33 && LA82_0<=65)||(LA82_0>=67 && LA82_0<=73)||(LA82_0>=94 && LA82_0<=95)) ) {
                alt82=1;
            }
            else if ( (LA82_0==16) ) {
                int LA82_2 = input.LA(2);

                if ( (synpred135_InternalJavadsl()) ) {
                    alt82=1;
                }
            }
            switch (alt82) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3518:1: (lv_for_expression3_8_0= ruleExpression )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3518:1: (lv_for_expression3_8_0= ruleExpression )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3519:3: lv_for_expression3_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForStatementAccess().getFor_expression3ExpressionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForStatement8567);
                    lv_for_expression3_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"for_expression3",
                              		lv_for_expression3_8_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleForStatement8580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getForStatementAccess().getSemicolonKeyword_6());
                  
            }
            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleForStatement8592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3543:1: ( (lv_statement_11_0= ruleStatement ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3544:1: (lv_statement_11_0= ruleStatement )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3544:1: (lv_statement_11_0= ruleStatement )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3545:3: lv_statement_11_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getStatementStatementParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleForStatement8613);
            lv_statement_11_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_11_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, ruleForStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleIfStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3569:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleIfStatement_StartIndex = input.index();
        EObject iv_ruleIfStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3570:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3571:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement8649);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement8659); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, entryRuleIfStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3578:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_statement_4_0= ruleStatement ) ) (otherlv_5= 'else' ( (lv_else_statement_6_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;
        int ruleIfStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_if_statement_4_0 = null;

        EObject lv_else_statement_6_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3581:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_statement_4_0= ruleStatement ) ) (otherlv_5= 'else' ( (lv_else_statement_6_0= ruleStatement ) ) )? ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3582:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_statement_4_0= ruleStatement ) ) (otherlv_5= 'else' ( (lv_else_statement_6_0= ruleStatement ) ) )? )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3582:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_statement_4_0= ruleStatement ) ) (otherlv_5= 'else' ( (lv_else_statement_6_0= ruleStatement ) ) )? )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3582:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_statement_4_0= ruleStatement ) ) (otherlv_5= 'else' ( (lv_else_statement_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleIfStatement8696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleIfStatement8708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3590:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3591:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3591:1: (lv_expression_2_0= ruleExpression )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3592:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfStatement8729);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleIfStatement8741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3612:1: ( (lv_if_statement_4_0= ruleStatement ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3613:1: (lv_if_statement_4_0= ruleStatement )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3613:1: (lv_if_statement_4_0= ruleStatement )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3614:3: lv_if_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getIf_statementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIfStatement8762);
            lv_if_statement_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"if_statement",
                      		lv_if_statement_4_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3630:2: (otherlv_5= 'else' ( (lv_else_statement_6_0= ruleStatement ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==98) ) {
                int LA83_1 = input.LA(2);

                if ( (synpred136_InternalJavadsl()) ) {
                    alt83=1;
                }
            }
            switch (alt83) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3630:4: otherlv_5= 'else' ( (lv_else_statement_6_0= ruleStatement ) )
                    {
                    otherlv_5=(Token)match(input,98,FOLLOW_98_in_ruleIfStatement8775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3634:1: ( (lv_else_statement_6_0= ruleStatement ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3635:1: (lv_else_statement_6_0= ruleStatement )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3635:1: (lv_else_statement_6_0= ruleStatement )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3636:3: lv_else_statement_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfStatementAccess().getElse_statementStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIfStatement8796);
                    lv_else_statement_6_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"else_statement",
                              		lv_else_statement_6_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, ruleIfStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3660:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleStatement_StartIndex = input.index();
        EObject iv_ruleStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3661:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3662:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement8834);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement8844); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, entryRuleStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3669:1: ruleStatement returns [EObject current=null] : ( ( (lv_variable_declaration_0_0= ruleVariableDeclaration ) ) | ( ( (lv_statement_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) | ( (lv_statement_block_3_0= ruleStatementBlock ) ) | ( (lv_if_statement_4_0= ruleIfStatement ) ) | ( (lv_do_statement_5_0= ruleDoStatement ) ) | ( (lv_while_statement_6_0= rulewhile_statement ) ) | ( (lv_for_statement_7_0= ruleForStatement ) ) | ( (lv_try_statement_8_0= ruleTryStatement ) ) | ( (lv_swith_statement_9_0= ruleSwitchStatement ) ) | ( () (otherlv_11= 'synchronized' otherlv_12= '(' ( (lv_sync_expression_13_0= ruleExpression ) ) otherlv_14= ')' ( (lv_sync_statement_15_0= ruleStatement ) ) ) ) | ( () (otherlv_17= 'return' ( (lv_return_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) ) | ( () (otherlv_21= 'throw' ( (lv_throw_expression_22_0= ruleExpression ) ) otherlv_23= ';' ) ) | ( () (this_ID_25= RULE_ID otherlv_26= ':' ( (lv_named_statement_27_0= ruleStatement ) ) ) ) | ( () (otherlv_29= 'break' (this_ID_30= RULE_ID )? otherlv_31= ';' ) ) | ( () (otherlv_33= 'continue' (this_ID_34= RULE_ID )? otherlv_35= ';' ) ) | ( () otherlv_37= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;
        int ruleStatement_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token this_ID_25=null;
        Token otherlv_26=null;
        Token otherlv_29=null;
        Token this_ID_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token this_ID_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        EObject lv_variable_declaration_0_0 = null;

        EObject lv_statement_expression_1_0 = null;

        EObject lv_statement_block_3_0 = null;

        EObject lv_if_statement_4_0 = null;

        EObject lv_do_statement_5_0 = null;

        EObject lv_while_statement_6_0 = null;

        EObject lv_for_statement_7_0 = null;

        EObject lv_try_statement_8_0 = null;

        EObject lv_swith_statement_9_0 = null;

        EObject lv_sync_expression_13_0 = null;

        EObject lv_sync_statement_15_0 = null;

        EObject lv_return_expression_18_0 = null;

        EObject lv_throw_expression_22_0 = null;

        EObject lv_named_statement_27_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3672:28: ( ( ( (lv_variable_declaration_0_0= ruleVariableDeclaration ) ) | ( ( (lv_statement_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) | ( (lv_statement_block_3_0= ruleStatementBlock ) ) | ( (lv_if_statement_4_0= ruleIfStatement ) ) | ( (lv_do_statement_5_0= ruleDoStatement ) ) | ( (lv_while_statement_6_0= rulewhile_statement ) ) | ( (lv_for_statement_7_0= ruleForStatement ) ) | ( (lv_try_statement_8_0= ruleTryStatement ) ) | ( (lv_swith_statement_9_0= ruleSwitchStatement ) ) | ( () (otherlv_11= 'synchronized' otherlv_12= '(' ( (lv_sync_expression_13_0= ruleExpression ) ) otherlv_14= ')' ( (lv_sync_statement_15_0= ruleStatement ) ) ) ) | ( () (otherlv_17= 'return' ( (lv_return_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) ) | ( () (otherlv_21= 'throw' ( (lv_throw_expression_22_0= ruleExpression ) ) otherlv_23= ';' ) ) | ( () (this_ID_25= RULE_ID otherlv_26= ':' ( (lv_named_statement_27_0= ruleStatement ) ) ) ) | ( () (otherlv_29= 'break' (this_ID_30= RULE_ID )? otherlv_31= ';' ) ) | ( () (otherlv_33= 'continue' (this_ID_34= RULE_ID )? otherlv_35= ';' ) ) | ( () otherlv_37= ';' ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3673:1: ( ( (lv_variable_declaration_0_0= ruleVariableDeclaration ) ) | ( ( (lv_statement_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) | ( (lv_statement_block_3_0= ruleStatementBlock ) ) | ( (lv_if_statement_4_0= ruleIfStatement ) ) | ( (lv_do_statement_5_0= ruleDoStatement ) ) | ( (lv_while_statement_6_0= rulewhile_statement ) ) | ( (lv_for_statement_7_0= ruleForStatement ) ) | ( (lv_try_statement_8_0= ruleTryStatement ) ) | ( (lv_swith_statement_9_0= ruleSwitchStatement ) ) | ( () (otherlv_11= 'synchronized' otherlv_12= '(' ( (lv_sync_expression_13_0= ruleExpression ) ) otherlv_14= ')' ( (lv_sync_statement_15_0= ruleStatement ) ) ) ) | ( () (otherlv_17= 'return' ( (lv_return_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) ) | ( () (otherlv_21= 'throw' ( (lv_throw_expression_22_0= ruleExpression ) ) otherlv_23= ';' ) ) | ( () (this_ID_25= RULE_ID otherlv_26= ':' ( (lv_named_statement_27_0= ruleStatement ) ) ) ) | ( () (otherlv_29= 'break' (this_ID_30= RULE_ID )? otherlv_31= ';' ) ) | ( () (otherlv_33= 'continue' (this_ID_34= RULE_ID )? otherlv_35= ';' ) ) | ( () otherlv_37= ';' ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3673:1: ( ( (lv_variable_declaration_0_0= ruleVariableDeclaration ) ) | ( ( (lv_statement_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) | ( (lv_statement_block_3_0= ruleStatementBlock ) ) | ( (lv_if_statement_4_0= ruleIfStatement ) ) | ( (lv_do_statement_5_0= ruleDoStatement ) ) | ( (lv_while_statement_6_0= rulewhile_statement ) ) | ( (lv_for_statement_7_0= ruleForStatement ) ) | ( (lv_try_statement_8_0= ruleTryStatement ) ) | ( (lv_swith_statement_9_0= ruleSwitchStatement ) ) | ( () (otherlv_11= 'synchronized' otherlv_12= '(' ( (lv_sync_expression_13_0= ruleExpression ) ) otherlv_14= ')' ( (lv_sync_statement_15_0= ruleStatement ) ) ) ) | ( () (otherlv_17= 'return' ( (lv_return_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) ) | ( () (otherlv_21= 'throw' ( (lv_throw_expression_22_0= ruleExpression ) ) otherlv_23= ';' ) ) | ( () (this_ID_25= RULE_ID otherlv_26= ':' ( (lv_named_statement_27_0= ruleStatement ) ) ) ) | ( () (otherlv_29= 'break' (this_ID_30= RULE_ID )? otherlv_31= ';' ) ) | ( () (otherlv_33= 'continue' (this_ID_34= RULE_ID )? otherlv_35= ';' ) ) | ( () otherlv_37= ';' ) )
            int alt87=16;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3673:2: ( (lv_variable_declaration_0_0= ruleVariableDeclaration ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3673:2: ( (lv_variable_declaration_0_0= ruleVariableDeclaration ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3674:1: (lv_variable_declaration_0_0= ruleVariableDeclaration )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3674:1: (lv_variable_declaration_0_0= ruleVariableDeclaration )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3675:3: lv_variable_declaration_0_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getVariable_declarationVariableDeclarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStatement8890);
                    lv_variable_declaration_0_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"variable_declaration",
                              		lv_variable_declaration_0_0, 
                              		"VariableDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3692:6: ( ( (lv_statement_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3692:6: ( ( (lv_statement_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3692:7: ( (lv_statement_expression_1_0= ruleExpression ) ) otherlv_2= ';'
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3692:7: ( (lv_statement_expression_1_0= ruleExpression ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3693:1: (lv_statement_expression_1_0= ruleExpression )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3693:1: (lv_statement_expression_1_0= ruleExpression )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3694:3: lv_statement_expression_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getStatement_expressionExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement8918);
                    lv_statement_expression_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"statement_expression",
                              		lv_statement_expression_1_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleStatement8930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3715:6: ( (lv_statement_block_3_0= ruleStatementBlock ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3715:6: ( (lv_statement_block_3_0= ruleStatementBlock ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3716:1: (lv_statement_block_3_0= ruleStatementBlock )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3716:1: (lv_statement_block_3_0= ruleStatementBlock )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3717:3: lv_statement_block_3_0= ruleStatementBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getStatement_blockStatementBlockParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementBlock_in_ruleStatement8958);
                    lv_statement_block_3_0=ruleStatementBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"statement_block",
                              		lv_statement_block_3_0, 
                              		"StatementBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3734:6: ( (lv_if_statement_4_0= ruleIfStatement ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3734:6: ( (lv_if_statement_4_0= ruleIfStatement ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3735:1: (lv_if_statement_4_0= ruleIfStatement )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3735:1: (lv_if_statement_4_0= ruleIfStatement )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3736:3: lv_if_statement_4_0= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getIf_statementIfStatementParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleStatement8985);
                    lv_if_statement_4_0=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"if_statement",
                              		lv_if_statement_4_0, 
                              		"IfStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3753:6: ( (lv_do_statement_5_0= ruleDoStatement ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3753:6: ( (lv_do_statement_5_0= ruleDoStatement ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3754:1: (lv_do_statement_5_0= ruleDoStatement )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3754:1: (lv_do_statement_5_0= ruleDoStatement )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3755:3: lv_do_statement_5_0= ruleDoStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDo_statementDoStatementParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoStatement_in_ruleStatement9012);
                    lv_do_statement_5_0=ruleDoStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"do_statement",
                              		lv_do_statement_5_0, 
                              		"DoStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3772:6: ( (lv_while_statement_6_0= rulewhile_statement ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3772:6: ( (lv_while_statement_6_0= rulewhile_statement ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3773:1: (lv_while_statement_6_0= rulewhile_statement )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3773:1: (lv_while_statement_6_0= rulewhile_statement )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3774:3: lv_while_statement_6_0= rulewhile_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getWhile_statementWhile_statementParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulewhile_statement_in_ruleStatement9039);
                    lv_while_statement_6_0=rulewhile_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"while_statement",
                              		lv_while_statement_6_0, 
                              		"while_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3791:6: ( (lv_for_statement_7_0= ruleForStatement ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3791:6: ( (lv_for_statement_7_0= ruleForStatement ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3792:1: (lv_for_statement_7_0= ruleForStatement )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3792:1: (lv_for_statement_7_0= ruleForStatement )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3793:3: lv_for_statement_7_0= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getFor_statementForStatementParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForStatement_in_ruleStatement9066);
                    lv_for_statement_7_0=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"for_statement",
                              		lv_for_statement_7_0, 
                              		"ForStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3810:6: ( (lv_try_statement_8_0= ruleTryStatement ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3810:6: ( (lv_try_statement_8_0= ruleTryStatement ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3811:1: (lv_try_statement_8_0= ruleTryStatement )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3811:1: (lv_try_statement_8_0= ruleTryStatement )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3812:3: lv_try_statement_8_0= ruleTryStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getTry_statementTryStatementParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTryStatement_in_ruleStatement9093);
                    lv_try_statement_8_0=ruleTryStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"try_statement",
                              		lv_try_statement_8_0, 
                              		"TryStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3829:6: ( (lv_swith_statement_9_0= ruleSwitchStatement ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3829:6: ( (lv_swith_statement_9_0= ruleSwitchStatement ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3830:1: (lv_swith_statement_9_0= ruleSwitchStatement )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3830:1: (lv_swith_statement_9_0= ruleSwitchStatement )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3831:3: lv_swith_statement_9_0= ruleSwitchStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSwith_statementSwitchStatementParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitchStatement_in_ruleStatement9120);
                    lv_swith_statement_9_0=ruleSwitchStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"swith_statement",
                              		lv_swith_statement_9_0, 
                              		"SwitchStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3848:6: ( () (otherlv_11= 'synchronized' otherlv_12= '(' ( (lv_sync_expression_13_0= ruleExpression ) ) otherlv_14= ')' ( (lv_sync_statement_15_0= ruleStatement ) ) ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3848:6: ( () (otherlv_11= 'synchronized' otherlv_12= '(' ( (lv_sync_expression_13_0= ruleExpression ) ) otherlv_14= ')' ( (lv_sync_statement_15_0= ruleStatement ) ) ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3848:7: () (otherlv_11= 'synchronized' otherlv_12= '(' ( (lv_sync_expression_13_0= ruleExpression ) ) otherlv_14= ')' ( (lv_sync_statement_15_0= ruleStatement ) ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3848:7: ()
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3849:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_9_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3857:2: (otherlv_11= 'synchronized' otherlv_12= '(' ( (lv_sync_expression_13_0= ruleExpression ) ) otherlv_14= ')' ( (lv_sync_statement_15_0= ruleStatement ) ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3857:4: otherlv_11= 'synchronized' otherlv_12= '(' ( (lv_sync_expression_13_0= ruleExpression ) ) otherlv_14= ')' ( (lv_sync_statement_15_0= ruleStatement ) )
                    {
                    otherlv_11=(Token)match(input,87,FOLLOW_87_in_ruleStatement9152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getSynchronizedKeyword_9_1_0());
                          
                    }
                    otherlv_12=(Token)match(input,27,FOLLOW_27_in_ruleStatement9164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_9_1_1());
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3865:1: ( (lv_sync_expression_13_0= ruleExpression ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3866:1: (lv_sync_expression_13_0= ruleExpression )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3866:1: (lv_sync_expression_13_0= ruleExpression )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3867:3: lv_sync_expression_13_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSync_expressionExpressionParserRuleCall_9_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement9185);
                    lv_sync_expression_13_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"sync_expression",
                              		lv_sync_expression_13_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleStatement9197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getStatementAccess().getRightParenthesisKeyword_9_1_3());
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3887:1: ( (lv_sync_statement_15_0= ruleStatement ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3888:1: (lv_sync_statement_15_0= ruleStatement )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3888:1: (lv_sync_statement_15_0= ruleStatement )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3889:3: lv_sync_statement_15_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSync_statementStatementParserRuleCall_9_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement9218);
                    lv_sync_statement_15_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"sync_statement",
                              		lv_sync_statement_15_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3906:6: ( () (otherlv_17= 'return' ( (lv_return_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3906:6: ( () (otherlv_17= 'return' ( (lv_return_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3906:7: () (otherlv_17= 'return' ( (lv_return_expression_18_0= ruleExpression ) )? otherlv_19= ';' )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3906:7: ()
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3907:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_10_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3915:2: (otherlv_17= 'return' ( (lv_return_expression_18_0= ruleExpression ) )? otherlv_19= ';' )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3915:4: otherlv_17= 'return' ( (lv_return_expression_18_0= ruleExpression ) )? otherlv_19= ';'
                    {
                    otherlv_17=(Token)match(input,99,FOLLOW_99_in_ruleStatement9252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getStatementAccess().getReturnKeyword_10_1_0());
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3919:1: ( (lv_return_expression_18_0= ruleExpression ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( ((LA84_0>=RULE_ID && LA84_0<=RULE_ZERO_TO_SEVEN)||(LA84_0>=18 && LA84_0<=19)||LA84_0==27||LA84_0==29||LA84_0==31||(LA84_0>=33 && LA84_0<=65)||(LA84_0>=67 && LA84_0<=73)||(LA84_0>=94 && LA84_0<=95)) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==16) ) {
                        int LA84_2 = input.LA(2);

                        if ( (synpred147_InternalJavadsl()) ) {
                            alt84=1;
                        }
                    }
                    switch (alt84) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3920:1: (lv_return_expression_18_0= ruleExpression )
                            {
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3920:1: (lv_return_expression_18_0= ruleExpression )
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3921:3: lv_return_expression_18_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getReturn_expressionExpressionParserRuleCall_10_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleStatement9273);
                            lv_return_expression_18_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"return_expression",
                                      		lv_return_expression_18_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleStatement9286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getStatementAccess().getSemicolonKeyword_10_1_2());
                          
                    }

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3942:6: ( () (otherlv_21= 'throw' ( (lv_throw_expression_22_0= ruleExpression ) ) otherlv_23= ';' ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3942:6: ( () (otherlv_21= 'throw' ( (lv_throw_expression_22_0= ruleExpression ) ) otherlv_23= ';' ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3942:7: () (otherlv_21= 'throw' ( (lv_throw_expression_22_0= ruleExpression ) ) otherlv_23= ';' )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3942:7: ()
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3943:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_11_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3951:2: (otherlv_21= 'throw' ( (lv_throw_expression_22_0= ruleExpression ) ) otherlv_23= ';' )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3951:4: otherlv_21= 'throw' ( (lv_throw_expression_22_0= ruleExpression ) ) otherlv_23= ';'
                    {
                    otherlv_21=(Token)match(input,100,FOLLOW_100_in_ruleStatement9320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getStatementAccess().getThrowKeyword_11_1_0());
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3955:1: ( (lv_throw_expression_22_0= ruleExpression ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3956:1: (lv_throw_expression_22_0= ruleExpression )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3956:1: (lv_throw_expression_22_0= ruleExpression )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3957:3: lv_throw_expression_22_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getThrow_expressionExpressionParserRuleCall_11_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement9341);
                    lv_throw_expression_22_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"throw_expression",
                              		lv_throw_expression_22_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleStatement9353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getStatementAccess().getSemicolonKeyword_11_1_2());
                          
                    }

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3978:6: ( () (this_ID_25= RULE_ID otherlv_26= ':' ( (lv_named_statement_27_0= ruleStatement ) ) ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3978:6: ( () (this_ID_25= RULE_ID otherlv_26= ':' ( (lv_named_statement_27_0= ruleStatement ) ) ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3978:7: () (this_ID_25= RULE_ID otherlv_26= ':' ( (lv_named_statement_27_0= ruleStatement ) ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3978:7: ()
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3979:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_12_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3987:2: (this_ID_25= RULE_ID otherlv_26= ':' ( (lv_named_statement_27_0= ruleStatement ) ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3987:3: this_ID_25= RULE_ID otherlv_26= ':' ( (lv_named_statement_27_0= ruleStatement ) )
                    {
                    this_ID_25=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement9386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_25, grammarAccess.getStatementAccess().getIDTerminalRuleCall_12_1_0()); 
                          
                    }
                    otherlv_26=(Token)match(input,66,FOLLOW_66_in_ruleStatement9397); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getStatementAccess().getColonKeyword_12_1_1());
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3995:1: ( (lv_named_statement_27_0= ruleStatement ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3996:1: (lv_named_statement_27_0= ruleStatement )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3996:1: (lv_named_statement_27_0= ruleStatement )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3997:3: lv_named_statement_27_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getNamed_statementStatementParserRuleCall_12_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement9418);
                    lv_named_statement_27_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"named_statement",
                              		lv_named_statement_27_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4014:6: ( () (otherlv_29= 'break' (this_ID_30= RULE_ID )? otherlv_31= ';' ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4014:6: ( () (otherlv_29= 'break' (this_ID_30= RULE_ID )? otherlv_31= ';' ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4014:7: () (otherlv_29= 'break' (this_ID_30= RULE_ID )? otherlv_31= ';' )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4014:7: ()
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4015:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_13_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4023:2: (otherlv_29= 'break' (this_ID_30= RULE_ID )? otherlv_31= ';' )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4023:4: otherlv_29= 'break' (this_ID_30= RULE_ID )? otherlv_31= ';'
                    {
                    otherlv_29=(Token)match(input,101,FOLLOW_101_in_ruleStatement9452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getStatementAccess().getBreakKeyword_13_1_0());
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4027:1: (this_ID_30= RULE_ID )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_ID) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4027:2: this_ID_30= RULE_ID
                            {
                            this_ID_30=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement9464); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ID_30, grammarAccess.getStatementAccess().getIDTerminalRuleCall_13_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    otherlv_31=(Token)match(input,16,FOLLOW_16_in_ruleStatement9477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getStatementAccess().getSemicolonKeyword_13_1_2());
                          
                    }

                    }


                    }


                    }
                    break;
                case 15 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4036:6: ( () (otherlv_33= 'continue' (this_ID_34= RULE_ID )? otherlv_35= ';' ) )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4036:6: ( () (otherlv_33= 'continue' (this_ID_34= RULE_ID )? otherlv_35= ';' ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4036:7: () (otherlv_33= 'continue' (this_ID_34= RULE_ID )? otherlv_35= ';' )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4036:7: ()
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4037:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_14_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4045:2: (otherlv_33= 'continue' (this_ID_34= RULE_ID )? otherlv_35= ';' )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4045:4: otherlv_33= 'continue' (this_ID_34= RULE_ID )? otherlv_35= ';'
                    {
                    otherlv_33=(Token)match(input,102,FOLLOW_102_in_ruleStatement9511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_33, grammarAccess.getStatementAccess().getContinueKeyword_14_1_0());
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4049:1: (this_ID_34= RULE_ID )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==RULE_ID) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4049:2: this_ID_34= RULE_ID
                            {
                            this_ID_34=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement9523); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ID_34, grammarAccess.getStatementAccess().getIDTerminalRuleCall_14_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    otherlv_35=(Token)match(input,16,FOLLOW_16_in_ruleStatement9536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getStatementAccess().getSemicolonKeyword_14_1_2());
                          
                    }

                    }


                    }


                    }
                    break;
                case 16 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4058:6: ( () otherlv_37= ';' )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4058:6: ( () otherlv_37= ';' )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4058:7: () otherlv_37= ';'
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4058:7: ()
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4059:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_15_0(),
                                  current);
                          
                    }

                    }

                    otherlv_37=(Token)match(input,16,FOLLOW_16_in_ruleStatement9569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getStatementAccess().getSemicolonKeyword_15_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, ruleStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSwitchStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4079:1: entryRuleSwitchStatement returns [EObject current=null] : iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
    public final EObject entryRuleSwitchStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleSwitchStatement_StartIndex = input.index();
        EObject iv_ruleSwitchStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4080:2: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4081:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement9606);
            iv_ruleSwitchStatement=ruleSwitchStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchStatement9616); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, entryRuleSwitchStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchStatement"


    // $ANTLR start "ruleSwitchStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4088:1: ruleSwitchStatement returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (lv_switch_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_case_expressions_6_0= ruleExpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_statements_10_0= ruleStatement ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleSwitchStatement() throws RecognitionException {
        EObject current = null;
        int ruleSwitchStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_switch_expression_2_0 = null;

        EObject lv_case_expressions_6_0 = null;

        EObject lv_statements_10_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4091:28: ( (otherlv_0= 'switch' otherlv_1= '(' ( (lv_switch_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_case_expressions_6_0= ruleExpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_statements_10_0= ruleStatement ) ) )* otherlv_11= '}' ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4092:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_switch_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_case_expressions_6_0= ruleExpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_statements_10_0= ruleStatement ) ) )* otherlv_11= '}' )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4092:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_switch_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_case_expressions_6_0= ruleExpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_statements_10_0= ruleStatement ) ) )* otherlv_11= '}' )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4092:3: otherlv_0= 'switch' otherlv_1= '(' ( (lv_switch_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (otherlv_5= 'case' ( (lv_case_expressions_6_0= ruleExpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_statements_10_0= ruleStatement ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,103,FOLLOW_103_in_ruleSwitchStatement9653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleSwitchStatement9665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4100:1: ( (lv_switch_expression_2_0= ruleExpression ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4101:1: (lv_switch_expression_2_0= ruleExpression )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4101:1: (lv_switch_expression_2_0= ruleExpression )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4102:3: lv_switch_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getSwitch_expressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitchStatement9686);
            lv_switch_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
              	        }
                     		set(
                     			current, 
                     			"switch_expression",
                      		lv_switch_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleSwitchStatement9698); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleSwitchStatement9710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4126:1: ( (otherlv_5= 'case' ( (lv_case_expressions_6_0= ruleExpression ) ) otherlv_7= ':' ) | (otherlv_8= 'default' otherlv_9= ':' ) | ( (lv_statements_10_0= ruleStatement ) ) )*
            loop88:
            do {
                int alt88=4;
                switch ( input.LA(1) ) {
                case 104:
                    {
                    alt88=1;
                    }
                    break;
                case 105:
                    {
                    alt88=2;
                    }
                    break;
                case RULE_ID:
                case RULE_STRING:
                case RULE_INT:
                case RULE_NUMBER_SUFFIX:
                case RULE_HEXA:
                case RULE_ZERO_TO_SEVEN:
                case 16:
                case 18:
                case 19:
                case 23:
                case 26:
                case 27:
                case 29:
                case 31:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 94:
                case 95:
                case 96:
                case 97:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 106:
                    {
                    alt88=3;
                    }
                    break;

                }

                switch (alt88) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4126:2: (otherlv_5= 'case' ( (lv_case_expressions_6_0= ruleExpression ) ) otherlv_7= ':' )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4126:2: (otherlv_5= 'case' ( (lv_case_expressions_6_0= ruleExpression ) ) otherlv_7= ':' )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4126:4: otherlv_5= 'case' ( (lv_case_expressions_6_0= ruleExpression ) ) otherlv_7= ':'
            	    {
            	    otherlv_5=(Token)match(input,104,FOLLOW_104_in_ruleSwitchStatement9724); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getSwitchStatementAccess().getCaseKeyword_5_0_0());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4130:1: ( (lv_case_expressions_6_0= ruleExpression ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4131:1: (lv_case_expressions_6_0= ruleExpression )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4131:1: (lv_case_expressions_6_0= ruleExpression )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4132:3: lv_case_expressions_6_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCase_expressionsExpressionParserRuleCall_5_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSwitchStatement9745);
            	    lv_case_expressions_6_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"case_expressions",
            	              		lv_case_expressions_6_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,66,FOLLOW_66_in_ruleSwitchStatement9757); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getSwitchStatementAccess().getColonKeyword_5_0_2());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4153:6: (otherlv_8= 'default' otherlv_9= ':' )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4153:6: (otherlv_8= 'default' otherlv_9= ':' )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4153:8: otherlv_8= 'default' otherlv_9= ':'
            	    {
            	    otherlv_8=(Token)match(input,105,FOLLOW_105_in_ruleSwitchStatement9777); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getSwitchStatementAccess().getDefaultKeyword_5_1_0());
            	          
            	    }
            	    otherlv_9=(Token)match(input,66,FOLLOW_66_in_ruleSwitchStatement9789); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getSwitchStatementAccess().getColonKeyword_5_1_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4162:6: ( (lv_statements_10_0= ruleStatement ) )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4162:6: ( (lv_statements_10_0= ruleStatement ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4163:1: (lv_statements_10_0= ruleStatement )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4163:1: (lv_statements_10_0= ruleStatement )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4164:3: lv_statements_10_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getStatementsStatementParserRuleCall_5_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleSwitchStatement9817);
            	    lv_statements_10_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_10_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleSwitchStatement9831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getSwitchStatementAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 98, ruleSwitchStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSwitchStatement"


    // $ANTLR start "entryRuleTryStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4192:1: entryRuleTryStatement returns [EObject current=null] : iv_ruleTryStatement= ruleTryStatement EOF ;
    public final EObject entryRuleTryStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleTryStatement_StartIndex = input.index();
        EObject iv_ruleTryStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4193:2: (iv_ruleTryStatement= ruleTryStatement EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4194:2: iv_ruleTryStatement= ruleTryStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTryStatementRule()); 
            }
            pushFollow(FOLLOW_ruleTryStatement_in_entryRuleTryStatement9867);
            iv_ruleTryStatement=ruleTryStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTryStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTryStatement9877); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, entryRuleTryStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTryStatement"


    // $ANTLR start "ruleTryStatement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4201:1: ruleTryStatement returns [EObject current=null] : (otherlv_0= 'try' ( (lv_try_statement_1_0= ruleStatement ) ) (otherlv_2= 'catch' otherlv_3= '(' ( (lv_paramenters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catch_statements_6_0= ruleStatement ) ) )* (otherlv_7= 'finally' ( (lv_finally_statement_8_0= ruleStatement ) ) )? ) ;
    public final EObject ruleTryStatement() throws RecognitionException {
        EObject current = null;
        int ruleTryStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_try_statement_1_0 = null;

        EObject lv_paramenters_4_0 = null;

        EObject lv_catch_statements_6_0 = null;

        EObject lv_finally_statement_8_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4204:28: ( (otherlv_0= 'try' ( (lv_try_statement_1_0= ruleStatement ) ) (otherlv_2= 'catch' otherlv_3= '(' ( (lv_paramenters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catch_statements_6_0= ruleStatement ) ) )* (otherlv_7= 'finally' ( (lv_finally_statement_8_0= ruleStatement ) ) )? ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4205:1: (otherlv_0= 'try' ( (lv_try_statement_1_0= ruleStatement ) ) (otherlv_2= 'catch' otherlv_3= '(' ( (lv_paramenters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catch_statements_6_0= ruleStatement ) ) )* (otherlv_7= 'finally' ( (lv_finally_statement_8_0= ruleStatement ) ) )? )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4205:1: (otherlv_0= 'try' ( (lv_try_statement_1_0= ruleStatement ) ) (otherlv_2= 'catch' otherlv_3= '(' ( (lv_paramenters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catch_statements_6_0= ruleStatement ) ) )* (otherlv_7= 'finally' ( (lv_finally_statement_8_0= ruleStatement ) ) )? )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4205:3: otherlv_0= 'try' ( (lv_try_statement_1_0= ruleStatement ) ) (otherlv_2= 'catch' otherlv_3= '(' ( (lv_paramenters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catch_statements_6_0= ruleStatement ) ) )* (otherlv_7= 'finally' ( (lv_finally_statement_8_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,106,FOLLOW_106_in_ruleTryStatement9914); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTryStatementAccess().getTryKeyword_0());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4209:1: ( (lv_try_statement_1_0= ruleStatement ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4210:1: (lv_try_statement_1_0= ruleStatement )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4210:1: (lv_try_statement_1_0= ruleStatement )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4211:3: lv_try_statement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTryStatementAccess().getTry_statementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleTryStatement9935);
            lv_try_statement_1_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTryStatementRule());
              	        }
                     		set(
                     			current, 
                     			"try_statement",
                      		lv_try_statement_1_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4227:2: (otherlv_2= 'catch' otherlv_3= '(' ( (lv_paramenters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catch_statements_6_0= ruleStatement ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==107) ) {
                    int LA89_2 = input.LA(2);

                    if ( (synpred158_InternalJavadsl()) ) {
                        alt89=1;
                    }


                }


                switch (alt89) {
            	case 1 :
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4227:4: otherlv_2= 'catch' otherlv_3= '(' ( (lv_paramenters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catch_statements_6_0= ruleStatement ) )
            	    {
            	    otherlv_2=(Token)match(input,107,FOLLOW_107_in_ruleTryStatement9948); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTryStatementAccess().getCatchKeyword_2_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleTryStatement9960); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTryStatementAccess().getLeftParenthesisKeyword_2_1());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4235:1: ( (lv_paramenters_4_0= ruleParameter ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4236:1: (lv_paramenters_4_0= ruleParameter )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4236:1: (lv_paramenters_4_0= ruleParameter )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4237:3: lv_paramenters_4_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTryStatementAccess().getParamentersParameterParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleTryStatement9981);
            	    lv_paramenters_4_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTryStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"paramenters",
            	              		lv_paramenters_4_0, 
            	              		"Parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleTryStatement9993); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getTryStatementAccess().getRightParenthesisKeyword_2_3());
            	          
            	    }
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4257:1: ( (lv_catch_statements_6_0= ruleStatement ) )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4258:1: (lv_catch_statements_6_0= ruleStatement )
            	    {
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4258:1: (lv_catch_statements_6_0= ruleStatement )
            	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4259:3: lv_catch_statements_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTryStatementAccess().getCatch_statementsStatementParserRuleCall_2_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleTryStatement10014);
            	    lv_catch_statements_6_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTryStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"catch_statements",
            	              		lv_catch_statements_6_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4275:4: (otherlv_7= 'finally' ( (lv_finally_statement_8_0= ruleStatement ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==108) ) {
                int LA90_1 = input.LA(2);

                if ( (synpred159_InternalJavadsl()) ) {
                    alt90=1;
                }
            }
            switch (alt90) {
                case 1 :
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4275:6: otherlv_7= 'finally' ( (lv_finally_statement_8_0= ruleStatement ) )
                    {
                    otherlv_7=(Token)match(input,108,FOLLOW_108_in_ruleTryStatement10029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTryStatementAccess().getFinallyKeyword_3_0());
                          
                    }
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4279:1: ( (lv_finally_statement_8_0= ruleStatement ) )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4280:1: (lv_finally_statement_8_0= ruleStatement )
                    {
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4280:1: (lv_finally_statement_8_0= ruleStatement )
                    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4281:3: lv_finally_statement_8_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTryStatementAccess().getFinally_statementStatementParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleTryStatement10050);
                    lv_finally_statement_8_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTryStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"finally_statement",
                              		lv_finally_statement_8_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, ruleTryStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTryStatement"


    // $ANTLR start "entryRulewhile_statement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4305:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;
        int entryRulewhile_statement_StartIndex = input.index();
        EObject iv_rulewhile_statement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4306:2: (iv_rulewhile_statement= rulewhile_statement EOF )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4307:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_statementRule()); 
            }
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement10088);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulewhile_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement10098); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, entryRulewhile_statement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulewhile_statement"


    // $ANTLR start "rulewhile_statement"
    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4314:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;
        int rulewhile_statement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4317:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4318:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4318:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4318:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,92,FOLLOW_92_in_rulewhile_statement10135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_rulewhile_statement10147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhile_statementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4326:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4327:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4327:1: (lv_expression_2_0= ruleExpression )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4328:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_rulewhile_statement10168);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_rulewhile_statement10180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhile_statementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4348:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4349:1: (lv_statement_4_0= ruleStatement )
            {
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4349:1: (lv_statement_4_0= ruleStatement )
            // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4350:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_rulewhile_statement10201);
            lv_statement_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_statementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_4_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 102, rulewhile_statement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulewhile_statement"

    // $ANTLR start synpred5_InternalJavadsl
    public final void synpred5_InternalJavadsl_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_ID_2=null;

        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:350:2: (kw= '.' this_ID_2= RULE_ID )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:350:2: kw= '.' this_ID_2= RULE_ID
        {
        kw=(Token)match(input,18,FOLLOW_18_in_synpred5_InternalJavadsl791); if (state.failed) return ;
        this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred5_InternalJavadsl806); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalJavadsl

    // $ANTLR start synpred35_InternalJavadsl
    public final void synpred35_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        EObject lv_variable_initializers_4_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1341:4: (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1341:4: otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) )
        {
        otherlv_3=(Token)match(input,31,FOLLOW_31_in_synpred35_InternalJavadsl3060); if (state.failed) return ;
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1345:1: ( (lv_variable_initializers_4_0= ruleVariableInitializer ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1346:1: (lv_variable_initializers_4_0= ruleVariableInitializer )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1346:1: (lv_variable_initializers_4_0= ruleVariableInitializer )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1347:3: lv_variable_initializers_4_0= ruleVariableInitializer
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getVariableInitializerAccess().getVariable_initializersVariableInitializerParserRuleCall_1_1_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleVariableInitializer_in_synpred35_InternalJavadsl3081);
        lv_variable_initializers_4_0=ruleVariableInitializer();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred35_InternalJavadsl

    // $ANTLR start synpred37_InternalJavadsl
    public final void synpred37_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_variable_initializer_2_0 = null;

        EObject lv_variable_initializers_4_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1323:2: ( ( (lv_variable_initializer_2_0= ruleVariableInitializer ) ) (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )* (otherlv_5= ',' )? )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1323:2: ( (lv_variable_initializer_2_0= ruleVariableInitializer ) ) (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )* (otherlv_5= ',' )?
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1323:2: ( (lv_variable_initializer_2_0= ruleVariableInitializer ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1324:1: (lv_variable_initializer_2_0= ruleVariableInitializer )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1324:1: (lv_variable_initializer_2_0= ruleVariableInitializer )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1325:3: lv_variable_initializer_2_0= ruleVariableInitializer
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getVariableInitializerAccess().getVariable_initializerVariableInitializerParserRuleCall_1_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleVariableInitializer_in_synpred37_InternalJavadsl3047);
        lv_variable_initializer_2_0=ruleVariableInitializer();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1341:2: (otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) ) )*
        loop94:
        do {
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==31) ) {
                int LA94_1 = input.LA(2);

                if ( (synpred35_InternalJavadsl()) ) {
                    alt94=1;
                }


            }


            switch (alt94) {
        	case 1 :
        	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1341:4: otherlv_3= ',' ( (lv_variable_initializers_4_0= ruleVariableInitializer ) )
        	    {
        	    otherlv_3=(Token)match(input,31,FOLLOW_31_in_synpred37_InternalJavadsl3060); if (state.failed) return ;
        	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1345:1: ( (lv_variable_initializers_4_0= ruleVariableInitializer ) )
        	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1346:1: (lv_variable_initializers_4_0= ruleVariableInitializer )
        	    {
        	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1346:1: (lv_variable_initializers_4_0= ruleVariableInitializer )
        	    // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1347:3: lv_variable_initializers_4_0= ruleVariableInitializer
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getVariableInitializerAccess().getVariable_initializersVariableInitializerParserRuleCall_1_1_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleVariableInitializer_in_synpred37_InternalJavadsl3081);
        	    lv_variable_initializers_4_0=ruleVariableInitializer();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop94;
            }
        } while (true);

        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1363:4: (otherlv_5= ',' )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==31) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1363:6: otherlv_5= ','
                {
                otherlv_5=(Token)match(input,31,FOLLOW_31_in_synpred37_InternalJavadsl3096); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred37_InternalJavadsl

    // $ANTLR start synpred41_InternalJavadsl
    public final void synpred41_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_BitExpression_3 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1472:2: ( ( (otherlv_0= '-' | otherlv_1= '++' | otherlv_2= '--' ) this_BitExpression_3= ruleBitExpression ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1472:2: ( (otherlv_0= '-' | otherlv_1= '++' | otherlv_2= '--' ) this_BitExpression_3= ruleBitExpression )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1472:2: ( (otherlv_0= '-' | otherlv_1= '++' | otherlv_2= '--' ) this_BitExpression_3= ruleBitExpression )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1472:3: (otherlv_0= '-' | otherlv_1= '++' | otherlv_2= '--' ) this_BitExpression_3= ruleBitExpression
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1472:3: (otherlv_0= '-' | otherlv_1= '++' | otherlv_2= '--' )
        int alt96=3;
        switch ( input.LA(1) ) {
        case 33:
            {
            alt96=1;
            }
            break;
        case 34:
            {
            alt96=2;
            }
            break;
        case 35:
            {
            alt96=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 96, 0, input);

            throw nvae;
        }

        switch (alt96) {
            case 1 :
                // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1472:5: otherlv_0= '-'
                {
                otherlv_0=(Token)match(input,33,FOLLOW_33_in_synpred41_InternalJavadsl3410); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1477:7: otherlv_1= '++'
                {
                otherlv_1=(Token)match(input,34,FOLLOW_34_in_synpred41_InternalJavadsl3428); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:1482:7: otherlv_2= '--'
                {
                otherlv_2=(Token)match(input,35,FOLLOW_35_in_synpred41_InternalJavadsl3446); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_ruleBitExpression_in_synpred41_InternalJavadsl3472);
        this_BitExpression_3=ruleBitExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred41_InternalJavadsl

    // $ANTLR start synpred78_InternalJavadsl
    public final void synpred78_InternalJavadsl_fragment() throws RecognitionException {   
        EObject lv_arg_list_2_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2038:1: ( (lv_arg_list_2_0= ruleArglist ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2038:1: (lv_arg_list_2_0= ruleArglist )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2038:1: (lv_arg_list_2_0= ruleArglist )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2039:3: lv_arg_list_2_0= ruleArglist
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getArgsExpressionAccess().getArg_listArglistParserRuleCall_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleArglist_in_synpred78_InternalJavadsl4862);
        lv_arg_list_2_0=ruleArglist();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred78_InternalJavadsl

    // $ANTLR start synpred82_InternalJavadsl
    public final void synpred82_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        EObject lv_right_13_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2128:6: ( ( () otherlv_12= ',' ( (lv_right_13_0= ruleCastingExpression ) ) ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2128:6: ( () otherlv_12= ',' ( (lv_right_13_0= ruleCastingExpression ) ) )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2128:6: ( () otherlv_12= ',' ( (lv_right_13_0= ruleCastingExpression ) ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2128:7: () otherlv_12= ',' ( (lv_right_13_0= ruleCastingExpression ) )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2128:7: ()
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2129:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_12=(Token)match(input,31,FOLLOW_31_in_synpred82_InternalJavadsl5025); if (state.failed) return ;
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2141:1: ( (lv_right_13_0= ruleCastingExpression ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2142:1: (lv_right_13_0= ruleCastingExpression )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2142:1: (lv_right_13_0= ruleCastingExpression )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2143:3: lv_right_13_0= ruleCastingExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getArgsExpressionAccess().getRightCastingExpressionParserRuleCall_1_3_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleCastingExpression_in_synpred82_InternalJavadsl5046);
        lv_right_13_0=ruleCastingExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred82_InternalJavadsl

    // $ANTLR start synpred85_InternalJavadsl
    public final void synpred85_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_3_0 = null;

        EObject lv_right_5_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2278:2: ( () otherlv_2= '(' ( (lv_types_3_0= ruleType ) ) otherlv_4= ')' ( (lv_right_5_0= ruleCreatingExpression ) ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2278:2: () otherlv_2= '(' ( (lv_types_3_0= ruleType ) ) otherlv_4= ')' ( (lv_right_5_0= ruleCreatingExpression ) )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2278:2: ()
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2279:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,27,FOLLOW_27_in_synpred85_InternalJavadsl5347); if (state.failed) return ;
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2291:1: ( (lv_types_3_0= ruleType ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2292:1: (lv_types_3_0= ruleType )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2292:1: (lv_types_3_0= ruleType )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2293:3: lv_types_3_0= ruleType
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCastingExpressionAccess().getTypesTypeParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleType_in_synpred85_InternalJavadsl5368);
        lv_types_3_0=ruleType();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,28,FOLLOW_28_in_synpred85_InternalJavadsl5380); if (state.failed) return ;
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2313:1: ( (lv_right_5_0= ruleCreatingExpression ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2314:1: (lv_right_5_0= ruleCreatingExpression )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2314:1: (lv_right_5_0= ruleCreatingExpression )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2315:3: lv_right_5_0= ruleCreatingExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCastingExpressionAccess().getRightCreatingExpressionParserRuleCall_1_4_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleCreatingExpression_in_synpred85_InternalJavadsl5401);
        lv_right_5_0=ruleCreatingExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred85_InternalJavadsl

    // $ANTLR start synpred86_InternalJavadsl
    public final void synpred86_InternalJavadsl_fragment() throws RecognitionException {   
        EObject lv_arg_list_4_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2384:1: ( (lv_arg_list_4_0= ruleArglist ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2384:1: (lv_arg_list_4_0= ruleArglist )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2384:1: (lv_arg_list_4_0= ruleArglist )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2385:3: lv_arg_list_4_0= ruleArglist
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreatingExpressionAccess().getArg_listArglistParserRuleCall_1_1_0_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleArglist_in_synpred86_InternalJavadsl5564);
        lv_arg_list_4_0=ruleArglist();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred86_InternalJavadsl

    // $ANTLR start synpred87_InternalJavadsl
    public final void synpred87_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arg_list_4_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2368:2: ( ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2368:2: ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2368:2: ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2369:2: ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')'
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleObjectName_in_synpred87_InternalJavadsl5532);
        ruleObjectName();

        state._fsp--;
        if (state.failed) return ;
        otherlv_3=(Token)match(input,27,FOLLOW_27_in_synpred87_InternalJavadsl5543); if (state.failed) return ;
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2383:1: ( (lv_arg_list_4_0= ruleArglist ) )?
        int alt105=2;
        int LA105_0 = input.LA(1);

        if ( ((LA105_0>=RULE_ID && LA105_0<=RULE_ZERO_TO_SEVEN)||LA105_0==18||LA105_0==27||LA105_0==31||(LA105_0>=70 && LA105_0<=73)||(LA105_0>=94 && LA105_0<=95)) ) {
            alt105=1;
        }
        else if ( (LA105_0==28) ) {
            int LA105_2 = input.LA(2);

            if ( (synpred86_InternalJavadsl()) ) {
                alt105=1;
            }
        }
        switch (alt105) {
            case 1 :
                // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2384:1: (lv_arg_list_4_0= ruleArglist )
                {
                // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2384:1: (lv_arg_list_4_0= ruleArglist )
                // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2385:3: lv_arg_list_4_0= ruleArglist
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getCreatingExpressionAccess().getArg_listArglistParserRuleCall_1_1_0_2_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleArglist_in_synpred87_InternalJavadsl5564);
                lv_arg_list_4_0=ruleArglist();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_5=(Token)match(input,28,FOLLOW_28_in_synpred87_InternalJavadsl5577); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred87_InternalJavadsl

    // $ANTLR start synpred88_InternalJavadsl
    public final void synpred88_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parenthesis_8_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2424:4: (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2424:4: otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']'
        {
        otherlv_7=(Token)match(input,29,FOLLOW_29_in_synpred88_InternalJavadsl5619); if (state.failed) return ;
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2428:1: ( (lv_parenthesis_8_0= ruleParenthesisExpression ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2429:1: (lv_parenthesis_8_0= ruleParenthesisExpression )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2429:1: (lv_parenthesis_8_0= ruleParenthesisExpression )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2430:3: lv_parenthesis_8_0= ruleParenthesisExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreatingExpressionAccess().getParenthesisParenthesisExpressionParserRuleCall_1_1_1_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleParenthesisExpression_in_synpred88_InternalJavadsl5640);
        lv_parenthesis_8_0=ruleParenthesisExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_9=(Token)match(input,30,FOLLOW_30_in_synpred88_InternalJavadsl5652); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_InternalJavadsl

    // $ANTLR start synpred89_InternalJavadsl
    public final void synpred89_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        Token otherlv_11=null;

        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2450:5: (otherlv_10= '[' otherlv_11= ']' )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2450:5: otherlv_10= '[' otherlv_11= ']'
        {
        otherlv_10=(Token)match(input,29,FOLLOW_29_in_synpred89_InternalJavadsl5667); if (state.failed) return ;
        otherlv_11=(Token)match(input,30,FOLLOW_30_in_synpred89_InternalJavadsl5679); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_InternalJavadsl

    // $ANTLR start synpred91_InternalJavadsl
    public final void synpred91_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parenthesis_2_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2491:3: (otherlv_1= '(' ( (lv_parenthesis_2_0= rulePrimaryExpression ) ) otherlv_3= ')' )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2491:3: otherlv_1= '(' ( (lv_parenthesis_2_0= rulePrimaryExpression ) ) otherlv_3= ')'
        {
        otherlv_1=(Token)match(input,27,FOLLOW_27_in_synpred91_InternalJavadsl5793); if (state.failed) return ;
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2495:1: ( (lv_parenthesis_2_0= rulePrimaryExpression ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2496:1: (lv_parenthesis_2_0= rulePrimaryExpression )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2496:1: (lv_parenthesis_2_0= rulePrimaryExpression )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2497:3: lv_parenthesis_2_0= rulePrimaryExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getParenthesisExpressionAccess().getParenthesisPrimaryExpressionParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_rulePrimaryExpression_in_synpred91_InternalJavadsl5814);
        lv_parenthesis_2_0=rulePrimaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_3=(Token)match(input,28,FOLLOW_28_in_synpred91_InternalJavadsl5826); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred91_InternalJavadsl

    // $ANTLR start synpred96_InternalJavadsl
    public final void synpred96_InternalJavadsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_literal_value_0_1 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2609:3: (lv_literal_value_0_1= ruleIntegerLiteral )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2609:3: lv_literal_value_0_1= ruleIntegerLiteral
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteral_valueIntegerLiteralParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleIntegerLiteral_in_synpred96_InternalJavadsl6097);
        lv_literal_value_0_1=ruleIntegerLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_InternalJavadsl

    // $ANTLR start synpred97_InternalJavadsl
    public final void synpred97_InternalJavadsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_literal_value_0_2 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2624:8: (lv_literal_value_0_2= ruleFloatLiteral )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2624:8: lv_literal_value_0_2= ruleFloatLiteral
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteral_valueFloatLiteralParserRuleCall_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleFloatLiteral_in_synpred97_InternalJavadsl6116);
        lv_literal_value_0_2=ruleFloatLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_InternalJavadsl

    // $ANTLR start synpred98_InternalJavadsl
    public final void synpred98_InternalJavadsl_fragment() throws RecognitionException {   
        Token lv_literal_value_0_3=null;

        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2639:8: (lv_literal_value_0_3= RULE_STRING )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2639:8: lv_literal_value_0_3= RULE_STRING
        {
        lv_literal_value_0_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred98_InternalJavadsl6131); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred98_InternalJavadsl

    // $ANTLR start synpred116_InternalJavadsl
    public final void synpred116_InternalJavadsl_fragment() throws RecognitionException {   
        Token this_INT_1=null;

        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2956:6: (this_INT_1= RULE_INT )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:2956:6: this_INT_1= RULE_INT
        {
        this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_synpred116_InternalJavadsl6949); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred116_InternalJavadsl

    // $ANTLR start synpred125_InternalJavadsl
    public final void synpred125_InternalJavadsl_fragment() throws RecognitionException {   
        Token kw=null;

        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3350:2: (kw= '.' )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3350:2: kw= '.'
        {
        kw=(Token)match(input,18,FOLLOW_18_in_synpred125_InternalJavadsl8144); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_InternalJavadsl

    // $ANTLR start synpred132_InternalJavadsl
    public final void synpred132_InternalJavadsl_fragment() throws RecognitionException {   
        EObject lv_variable_declaration_2_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3449:2: ( ( (lv_variable_declaration_2_0= ruleVariableDeclaration ) ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3449:2: ( (lv_variable_declaration_2_0= ruleVariableDeclaration ) )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3449:2: ( (lv_variable_declaration_2_0= ruleVariableDeclaration ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3450:1: (lv_variable_declaration_2_0= ruleVariableDeclaration )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3450:1: (lv_variable_declaration_2_0= ruleVariableDeclaration )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3451:3: lv_variable_declaration_2_0= ruleVariableDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getForStatementAccess().getVariable_declarationVariableDeclarationParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleVariableDeclaration_in_synpred132_InternalJavadsl8452);
        lv_variable_declaration_2_0=ruleVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred132_InternalJavadsl

    // $ANTLR start synpred133_InternalJavadsl
    public final void synpred133_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_for_expression1_3_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3468:6: ( ( ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';' ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3468:6: ( ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';' )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3468:6: ( ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';' )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3468:7: ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';'
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3468:7: ( (lv_for_expression1_3_0= ruleExpression ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3469:1: (lv_for_expression1_3_0= ruleExpression )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3469:1: (lv_for_expression1_3_0= ruleExpression )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3470:3: lv_for_expression1_3_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getForStatementAccess().getFor_expression1ExpressionParserRuleCall_2_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred133_InternalJavadsl8480);
        lv_for_expression1_3_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,16,FOLLOW_16_in_synpred133_InternalJavadsl8492); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred133_InternalJavadsl

    // $ANTLR start synpred134_InternalJavadsl
    public final void synpred134_InternalJavadsl_fragment() throws RecognitionException {   
        EObject lv_for_expression2_6_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3496:1: ( (lv_for_expression2_6_0= ruleExpression ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3496:1: (lv_for_expression2_6_0= ruleExpression )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3496:1: (lv_for_expression2_6_0= ruleExpression )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3497:3: lv_for_expression2_6_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getForStatementAccess().getFor_expression2ExpressionParserRuleCall_3_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred134_InternalJavadsl8533);
        lv_for_expression2_6_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred134_InternalJavadsl

    // $ANTLR start synpred135_InternalJavadsl
    public final void synpred135_InternalJavadsl_fragment() throws RecognitionException {   
        EObject lv_for_expression3_8_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3518:1: ( (lv_for_expression3_8_0= ruleExpression ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3518:1: (lv_for_expression3_8_0= ruleExpression )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3518:1: (lv_for_expression3_8_0= ruleExpression )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3519:3: lv_for_expression3_8_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getForStatementAccess().getFor_expression3ExpressionParserRuleCall_5_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred135_InternalJavadsl8567);
        lv_for_expression3_8_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred135_InternalJavadsl

    // $ANTLR start synpred136_InternalJavadsl
    public final void synpred136_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_else_statement_6_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3630:4: (otherlv_5= 'else' ( (lv_else_statement_6_0= ruleStatement ) ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3630:4: otherlv_5= 'else' ( (lv_else_statement_6_0= ruleStatement ) )
        {
        otherlv_5=(Token)match(input,98,FOLLOW_98_in_synpred136_InternalJavadsl8775); if (state.failed) return ;
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3634:1: ( (lv_else_statement_6_0= ruleStatement ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3635:1: (lv_else_statement_6_0= ruleStatement )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3635:1: (lv_else_statement_6_0= ruleStatement )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3636:3: lv_else_statement_6_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getIfStatementAccess().getElse_statementStatementParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred136_InternalJavadsl8796);
        lv_else_statement_6_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred136_InternalJavadsl

    // $ANTLR start synpred137_InternalJavadsl
    public final void synpred137_InternalJavadsl_fragment() throws RecognitionException {   
        EObject lv_variable_declaration_0_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3673:2: ( ( (lv_variable_declaration_0_0= ruleVariableDeclaration ) ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3673:2: ( (lv_variable_declaration_0_0= ruleVariableDeclaration ) )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3673:2: ( (lv_variable_declaration_0_0= ruleVariableDeclaration ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3674:1: (lv_variable_declaration_0_0= ruleVariableDeclaration )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3674:1: (lv_variable_declaration_0_0= ruleVariableDeclaration )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3675:3: lv_variable_declaration_0_0= ruleVariableDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getVariable_declarationVariableDeclarationParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleVariableDeclaration_in_synpred137_InternalJavadsl8890);
        lv_variable_declaration_0_0=ruleVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred137_InternalJavadsl

    // $ANTLR start synpred138_InternalJavadsl
    public final void synpred138_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_statement_expression_1_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3692:6: ( ( ( (lv_statement_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3692:6: ( ( (lv_statement_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3692:6: ( ( (lv_statement_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3692:7: ( (lv_statement_expression_1_0= ruleExpression ) ) otherlv_2= ';'
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3692:7: ( (lv_statement_expression_1_0= ruleExpression ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3693:1: (lv_statement_expression_1_0= ruleExpression )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3693:1: (lv_statement_expression_1_0= ruleExpression )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3694:3: lv_statement_expression_1_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getStatement_expressionExpressionParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred138_InternalJavadsl8918);
        lv_statement_expression_1_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,16,FOLLOW_16_in_synpred138_InternalJavadsl8930); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred138_InternalJavadsl

    // $ANTLR start synpred147_InternalJavadsl
    public final void synpred147_InternalJavadsl_fragment() throws RecognitionException {   
        EObject lv_return_expression_18_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3920:1: ( (lv_return_expression_18_0= ruleExpression ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3920:1: (lv_return_expression_18_0= ruleExpression )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3920:1: (lv_return_expression_18_0= ruleExpression )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:3921:3: lv_return_expression_18_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getReturn_expressionExpressionParserRuleCall_10_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred147_InternalJavadsl9273);
        lv_return_expression_18_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred147_InternalJavadsl

    // $ANTLR start synpred158_InternalJavadsl
    public final void synpred158_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_paramenters_4_0 = null;

        EObject lv_catch_statements_6_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4227:4: (otherlv_2= 'catch' otherlv_3= '(' ( (lv_paramenters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catch_statements_6_0= ruleStatement ) ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4227:4: otherlv_2= 'catch' otherlv_3= '(' ( (lv_paramenters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_catch_statements_6_0= ruleStatement ) )
        {
        otherlv_2=(Token)match(input,107,FOLLOW_107_in_synpred158_InternalJavadsl9948); if (state.failed) return ;
        otherlv_3=(Token)match(input,27,FOLLOW_27_in_synpred158_InternalJavadsl9960); if (state.failed) return ;
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4235:1: ( (lv_paramenters_4_0= ruleParameter ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4236:1: (lv_paramenters_4_0= ruleParameter )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4236:1: (lv_paramenters_4_0= ruleParameter )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4237:3: lv_paramenters_4_0= ruleParameter
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTryStatementAccess().getParamentersParameterParserRuleCall_2_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleParameter_in_synpred158_InternalJavadsl9981);
        lv_paramenters_4_0=ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,28,FOLLOW_28_in_synpred158_InternalJavadsl9993); if (state.failed) return ;
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4257:1: ( (lv_catch_statements_6_0= ruleStatement ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4258:1: (lv_catch_statements_6_0= ruleStatement )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4258:1: (lv_catch_statements_6_0= ruleStatement )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4259:3: lv_catch_statements_6_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTryStatementAccess().getCatch_statementsStatementParserRuleCall_2_4_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred158_InternalJavadsl10014);
        lv_catch_statements_6_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred158_InternalJavadsl

    // $ANTLR start synpred159_InternalJavadsl
    public final void synpred159_InternalJavadsl_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        EObject lv_finally_statement_8_0 = null;


        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4275:6: (otherlv_7= 'finally' ( (lv_finally_statement_8_0= ruleStatement ) ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4275:6: otherlv_7= 'finally' ( (lv_finally_statement_8_0= ruleStatement ) )
        {
        otherlv_7=(Token)match(input,108,FOLLOW_108_in_synpred159_InternalJavadsl10029); if (state.failed) return ;
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4279:1: ( (lv_finally_statement_8_0= ruleStatement ) )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4280:1: (lv_finally_statement_8_0= ruleStatement )
        {
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4280:1: (lv_finally_statement_8_0= ruleStatement )
        // ../org.xtext.com.Javadsl/src-gen/org/xtext/com/parser/antlr/internal/InternalJavadsl.g:4281:3: lv_finally_statement_8_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTryStatementAccess().getFinally_statementStatementParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred159_InternalJavadsl10050);
        lv_finally_statement_8_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred159_InternalJavadsl

    // Delegated rules

    public final boolean synpred82_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred159_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred159_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred132_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred116_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred147_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred147_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred137_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred137_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred134_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred134_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred136_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred158_InternalJavadsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred158_InternalJavadsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA87 dfa87 = new DFA87(this);
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\13\24\2\uffff";
    static final String DFA6_maxS =
        "\13\132\2\uffff";
    static final String DFA6_acceptS =
        "\13\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\13\4\uffff\1\14\1\4\67\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\4\uffff\1\14\1\4\67\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\4\uffff\1\14\1\4\67\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\4\uffff\1\14\1\4\67\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\4\uffff\1\14\1\4\67\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\4\uffff\1\14\1\4\67\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\4\uffff\1\14\1\4\67\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\4\uffff\1\14\1\4\67\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\4\uffff\1\14\1\4\67\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\4\uffff\1\14\1\4\67\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\4\uffff\1\14\1\4\67\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "383:2: ( ( (lv_class_declaration_0_0= ruleClassDeclaration ) ) | ( (lv_interface_declaration_1_0= ruleInterfaceDeclaration ) ) )";
        }
    }
    static final String DFA16_eotS =
        "\36\uffff";
    static final String DFA16_eofS =
        "\36\uffff";
    static final String DFA16_minS =
        "\24\4\1\36\1\20\1\36\1\uffff\1\4\1\uffff\1\4\1\uffff\2\4";
    static final String DFA16_maxS =
        "\13\132\10\35\1\40\1\36\1\40\1\36\1\uffff\1\4\1\uffff\1\35\1\uffff\1\40\1\35";
    static final String DFA16_acceptS =
        "\27\uffff\1\3\1\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String DFA16_specialS =
        "\36\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\23\25\uffff\1\4\57\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\23\25\uffff\1\4\57\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\23\25\uffff\1\4\57\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\23\25\uffff\1\4\57\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\23\25\uffff\1\4\57\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\23\25\uffff\1\4\57\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\23\25\uffff\1\4\57\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\23\25\uffff\1\4\57\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\23\25\uffff\1\4\57\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\23\25\uffff\1\4\57\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\23\25\uffff\1\4\57\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\25\30\uffff\1\24",
            "\1\25\30\uffff\1\24",
            "\1\25\30\uffff\1\24",
            "\1\25\30\uffff\1\24",
            "\1\25\30\uffff\1\24",
            "\1\25\30\uffff\1\24",
            "\1\25\30\uffff\1\24",
            "\1\25\30\uffff\1\24",
            "\1\25\13\uffff\1\27\1\uffff\1\30\10\uffff\1\31\1\uffff\1\26\1\uffff\2\27",
            "\1\32",
            "\1\27\12\uffff\1\33\1\uffff\1\27\1\uffff\2\27",
            "\1\34",
            "",
            "\1\35",
            "",
            "\1\25\30\uffff\1\24",
            "",
            "\1\25\13\uffff\1\27\14\uffff\1\26\1\uffff\2\27",
            "\1\25\15\uffff\1\30\12\uffff\1\24"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "679:1: (lv_declaration_0_1= ruleMethodDeclaration | lv_declaration_0_2= ruleConstructorDeclaration | lv_declaration_0_3= ruleVariableDeclaration )";
        }
    }
    static final String DFA28_eotS =
        "\6\uffff";
    static final String DFA28_eofS =
        "\6\uffff";
    static final String DFA28_minS =
        "\1\4\1\uffff\1\4\1\36\1\uffff\1\4";
    static final String DFA28_maxS =
        "\1\121\1\uffff\1\40\1\36\1\uffff\1\40";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA28_specialS =
        "\6\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\2\105\uffff\10\1",
            "",
            "\1\1\13\uffff\1\4\1\uffff\1\1\12\uffff\1\3\1\uffff\2\4",
            "\1\5",
            "",
            "\1\1\13\uffff\1\4\14\uffff\1\3\1\uffff\2\4"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1153:3: ( (lv_type_1_0= ruleType ) )?";
        }
    }
    static final String DFA58_eotS =
        "\13\uffff";
    static final String DFA58_eofS =
        "\13\uffff";
    static final String DFA58_minS =
        "\1\4\1\0\11\uffff";
    static final String DFA58_maxS =
        "\1\121\1\0\11\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\2\7\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1\105\uffff\10\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "2368:1: ( ( ruleObjectName otherlv_3= '(' ( (lv_arg_list_4_0= ruleArglist ) )? otherlv_5= ')' ) | ( ( (lv_type_specifiers_6_0= ruleTypeSpecifier ) ) (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )? (otherlv_10= '[' otherlv_11= ']' )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalJavadsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\132\uffff";
    static final String DFA56_eofS =
        "\1\2\131\uffff";
    static final String DFA56_minS =
        "\1\20\1\4\1\uffff\1\6\2\10\2\7\1\33\1\4\1\0\1\6\5\33\2\6\1\12\1\33\1\0\1\33\1\7\1\33\1\6\2\10\2\7\1\34\1\33\1\6\4\34\1\22\1\uffff\4\6\1\34\1\6\1\12\1\34\1\7\1\34\1\6\1\4\1\6\1\12\1\33\4\6\1\12\1\34\1\4\2\6\2\10\2\7\1\34\1\33\1\6\4\34\1\22\1\6\1\34\1\6\1\12\1\34\1\7\1\34\1\6\1\4\3\6\1\12\1\34\1\6";
    static final String DFA56_maxS =
        "\1\106\1\137\1\uffff\1\135\2\10\3\106\1\137\1\0\1\6\5\106\2\135\2\106\1\0\3\106\1\135\2\10\3\34\1\106\1\6\4\34\1\35\1\uffff\4\135\1\34\1\135\4\34\1\135\1\137\1\135\2\106\4\135\2\34\1\137\2\135\2\10\3\34\1\106\1\6\4\34\1\35\1\135\1\34\1\135\4\34\1\135\1\137\3\135\2\34\1\135";
    static final String DFA56_acceptS =
        "\2\uffff\1\2\43\uffff\1\1\63\uffff";
    static final String DFA56_specialS =
        "\12\uffff\1\1\12\uffff\1\0\104\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\2\1\uffff\2\2\4\uffff\1\2\2\uffff\2\2\1\1\2\2\1\uffff\13\2\1\uffff\12\2\1\uffff\13\2\2\uffff\2\2",
            "\1\20\1\14\1\3\1\10\1\6\1\7\10\uffff\1\13\10\uffff\1\11\2\uffff\1\12\47\uffff\1\2\1\15\1\16\1\17\24\uffff\1\4\1\5",
            "",
            "\1\21\1\26\2\uffff\1\24\7\uffff\1\22\10\uffff\1\11\2\uffff\1\25\47\uffff\1\2\26\uffff\1\23",
            "\1\27",
            "\1\27",
            "\1\30\23\uffff\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\10\1\uffff\1\7\21\uffff\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\45\1\41\1\31\1\36\1\34\1\35\10\uffff\1\40\11\uffff\1\37\52\uffff\1\42\1\43\1\44\10\2\14\uffff\1\32\1\33",
            "\1\uffff",
            "\1\47",
            "\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\50\1\26\2\uffff\1\24\7\uffff\1\22\10\uffff\1\11\2\uffff\1\25\47\uffff\1\2\26\uffff\1\23",
            "\1\51\3\uffff\1\24\20\uffff\1\11\2\uffff\1\25\47\uffff\1\2\26\uffff\1\23",
            "\1\24\20\uffff\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\uffff",
            "\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\30\23\uffff\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\52\1\53\2\uffff\1\56\7\uffff\1\54\11\uffff\1\37\100\uffff\1\55",
            "\1\57",
            "\1\57",
            "\1\60\24\uffff\1\37",
            "\1\36\1\uffff\1\35\22\uffff\1\37",
            "\1\37",
            "\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\61",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\2\11\uffff\1\62\1\2",
            "",
            "\1\63\3\uffff\1\65\20\uffff\1\11\2\uffff\1\25\47\uffff\1\2\26\uffff\1\64",
            "\1\50\1\26\2\uffff\1\24\7\uffff\1\22\10\uffff\1\11\2\uffff\1\25\47\uffff\1\2\26\uffff\1\23",
            "\1\66\3\uffff\1\24\20\uffff\1\11\2\uffff\1\25\47\uffff\1\2\26\uffff\1\23",
            "\1\67\1\53\2\uffff\1\56\7\uffff\1\54\11\uffff\1\37\100\uffff\1\55",
            "\1\37",
            "\1\70\3\uffff\1\56\21\uffff\1\37\100\uffff\1\55",
            "\1\56\21\uffff\1\37",
            "\1\37",
            "\1\60\24\uffff\1\37",
            "\1\37",
            "\1\71\3\uffff\1\73\21\uffff\1\37\100\uffff\1\72",
            "\6\2\10\uffff\1\2\10\uffff\1\74\2\uffff\1\25\47\uffff\4\2\24\uffff\2\2",
            "\1\63\3\uffff\1\65\20\uffff\1\11\2\uffff\1\25\47\uffff\1\2\26\uffff\1\64",
            "\1\65\20\uffff\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\11\2\uffff\1\25\47\uffff\1\2",
            "\1\66\3\uffff\1\24\20\uffff\1\11\2\uffff\1\25\47\uffff\1\2\26\uffff\1\23",
            "\1\67\1\53\2\uffff\1\56\7\uffff\1\54\11\uffff\1\37\100\uffff\1\55",
            "\1\75\3\uffff\1\56\21\uffff\1\37\100\uffff\1\55",
            "\1\71\3\uffff\1\73\21\uffff\1\37\100\uffff\1\72",
            "\1\73\21\uffff\1\37",
            "\1\37",
            "\1\112\1\106\1\76\1\103\1\101\1\102\10\uffff\1\105\11\uffff\1\104\52\uffff\1\107\1\110\1\111\10\2\14\uffff\1\77\1\100",
            "\1\75\3\uffff\1\56\21\uffff\1\37\100\uffff\1\55",
            "\1\113\1\114\2\uffff\1\117\7\uffff\1\115\11\uffff\1\104\100\uffff\1\116",
            "\1\120",
            "\1\120",
            "\1\121\24\uffff\1\104",
            "\1\103\1\uffff\1\102\22\uffff\1\104",
            "\1\104",
            "\1\74\2\uffff\1\25\47\uffff\1\2",
            "\1\122",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\2\11\uffff\1\123\1\2",
            "\1\124\1\114\2\uffff\1\117\7\uffff\1\115\11\uffff\1\104\100\uffff\1\116",
            "\1\104",
            "\1\125\3\uffff\1\117\21\uffff\1\104\100\uffff\1\116",
            "\1\117\21\uffff\1\104",
            "\1\104",
            "\1\121\24\uffff\1\104",
            "\1\104",
            "\1\126\3\uffff\1\130\21\uffff\1\104\100\uffff\1\127",
            "\6\2\10\uffff\1\2\10\uffff\1\74\2\uffff\1\25\47\uffff\4\2\24\uffff\2\2",
            "\1\124\1\114\2\uffff\1\117\7\uffff\1\115\11\uffff\1\104\100\uffff\1\116",
            "\1\131\3\uffff\1\117\21\uffff\1\104\100\uffff\1\116",
            "\1\126\3\uffff\1\130\21\uffff\1\104\100\uffff\1\127",
            "\1\130\21\uffff\1\104",
            "\1\104",
            "\1\131\3\uffff\1\117\21\uffff\1\104\100\uffff\1\116"
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "2424:2: (otherlv_7= '[' ( (lv_parenthesis_8_0= ruleParenthesisExpression ) ) otherlv_9= ']' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_21 = input.LA(1);

                         
                        int index56_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalJavadsl()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index56_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_10 = input.LA(1);

                         
                        int index56_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalJavadsl()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index56_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\40\uffff";
    static final String DFA60_eofS =
        "\1\1\37\uffff";
    static final String DFA60_minS =
        "\1\20\1\uffff\1\4\1\22\1\6\2\10\2\7\1\33\1\0\1\6\4\33\1\0\1\6\1\33\1\6\1\12\1\33\1\7\1\33\1\uffff\4\6\1\12\1\33\1\6";
    static final String DFA60_maxS =
        "\1\106\1\uffff\1\137\1\106\1\135\2\10\3\106\1\0\1\6\4\106\1\0\1\135\1\106\1\135\4\106\1\uffff\4\135\2\106\1\135";
    static final String DFA60_acceptS =
        "\1\uffff\1\2\26\uffff\1\1\7\uffff";
    static final String DFA60_specialS =
        "\12\uffff\1\1\5\uffff\1\0\17\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\1\1\uffff\2\1\4\uffff\1\1\2\uffff\1\2\4\1\1\uffff\13\1\1\uffff\12\1\1\uffff\13\1\2\uffff\2\1",
            "",
            "\1\3\1\14\1\4\1\11\1\7\1\10\10\uffff\1\13\10\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1\1\15\1\16\1\17\10\1\14\uffff\1\5\1\6",
            "\1\1\10\uffff\1\1\1\20\1\1\1\uffff\1\1\46\uffff\1\1",
            "\1\21\1\22\2\uffff\1\25\7\uffff\1\23\10\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1\26\uffff\1\24",
            "\1\26",
            "\1\26",
            "\1\27\23\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "\1\11\1\uffff\1\10\21\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "\1\uffff",
            "\1\31",
            "\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "\1\uffff",
            "\1\32\1\22\2\uffff\1\25\7\uffff\1\23\10\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1\26\uffff\1\24",
            "\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "\1\33\3\uffff\1\25\20\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1\26\uffff\1\24",
            "\1\25\20\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "\1\27\23\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "",
            "\1\34\3\uffff\1\36\20\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1\26\uffff\1\35",
            "\1\32\1\22\2\uffff\1\25\7\uffff\1\23\10\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1\26\uffff\1\24",
            "\1\37\3\uffff\1\25\20\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1\26\uffff\1\24",
            "\1\34\3\uffff\1\36\20\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1\26\uffff\1\35",
            "\1\36\20\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "\1\1\1\12\2\uffff\1\1\46\uffff\1\1",
            "\1\37\3\uffff\1\25\20\uffff\1\1\1\12\2\uffff\1\1\46\uffff\1\1\26\uffff\1\24"
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "()* loopback of 2491:1: (otherlv_1= '(' ( (lv_parenthesis_2_0= rulePrimaryExpression ) ) otherlv_3= ')' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_16 = input.LA(1);

                         
                        int index60_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalJavadsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_10 = input.LA(1);

                         
                        int index60_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalJavadsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA80_eotS =
        "\21\uffff";
    static final String DFA80_eofS =
        "\21\uffff";
    static final String DFA80_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\0\3\4\1\0\1\uffff\2\4\1\20\3\4\1\20";
    static final String DFA80_maxS =
        "\1\137\1\uffff\1\106\1\uffff\1\0\3\137\1\0\1\uffff\1\106\1\105\1\106\2\137\2\105";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\5\uffff\1\3\7\uffff";
    static final String DFA80_specialS =
        "\4\uffff\1\0\3\uffff\1\1\10\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\2\5\3\6\uffff\1\4\1\uffff\2\3\6\uffff\1\1\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\41\3\1\uffff\7\3\21\1\3\uffff\2\3",
            "",
            "\1\1\13\uffff\1\10\1\uffff\1\5\1\3\7\uffff\1\3\1\uffff\1\6\1\uffff\1\7\1\1\13\3\1\uffff\12\3\1\uffff\12\3\3\uffff\2\3",
            "",
            "\1\uffff",
            "\1\12\5\3\6\uffff\1\3\1\uffff\2\3\7\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\13\3\1\uffff\12\3\1\uffff\12\3\3\uffff\5\3\24\uffff\2\3",
            "\6\3\10\uffff\1\3\10\uffff\1\3\2\uffff\1\13\47\uffff\4\3\24\uffff\2\3",
            "\1\14\5\3\6\uffff\1\3\1\uffff\2\3\7\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\13\3\1\uffff\12\3\1\uffff\12\3\3\uffff\5\3\24\uffff\2\3",
            "\1\uffff",
            "",
            "\1\1\13\uffff\1\3\1\uffff\1\5\1\3\7\uffff\1\3\1\uffff\1\15\1\uffff\1\3\1\uffff\13\3\1\uffff\12\3\1\uffff\12\3\3\uffff\2\3",
            "\1\1\13\uffff\1\10\1\uffff\2\3\7\uffff\1\3\1\uffff\1\6\1\uffff\1\7\1\1\13\3\1\uffff\12\3\1\uffff\12\3\3\uffff\1\3",
            "\1\10\1\uffff\2\3\7\uffff\1\3\1\uffff\1\16\1\uffff\1\7\1\1\13\3\1\uffff\12\3\1\uffff\12\3\3\uffff\2\3",
            "\6\3\10\uffff\1\3\10\uffff\1\3\2\uffff\1\17\47\uffff\4\3\24\uffff\2\3",
            "\6\3\10\uffff\1\3\10\uffff\1\3\2\uffff\1\20\47\uffff\4\3\24\uffff\2\3",
            "\1\1\13\uffff\1\3\1\uffff\2\3\7\uffff\1\3\1\uffff\1\15\1\uffff\1\3\1\uffff\13\3\1\uffff\12\3\1\uffff\12\3\3\uffff\1\3",
            "\1\10\1\uffff\2\3\7\uffff\1\3\1\uffff\1\16\1\uffff\1\7\1\1\13\3\1\uffff\12\3\1\uffff\12\3\3\uffff\1\3"
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "3449:1: ( ( (lv_variable_declaration_2_0= ruleVariableDeclaration ) ) | ( ( (lv_for_expression1_3_0= ruleExpression ) ) otherlv_4= ';' ) | otherlv_5= ';' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_4 = input.LA(1);

                         
                        int index80_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalJavadsl()) ) {s = 3;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index80_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_8 = input.LA(1);

                         
                        int index80_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalJavadsl()) ) {s = 1;}

                        else if ( (synpred133_InternalJavadsl()) ) {s = 3;}

                         
                        input.seek(index80_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA87_eotS =
        "\37\uffff";
    static final String DFA87_eofS =
        "\37\uffff";
    static final String DFA87_minS =
        "\1\4\1\uffff\2\4\1\uffff\1\0\14\uffff\3\4\1\0\2\uffff\2\4\1\20\3\4\1\20";
    static final String DFA87_maxS =
        "\1\152\1\uffff\1\132\1\106\1\uffff\1\0\14\uffff\3\137\1\0\2\uffff\1\106\1\105\1\106\2\137\2\105";
    static final String DFA87_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14\1\16\1\17\1\12\4\uffff\1\15\1\20\7\uffff";
    static final String DFA87_specialS =
        "\5\uffff\1\1\17\uffff\1\0\11\uffff}>";
    static final String[] DFA87_transitionS = {
            "\1\3\5\4\6\uffff\1\5\1\uffff\2\4\3\uffff\1\6\2\uffff\1\1\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\41\4\1\uffff\7\4\15\1\1\2\3\1\1\10\1\11\1\uffff\2\4\1\12\1\7\1\uffff\1\15\1\16\1\17\1\20\1\14\2\uffff\1\13",
            "",
            "\1\1\25\uffff\1\1\1\21\56\uffff\21\1",
            "\1\1\13\uffff\1\25\1\uffff\1\22\1\4\7\uffff\1\4\1\uffff\1\23\1\uffff\1\24\1\1\13\4\1\uffff\12\4\1\uffff\12\4\1\26\2\uffff\2\4",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30\5\4\6\uffff\1\4\1\uffff\2\4\7\uffff\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\13\4\1\uffff\12\4\1\uffff\12\4\3\uffff\5\4\24\uffff\2\4",
            "\6\4\10\uffff\1\4\10\uffff\1\4\2\uffff\1\31\47\uffff\4\4\24\uffff\2\4",
            "\1\32\5\4\6\uffff\1\4\1\uffff\2\4\7\uffff\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\13\4\1\uffff\12\4\1\uffff\12\4\3\uffff\5\4\24\uffff\2\4",
            "\1\uffff",
            "",
            "",
            "\1\1\13\uffff\1\4\1\uffff\1\22\1\4\7\uffff\1\4\1\uffff\1\33\1\uffff\1\4\1\uffff\13\4\1\uffff\12\4\1\uffff\12\4\3\uffff\2\4",
            "\1\1\13\uffff\1\25\1\uffff\2\4\7\uffff\1\4\1\uffff\1\23\1\uffff\1\24\1\1\13\4\1\uffff\12\4\1\uffff\12\4\3\uffff\1\4",
            "\1\25\1\uffff\2\4\7\uffff\1\4\1\uffff\1\34\1\uffff\1\24\1\1\13\4\1\uffff\12\4\1\uffff\12\4\3\uffff\2\4",
            "\6\4\10\uffff\1\4\10\uffff\1\4\2\uffff\1\35\47\uffff\4\4\24\uffff\2\4",
            "\6\4\10\uffff\1\4\10\uffff\1\4\2\uffff\1\36\47\uffff\4\4\24\uffff\2\4",
            "\1\1\13\uffff\1\4\1\uffff\2\4\7\uffff\1\4\1\uffff\1\33\1\uffff\1\4\1\uffff\13\4\1\uffff\12\4\1\uffff\12\4\3\uffff\1\4",
            "\1\25\1\uffff\2\4\7\uffff\1\4\1\uffff\1\34\1\uffff\1\24\1\1\13\4\1\uffff\12\4\1\uffff\12\4\3\uffff\1\4"
    };

    static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
    static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
    static final char[] DFA87_min = DFA.unpackEncodedStringToUnsignedChars(DFA87_minS);
    static final char[] DFA87_max = DFA.unpackEncodedStringToUnsignedChars(DFA87_maxS);
    static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
    static final short[] DFA87_special = DFA.unpackEncodedString(DFA87_specialS);
    static final short[][] DFA87_transition;

    static {
        int numStates = DFA87_transitionS.length;
        DFA87_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
        }
    }

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = DFA87_eot;
            this.eof = DFA87_eof;
            this.min = DFA87_min;
            this.max = DFA87_max;
            this.accept = DFA87_accept;
            this.special = DFA87_special;
            this.transition = DFA87_transition;
        }
        public String getDescription() {
            return "3673:1: ( ( (lv_variable_declaration_0_0= ruleVariableDeclaration ) ) | ( ( (lv_statement_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) | ( (lv_statement_block_3_0= ruleStatementBlock ) ) | ( (lv_if_statement_4_0= ruleIfStatement ) ) | ( (lv_do_statement_5_0= ruleDoStatement ) ) | ( (lv_while_statement_6_0= rulewhile_statement ) ) | ( (lv_for_statement_7_0= ruleForStatement ) ) | ( (lv_try_statement_8_0= ruleTryStatement ) ) | ( (lv_swith_statement_9_0= ruleSwitchStatement ) ) | ( () (otherlv_11= 'synchronized' otherlv_12= '(' ( (lv_sync_expression_13_0= ruleExpression ) ) otherlv_14= ')' ( (lv_sync_statement_15_0= ruleStatement ) ) ) ) | ( () (otherlv_17= 'return' ( (lv_return_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) ) | ( () (otherlv_21= 'throw' ( (lv_throw_expression_22_0= ruleExpression ) ) otherlv_23= ';' ) ) | ( () (this_ID_25= RULE_ID otherlv_26= ':' ( (lv_named_statement_27_0= ruleStatement ) ) ) ) | ( () (otherlv_29= 'break' (this_ID_30= RULE_ID )? otherlv_31= ';' ) ) | ( () (otherlv_33= 'continue' (this_ID_34= RULE_ID )? otherlv_35= ';' ) ) | ( () otherlv_37= ';' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA87_21 = input.LA(1);

                         
                        int index87_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_InternalJavadsl()) ) {s = 1;}

                        else if ( (synpred138_InternalJavadsl()) ) {s = 4;}

                         
                        input.seek(index87_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA87_5 = input.LA(1);

                         
                        int index87_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalJavadsl()) ) {s = 4;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index87_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 87, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead88 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilationUnit_in_ruleHead143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilationUnit188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageStatement_in_ruleCompilationUnit246 = new BitSet(new long[]{0x0000000006120002L,0x0000000007FC0000L});
    public static final BitSet FOLLOW_ruleImportStatement_in_ruleCompilationUnit268 = new BitSet(new long[]{0x0000000006120002L,0x0000000007FC0000L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_ruleCompilationUnit290 = new BitSet(new long[]{0x0000000006100002L,0x0000000007FC0000L});
    public static final BitSet FOLLOW_rulePackageStatement_in_entryRulePackageStatement328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageStatement339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePackageStatement377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectName_in_rulePackageStatement399 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePackageStatement417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportStatement_in_entryRuleImportStatement458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportStatement469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleImportStatement507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImportStatement__in_ruleImportStatement529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportStatement__in_entryRuleImportStatement_575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportStatement_586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectName_in_ruleImportStatement_633 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleImportStatement_652 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleImportStatement_665 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleImportStatement_680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectName_in_entryRuleObjectName721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectName732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectName772 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleObjectName791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectName806 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDeclaration863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDeclaration_in_ruleTypeDeclaration910 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_ruleTypeDeclaration937 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTypeDeclaration950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDeclaration_in_entryRuleClassDeclaration986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDeclaration996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleClassDeclaration1054 = new BitSet(new long[]{0x0000000004100000L,0x0000000007FC0000L});
    public static final BitSet FOLLOW_20_in_ruleClassDeclaration1067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassDeclaration1078 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_21_in_ruleClassDeclaration1090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectName_in_ruleClassDeclaration1109 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleClassDeclaration1123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectName_in_ruleClassDeclaration1142 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_18_in_ruleClassDeclaration1154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectName_in_ruleClassDeclaration1173 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_23_in_ruleClassDeclaration1188 = new BitSet(new long[]{0x0000000005010010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleFieldDeclaration_in_ruleClassDeclaration1209 = new BitSet(new long[]{0x0000000005010010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_24_in_ruleClassDeclaration1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration1258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDeclaration1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleInterfaceDeclaration1325 = new BitSet(new long[]{0x0000000006000000L,0x0000000007FC0000L});
    public static final BitSet FOLLOW_25_in_ruleInterfaceDeclaration1338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceDeclaration1349 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_21_in_ruleInterfaceDeclaration1361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectName_in_ruleInterfaceDeclaration1380 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_18_in_ruleInterfaceDeclaration1392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectName_in_ruleInterfaceDeclaration1411 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_23_in_ruleInterfaceDeclaration1426 = new BitSet(new long[]{0x0000000005010010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleFieldDeclaration_in_ruleInterfaceDeclaration1447 = new BitSet(new long[]{0x0000000005010010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_24_in_ruleInterfaceDeclaration1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldDeclaration_in_entryRuleFieldDeclaration1496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldDeclaration1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDeclaration_in_ruleFieldDeclaration1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorDeclaration_in_ruleFieldDeclaration1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFieldDeclaration1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticInitializer_in_ruleFieldDeclaration1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFieldDeclaration1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticInitializer_in_entryRuleStaticInitializer1693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticInitializer1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStaticInitializer1740 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleStaticInitializer1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDeclaration_in_entryRuleMethodDeclaration1800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodDeclaration1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMethodDeclaration1855 = new BitSet(new long[]{0x0000000004000010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethodDeclaration1881 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodDeclaration1891 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMethodDeclaration1902 = new BitSet(new long[]{0x0000000014000010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleMethodDeclaration1928 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMethodDeclaration1941 = new BitSet(new long[]{0x0000000020810000L});
    public static final BitSet FOLLOW_29_in_ruleMethodDeclaration1954 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMethodDeclaration1966 = new BitSet(new long[]{0x0000000020810000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleMethodDeclaration1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMethodDeclaration2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorDeclaration_in_entryRuleConstructorDeclaration2045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructorDeclaration2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleConstructorDeclaration2100 = new BitSet(new long[]{0x0000000004000010L,0x0000000007FC0000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructorDeclaration2112 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleConstructorDeclaration2123 = new BitSet(new long[]{0x0000000014000010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleConstructorDeclaration2149 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleConstructorDeclaration2162 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleConstructorDeclaration2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList2219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList2279 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleParameterList2291 = new BitSet(new long[]{0x0000000004000010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList2312 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameter2410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2420 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleParameter2432 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleParameter2444 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock2482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementBlock2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleStatementBlock2529 = new BitSet(new long[]{0x0080100E058503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementBlock2562 = new BitSet(new long[]{0x0080100E058503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_24_in_ruleStatementBlock2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleVariableDeclaration2666 = new BitSet(new long[]{0x0000000004000010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration2688 = new BitSet(new long[]{0x0000000004000010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleVariableDeclarator_in_ruleVariableDeclaration2710 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_31_in_ruleVariableDeclaration2723 = new BitSet(new long[]{0x0000000004000010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleVariableDeclarator_in_ruleVariableDeclaration2744 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_16_in_ruleVariableDeclaration2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarator_in_entryRuleVariableDeclarator2794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclarator2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclarator2852 = new BitSet(new long[]{0x0000000120000002L});
    public static final BitSet FOLLOW_29_in_ruleVariableDeclarator2864 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleVariableDeclarator2876 = new BitSet(new long[]{0x0000000120000002L});
    public static final BitSet FOLLOW_32_in_ruleVariableDeclarator2891 = new BitSet(new long[]{0x0080100E008403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleVariableInitializer_in_ruleVariableDeclarator2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableInitializer_in_entryRuleVariableInitializer2950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableInitializer2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableInitializer3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleVariableInitializer3025 = new BitSet(new long[]{0x0080100E018403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleVariableInitializer_in_ruleVariableInitializer3047 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_31_in_ruleVariableInitializer3060 = new BitSet(new long[]{0x0080100E008403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleVariableInitializer_in_ruleVariableInitializer3081 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_31_in_ruleVariableInitializer3096 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleVariableInitializer3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType3149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleType3205 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleType3218 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleType3230 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_ruleExpression3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression3361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericExpression3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleNumericExpression3410 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_34_in_ruleNumericExpression3428 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_35_in_ruleNumericExpression3446 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleBitExpression_in_ruleNumericExpression3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitExpression_in_ruleNumericExpression3504 = new BitSet(new long[]{0x00000FFE00080002L});
    public static final BitSet FOLLOW_34_in_ruleNumericExpression3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNumericExpression3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleNumericExpression3568 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_37_in_ruleNumericExpression3586 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_33_in_ruleNumericExpression3604 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_38_in_ruleNumericExpression3622 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_19_in_ruleNumericExpression3640 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_39_in_ruleNumericExpression3658 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_40_in_ruleNumericExpression3676 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_41_in_ruleNumericExpression3694 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_42_in_ruleNumericExpression3712 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_43_in_ruleNumericExpression3730 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleBitExpression_in_ruleNumericExpression3752 = new BitSet(new long[]{0x00000FF200080002L});
    public static final BitSet FOLLOW_ruleBitExpression_in_entryRuleBitExpression3792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitExpression3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleBitExpression3840 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleLogicalExpression_in_ruleBitExpression3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalExpression_in_ruleBitExpression3897 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_45_in_ruleBitExpression3922 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_46_in_ruleBitExpression3940 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_47_in_ruleBitExpression3958 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_48_in_ruleBitExpression3976 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleLogicalExpression_in_ruleBitExpression3998 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_ruleTestingExpression_in_entryRuleTestingExpression4037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestingExpression4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgsExpression_in_ruleTestingExpression4097 = new BitSet(new long[]{0x007E000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTestingExpression4122 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_50_in_ruleTestingExpression4140 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_51_in_ruleTestingExpression4158 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_52_in_ruleTestingExpression4176 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_53_in_ruleTestingExpression4194 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_54_in_ruleTestingExpression4212 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleArgsExpression_in_ruleTestingExpression4234 = new BitSet(new long[]{0x007E000000000002L});
    public static final BitSet FOLLOW_ruleLogicalExpression_in_entryRuleLogicalExpression4272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalExpression4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleLogicalExpression4320 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleTestingExpression_in_ruleLogicalExpression4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestingExpression_in_ruleLogicalExpression4374 = new BitSet(new long[]{0xFF00000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_56_in_ruleLogicalExpression4400 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_57_in_ruleLogicalExpression4418 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_58_in_ruleLogicalExpression4436 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_59_in_ruleLogicalExpression4454 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_60_in_ruleLogicalExpression4472 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_61_in_ruleLogicalExpression4490 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_62_in_ruleLogicalExpression4508 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_63_in_ruleLogicalExpression4526 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_64_in_ruleLogicalExpression4544 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleTestingExpression_in_ruleLogicalExpression4566 = new BitSet(new long[]{0xFF00000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_65_in_ruleLogicalExpression4598 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleTestingExpression_in_ruleLogicalExpression4619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleLogicalExpression4643 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleTestingExpression_in_ruleLogicalExpression4664 = new BitSet(new long[]{0xFF00000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_67_in_ruleLogicalExpression4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLogicalExpression4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgsExpression_in_entryRuleArgsExpression4768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgsExpression4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastingExpression_in_ruleArgsExpression4828 = new BitSet(new long[]{0x00000000A8040002L,0x0000000000000020L});
    public static final BitSet FOLLOW_27_in_ruleArgsExpression4841 = new BitSet(new long[]{0x00000000100403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleArglist_in_ruleArgsExpression4862 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleArgsExpression4875 = new BitSet(new long[]{0x00000000A8040002L,0x0000000000000020L});
    public static final BitSet FOLLOW_18_in_ruleArgsExpression4907 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleCastingExpression_in_ruleArgsExpression4928 = new BitSet(new long[]{0x00000000A8040002L,0x0000000000000020L});
    public static final BitSet FOLLOW_29_in_ruleArgsExpression4960 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleCastingExpression_in_ruleArgsExpression4981 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleArgsExpression4993 = new BitSet(new long[]{0x00000000A8040002L,0x0000000000000020L});
    public static final BitSet FOLLOW_31_in_ruleArgsExpression5025 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleCastingExpression_in_ruleArgsExpression5046 = new BitSet(new long[]{0x00000000A8040002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleArgsExpression5078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleObjectName_in_ruleArgsExpression5097 = new BitSet(new long[]{0x00000000A8040002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleArglist_in_entryRuleArglist5135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArglist5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastingExpression_in_ruleArglist5191 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleArglist5204 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleCastingExpression_in_ruleArglist5225 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleCastingExpression_in_entryRuleCastingExpression5263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastingExpression5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreatingExpression_in_ruleCastingExpression5323 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleCastingExpression5347 = new BitSet(new long[]{0x0000000004000010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleType_in_ruleCastingExpression5368 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCastingExpression5380 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleCreatingExpression_in_ruleCastingExpression5401 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleCreatingExpression_in_entryRuleCreatingExpression5439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreatingExpression5449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_ruleCreatingExpression5499 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleCreatingExpression5511 = new BitSet(new long[]{0x0000000004000010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleObjectName_in_ruleCreatingExpression5532 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCreatingExpression5543 = new BitSet(new long[]{0x00000000100403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleArglist_in_ruleCreatingExpression5564 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCreatingExpression5577 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleCreatingExpression5606 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_29_in_ruleCreatingExpression5619 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_ruleCreatingExpression5640 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCreatingExpression5652 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_29_in_ruleCreatingExpression5667 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCreatingExpression5679 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression5721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisExpression5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleParenthesisExpression5781 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleParenthesisExpression5793 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleParenthesisExpression5814 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleParenthesisExpression5826 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_rulePrimaryExpression5933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulePrimaryExpression5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulePrimaryExpression5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulePrimaryExpression5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression6040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteralExpression6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteralExpression6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralExpression6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_ruleLiteralExpression6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier6193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecifier6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTypeSpecifier6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleTypeSpecifier6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleTypeSpecifier6305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleTypeSpecifier6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleTypeSpecifier6363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleTypeSpecifier6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleTypeSpecifier6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleTypeSpecifier6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectName_in_ruleTypeSpecifier6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier6521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleModifier6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleModifier6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleModifier6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleModifier6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleModifier6646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleModifier6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleModifier6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleModifier6703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleModifier6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleModifier6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_entryRuleCharacter6782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacter6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharacter6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecimal_digits_in_entryRuledecimal_digits6877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledecimal_digits6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruledecimal_digits6928 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruledecimal_digits6949 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleDoStatement_in_entryRuleDoStatement6996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoStatement7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleDoStatement7043 = new BitSet(new long[]{0x0080100E048503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDoStatement7064 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleDoStatement7076 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDoStatement7088 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDoStatement7109 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDoStatement7121 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDoStatement7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexponent_part_in_entryRuleexponent_part7170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexponent_part7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleexponent_part7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral7258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral7269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecimal_integer_literal_in_ruleIntegerLiteral7316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehex_integer_literal_in_ruleIntegerLiteral7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoctal_integer_literal_in_ruleIntegerLiteral7382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecimal_integer_literal_in_entryRuledecimal_integer_literal7428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledecimal_integer_literal7439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecimal_digits_in_ruledecimal_integer_literal7486 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_NUMBER_SUFFIX_in_ruledecimal_integer_literal7507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehex_integer_literal_in_entryRulehex_integer_literal7555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulehex_integer_literal7566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehexa_numeral_in_rulehex_integer_literal7613 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_NUMBER_SUFFIX_in_rulehex_integer_literal7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehexa_numeral_in_entryRulehexa_numeral7682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulehexa_numeral7693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rulehexa_numeral7733 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_95_in_rulehexa_numeral7752 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_HEXA_in_rulehexa_numeral7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXA_in_rulehexa_numeral7795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoctal_integer_literal_in_entryRuleoctal_integer_literal7841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoctal_integer_literal7852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoctal_numeral_in_ruleoctal_integer_literal7899 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_NUMBER_SUFFIX_in_ruleoctal_integer_literal7920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoctal_numeral_in_entryRuleoctal_numeral7968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoctal_numeral7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ZERO_TO_SEVEN_in_ruleoctal_numeral8019 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral8066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecimal_digits_in_ruleFloatLiteral8125 = new BitSet(new long[]{0x0000000000040442L,0x0000000020000000L});
    public static final BitSet FOLLOW_18_in_ruleFloatLiteral8144 = new BitSet(new long[]{0x0000000000000442L,0x0000000020000000L});
    public static final BitSet FOLLOW_ruledecimal_digits_in_ruleFloatLiteral8169 = new BitSet(new long[]{0x0000000000000402L,0x0000000020000000L});
    public static final BitSet FOLLOW_ruleexponent_part_in_ruleFloatLiteral8199 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_FLOAT_SUFFIX_in_ruleFloatLiteral8222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFloatLiteral8250 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruledecimal_digits_in_ruleFloatLiteral8272 = new BitSet(new long[]{0x0000000000000402L,0x0000000020000000L});
    public static final BitSet FOLLOW_ruleexponent_part_in_ruleFloatLiteral8300 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_FLOAT_SUFFIX_in_ruleFloatLiteral8323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_entryRuleForStatement8371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForStatement8381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleForStatement8418 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleForStatement8430 = new BitSet(new long[]{0x0080100E040503F0L,0x00000000C7FFFF98L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleForStatement8452 = new BitSet(new long[]{0x0080100E000503F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement8480 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleForStatement8492 = new BitSet(new long[]{0x0080100E000503F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_16_in_ruleForStatement8511 = new BitSet(new long[]{0x0080100E000503F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement8533 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleForStatement8546 = new BitSet(new long[]{0x0080100E000503F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement8567 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleForStatement8580 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleForStatement8592 = new BitSet(new long[]{0x0080100E048503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleForStatement8613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement8649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement8659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleIfStatement8696 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIfStatement8708 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement8729 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIfStatement8741 = new BitSet(new long[]{0x0080100E048503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfStatement8762 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleIfStatement8775 = new BitSet(new long[]{0x0080100E048503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfStatement8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement8834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement8844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStatement8890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement8918 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatement8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleStatement8958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleStatement8985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoStatement_in_ruleStatement9012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_ruleStatement9039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_ruleStatement9066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryStatement_in_ruleStatement9093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_ruleStatement9120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleStatement9152 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStatement9164 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement9185 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleStatement9197 = new BitSet(new long[]{0x0080100E048503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement9218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleStatement9252 = new BitSet(new long[]{0x0080100E000503F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement9273 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatement9286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleStatement9320 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement9341 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatement9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement9386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleStatement9397 = new BitSet(new long[]{0x0080100E048503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement9418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleStatement9452 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement9464 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatement9477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleStatement9511 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement9523 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatement9536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStatement9569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement9606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchStatement9616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleSwitchStatement9653 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSwitchStatement9665 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchStatement9686 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSwitchStatement9698 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSwitchStatement9710 = new BitSet(new long[]{0x0080100E058503F0L,0x000007FBDFFFFF98L});
    public static final BitSet FOLLOW_104_in_ruleSwitchStatement9724 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchStatement9745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleSwitchStatement9757 = new BitSet(new long[]{0x0080100E058503F0L,0x000007FBDFFFFF98L});
    public static final BitSet FOLLOW_105_in_ruleSwitchStatement9777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleSwitchStatement9789 = new BitSet(new long[]{0x0080100E058503F0L,0x000007FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitchStatement9817 = new BitSet(new long[]{0x0080100E058503F0L,0x000007FBDFFFFF98L});
    public static final BitSet FOLLOW_24_in_ruleSwitchStatement9831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryStatement_in_entryRuleTryStatement9867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTryStatement9877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleTryStatement9914 = new BitSet(new long[]{0x0080100E048503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTryStatement9935 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_107_in_ruleTryStatement9948 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTryStatement9960 = new BitSet(new long[]{0x0000000004000010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTryStatement9981 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTryStatement9993 = new BitSet(new long[]{0x0080100E048503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTryStatement10014 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_108_in_ruleTryStatement10029 = new BitSet(new long[]{0x0080100E048503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTryStatement10050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement10088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rulewhile_statement10135 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulewhile_statement10147 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleExpression_in_rulewhile_statement10168 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulewhile_statement10180 = new BitSet(new long[]{0x0080100E048503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_rulewhile_statement10201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred5_InternalJavadsl791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred5_InternalJavadsl806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred35_InternalJavadsl3060 = new BitSet(new long[]{0x0080100E008403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleVariableInitializer_in_synpred35_InternalJavadsl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableInitializer_in_synpred37_InternalJavadsl3047 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_synpred37_InternalJavadsl3060 = new BitSet(new long[]{0x0080100E008403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleVariableInitializer_in_synpred37_InternalJavadsl3081 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_synpred37_InternalJavadsl3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred41_InternalJavadsl3410 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_34_in_synpred41_InternalJavadsl3428 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_35_in_synpred41_InternalJavadsl3446 = new BitSet(new long[]{0x0080100E000403F0L,0x00000000C0000398L});
    public static final BitSet FOLLOW_ruleBitExpression_in_synpred41_InternalJavadsl3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArglist_in_synpred78_InternalJavadsl4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred82_InternalJavadsl5025 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleCastingExpression_in_synpred82_InternalJavadsl5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred85_InternalJavadsl5347 = new BitSet(new long[]{0x0000000004000010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleType_in_synpred85_InternalJavadsl5368 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred85_InternalJavadsl5380 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleCreatingExpression_in_synpred85_InternalJavadsl5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArglist_in_synpred86_InternalJavadsl5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectName_in_synpred87_InternalJavadsl5532 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred87_InternalJavadsl5543 = new BitSet(new long[]{0x00000000100403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleArglist_in_synpred87_InternalJavadsl5564 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred87_InternalJavadsl5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred88_InternalJavadsl5619 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_synpred88_InternalJavadsl5640 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred88_InternalJavadsl5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred89_InternalJavadsl5667 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred89_InternalJavadsl5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred91_InternalJavadsl5793 = new BitSet(new long[]{0x00000000000403F0L,0x00000000C0000380L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_synpred91_InternalJavadsl5814 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred91_InternalJavadsl5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_synpred96_InternalJavadsl6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_synpred97_InternalJavadsl6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred98_InternalJavadsl6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_synpred116_InternalJavadsl6949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred125_InternalJavadsl8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_synpred132_InternalJavadsl8452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred133_InternalJavadsl8480 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred133_InternalJavadsl8492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred134_InternalJavadsl8533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred135_InternalJavadsl8567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_synpred136_InternalJavadsl8775 = new BitSet(new long[]{0x0080100E048503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred136_InternalJavadsl8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_synpred137_InternalJavadsl8890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred138_InternalJavadsl8918 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred138_InternalJavadsl8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred147_InternalJavadsl9273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_synpred158_InternalJavadsl9948 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred158_InternalJavadsl9960 = new BitSet(new long[]{0x0000000004000010L,0x0000000007FFFC00L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred158_InternalJavadsl9981 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred158_InternalJavadsl9993 = new BitSet(new long[]{0x0080100E048503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred158_InternalJavadsl10014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_synpred159_InternalJavadsl10029 = new BitSet(new long[]{0x0080100E048503F0L,0x000004FBDFFFFF98L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred159_InternalJavadsl10050 = new BitSet(new long[]{0x0000000000000002L});

}