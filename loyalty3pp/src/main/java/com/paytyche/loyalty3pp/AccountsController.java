package com.paytyche.loyalty3pp;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paytyche.account.objects.CheckMsisdnRequest;
import com.paytyche.account.objects.CheckMsisdnResponse;
import com.tlc.common.DataRow;
import com.tlc.common.DataRowCollection;
import com.tlc.common.SystemInfo;
import com.tlc.core.plugin.loader.modules.common.Subscriber;

@Controller
public class AccountsController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountsController.class);

	@RequestMapping(value = "/checkmsisdn", method = RequestMethod.POST)
	@ResponseBody
	public CheckMsisdnResponse checkMsisdn(
			@RequestHeader("Authorization") String authorization,
			@RequestBody CheckMsisdnRequest request) {
		CheckMsisdnResponse res = new CheckMsisdnResponse();
		Subscriber subs = new Subscriber(request.getMsisdn());
		res.setIsRegistered("NO");
		DataRowCollection dr = SystemInfo.getDb().QueryDataRows("SELECT CARDNUMBER FROM TBLLOYALTYCARDS WHERE MSISDN = ? AND STATUS = 'REGISTERED'", subs.getMsisdn());
		String facebookID = SystemInfo.getDb().QueryScalar("SELECT FACEBOOKID FROM TBLFACEBOOKINFO WHERE MSISDN = ?", "", subs.getMsisdn());
		
		logger.info("Authorization: " + authorization);
		
		if(dr.size() > 0) {
			res.setIsRegistered("YES");
			ArrayList<String> arr = new ArrayList<String>();
			for (DataRow r : dr) {
				arr.add(r.getString("CARDNUMBER"));
			}
			res.setCards(arr);
			res.setFacebookID(facebookID);
		}		
		return res;
	}
	
	
	
}