package com.sappress.hcpbook.chp03;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class ReadingListManagerBean
 */
@Stateful
@LocalBean
public class ReadingListManagerBean implements ReadingListManagerBeanLocal {
    
	private List<String> readingList = new ArrayList<String>();
	
    /**
     * Default constructor. 
     */
    public ReadingListManagerBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addTitle(String title) {
		readingList.add(title);
	}

	@Override
	public boolean removeTitle(String title) {
		return readingList.remove(title);
	}

	@Override
	public int getCount() {
		return readingList.size();
	}

	@Override
	public List<String> getReadingList() {
		return readingList;
	}

}
