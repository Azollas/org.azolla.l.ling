/*
 * @(#)ExceptionCoder.java		Created at 2013-2-23
 * 
 * Copyright (c) 2011-2013 azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.l.ling.exception.code;

/**
 * Exception Code
 * 
 * <p>[0]					:UnAzolla Exception
 * 
 * 
 * <p>[10,99]				:For Azoll Core
 * 
 * <p>[10000,99999]			:For Azolla Component
 * <p>[10000,19999]         :For Azolla Component(Java)
 * <p>[20000,29999]         :For Azolla Component(Ling)
 * 
 * <p>[10000000,99999999]	:For Azolla Application
 * 
 * 
 * <p>[100,999]				:Third Core Code
 * <p>[100000,999999] 		:Third Component Code
 * <p>[100000000,999999999]	:Third Application Code
 * 
 * @author 	sk@azolla.org
 * @since 	ADK1.0
 */
public interface ErrorCoder
{
    //Get Error Code
    int getCode();
}
