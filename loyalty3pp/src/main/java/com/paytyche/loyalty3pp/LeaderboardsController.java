package com.paytyche.loyalty3pp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paytyche.leaderboards.objects.LeaderboardsRequest;
import com.paytyche.leaderboards.objects.LeaderboardsResponse;
import com.tlc.common.Util;

@Controller
public class LeaderboardsController {

	private static final Logger logger = LoggerFactory.getLogger(LeaderboardsController.class);
		
	@RequestMapping(value = "/leaders", method = RequestMethod.POST)
	@ResponseBody
	public LeaderboardsResponse getLeaders(@RequestBody LeaderboardsRequest request) {
		logger.info("Inside getLeaders method, merchantID: " + request.getMerchantID());
		logger.info("working directory: " + Util.getWorkingDirectory());
		return new LeaderboardsResponse();
	}
	
}