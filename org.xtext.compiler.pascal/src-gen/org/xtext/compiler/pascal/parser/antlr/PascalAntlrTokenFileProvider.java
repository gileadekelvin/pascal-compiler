/*
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PascalAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/compiler/pascal/parser/antlr/internal/InternalPascalParser.tokens");
	}
}
