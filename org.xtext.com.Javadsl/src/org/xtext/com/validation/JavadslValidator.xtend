/*
 * generated by Xtext
 */
package org.xtext.com.validation

import org.eclipse.xtext.validation.Check
import org.xtext.com.javadsl.IfStatement
import org.xtext.com.javadsl.JavadslPackage
import org.xtext.com.javadsl.LogicalExpression
import org.xtext.com.javadsl.MethodDeclaration
import org.xtext.com.javadsl.ObjectType
import org.xtext.com.javadsl.ReturnStatement
import org.xtext.com.javadsl.TestingExpression
import org.xtext.com.javadsl.VariableDeclaration
import org.xtext.com.javadsl.VoidType

//import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class JavadslValidator extends AbstractJavadslValidator {
	
	@Check
	def checkType(VariableDeclaration v){
		if(!v.type.specifier.class.equals(
			v.variable_declarator.variable_initializer.expr.literal.class
		)){
			error("Invalid type " + v.type.specifier.name + " required", JavadslPackage.Literals.VARIABLE_DECLARATION__TYPE)
			return
		}
	}
	
	@Check
	def checkType(IfStatement statement){
		if(!(statement.expression instanceof LogicalExpression) && !(statement.expression instanceof TestingExpression)){
			error("It's not boolean", JavadslPackage.Literals.IF_STATEMENT__EXPRESSION)
			return
		}
	}
	
	@Check
	def checkMethod(MethodDeclaration m){
		val return_statements = m.body.statements.filter(typeof(ReturnStatement))
		if(!(m.type.specifier instanceof VoidType) && return_statements.isEmpty){
			error("Method should return "+ m.type.specifier.name, JavadslPackage.Literals.METHOD_DECLARATION__TYPE)
			return
		}
		for(st: return_statements){
			if((m.type.specifier instanceof ObjectType) && !st.return_expression.literal.equals(m.type.specifier)){
				error("Method should return "+ m.type.specifier.name + " type", JavadslPackage.Literals.METHOD_DECLARATION__TYPE)
				return
			}else if(m.type.specifier instanceof VoidType){
				error("Void methods can't return a value", JavadslPackage.Literals.METHOD_DECLARATION__TYPE)
				return
			}else if(!m.type.specifier.class.equals(st.return_expression.literal.class)){
				error("Method should return " + m.type.specifier.name, JavadslPackage.Literals.METHOD_DECLARATION__TYPE)
				return
			}
		}
	}
}