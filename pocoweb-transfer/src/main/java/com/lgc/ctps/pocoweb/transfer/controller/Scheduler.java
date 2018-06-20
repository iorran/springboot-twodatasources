package com.lgc.ctps.pocoweb.transfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Scheduler {
	@Autowired
	private Transfer transfer;

	private static final String TIME_ZONE = "America/Sao_Paulo";

	@Scheduled(cron = "*/1111 * * * * *", zone = TIME_ZONE)
	public void syncAllData15Minutes() {
//		transfer.syncAllData();
	}


	@Scheduled(cron = "*/1 * * * * *", zone = TIME_ZONE)
	public void syncWell15Minutes() {
//		transfer.syncWell("Mestre Álvaro");
	}
}
