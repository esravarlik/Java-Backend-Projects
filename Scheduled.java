@Scheduled(cron = "0 35 8 * * *") // Daily at midnight '0 0 0': saat, dakika, saniye '* * *': gun, ay, haftanın gunu
    //her gün 8:35 de calısacak sekilde tetiklenir

    public void deleteOldFiles() throws InterruptedException {
        LocalDate thresholdDate = LocalDate.now().minusMonths(MAX_TIME_TO_FILE);
        logger.info("Computing price at "+ LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
        registeredFileRepository.deleteByCreatedDateBefore(Date.from(thresholdDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }

/*
    "0 0 * * * *" = Hergün her zaman çalışır.
    "10 * * * * *" = Hergün 10 saniyede bir çalışır.
    "0 0 8-10 * * *" = Hergün 8, 9 ve 10 saatinde çalışır.
    "0 0/30 8-10 * * *" = Hergün 8:00, 8:30, 9:00, 9:30 ve 10 saatinde çalışır.
    "0 0 9-17 * * MON-FRI" = Her zaman Pazartesiden Cumaya kadar saat 9 ile 17 saatleri arasında çalışır.

*/
