/*
 * @(#)FileHelperTest.java		Created at 2013-4-29
 * 
 * Copyright (c) 2011-2013 azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.io;

import java.io.File;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.collect.Lists;

/**
 * The coder is very lazy, nothing to write for this FileHelperTest class
 *
 * @author 	sk@azolla.org
 * @since 	ADK1.0
 */
public class FileHelperTest
{
	private String				currentMethodName	= "";

	private List<File>			fileList			= Lists.newArrayList();

	private List<String>		stringList			= Lists.newArrayList();

	private static final File	testDir				= FileHelper.createFile(FileHelper.getUserDir(), "src", "test",
															"resources", "org", "azolla", "io");

	/**
	 * The coder is very lazy, nothing to write for this setUpBeforeClass method
	 * 
	 * @throws java.lang.Exception void
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		File f = new File(testDir, System.currentTimeMillis() + ".txt");
		f.createNewFile();
	}

	/**
	 * The coder is very lazy, nothing to write for this tearDownAfterClass method
	 * 
	 * @throws java.lang.Exception void
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		FileHelper.delFiles(testDir);
	}

	/**
	 * The coder is very lazy, nothing to write for this setUp method
	 * 
	 * @throws java.lang.Exception void
	 */
	@Before
	public void setUp() throws Exception
	{
		fileList = Lists.newArrayList();
		stringList = Lists.newArrayList();
	}

	/**
	 * The coder is very lazy, nothing to write for this tearDown method
	 * 
	 * @throws java.lang.Exception void
	 */
	@After
	public void tearDown() throws Exception
	{
		System.out.println(currentMethodName + "===fileList===");
		for(File f : fileList)
		{
			System.out.println(f.getAbsolutePath());
		}

		System.out.println();
		System.out.println(currentMethodName + "===stringList===");
		for(String s : stringList)
		{
			System.out.println(s);
		}
	}

	@Test
	public void testAllFilePathsFile()
	{
		currentMethodName = "testAllFilePathsFile";
		stringList = FileHelper.allFilePaths(testDir);
	}

	@Test
	public void testAllFilePathsString()
	{
		currentMethodName = "testAllFilePathsString";
		stringList = FileHelper.allFilePaths(testDir.getAbsolutePath());
	}

	@Test
	public void testAllFileFile()
	{
		currentMethodName = "testAllFileFile";
		fileList = FileHelper.allFiles(testDir);
	}

	@Test
	public void testAllFileString()
	{
		currentMethodName = "testAllFileString";
		fileList = FileHelper.allFiles(testDir.getAbsolutePath());
	}

	@Test
	public void testToLegalFileNameString()
	{
		Assert.assertEquals("[____________]", FileHelper.toLegalFileName(FileHelper.ILLEGAL_FILENAME_REGEX));
	}

	@Test
	public void testToLegalFileNameStringString()
	{
		Assert.assertEquals("[++++++++++++]", FileHelper.toLegalFileName(FileHelper.ILLEGAL_FILENAME_REGEX, "+"));
	}

	/**
	 * Test method for {@link org.azolla.io.FileHelper#getFileType(java.io.File)}.
	 */
	@Test
	public void testGetFileTypeFile()
	{
		currentMethodName = "testGetFileTypeFile";
		//		Assert.assertSame("txt", FileHelper.getFileType(FileHelper.getFile(FileHelper.getUserDir(), "src", "test",
		//				"resources", "readme.txt")));
		Assert.assertEquals("txt", FileHelper.getFileType(FileHelper.createFile(FileHelper.getUserDir(), "src", "test",
				"resources", "readme.txt")));
	}

	/**
	 * Test method for {@link org.azolla.io.FileHelper#getFileType(java.lang.String)}.
	 */
	@Test
	public void testGetFileTypeString()
	{
		currentMethodName = "testGetFileTypeString";
		//		Assert.assertSame(
		//				"txt",
		//				FileHelper.getFileType(FileHelper.getFile(FileHelper.getUserDir(), "src", "test", "resources",
		//						"readme.txt").getAbsolutePath()));
		Assert.assertEquals(
				"txt",
				FileHelper.getFileType(FileHelper.createFile(FileHelper.getUserDir(), "src", "test", "resources",
						"readme.txt").getAbsolutePath()));
	}

	@Test
	public void testCreateFileStrings()
	{
		System.out.println(FileHelper.createFile());
		//		System.out.println(FileHelper.createFile(null));
	}

	public static void main(String[] args)
	{
		System.out.println(System.getProperty("user.dir"));
		System.out.println(FileHelper.toLegalFileName(FileHelper.ILLEGAL_FILENAME_REGEX));

		String s = null;
		List<String> stringList = Lists.newArrayList(s);
		System.out.println(stringList.get(0));

		File f = null;
		List<File> fileList = Lists.newArrayList(f);
		System.out.println(fileList.get(0));

	}

}