package com.aptana.git.core.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.aptana.git.core.model.GitExecutableTest;
import com.aptana.git.core.model.GitRefTest;
import com.aptana.git.core.model.GitRepositoryTest;
import com.aptana.git.core.model.GitRevSpecifierTest;

public class AllTests
{

	public static Test suite()
	{
		TestSuite suite = new TestSuite(AllTests.class.getName());
		// $JUnit-BEGIN$
		suite.addTestSuite(GitExecutableTest.class);
		suite.addTestSuite(GitRefTest.class);
		suite.addTestSuite(GitRepositoryTest.class);
		suite.addTestSuite(GitRevSpecifierTest.class);
		// $JUnit-END$
		return suite;
	}

}
