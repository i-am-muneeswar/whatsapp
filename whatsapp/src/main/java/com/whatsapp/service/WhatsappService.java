package com.whatsapp.service;

import com.whatsapp.dao.WhatsappDAO;
import com.whatsapp.entity.WhatsappUser;

public class WhatsappService {

	public int createProfileService(WhatsappUser wu) {
		// TODO Auto-generated method stub
		WhatsappDAO wd = new WhatsappDAO();
		int i = wd.createProfileDAO(wu);
		return i;
	}
	
	

}
