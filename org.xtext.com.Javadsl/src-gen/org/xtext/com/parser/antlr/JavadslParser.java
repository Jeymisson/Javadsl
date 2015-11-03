/*
 * generated by Xtext
 */
package org.xtext.com.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.com.services.JavadslGrammarAccess;

public class JavadslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private JavadslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.com.parser.antlr.internal.InternalJavadslParser createParser(XtextTokenStream stream) {
		return new org.xtext.com.parser.antlr.internal.InternalJavadslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Head";
	}
	
	public JavadslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JavadslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
