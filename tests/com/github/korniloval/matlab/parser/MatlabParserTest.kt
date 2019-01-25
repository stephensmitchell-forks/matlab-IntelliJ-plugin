package com.github.korniloval.matlab.parser

import com.github.korniloval.matlab.MatlabParserDefinition
import com.intellij.testFramework.ParsingTestCase

open class MatlabParserTest : ParsingTestCase("", "m", MatlabParserDefinition()) {

    override fun getTestDataPath(): String = "testData/parser"

    fun doTest() = doTest(true)

    fun testNumbers() = doTest()
    fun testFileOperations() = doTest()
    fun testWhileLoop() = doTest()
    fun testForLoop() = doTest()
    fun testIf() = doTest()
    fun testFunctionCall() = doTest()
    fun testFunctionDeclaration() = doTest()
    fun testClassDeclaration() = doTest()
    fun testPropertyAccess() = doTest()
    fun testStrings() = doTest()
    fun testOneSingleQuote() = doTest()
    fun testSingleQuote() = doTest()
    fun testComments() = doTest()
    fun testCellArray() = doTest()
    fun testMatrix() = doTest()
    fun testLambda() = doTest()
    fun testSwitch() = doTest()
    fun testExpressions() = doTest()
}