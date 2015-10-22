package com.easemob.weichat.konwledge.persistence.es;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.easemob.weichat.konwledge.App;
import com.easemob.weichat.konwledge.KefuKonwledge;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class KefuKonwledgeRepositoryTest {

	@Autowired
	KefuKonwledgeRepository repository;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() {
        for (int i = 1; i < 10; i++) {
            repository.save(new KefuKonwledge(i + "", i, "问题test" + i, "答案test" + i));
        }
	}
	
	@Test
	public void testSearchQueryBuilder() {
		fail("Not yet implemented");
	}



	@Test
	public void testSaveIterableOfS() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteID() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteT() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteIterableOfQextendsT() {
		fail("Not yet implemented");
	}

}
