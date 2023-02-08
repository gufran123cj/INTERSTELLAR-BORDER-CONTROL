import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Main {
    static Random r = new Random();
    static Player player = new Player("Player", 0, 100, 0);
    public static boolean start = false;
    public static boolean input = false;
    public static boolean choiceClicked = false;
    public static String planetName = "";
    public static boolean hotBool = false;
    public static boolean coldBool = false;
    public static boolean earthBool = false;
    static Queue<String> errors = new LinkedList<>();
    public static void main(String[] args) throws Exception {
        Planet planet = getPlanet(planetName);
        String playerName = "Fil Necati";
        player.setName(playerName);
        loop(planet);
        
        
    }
    //Alien races : Sura,Argonian,Human,Polymand,Piront,Gagot
    //intelligence 0-300, strength 0-10, reputation 0-10(0: very bad reputation criminal,10: very good reputation celebrity) ,body temperature cold,warm,hot 
    //languages : Sura:"Tengwar",Argonian:"Jel",Human:"Türkçe",Piront"Hutuquni",Gagot:"Uryuomoco"
    //crimes: "Murder","Theft","Fraud"
    static void loop(Planet planet) throws InterruptedException{
        boolean a = true;
        while(true){
            Thread.sleep(100);
            if(a){
                new App();
                a = false;
            }
            if(start){
                if(hotBool){
                    planet = getPlanet(planetName);
                    HotNewWindow.printToPlanetInfoPanel(planet.toString());
                    HotNewWindow.printToErrorPanel(planet.getName());
                    int randAlienInt = r.nextInt(5);
                    // int randAlienInt = 2;
                    Piront piront = null;
                    Human human = null;
                    Argonian argonian = null;
                    Gagot gagot = null;
                    Sura sura = null;
                    Alien alien = null;
                    if(randAlienInt == 0) {
                        gagot = createGagots(planet)[r.nextInt(2)];
                        HotNewWindow.printToInfoPanel(gagot.toString());
                        alien = gagot;
                    }if(randAlienInt == 1){
                        sura  = createSuras(planet)[r.nextInt(2)];
                        HotNewWindow.printToInfoPanel(sura.toString());
                        alien = sura;
                    }if(randAlienInt == 2){
                        argonian  = createArgonians(planet)[r.nextInt(2)];
                        HotNewWindow.printToInfoPanel(argonian.toString());
                        alien = argonian;
                    }if(randAlienInt == 3){
                        human  = createHumans(planet)[r.nextInt(2)];
                        HotNewWindow.printToInfoPanel(human.toString());
                        alien = human;
                    }if(randAlienInt == 4){
                        piront  = createPironts(planet)[r.nextInt(2)];
                        HotNewWindow.printToInfoPanel(piront.toString());
                        alien = piront;
                    }
                    HotNewWindow.printToErrorPanel("A(n) " + alien.getClass().getCanonicalName() + " named " + alien.getName() + " just came in.");
                    Thread.sleep(2000);
                    if(alien.getReputation() < 3){
                        String error = alien.getName() + " has a very bad reputation!!";
                        HotNewWindow.printToErrorPanel(error);
                    }
                    else if(alien.getReputation() < 5){ 
                        String error = alien.getName() + " has a bad reputation!";
                        HotNewWindow.printToErrorPanel(error);
                    }
                    else if(alien.getReputation() > 7){
                        String error = alien.getName() + " has a very good reputation!!";
                        HotNewWindow.printToErrorPanel(error);
                    }
                    Thread.sleep(2000);
                    HotNewWindow.printToErrorPanel("Carefully check " + alien.getName() + "'s attributes and decide if it can enter the planet or not!!");
                    while(!choiceClicked){
                        Thread.sleep(100);
                    }
                    choiceClicked = false;
                    int paymentPerCorrectChoice = 100;
                    int mistakeCharge = 500;
                    Boolean controlResult = null;
                    if(randAlienInt == 0) {
                        controlResult = canGagotEnter(gagot, planet);
                    }if(randAlienInt == 1){
                        controlResult = canSuraEnter(sura,planet);
                    }if(randAlienInt == 2){
                        controlResult = canArgonianEnter(argonian,planet);
                    }if(randAlienInt == 3){
                        controlResult = canHumanEnter(human,planet);
                    }if(randAlienInt == 4){
                        controlResult = canPirontEnter(piront,planet);
                    }

                    if(input == false && controlResult == true){
                        HotNewWindow.printToErrorPanel("Wrong choice! " + alien.getName() + " should've been free to enter the planet!");
                        if(player.getErorrs() >= 2){
                            HotNewWindow.printToErrorPanel("You can't keep making mistakes! -" + mistakeCharge + " " + planet.getCurrency());
                            mistakeCharge+= 500;
                        }
                    }else if(input == true && controlResult == false){
                        HotNewWindow.printToErrorPanel("Wrong choice! " + errorsToString());
                        if(player.getErorrs() >= 2){
                            HotNewWindow.printToErrorPanel("You can't keep making mistakes! -" + mistakeCharge + " " + planet.getCurrency());
                            mistakeCharge+= 500;                }
                    }else if(input == controlResult){
                        HotNewWindow.printToErrorPanel("Correct choice! +" + paymentPerCorrectChoice + " " + planet.getCurrency());
                        player.setMoney(player.getMoney() + paymentPerCorrectChoice);
                    }
                    errors = new LinkedList<>();
                    Thread.sleep(10000);
                    HotNewWindow.clearErrorPanel();
                }
                if(coldBool){
                    planet = getPlanet(planetName);
                    ColdNewWindow.printToPlanetInfoPanel(planet.toString());
                    ColdNewWindow.printToErrorPanel(planet.getName());
                    int randAlienInt = r.nextInt(5);
                    Piront piront = null;
                    Human human = null;
                    Argonian argonian = null;
                    Gagot gagot = null;
                    Sura sura = null;
                    Alien alien = null;
                    if(randAlienInt == 0) {
                        gagot = createGagots(planet)[r.nextInt(2)];
                        ColdNewWindow.printToInfoPanel(gagot.toString());
                        alien = gagot;
                    }if(randAlienInt == 1){
                        sura  = createSuras(planet)[r.nextInt(2)];
                        ColdNewWindow.printToInfoPanel(sura.toString());
                        alien = sura;
                    }if(randAlienInt == 2){
                        argonian  = createArgonians(planet)[r.nextInt(2)];
                        ColdNewWindow.printToInfoPanel(argonian.toString());
                        alien = argonian;
                    }if(randAlienInt == 3){
                        human  = createHumans(planet)[r.nextInt(2)];
                        ColdNewWindow.printToInfoPanel(human.toString());
                        alien = human;
                    }if(randAlienInt == 4){
                        piront  = createPironts(planet)[r.nextInt(2)];
                        ColdNewWindow.printToInfoPanel(piront.toString());
                        alien = piront;
                    }
                    ColdNewWindow.printToErrorPanel("A(n) " + alien.getClass().getCanonicalName() + " named " + alien.getName() + " just came in.");
                    Thread.sleep(2000);
                    if(alien.getReputation() < 3){
                        String error = alien.getName() + " has a very bad reputation!!";
                        ColdNewWindow.printToErrorPanel(error);
                    }
                    else if(alien.getReputation() < 5){ 
                        String error = alien.getName() + " has a bad reputation!";
                        ColdNewWindow.printToErrorPanel(error);
                    }
                    else if(alien.getReputation() > 7){
                        String error = alien.getName() + " has a very good reputation!!";
                        ColdNewWindow.printToErrorPanel(error);
                    }
                    Thread.sleep(2000);
                    ColdNewWindow.printToErrorPanel("Carefully check " + alien.getName() + "'s attributes and decide if it can enter the planet or not!!");
                    while(!choiceClicked){
                        Thread.sleep(100);
                    }
                    choiceClicked = false;
                    int paymentPerCorrectChoice = 100;
                    int mistakeCharge = 500;
                    Boolean controlResult = null;
                    if(randAlienInt == 0) {
                        controlResult = canGagotEnter(gagot, planet);
                    }if(randAlienInt == 1){
                        controlResult = canSuraEnter(sura,planet);
                    }if(randAlienInt == 2){
                        controlResult = canArgonianEnter(argonian,planet);
                    }if(randAlienInt == 3){
                        controlResult = canHumanEnter(human,planet);
                    }if(randAlienInt == 4){
                        controlResult = canPirontEnter(piront,planet);
                    }

                    if(input == false && controlResult == true){
                        ColdNewWindow.printToErrorPanel("Wrong choice! " + alien.getName() + " should've been free to enter the planet!");
                        if(player.getErorrs() >= 2){
                            ColdNewWindow.printToErrorPanel("You can't keep making mistakes! -" + mistakeCharge + " " + planet.getCurrency());
                            mistakeCharge+= 500;
                        }
                    }else if(input == true && controlResult == false){
                        ColdNewWindow.printToErrorPanel("Wrong choice! " + errorsToString());
                        if(player.getErorrs() >= 2){
                            ColdNewWindow.printToErrorPanel("You can't keep making mistakes! -" + mistakeCharge + " " + planet.getCurrency());
                            mistakeCharge+= 500;                
                        }
                    }else if(input == controlResult){
                        ColdNewWindow.printToErrorPanel("Correct choice! +" + paymentPerCorrectChoice + " " + planet.getCurrency());
                        player.setMoney(player.getMoney() + paymentPerCorrectChoice);
                    }
                    errors = new LinkedList<>();
                    Thread.sleep(10000);
                    ColdNewWindow.clearErrorPanel();
                }
                if(earthBool){
                        planet = getPlanet(planetName);
                        EarthNewWindow.printToPlanetInfoPanel(planet.toString());
                        EarthNewWindow.printToErrorPanel(planet.getName());
                        int randAlienInt = r.nextInt(5);
                        Piront piront = null;
                        Human human = null;
                        Argonian argonian = null;
                        Gagot gagot = null;
                        Sura sura = null;
                        Alien alien = null;
                        if(randAlienInt == 0) {
                            gagot = createGagots(planet)[r.nextInt(2)];
                            EarthNewWindow.printToInfoPanel(gagot.toString());
                            alien = gagot;
                        }if(randAlienInt == 1){
                            sura  = createSuras(planet)[r.nextInt(2)];
                            EarthNewWindow.printToInfoPanel(sura.toString());
                            alien = sura;
                        }if(randAlienInt == 2){
                            argonian  = createArgonians(planet)[r.nextInt(2)];
                            EarthNewWindow.printToInfoPanel(argonian.toString());
                            alien = argonian;
                        }if(randAlienInt == 3){
                            human  = createHumans(planet)[r.nextInt(2)];
                            EarthNewWindow.printToInfoPanel(human.toString());
                            alien = human;
                        }if(randAlienInt == 4){
                            piront  = createPironts(planet)[r.nextInt(2)];
                            EarthNewWindow.printToInfoPanel(piront.toString());
                            alien = piront;
                        }
                        EarthNewWindow.printToErrorPanel("A(n) " + alien.getClass().getCanonicalName() + " named " + alien.getName() + " just came in.");
                        Thread.sleep(2000);
                        if(alien.getReputation() < 3){
                            String error = alien.getName() + " has a very bad reputation!!";
                            EarthNewWindow.printToErrorPanel(error);
                        }
                        else if(alien.getReputation() < 5){ 
                            String error = alien.getName() + " has a bad reputation!";
                            EarthNewWindow.printToErrorPanel(error);
                        }
                        else if(alien.getReputation() > 7){
                            String error = alien.getName() + " has a very good reputation!!";
                            EarthNewWindow.printToErrorPanel(error);
                        }
                        Thread.sleep(2000);
                        EarthNewWindow.printToErrorPanel("Carefully check " + alien.getName() + "'s attributes and decide if it can enter the planet or not!!");
                        while(!choiceClicked){
                            Thread.sleep(100);
                        }
                        choiceClicked = false;
                        int paymentPerCorrectChoice = 100;
                        int mistakeCharge = 500;
                        Boolean controlResult = null;
                        if(randAlienInt == 0) {
                            controlResult = canGagotEnter(gagot, planet);
                        }if(randAlienInt == 1){
                            controlResult = canSuraEnter(sura,planet);
                        }if(randAlienInt == 2){
                            controlResult = canArgonianEnter(argonian,planet);
                        }if(randAlienInt == 3){
                            controlResult = canHumanEnter(human,planet);
                        }if(randAlienInt == 4){
                            controlResult = canPirontEnter(piront,planet);
                        }
    
                        if(input == false && controlResult == true){
                            EarthNewWindow.printToErrorPanel("Wrong choice! " + alien.getName() + " should've been free to enter the planet!");
                            if(player.getErorrs() >= 2){
                                EarthNewWindow.printToErrorPanel("You can't keep making mistakes! -" + mistakeCharge + " " + planet.getCurrency());
                                mistakeCharge+= 500;
                            }
                        }else if(input == true && controlResult == false){
                            EarthNewWindow.printToErrorPanel("Wrong choice! " + errorsToString());
                            if(player.getErorrs() >= 2){
                                EarthNewWindow.printToErrorPanel("You can't keep making mistakes! -" + mistakeCharge + " " + planet.getCurrency());
                                mistakeCharge+= 500;                
                            }
                        }else if(input == controlResult){
                            EarthNewWindow.printToErrorPanel("Correct choice! +" + paymentPerCorrectChoice + " " + planet.getCurrency());
                            player.setMoney(player.getMoney() + paymentPerCorrectChoice);
                        }
                        errors = new LinkedList<>();
                        Thread.sleep(10000);
                        EarthNewWindow.clearErrorPanel();
                    
                }
                
            }
        }
    }
    static String errorsToString(){
        String string = "";
        while(errors.peek() != null){
            string += "\n->" + errors.poll();
        }
        return string;
    }
    static Planet getPlanet(String string){
        //{"Millenium Falcon", "Sunset", "Goliath", "Moonlight","NA-2708","Hitac","Streuner"};
        //{"LF-4","Proton Beam Cannon","Gauss Cannon","Prometheus Laser","Cannon","AK-47"}
        //crimes: "Murder","Theft","Fraud"
        //like atlantis
        Planet[] planets = new Planet[3];
        City[] pl1Cities = getCities("4546B"); 
        String[] pl1Documents = new String[]{"Document-1","Document-5"};
        String[] pl1BannedShips = new String[]{"Goliath","Sunset","Hitac"};
        String[] pl1BannedWeapons = new String[]{"Gauss Cannon","Proton Beam Cannon"};
        String[] pl1BannedRaces = new String[]{"Piront","Sura","Argonian"};
        String[] pl1BannedCriminalRecords = new String[]{"Murder","Theft","Fraud"};
        Planet pl1 = new Planet("2,570,000,000", "Gagot", "4546B", pl1Cities, "Water", "Cold", pl1Documents, 
        1000, "Milksa", "Oxygen", 500, 200, pl1BannedShips, pl1BannedWeapons, 
        pl1BannedRaces,pl1BannedCriminalRecords, false,200);
        planets[0] = pl1;
        //like new york
        City[] pl2Cities = getCities("Coruscant"); 
        String[] pl2Documents = new String[]{"Document-1","Document-3","Document-4"};
        String[] pl2BannedShips = new String[]{};
        String[] pl2BannedWeapons = new String[]{"LF-4","AK-47"};
        String[] pl2BannedRaces = new String[]{"Piront"};
        String[] pl2BannedCriminalRecords = new String[]{"Murder"};
        Planet pl2 = new Planet("83,000,000,000", "Multinational", "Coruscant", pl2Cities, "Earth", "Warm", 
        pl2Documents, 25000, "Credits", "Oxygen", 500, 1000, pl2BannedShips, pl2BannedWeapons,
         pl2BannedRaces, pl2BannedCriminalRecords, false, 0);
        planets[1] = pl2;
        //like texas
        City[] pl3Cities = getCities("Tatooine"); 
        String[] pl3Documents = new String[]{"Document-2"};
        String[] pl3BannedShips = new String[]{"NA-2708"};
        String[] pl3BannedWeapons = new String[]{};
        String[] pl3BannedRaces = new String[]{"Piront"};
        String[] pl3BannedCriminalRecords = new String[]{};
        Planet pl3 = new Planet("1,890,000,000", "Piront", "Tatooine", pl3Cities, "Desert", "Hot", 
        pl3Documents, 500, "Bobux", "Carbondioxide", 100000, 10000, pl3BannedShips, pl3BannedWeapons,
         pl3BannedRaces, pl3BannedCriminalRecords, false, 100);
        planets[2] = pl3;
        Planet planet = null;
        for (Planet pl : planets) {
            if(pl.getName().equals(string)){
                planet = pl;
            }
         }
        return planet;
    }
    static Boolean canAlienEnter(Alien alien, Planet planet){
        //body temp = cold,warm,hot, planet climate = cold,warm,hot
        if(!alien.getBodyTemperature().equals(planet.getClimate()) || alien.getBodyTemperature().equals("All")){
            String error = "Planets climate isn't suitable for this alien.";
            alien.setAccepted(false);
            errors.add(error);
        }
        int count = 0;
        Queue<String> missingDocs = new LinkedList<String>();
        for (String document : planet.getNecessaryDocumentsForEntry()) {
            for (String alienDocument : alien.getDocuments()) {
                if(alienDocument != null)if(alienDocument.equals(document)) {
                    count++;
                }else{
                    missingDocs.add(alienDocument);
                }
            }
        }
        if(count < 1){
            String missingDocsString = "";
            while(!missingDocs.isEmpty()){missingDocsString += " " + missingDocs.poll();}
            String error = alien.getName() + " has missing documents. Missing documents:" + missingDocsString;
            alien.setAccepted(false);
            errors.add(error);
        }
        if(alien.getMoney()<planet.getEntryFee()){
            String error = alien.getName() + " doesn't have enough money." + alien.getName() + "'s money: " + alien.getMoney();
            alien.setAccepted(false);
            errors.add(error);
        }
        if(!alien.getMoneyCurrency().equals(planet.getCurrency())){
            String error = alien.getName() + " has money with a different currency that is not accepted in this planet." + alien.getName() + "'s currency is: " + alien.getMoneyCurrency();
            alien.setAccepted(false);
            errors.add(error);
        }
        if(!alien.getSuitableAtmosphere().equals(planet.getAtmosphere()) && !alien.getSuitableAtmosphere().equals("All")){
            String error = alien.getName() + " can't breath in this planets atmosphere."  + alien.getName() + " can only breath " + alien.getSuitableAtmosphere() + " while " + planet.getName() + "'s atmosphere is " + planet.getAtmosphere();
            alien.setAccepted(false);
            errors.add(error);
        }
        if(alien.getShip().getCargoWeight() > planet.getMaxCargo()){
            String error = alien.getName() + "s cargo is too heavy to enter." + alien.getName() + "'s cargo weights " + alien.getShip().getCargoWeight() + " tons.";
            alien.setAccepted(false);
            errors.add(error);
        }
        for (String bannedShip : planet.getBannedShips()) {
            if(alien.getShip().getShipType().equals(bannedShip)){
                String error = alien.getName() + " is riding in a ship that is banned in this planet." + alien.getName() + " ship is a(n) " + alien.getShip().getShipType();
                alien.setAccepted(false);
                errors.add(error);
            }
        }
        for (String bannedWeapon : planet.getBannedWeapons()) {
            if(alien.getShip().getWeaponry().equals(bannedWeapon)){
                String error = alien.getName() + "'s ship has weapons that are banned in this planet.";
                alien.setAccepted(false);
                errors.add(error);
            }
        }
        for (String bannedRace : planet.getBannedRaces()) {
            if(alien.getClass().getSimpleName().equals(bannedRace)){
                String error = alien.getClass().getSimpleName() + "'s are banned in this planet!"  + alien.getName() + " can't get in!";
                alien.setAccepted(false);
                errors.add(error);
            }
        }
        for (String bannedCriminalRecord : planet.getBannedCriminalRecord()) {
            if(alien.getCriminalRecord().equals(bannedCriminalRecord)){
                String error = alien.getName() + " have done " + alien.getCriminalRecord() + " in the past which is strictly forbidden in this planet so it can't be let in";
                alien.setAccepted(false);
                errors.add(error);
            }
        }
        if(planet.getMinIntelligence() > alien.getIntelligence()){
            String error = alien.getName() + " is too dumb to enter this planet." + alien.getName() + "'s IQ is " + alien.getIntelligence();
            alien.setAccepted(false);
            errors.add(error);
        }
        if(errors.peek() == null){
            alien.setAccepted(true);
        }
        return alien.getAccepted();

    }
    static Boolean canGagotEnter(Gagot gagot, Planet planet){
        if(!planet.getGeography().equals("Water") && !gagot.canBreathAir()){//if the planet isn't a water planet and the gagot can't breath out of water
            String error = "Planet has no water and " + gagot.getName() +" can't breath air!";
            gagot.setAccepted(false);
            errors.add(error);
        }
        if(planet.areHornsAreBanned() && gagot.hasHorn()){
            String error = "Horns are banned in this planet!";
            gagot.setAccepted(false);
            errors.add(error);
            
        }
        Boolean canAlienEnter = canAlienEnter(gagot, planet);
        if(canAlienEnter == false) return false;
        return gagot.getAccepted();
    }

    static Boolean canSuraEnter(Sura sura, Planet planet){
        Boolean canAlienEnter = canAlienEnter(sura, planet);
        if(canAlienEnter == false) return false;
        return sura.getAccepted();
    }

    static Boolean canArgonianEnter(Argonian argonian, Planet planet){
        Boolean canAlienEnter = canAlienEnter(argonian, planet);
        if(canAlienEnter == false) return false;
        return argonian.getAccepted();
    }

    static Boolean canHumanEnter(Human human, Planet planet){
        Boolean canAlienEnter = canAlienEnter(human, planet);
        if(canAlienEnter == false) return false;
        return human.getAccepted();
    }

    static Boolean canPirontEnter(Piront piront, Planet planet){
        Boolean canAlienEnter = canAlienEnter(piront, planet);
        if(canAlienEnter == false) return false;
        return piront.getAccepted();
    }

    
    //languages : Sura:"Tengwar",Argonian:"Jel",Human:"Türkçe",Piront"Hutuquni",Gagot:"Uryuomoco"
    static Gagot[] createGagots(Planet planet){
        Gagot[] gagots = new Gagot[3];    
        City[] cities = getCities("4546B");
        String[] documents = getRandomDocumentArray(generateDocuments());
        Gagot gagot1 = new Gagot(true, false, "Rouxls Kaard", 231, 290, 8,
        3, 150, cities[r.nextInt(cities.length)], 389, "None", false, "Cold",
        new String[]{"Engspadeutsch","Tengwar","Uryuomoco","Yitmaukan","Hutuquni"}, "Oxygen", generateShip(), "Male",
        documents,9000,"Milksa");
        gagots[0] = gagot1;

        String[] documents2 = getRandomDocumentArray(generateDocuments());
        Gagot gagot2 = new Gagot(true, true, "Atheduwaq Upora", 212, 260, 6, 2, 132,
        cities[r.nextInt(cities.length)], 150, "None", false, "Cold", 
        new String[]{"Tengwar","Uryuomoco"}, "Oxygen", generateShip(), "Female", documents2, 20230, "Credits");
        gagots[1] = gagot2;
        
        String[] documents3 = getRandomDocumentArray(generateDocuments());
        Gagot gagot3 = new Gagot(false, true, "Uyasdw Kure", 300, 275, 6, 2, 132,
        cities[r.nextInt(cities.length)], 212, "None", false, "Cold", 
        new String[]{"Tengwar","Uryuomoco","Yitmaukan"}, "Oxygen", generateShip(), "Female", documents3, 3645, "Bobux");
        gagots[2] = gagot3;
        return gagots;
    }
    static Sura[] createSuras(Planet planet){ 
        Sura[] suras = new Sura[3];    
        City[] cities = getCities("Coruscant"); 
        String[] documents = getRandomDocumentArray(generateDocuments());
        Sura sura1 = new Sura("Krueger", 185, 268, 9, 95, cities[r.nextInt(cities.length)], 37, 2, "Murder",
        false, "Warm", new String[]{"Tengwar"}, "Oxygen", generateShip(), "Male", "Dark Magic", true,
        documents, 9000000, "Credits");
        suras[0] = sura1;

        String[] documents1 = getRandomDocumentArray(generateDocuments());
        Sura sura2 = new Sura("Kratos", 190, 200, 9, 100, cities[r.nextInt(cities.length)], 21, 4, "Murder",
        false, "Warm", new String[]{"Tengwar"}, "Oxygen", generateShip(), "Male", "Dark Magic", true,
        documents1, 10000, "Bobux");
        suras[1] = sura2;

        String[] documents2 = getRandomDocumentArray(generateDocuments());
        Sura sura3 = new Sura("Dante Afroenzi", 187, 220, 7, 85, cities[r.nextInt(cities.length)], 25, 6, "Murder",
        false, "Warm", new String[]{"Tengwar"}, "Oxygen", generateShip(), "Male", "Dark Magic", true,
        documents2, 45241, "Credits");
        suras[2] = sura3;
        return suras;
    }
    static Argonian[] createArgonians(Planet planet){ 
        Argonian[] argonians = new Argonian[3];    
        City[] cities = getCities("Tatooine"); 
        String[] documents = getRandomDocumentArray(generateDocuments());
        Argonian argonian1 = new Argonian("Gulum-Ei", 175, 102, 5, 68, 4, cities[r.nextInt(cities.length)], 
        27, "Theft", false, "All", new String[]{"Jel","Yitmaukan"}, "All", generateShip(), "Male", false, 
        documents, 31, "Bobux");
        argonians[0] = argonian1;

        String[] documents1 = getRandomDocumentArray(generateDocuments());
        Argonian argonian2 = new Argonian("Ezio-Audo-De", 180, 142, 5, 72, 8, cities[r.nextInt(cities.length)], 
        18, "Theft", false, "All", new String[]{"Jel","Tengwar"}, "All", generateShip(), "Female", true, 
        documents1, 8230, "Bobux");
        argonians[1] = argonian2;

        String[] documents2 = getRandomDocumentArray(generateDocuments());
        Argonian argonian3 = new Argonian("Lura-Anaste", 160, 170, 2, 50, 8, cities[r.nextInt(cities.length)], 
        61, "Theft", false, "All", new String[]{"Jel","Tengwar","Uryuomoco"}, "All", generateShip(), "Female", true, 
        documents2, 8230, "Credits");
        argonians[2] = argonian3;
        return argonians;
    }
    static Human[] createHumans(Planet planet){ 
        Human[] humans = new Human[3];    
        City[] cities = getCities("Coruscant"); 
        String[] documents = getRandomDocumentArray(generateDocuments());
        Human human1 = new Human("Deniz Göçer", 185, 200, 7, 66, cities[r.nextInt(cities.length)], 21, 8, 
        "Fraud", false, "Warm", new String[]{"Türkçe"}, "Oxygen", generateShip(), "Male", 
        "Fruit Knife",documents, 1300, "Credits");
        humans[0] = human1;

        String[] documents1 = getRandomDocumentArray(generateDocuments());
        Human human2 = new Human("Gufran Gunes", 187, 278, 9, 91, cities[r.nextInt(cities.length)], 21, 9, 
        "Fraud", false, "Warm", new String[]{"Türkçe","Engspadeutsch","Tengwar"}, "Oxygen", generateShip(), "Male", 
        "Fruit Knife",documents1, 1000000, "Credits");
        humans[1] = human2;

        String[] documents2 = getRandomDocumentArray(generateDocuments());
        Human human3 = new Human("Beyza Luras", 170, 180, 4, 50, cities[r.nextInt(cities.length)], 19, 5, 
        " ", false, "Warm", new String[]{"Türkçe","Tengwar"}, "Oxygen", generateShip(), "Female", 
        "Fruit Knife",documents2, 300, "Credits");
        humans[2] = human3;

        return humans;
    }
    static Piront[] createPironts(Planet planet){ 
        Piront[] pironts = new Piront[3];    
        City[] cities = getCities("Tatooine"); 
        String[] documents = getRandomDocumentArray(generateDocuments());
        Piront piront1 = new Piront("Borlit Kackah", 193, 3, 150, 7, 126, cities[r.nextInt(cities.length)], 
        73, "Murder", false, "Hot", new String[]{"Hutuquni"}, "Carbondioxide", generateShip(), 
        "Male", documents, 2500, "Bobux");
        pironts[0] = piront1;

        String[] documents1 = getRandomDocumentArray(generateDocuments());
        Piront piront2 = new Piront("Illue Uyasd", 200, 4, 100, 10, 150, cities[r.nextInt(cities.length)], 
        73, "Fraud", false, "Hot", new String[]{"Hutuquni","Türkçe","Tengwar"}, "Carbondioxide", generateShip(), 
        "Male", documents1, 500000, "Milksa");
        pironts[1] = piront2;

        String[] documents2 = getRandomDocumentArray(generateDocuments());
        Piront piront3 = new Piront("Borlit Kackah", 250, 3, 100, 8, 140, cities[r.nextInt(cities.length)], 
        73, "Murder", false, "Hot", new String[]{"Hutuquni","Jel"}, "Carbondioxide", generateShip(), 
        "Male", documents2, 100, "Milksa");
        pironts[2] = piront3;
        return pironts;
    }
    static City[] getCities(String planet){
        //development level 0-10
        City[] cities = new City[9];//every planet has 3 cities
        City city1 = new City("Phanagoria",800000, 8,"4546B");
        cities[0] = city1;
        City city2 = new City("Pyungmoo",80000, 10,"Coruscant");
        cities[1] = city2;
        City city3 = new City("Kaer Morhen", 150000, 4, "Tatooine");
        cities[2] = city3;
        City city4 = new City("Helheim", 45000000, 1, "Tatooine");
        cities[3] = city4;
        City city5 = new City("Riften", 900000000, 9, "Coruscant");
        cities[4] = city5;
        City city6 = new City("Upperhood", 500000, 6, "4546B");
        cities[5] = city6;
        City city7 = new City("Tolkien", 700000, 4, "Coruscant");
        cities[6] = city7;
        City city8 = new City("Tol Eressui", 200000, 10, "4546B");
        cities[7] = city8;
        City city9 = new City("Pung-Ma", 35000000, 5, "Tatooine");
        cities[8] = city9;
        //8 şehir daha oluştur arraylere doldur sonra rastgele çevir
        
        City[] tempCities = new City[3];
        int i = 0;
        for (City city : cities) {//creates the array that has the cities of the planet    
            if(city != null)if(city.getPlanet() == planet){
                tempCities[i] = city;
                i++;
            }
        }
        return tempCities;
    }
    static Ship generateShip(){
        String[] shipWeapons = {"LF-4","Proton Beam Cannon","Gauss Cannon","Prometheus Laser","Cannon","AK-47"};
        String[] shipNames = {"Millenium Falcon", "Sunset", "Goliath", "Moonlight","NA-2708","Hitac","Streuner"};
        
        return new Ship(r.nextInt(300), shipNames[r.nextInt(shipNames.length)], shipWeapons[r.nextInt(shipWeapons.length)]);
    }
    static String[] generateDocuments(){
        String doc1 = "Document-1";
        String doc2 = "Document-2";//mercenary
        String doc3 = "Document-3";
        String doc4 = "Document-4";
        String doc5 = "Document-5";//swimming
        return new String[]{doc1,doc2,doc3,doc4,doc5};
    }
    static String[] getRandomDocumentArray(String[] documents){
        String[] randomDocumentArray = new String[documents.length];
        for (int i = 0; i < r.nextInt(documents.length-1) + 1; i++) {
            int j = r.nextInt(documents.length);
            if(!Arrays.asList(randomDocumentArray).contains(documents[j])){
                randomDocumentArray[i] = documents[j];
            }
        }
        return randomDocumentArray;
    }
}
