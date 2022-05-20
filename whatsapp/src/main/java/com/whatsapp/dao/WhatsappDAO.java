package com.whatsapp.dao;

import com.whatsapp.entity.WhatsappUser;

public class WhatsappDAO {

	public int createProfileDAO(WhatsappUser wu) {
		// TODO Auto-generated method stub
		if(wu.getNumber() == 1234) {
			return 1;
		}
		return 0;
	}
	

}
