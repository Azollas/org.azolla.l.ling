/*
 * @(#)Cfg0Test.java		Created at 2013-9-1
 * 
 * Copyright (c) 2011-2013 azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.open.ling.cfg;

import java.io.File;

import org.azolla.open.ling.cfg.test.TestRootNode;
import org.azolla.open.ling.io.Encoding;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.base.Stopwatch;

/**
 * The coder is very lazy, nothing to write for this Cfg0Test class
 *
 * @author 	sk@azolla.org
 * @since 	ADK1.0
 */
public class Cfg0Test
{
    private Stopwatch    stopwatch       = Stopwatch.createStarted();

    private TestRootNode testRootNode;

    private File         testDataCfgFile = new File(System.getProperty("user.dir"), "src/test/resources/" + Cfg0Test.this.getClass().getPackage().getName().replace('.', '/') + "/testDataCfg.xml");

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        System.out.println("===org.azolla.open.ling.cfg.Cfg0Test.setUpBeforeClass()");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
        System.out.println("===org.azolla.open.ling.cfg.Cfg0Test.tearDownAfterClass()");
    }

    @Before
    public void setUp() throws Exception
    {
        stopwatch = Stopwatch.createStarted();
        testRootNode = Cfg0.unmarshal(TestRootNode.class, testDataCfgFile);
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("===" + stopwatch.stop());
    }

    @Test
    public void testUnmarshal()
    {
        Assert.assertNotNull(Cfg0.unmarshal(TestRootNode.class, testDataCfgFile));
        Assert.assertNull(Cfg0.unmarshal(null, testDataCfgFile));
        Assert.assertNull(Cfg0.unmarshal(TestRootNode.class, null));
        Assert.assertNull(Cfg0.unmarshal(null, null));
    }

    @Test
    public void testMarshalTString()
    {
        Assert.assertTrue(Cfg0.marshal(testRootNode, testDataCfgFile));
        Assert.assertFalse(Cfg0.marshal(testRootNode, null));
        Assert.assertFalse(Cfg0.marshal(null, testDataCfgFile));
        Assert.assertFalse(Cfg0.marshal(null, null));
    }

    @Test
    public void testMarshalTStringEncoding()
    {
        Assert.assertTrue(Cfg0.marshal(testRootNode, testDataCfgFile, Encoding.UTF8));
        Assert.assertTrue(Cfg0.marshal(testRootNode, testDataCfgFile, null));
        Assert.assertFalse(Cfg0.marshal(testRootNode, null, Encoding.UTF8));
        Assert.assertFalse(Cfg0.marshal(testRootNode, null, null));
        Assert.assertFalse(Cfg0.marshal(null, testDataCfgFile, Encoding.UTF8));
        Assert.assertFalse(Cfg0.marshal(null, testDataCfgFile, null));
        Assert.assertFalse(Cfg0.marshal(null, null, Encoding.UTF8));
        Assert.assertFalse(Cfg0.marshal(null, null, null));
    }
}
