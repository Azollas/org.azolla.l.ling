/*
 * @(#)ExceptionTest.java		Created at 2013-2-23
 * 
 * Copyright (c) 2011-2013 azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.open.common;

import org.azolla.open.common.exception.AzollaExceptionTest;
import org.azolla.open.common.exception.CodeTests;
import org.azolla.open.common.io.FileHelperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The coder is very lazy, nothing to write for this ExceptionTest class
 *
 * @author 	sk@azolla.org
 * @version 1.0.0
 * @since 	ADK1.0
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({AzollaExceptionTest.class, CodeTests.class, FileHelperTest.class})
public class ExceptionTests
{

}