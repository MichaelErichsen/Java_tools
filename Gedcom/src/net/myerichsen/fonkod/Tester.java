package net.myerichsen.fonkod;

/**
 * @author Michael Erichsen
 * 
 * This class can test Fonkod
 * 
 */
public class Tester {

	/**
	 * Can be used for testing
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// I gedcom-programmet skal hvert person- og stednavn have doublephone
		// og denne som alternative navne, s� der kan s�ges p� alle tre.
		String[] inputNavne = { 
				"Aabye", "Aagaard", "Aagesen", "Aalborig",
				"Aanonsdatter", "Aase", "Aaskov", "Aaslund", "Aasted",
				"Abbestee", "Abel", "�berg", "Abildgaard", "Abraham",
				"Abrahamsen", "Abramczuk", "Acthon", "Acthonia", 
				"af Putbus",
				"Agens�", "Agergaard", "Agier", "Agricola", "Ahlefeldt",
				"Ahlefeldt-Laurvig", "Akeleye", "Alberti", "Albertsen",
				"Albrechtsen", "Albretsen", "Alexander", "Allerup",
				"Allgulander", "Alliot", "Almisdatter", "Alten", "Althausen",
				"Alv�rn", "Alvarez", "Ambj�rn", "Ambrosia", "Ammentorp",
				"Amos", "Amundsen", "Ancher", "Anchersdatter", "Andersdatter",
				"Andersdotter", "Andersen", "Andersen-Kj�r", "Anderson",
				"Andersson", "Andreasen", "Andreassen", "Andresdatter",
				"Andresen", "Andrews", "Andrup", "Angelo", "Anglov",
				"Anker-M�ller", "Anskarsen", "Anthonsen", "Antonisen",
				"Antonsson", "Aquivallinus", "Arctander", "Aredsen",
				"Arentzen", "Arenvall", "Arff", "Arffmann", "Arfmann", "Arias",
				"Aristsen", "Armoese", "Arnesdatter", "Arnesen",
				"Arnesen-Kall", "Arnkiel", "Arnolds", "Arpe", "Arrildt",
				"Arvesdatter", "Arvesen", "Arvidsen", "Arving", "Ascanius",
				"Aslaksen", "Asmussen", "Assarsdatter", "Assing", "Atkin",
				"Ator", "Aubertin", "Augsburg", "August", "Axelsdatter",
				"Ayre", "Baad", "Baare", "Bach", "Bache", "Bachele", "Back",
				"B�k", "B�rildsdatter", "B�rildsen", "Bafenerda", "Bager",
				"Bagge", "Bagger", "Baggesdatter", "Baggesen", "Bagley",
				"Bahrenscheer", "Baillot", "Bak", "Baker", "Bakken", "Baldwin",
				"Ball", "Balle", "Balsborg", "Balslay", "Baltzar",
				"Baltzersdatter", "Baltzersen", "Bang", "Bank-Rasmussen",
				"Baranski", "Barchalia", "Baret", "Barfred",
				"Baronesse Reedtz-Thott", "Barr", "Barry", "Barth",
				"Bartholdy", "Bartholin", "Bartholin-Eichel",
				"Bartholom�usdatter", "Bartsk�r", "Bartsk�rer", "Basballe",
				"Basse", "Bass�e", "Batemen", "Baudissin", "Bauer-Johansen",
				"Baurath", "Bautz", "Baxter", "Bay", "Bayer", "Beal", "Beam",
				"Bean", "Beaver", "Bech", "Bech-Bruun", "Bechmann", "Beck",
				"Becker", "Beckmann", "Beder", "Bedsted Madsdatter", "Beege",
				"Begtrup", "Behrens", "Bek", "Bekker", "Bell", "Bellins",
				"Bendtsdatter", "Bendtsen", "Bendz", "Bengtsson", "Bennedsen",
				"Bennichmann", "Bense", "Benstead", "Bentley", "Bentsen",
				"Bentzen", "Bercholten", "Berg", "Bergin", "Bergman",
				"Bergmann", "Bergstr�m", "Bergstr�m", "Berlin", "Bernadotte",
				"Bernard", "Berner", "Bertelsdatter", "Bertelsen",
				"Berthelsdatter", "Berthelsen", "Bertrand", "Betti",
				"Beuschel", "Beyer", "Bezzoli", "Bidstrup", "Biering",
				"Biering-S�rensen", "Bigum", "Bild", "Billing", "Bing",
				"Birch", "Birkedal", "Bischoff", "Bisson", "Bjerre",
				"Bjerregaard", "Bj�rkenberg", "Bj�rklund", "Bj�rnsdatter",
				"Bj�rnsen", "Black", "Blad", "Bl�sbjerg-Christiansen",
				"Bl�fod", "Blakeney", "Blanvallet", "Blasholtz", "Blatan",
				"Blatter", "Blem", "Blicher", "Blichert", "Blichert-Hansen",
				"Blichfeldt", "Blix", "Bloch", "Blom", "Blumensaat", "Blykop",
				"Blytmann", "Bock", "Bockenhoffer", "Bodenhoff", "B�eg",
				"Boemand", "Bo�tius", "B�ge", "B�ggild", "B�gh", "B�gild",
				"Bogle", "B�gvad", "Bohem", "B�hme", "B�hme", "Bohn",
				"Boiesen", "Boisen", "Boje", "Bojesen", "Bolinder", "Boll",
				"Bollers", "Bollesdatter", "Bollesen", "Bolt", "Bolvig",
				"Bonde", "Bondesen", "Bonnevie", "Bonnevie-Dysseg�rd",
				"Bonnevie-Nielsen", "BonnevieOlesen", "Bookall", "Borch",
				"Borchhorst", "Borg", "Borges", "B�rgesen", "B�rjesson",
				"Bornemann", "Borntzen", "Borreby", "Borregaard", "Borring",
				"Borringholm", "Botkin", "Bourgoin", "Bourke", "B�ving",
				"Bowden", "Boxsell", "Boye", "B�ye", "Boysen", "Brackmann",
				"Bradbury", "Br�ndgaard", "Br�strup", "Bramdroph", "Brams",
				"Brandenborg", "Brandi", "Brandt", "Brasce", "Brasch",
				"Bredahl", "Bredenberg", "Bredmose", "Bredsdorff", "Bremer",
				"Brennan", "Brenteson", "Brethvad", "Breum", "Brew", "Breyen",
				"Bride", "Brinch", "Broch", "Brock", "Brockhoff", "Broder",
				"Brodersen", "Brogaard", "Br�gger", "Bromfield",
				"Bromfield-Geld", "Brommer", "Br�ndum", "Br�ns", "Brorsen",
				"Br�seth", "Brotherwood", "Broughton", "Brown", "Br�el",
				"Bruhn", "Brun", "Brunin", "Brunn", "Brusch", "Brusendorff",
				"Bruun", "Bruun-Andersen", "Bryant", "Bryde", "Brygger",
				"Bryld", "Bub", "Buch", "Buck", "Budd", "Budde", "Bugge",
				"Buitenhuis", "Bull", "Bullock", "B�low", "Bundt", "Bunkeflod",
				"Burke", "Burns", "Busato", "Busch", "Busche", "Busck",
				"Busenbark", "Bussmann", "Butler", "Buttars", "B�ttener",
				"Buttensch�n", "Buus", "Bydelsbach", "Bydelsbak", "Byers",
				"Byington", "Bylsma", "Byrresen Nielsen", "Calkins",
				"Callesen", "Callow", "Cameron", "Campbell", "Cantzler",
				"Cargill", "Carlisle", "Carlsdotter", "Carlsen", "Car�e",
				"Carstensen", "Caruso", "Casey", "Caspersdatter",
				"Castensdatter", "Castensen", "Cederfeld de Simonsen",
				"Challoner", "Chamberlain", "Charbonnel", "Chimes", "Choudaba",
				"Christensdatter", "Christensen", "Christensen",
				"Christensen-Palmer", "Christiani", "Christiansdatter",
				"Christiansen", "Christoffersen", "Christophersdatter",
				"Christophersen", "Claudi", "Clausdatter", "Clausen",
				"Clayton", "Clemens", "Clemensdatter", "Clemensen",
				"Clemmensdatter", "Clemmensen", "Cline", "Clod", "Cobb",
				"Colding", "Cole", "Coleman", "Collins", "Colman",
				"comtesse Moltke", "Conlon", "Connor", "Conradsen", "Cooley",
				"Cooper", "Cor", "Cordes", "Corn", "Corneliussen", "Coudray",
				"Courtault", "Coutu", "Couvreur", "Cowley", "Coyle", "Crain",
				"Cramer", "Crane", "Crone", "Cronfelt", "Crowford", "Crowley",
				"Curtis", "Curtiss", "Curtz", "Cusack", "Dahl", "Dahlbom",
				"Dal", "Dalberg", "Dalsgaard", "Dam", "Damgaard", "Damm",
				"Damsgaard", "Dan", "Danborg", "Danchell", "Danco",
				"Danco-Heil", "Danebod", "Danholm", "Danholt", "Dania",
				"Danielsdatter", "Danielsen", "Davidsdatter", "Davidsen",
				"Davis", "Day", "de Benidetti", 
				"Debes", "de Carlo",
				"de Cernin", "de Cernyn", "Deering", "de Fontenay", "Dehle",
				"de la Cour", "De Lai", "Demant", "Dem�n", "Dem�n-Villaume",
				"de Neergaard", "den Gamle", "Denyer", "de Ottenb�ttel",
				"de Regt", "de Rehling-Qvistgaard", "de Renouard", "Deschamps",
				"Desin", "Desmond", "Destiana", "de Svanenskjold",
				"de Svanenskjold Hoff", "Dethlefsen", "Deubel", "Devecchi",
				"de Villers Grand Champ", "Dewar", "de Watteville", "Dhaynaut",
				"Dich", "Diderichsen", "Diech", "Dierks", "Dige", "Dinesen",
				"Dirch", "Dirchsen", "Ditlevsen", "Ditzel", "Dixen",
				"Dollerup", "Dolman", "D�lner", "Domgaard", "Domino", "Donald",
				"Donoghue", "Dooley", "Doran", "Dorn", "Dowdell", "Dowdle",
				"Down", "Doyle", "Drabsch", "Dragsted", "Drechsel", "Dreier",
				"Dreilov", "Drei�e", "Drejer", "Dresing", "Drewsen", "Dreyer",
				"Drovin", "Du Coudray", "Ducoudray", "Ducoudray-Holstein",
				"Due", "Duelund", "Due-Petersen", "duPlan", "Dupont", "Dupuis",
				"Dybbroe", "Dyhrberg", "Dyre", "Dyring", "Dyrkov",
				"Dyssegaard", "Dyssel", "Ebbesdatter", "Ebbesen", "Eberhardt",
				"Ebert", "Echsteen", "Edholm", "Edinger", "Edwards", "Ege",
				"Egede", "Egholm", "Ehrenreich", "Ehrhardt", "Eilersen",
				"Eilert", "EilertPedersen", "Eisens�e", "Ejlertsen", "Eklund",
				"Ekman", "Ekstrand", "Elb�k", "Elberling", "Eliasen",
				"Eliassen", "Ellefsson", "Ellekvist", "Ellenberger", "Eller",
				"Ellertsen", "Elm", "Elster", "Emery", "Endorph", "Enevoldsen",
				"Engberg", "Engels", "Engelsted", "Engelund", "Enger",
				"Enghoff", "Englev", "Engquist", "Engsig", "Engsig-Karup",
				"Erichsdatter", "Erichsen", "Erickson", "Eriksdatter",
				"Eriksen", "Eriksson", "Erinder", "Erlandsen", "Ernfors",
				"Ernst", "Ernstsdatter", "Esbernsdatter", "Esbersdatter",
				"Esbersen", "Eschildsen", "Eskesen", "Esmann", "Espersdatter",
				"Espersen", "Espesen", "Esrum", "Essendrop", "Essendrup",
				"Esser", "Estridsen", "Everstein", "Ewald", "Faartoft",
				"Faber", "Fabiansen", "Fabricius", "F�ster", "Fafeita",
				"Fage-Pedersen", "Fagerlund", "F�gerstrand", "Fahlenkamp",
				"Fahlgreen", "Falk", "Falkenberg", "Falkner", "Fallesen",
				"Falster", "Farr", "Fast", "Fauerby", "Faurbo", "Faxner",
				"Fehn", "Feilberg", "Feiring", "Feldberg", "Feldh�tter",
				"Felton", "Felumb", "Fenger", "Fernqvist", "Fibiger", "Fich",
				"Fiedler", "Fiil", "Filipsdotter", "Filskov", "Finch",
				"Fink-Jensen", "Finnerup", "Fischer", "Fish", "Fisker",
				"Fitzgerald", "Fleischer", "Flensborg", "Fleron",
				"Flinck-Rosenkranz", "Flintrup", "Floor", "Flor", "Fluton",
				"Fobian", "Foerseu", "Foersom", "Fog", "Fogh", "Fogh-Andersen",
				"Fontaine", "Forsee", "Forsyth", "Fort", "Foss", "Fox",
				"Frambo", "Fran�on", "Frandsen", "Frank", "Frantsdatter",
				"Franz", "Frappi", "Frear", "Frederichsdatter", "Frederichsen",
				"Frederiksdatter", "Frederiksen", "Freding-Poulsen", "Freese",
				"Frende", "Friborg", "Frick", "Fricke", "Frid", "Friderichsen",
				"Fridrichsdatter", "Fridsch", "Friedstedt", "Friend", "Fries",
				"Friis", "Friisberg", "Friis-Mikkelsen", "Frisenborg",
				"Frisenette", "Frisk", "Froberg", "Fr�berg", "Frob�se",
				"Frost", "Fry", "Frydenlund", "Fuchs", "Fugl", "Fuglede",
				"Fuglsang", "Fullmer", "Funch", "Funder", "Fyhn", "Gaardmand",
				"Gad", "Gadd", "Gade", "G�deken", "Gagge", "GaggeGagge",
				"Gagghe", "Galen", "Gallois", "Galster", "Galthen",
				"Gammelgaard", "Gamshard", "Gamst", "Garcia", "Garde",
				"Garrald", "Gebert", "Gedde", "Gede", "Geelmuyden", "Geertsen",
				"Geld", "Geldart", "Gellespie", "Gemmell", "Gerlach",
				"Gernyx-Hansen", "Gerstenberg", "Ghede", "Giede", "Gierl�v",
				"Giertss�n", "Gilbe", "Gimmini", "Gi�dich", "Givern",
				"Gjellerup", "Gjerl�v", "Gjerl�w", "Gjertsen", "Gj�dvad",
				"Gjordsdatter", "Gj�rup", "Gl�sner", "Glahn", "Glatz",
				"Gliemann", "Glud", "Godfredsdatter", "Godske-Nielsen",
				"Godtfredsen", "Goldin", "Goldschmidt", "Gorm-Knudsen",
				"Gornitzka", "Gotfredsen", "G�the", "Gottfredsen", "Gottlieb",
				"Gottschau", "G�tzsche", "Graa", "Graae", "Grabow", "Grady",
				"Graff", "Graff-Nielsen", "Grage", "Grahann", "Gram",
				"Grandlev", "Grauer", "Graulev", "Gravensteen", "Gravenstein",
				"Graversen", "Gravete", "Green", "Gregersdatter", "Gregersen",
				"Greiff", "Greisen", "Grelsby", "Greve", "greveMoltke",
				"Gripka", "Groftved", "Gronemann", "Gr�nhaug", "Gr�nlund",
				"Gr�nvold", "Grosen", "Grosskopff", "Grosskopff-Berner",
				"Gr�tcher", "Gr�tner", "Grove", "Grubbe", "Grum-Schwensen",
				"Grundy", "Gr�ner", "Guay", "Gudbjerg", "Gudme", "Gudmundsen",
				"Gudmundsson", "Guerrier", "Gug", "Guldager", "Guldberg",
				"GuldbergHaig", "Guldborg", "Guldmann", "Gull�v", "Gulmann",
				"Guml�s", "Gundersen", "Gundestrup", "Gundorph", "Gunnarssen",
				"Gunner", "Gunthel", "Gustafson", "Gustafsson", "Gyldenkerne",
				"Gyldenstierne", "Gyldenstjerne", "Haagen", "Haagensdatter",
				"Haagensen", "Haagh", "Haastrup", "Hack", "Haderup",
				"Hadsteen", "H�kkerup", "Hage", "Hagefeldt", "Hagemeister",
				"Hagen", "Hagens", "Hakonsen", "Halanzy", "Halberg", "Hald",
				"Hall", "Hallb�ck", "Hallbom", "Hals", "Hamann", "Hammerich",
				"Hammerlund", "Hammerstad", "Hammond", "Hanbury", "Handest",
				"Handewitt", "Hansdatter", "Hansen", "Hanson", "Hanssen",
				"Hansson", "HaraldsenLitle", "Harboe", "Harder", "Hardt",
				"Hare", "Harmison", "Harp�th", "Harrington", "Harris",
				"Hartkings", "Hartoft", "Harttung", "Hartvig", "Hartvigsen",
				"Hartwig", "Hass", "Hasse", "Hasselbalch", "Hastrup", "Hauge",
				"Haugland", "Hauka", "Haung", "Hauptmann", "Hay", "Hayward",
				"Hecquet", "Hedberg", "Hede", "Hedebo", "Hedegaard", "Hedeman",
				"Heegaard", "Heegaard-Jensen", "Heiberg", "Heide", "Heiede",
				"Heigaard", "Heil", "Heilesen", "Hein", "Heinesen",
				"Helgesson", "Hellesen", "Helligsdatter", "Hellmund",
				"Hellner", "Hellner-Nielsen", "Helm-Petersen", "Helms",
				"Hemmingsen", "Henault", "Henckel", "Hendrichsdatter",
				"Hendrichsen", "Hendricksen", "Hendriksen", "Heniochus",
				"Henius", "HenningAlbertsdatter", "Hennings", "Henningsdatter",
				"Henningsen", "Henrichsdatter", "Henrichsen", "Henricsson",
				"Henriksdatter", "Henriksen", "Henriques", "Henth", "Herbst",
				"Herfort", "Herfurth", "Herlev", "Herlichsen", "Herlogsdatter",
				"Hermansen", "Herschend", "Herskind", "Hertz", "Heseler",
				"Hess", "Hessner", "Heurlin", "Hewitt", "Heyn", "Heyne",
				"Heyner", "Hildebrandt", "Hildestr�m", "Hill", "Hillersborg",
				"Hillerslev", "Hincheldey", "Hinge", "Hipps", "Hjordt",
				"Hj�rringgaard", "Hjorth", "Hjortholm", "Hochbrandt", "H�eg",
				"H�egh-Guldberg", "Hoff", "H�ffding", "Hoffmann", "Hoffmeyer",
				"H�g", "H�gh", "H�glund", "H�hne", "H�holt", "H�jelse",
				"H�jland", "Holch", "Holgersen", "Holladay", "Holland", "Holm",
				"Holmer", "Holmes", "Holmgersen", "HolmgerssonL�nge",
				"Holmgren", "Holst", "Holstboe", "Holstein", "Holt", "Holten",
				"Holtorp", "Holvert", "Hommelgaard", "Hoormann", "Hopkins",
				"Hopp", "Hoptrup", "H�rdum", "H�rl�ck", "Horn", "Horndal",
				"Hornskov", "Hornum", "Hornwain", "Horst", "Horton", "H�rved",
				"H�sche", "H�st", "H�stmark", "HostrupSchultz",
				"Hostrup-Schultz", "Hotvedt", "Hougaard", "Hovland", "Hovmand",
				"Howden-R�nnenkamp", "H�yer", "H�ygaard-Nielsen", "H�yrup",
				"Hozian", "Hubbard", "Hude", "Hudson", "Hunter", "Hurup",
				"Hurwitz", "Husted", "Hvide", "Hviid", "Hvoslef", "Hyllested",
				"Hylsenberg", "Hynkemeier", "Ibsdatter", "Ibsen", "Ide",
				"Igglund", "Ignatiev", "Ils�e", "Ingerslev", "Ingvordsen",
				"Ingvorsen", "Ipsdatter", "Ipsen", "Irgens-M�ller",
				"Isaachsen", "Isachsen", "Isaksdatter", "Ish�y", "Itkis",
				"ITvesk�g", "Iuul", "IVafGleichen", "Iversdatter", "Iversen",
				"Jacobsdatter", "Jacobsen", "Jacobsons", "Jakobsen", "James",
				"Jamil", "Jansen", "Janson", "Jansson", "Janting", "Jantz",
				"Jantzen", "Jantzen-Holst", "Jarvis", "Jasper", "Jellesmark",
				"Jennings", "Jensdatter", "Jensen", "Jensen-Holm",
				"JensenJonsdotter", "Jeppesdatter", "Jeppesen", "Jeppsson",
				"Jernskj�g", "Jespersen", "Jessen", "Jetlund", "Jochumsen",
				"Joensdatter", "Joensen", "Johannesdatter", "Johannesen",
				"Johannessen", "Johansdatter", "Johansen", "Johansson",
				"Johnsdatter", "Johnsen", "Johnson", "Johnsson", "Johnstone",
				"Joliffe", "Jonasdatter", "Jonasen", "Jones", "J�nsdotter",
				"Jonsen", "Jonsson", "J�nsson", "J�nsson", "Jonz�n", "J�rgen",
				"J�rgensdatter", "Jorgensen", "J�rgensen", "Joyce", "Juel",
				"JueSue", "Juhl", "Jul", "J�rgensen", "Justus", "Juul",
				"Juul-Mortensen", "Jyde", "K�rg�rd", "Kalkar", "Kall",
				"Kall-Eberhardt", "Kallenbach", "Kall-Rasmussen", "Kames",
				"Kampmann", "Kappers", "Karlsen", "Karmark", "Kastrup",
				"Kavarno", "Kean", "Kegebein", "Keiding", "Kejlskov", "Kelet",
				"Kelly", "Kelou", "Kemp", "Kent", "Kenvad", "Kidmose",
				"Kieldsen", "Kielgast", "Kielland", "Kielstrup", "Kierboe",
				"Kierulfsdatter", "Kindler", "Kirby", "Kirch", "Kirchheiner",
				"Kirk", "Kirkeby", "Kirkegaard", "Kirkemann", "Kirkeskov",
				"Kirketerp", "KirstenMagnaRigmor", "Kj�r", "Kj�rbye",
				"Kj�rgaard", "Kj�rsgaard", "Kj�rulf", "Kjeldsen", "Kjelgaard",
				"Kjelgaard-Kronborg", "Kjenner", "Kj�ller", "Klausen", "Kleis",
				"Kliewer", "Klingberg", "Klinge", "Klitgaard", "Klo",
				"Kl�cker", "Kloe", "Kloumann", "Klubien", "Kl�ver", "Kluw",
				"Klyver", "Knakkergaard", "Kneus", "Kneyln", "Knoblauch",
				"Knud", "Knudsdatter", "Knudsen", "Knuppert", "Koch", "Kock",
				"Kodriaty", "Koefod", "Koefoed", "Kofoed", "Kofoed-Olsen",
				"Kofoed-Thorsager", "Kokborg", "K�ller", "Kolling", "K�nicke",
				"Konig", "K�nig", "Korch", "Korff", "Korgaard", "Kornerup",
				"Korsbech", "Korsgaard", "K�rsing", "Kors�", "Kortegaard",
				"K�ster", "Kraft", "Krag", "Kragelund", "Kragh", "Krahe",
				"Krarup", "Krasilnikoff", "Kraul", "Krause", "Krauthoff",
				"Kreibe", "Kreimer", "Kretzschmer", "Krieger", "Kringelbach",
				"Kristensdatter", "Kristensen", "Kristiansen", "Kristoffersen",
				"Krjukova", "Krog", "Kr�ger", "Krogh", "Kromer", "Kr�yer",
				"Kr�ger", "Krumhausen", "Krummedige", "Krummendiek", "Kruse",
				"Krutmeier", "Kruuse", "Kryger", "Kvist", "Kvistgaard", "Kyhl",
				"Laage", "laCour", "Lagesdatter", "Lambert", "Landry", "Lang",
				"Langballe", "Lange", "Langeland", "Langemach", "Langendorff",
				"Langgaard", "Langhorn", "Langkilde", "Lanier", "Larkins",
				"Larsdatter", "Larsdotter", "Larsen", "Larson", "Larssen",
				"Larsson", "Lassen", "Lasseson", "Lasson", "Lauesdatter",
				"Laugesen", "Laumann", "Launy", "Laurberg", "Laurensdatter",
				"Laurentsdatter", "Lauridsdatter", "Lauridsen", "Lauridssen",
				"Lauritsdatter", "Lauritsen", "Lauritzen", "Laursdatter",
				"Laursen", "Lausen", "Lavesdatter", "Law", "laWalle",
				"Lawkowicz", "Leasure", "leClerc", "Lee", "Leegaard", "Leeser",
				"Legge", "Lehrmann", "Leifer", "Lellinge", "Lembke",
				"Lembourn", "Lemcke", "Lemos", "Lendi", "Lennartz",
				"Lennertzdatter", "Leo", "Leonard", "lePoull", "leRoy",
				"Lesler", "Lesse", "Lester", "Lethmathe", "Lett", "Leuning",
				"Lewardia", "Lewis", "Liebenberg", "Liechty", "Lihme",
				"Liljehult", "Lille", "Lillelund", "Lillienskjold", "Limschou",
				"Lind", "Lindahl", "Lindb�k", "Lindberg", "Linde",
				"Lindekilde", "Lindemann", "Lindenblad", "Lindenfeld",
				"Lindgren", "Lindhard", "Lindhardt", "Lindschou", "Linstow",
				"Lister", "Litle", "Livier", "Ljufstr�m", "Lobedanz", "Locher",
				"L�hr", "Lohse", "Lomborg", "Lomholt", "L�nberg", "Longsdale",
				"Lordan", "Lorentsen", "Lorentzen", "Lorenzen", "Lose",
				"Losen", "L�ssl", "L�th-Jensen", "Lottrup", "Lovie", "L�we",
				"L�we", "L�wenstein", "L�ye", "L�becker", "Luciatte",
				"Ludewig", "Ludvigsen", "Luffe", "Lund", "Lundberg", "Lunde",
				"Lundgren", "Lundin", "Lundquist", "Lundqvist",
				"Lund-S�rensen", "Lunge", "Lunn", "L�tken", "L�xdorph",
				"Lydichsen", "Lykke", "Lynderup", "Lyng", "Lynge", "Lyngse",
				"Lyngs�", "Lyngv�g", "Lyn�e", "Lystager", "Lytle", "Maahr",
				"Maccab�us", "MacDonald", "Macholt", "Madi�", "Madsdatter",
				"Madsen", "Madtzdatter", "Magaard", "Maher", "Majoner",
				"Major", "Malchow-M�ller", "Malin", "Malinowska", "Malmgreen",
				"Malm�", "Malmquist", "Mangor", "Manthey", "Manwell",
				"Marchall", "Marcher", "Marchmann", "Marcker", "Marckmann",
				"Marco", "Marcusdatter", "Marcussen", "Marek", "Marke",
				"Markmand", "Marks", "Markussen", "Marling", "Marre", "Marsh",
				"Martell", "Martin", "Martinusdatter", "Marx", "Mason",
				"Mathiasdatter", "Mathiasen", "Mathiassen", "Mathiesen",
				"Mathisen", "Matos", "Mattson", "Mauritzdatter", "Mauritzen",
				"Mayer", "MazardelaGarde", "McCarthy", "McClellan",
				"McCormack", "McDonald", "McDonell", "McFadyen", "McGee",
				"McGovern", "McGuire", "McKay", "McKinney", "McLaughlin",
				"McLean", "McNevin", "Meacham", "Mechernsen", "Megyessi",
				"Mehl", "Meiger", "Meincke", "Meinertz", "Meisler", "Melchior",
				"Mellerup", "Mengs", "Mercker", "Merkel", "Metzroth",
				"Meulengracht", "Meyer", "Michael", "Michel", "Michelbecker",
				"Michell", "Michelsdatter", "Michelsen", "Michielin",
				"Mickelsdatter", "Mikkelborg", "Mikkelsdatter", "Mikkelsen",
				"Mikkelson", "Miller", "Mills", "Misurraca", "Mitchinson",
				"Modig", "Mogensdatter", "Mogensen", "M�inichen", 
				"Mokrzyczki",
				"Moller", "M�ller", "M�ller-Holmstoel", "M�ller-Holst",
				"Mollerup", "Moltke", "Moltke-Hoff", "Monrad", "Monrath",
				"Monsdatter", "Monsen", "Monson", "M�nsted", "M�nster",
				"Morawski", "M�rch", "M�rck", "Morgan", "Morgareidge",
				"Morgenstj�rne", "Moritz", "M�rk", "Mormay", "Moron", "Mors",
				"Mortensdatter", "Mortensen", "Morton", "Mosberg", "Mose",
				"Moss", "Motmans", "Mouritsen", "Mouritzen", "Moyston",
				"M�hlensteth", "M�ller", "Mumme", "Munch", "Munch-Petersen",
				"Munk", "Munksgaard", "M�nster", "Murtagh", "Mwakitalu",
				"Myers", "Myhre", "Mylius-Erichsen", "Myre", "Nadolska",
				"N�sted", "Nagel", "Nathan", "Nathansen", "Nathanson",
				"Nattestad", "Nedergaard", "Neergaard", "Nees", "Nellemann",
				"Neller�d", "Nepen-Hutchison", "Nersting", "Nichols",
				"Nicholson", "Niel", "Nielsdatter", "Nielsen", "Nielsen",
				"NielsenLund", "NielsenToft", "NielsenWinther", "Nielson",
				"Niemans", "Nigels", "Nigelsen", "Nikolaisen",
				"Nikolajsdatter", "Nikulajevska", "Nilsdotter", "Nilsson",
				"Nipgaard", "Nisdatter", "Nissen", "Nistad", "Nitsche",
				"Noichol", "N�ies", "N�jgaard", "N�rbye", "Nordberg",
				"Nordentoft", "NordentoftFisker", "Nordentoft-Jacobsen",
				"NordentoftThomsen", "Nordholt", "Nordlind", "N�rgaard",
				"Normann", "N�rregaard", "N�rrekj�r", "Norrie", "Norsman",
				"Norstr�m", "Novak", "Nyborg", "Nygaard", "Nyholm", "Nyhuus",
				"Oates", "Obel", "Ochsner", "O\'Conell", "�dbergsen",
				"Odegaard", "Odin", "�elund", "O\'Flanigan", "O\'Flannigan",
				"Ohlsen", "Okubo", "�land", "Oldesloe", "Olesdatter", "Olesen",
				"Olesson", "Olrik", "Olsdatter", "Olsdotter", "Olsen",
				"Olsen Nielsen", "Olson", "Olufsdatter", "Olufsen", "�rgaard",
				"�rkilde", "O\'Rourke", "�rsted", "�rum", "�ster",
				"�stergaard", "�stergren", "�sterlund", "�sterman", "�strup",
				"Ott", "Otto", "Ottosen", "Ottow", "Ovaqqaorahou", "Overbeck",
				"Overgaard", "Ovesdatter", "Oxholm", "Paddleford", "P�ling",
				"Pallesdatter", "Pallesen", "Palliser", "Pallisgaard",
				"Palmer", "Palsby", "Paludan", "Paludanus", "Pan", "Panduro",
				"Panton", "Papck", "Papeke", "Paquot", "Parcell", "Paris",
				"Parr�", "Parvari", "Passow", "Paulli", "Paulsen", "Paust",
				"Peake", "Pearson", "Peattie", "Pedersdatter", "Pedersdotter",
				"Pedersen", "Pegler", "Pennington", "Perb�l", "Perrochet",
				"Persen", "Persson", "Peschard", "Peschardt", "Petersen",
				"Petersen-B�k", "Peterson", "Petr�us", "Petrasi", "Pettersen",
				"Petterson", "Pettiti", "Petty", "Peytz", "Pfaltzgraff",
				"Philippe", "Philipsen", "Phillips", "Pialba", "Pierce",
				"Piil", "Pinholt", "PistoriusBecker", "Plamb�ck", "Plesner",
				"Podebusk", "Pontoppidan", "Poole", "Pope", "Pors", "Porteous",
				"Posse", "Posselt", "Poulsdatter", "Poulsen", "Povlsdatter",
				"Power", "Poznikoff", "Pr�strud", "Praetorius", "Praff",
				"Prenger", "Prentice", "Price", "Primon", "Prins", "Prip",
				"Pritchard", "Prom", "Puggaard", "Purdon", "P�rschel",
				"Purwing", "Qualen", "Quist", "Quistgaard", "Qvist",
				"Qvistgaard", "Rabes", "Rabis", "R�fdal", "Rager", "Rahnert",
				"Rais", "Ramos", "Ramsey", "Ramus", "Rani", "Rankin", "Rasch",
				"Rasmusdatter", "Rasmussen", "Rass", "Rauberg", "Rauch",
				"Ravn", "Ravnborg", "Ravnsgaard", "Reddersen", "Rediclffe",
				"Redsted", "Reedtz-Thott", "Reese", "Reffs", "Rehder",
				"Rehling", "Rehling-Quistgaard", "Rehling-Qvistgaard", "Reid",
				"Reimer", "Reimers", "Reimert", "Reinhard", "Reinhold",
				"Reinholdt", "Reinholdtsdatter", "Reinholtsdatter",
				"Reinmothtsen", "Reinsholm", "Renouard", "Resch", "Retsloff",
				"Reuter", "Reutze", "Reville", "Reymann", "Reyment",
				"Rheinl�nder", "Ribeiro", "Ribers", "Ribolt", "Rice",
				"Richards", "Richardt", "Richie", "Rickerts", "Rieper", "Riis",
				"Riisbrigh", "Riise", "Rimboltsen", "Rindom", "Ring", "Risak",
				"Rischel", "Ris�e", "Risom", "Risting", "Ritchie", "Ritmer",
				"Rix", "Rizer", "Roark", "Robbert", "Robbert-Rasmussen",
				"Robinson", "Rocho", "Rode", "R�deb�k", "Rodgers", "Roed",
				"R�en", "Rogers", "Roggenbau", "Rohde", "R�jkj�r", "Rolley",
				"Rollin", "Rollwagen", "Roloff", "Rom", "R�mer", "Rommel",
				"R�nberg", "R�nchendorff", "R�nholdt", "R�nne", "Rookwood",
				"R�r", "R�rdam", "Rose", "Rosenberg", "Rosenbjerg",
				"Rosendahl", "Rosenkj�r", "Rosenkrantz", "Rosenstand",
				"RosenstandGoiske", "Rosenthal", "Rosentoft", "Roslund",
				"Roslundh", "Rosman", "Rossau", "Rossov", "Rostgaard", "Rud",
				"R�dinger", "Ruhwald", "Runge", "Rutten", "Ryan", 
				"Ryberg",
				"Rydberg", "Rygaard", "Ryge", "Ryving-Jensen", "Saabye",
				"Sabro", "Sabroe", "Sakariasen", "Salewsky", "Sally", "Salten",
				"Saltensee", "Salto", "Salvesen", "Sand", "Sandager",
				"Sandberg", "Sandbye", "Sande", "Sanders", "Sandersen",
				"Sandorff", "Sappi", "Sargent", "Saugmann", "Sauvaget",
				"Savage", "Saxby", "Scavenius", "Schack-Schou", "Sch�ffer",
				"Sch�g", "Sch�ffer", "Schalburg", "Schaldemose", "Schanderup",
				"Schau", "Scheel", "Schelde", "Scheller", "Schepelern",
				"Schermer", "Schiemann", "Schiffer", "Schindberg", 
				"Schi�dte",
				"Schi�nning", "Schi�t", "Schj�dt", "Schj�rring", 
				"Schlegel",
				"Schlichter", "Schlorffers", "Schmedes", "Schmidt",
				"Schmidt-Nielsen", "Schmidt Qvist", "Schmith", "Schmitt",
				"Schmutter", "Schneekloth", "Sch�ller", "Sch�ps",
				"Sch�pzinsky", "Sch�rling", "Schou", "Schouboe", "Schoupe",
				"Schousboe", "Schouw", "Schovgaard", "Schow", 
				"Schram",
				"Schr�der", "Schule", "Schultz", "Schumann", "Schwartz",
				"Schwartzkopf", "Schwarz", "Schytte", "Seelen", "Seerup",
				"Segelcke", "Sehard", "Seidel", "Seidelin", "Seidentopf",
				"Seiers�ll", "Sejer", "Sejersen", "Sekker Hansen", "Seldon",
				"Selmer", "Sergeant", "Serlin", "Setter", "Severin", "Sexton",
				"Seymour", "Shah", "Sharp", "Sharry", "Shaw", "Sherrel",
				"Short", "Sidenius", "Siebert", "Sigaard", "Sigurdsdatter",
				"Sigvardsdatter", "Sigvardsen", "Sikker Hansen", "Silver",
				"Silwer", "Simmelhag", "Simonsdatter", "Simonsen", "Simpkins",
				"Simpson", "Sims", "Sindahl", "Sinnerup", "Sitapan",
				"Sj�llandsfar", "Sj�lander", "Sj�r�n", "Skagen", "Skavbo",
				"Skavlan", "Skelh�j", "Skibsted", "Skidenvad", "Skjalmsen",
				"Skjelmose", "Skj�dt", "Skjoldager", "Skotte", "Skouboe",
				"Skov", "Skovdan", "Skoven", "Skovgaard", "Skovg�rd",
				"Skovhus", "Skr�dder", "Skr�der", "Skr�ders", "Skram",
				"Skriver", "Skydt", "Slamberg", "Slangerup", "Slanhoff",
				"Slee", "Sletved", "Sloth", "Smed", "Smidt", "Sminge", "Smith",
				"Smitt", "Smyth", "Snare", "Sneddon", "Sode", "S�e-Pedersen",
				"S�gaard", "Sohn", "Soldbro", "S�lling", "Sollohub", "Sols",
				"Solter", "Sommer", "S�nderbye", "S�ndergaard", "S�nderup",
				"Sonne", "Sonnenberg", "Sonnenschmidt", "S�rensdatter",
				"S�rensen", "S�rensenJ�rgensen", "S�vndahl-Petersen", "Spager",
				"Spangler", "Sparkes", "Sparre", "Spendt", "Sperling",
				"Spethmann", "Spiero", "Sprageleg", "St�hr-Nielsen", "Stander",
				"Stanley", "Stanton", "Stapel", "Staphrophski", "Starkow",
				"Stchelkunoff", "Stech", "Steen", "Steenberg", "Steensen",
				"Steffansen", "Steffensdatter", "Steffensen", "Steiaholt",
				"Stellmacher", "Stenbeck", "Stenberg", "Stendrup",
				"Stenholm-Hansen", "Stensballe", "Stensson", "Stephens",
				"Stephensdatter", "Stephensen", "Sterck", "Stevens", "Stewart",
				"Stibe", "Stibolt", "Stilson", "Stobbe", "Stockfleth",
				"Stockmann", "Stockwell", "Stoier", "Stoklund",
				"Storbritannien og Irland", "Storch", "Storey", "Storm",
				"Storr�de", "St�ttrup", "Stoug�rd", "Stough", "Stow", "Stowe",
				"Strand", "Strandberg", "Strandgaard", "Strange",
				"Strangesdatter", "Strate", "Stratmann", "Stricker",
				"Stroberg", "Str�mer", "Str�m Petersen", "Stuve", "Stygge",
				"Suenson", "Suhr", "Sundstr�m", "Sundt", "Sunesdatter",
				"Sunesen", "Sunke", "Sv�rdfegers", "Svane", "SvanenskjoldHoff",
				"Svarre", "Sveinbj�rnsson", "Sveinbj�rnsson", "Sveistrup",
				"Sven", "Svendborg", "Svendsdatter", "Svendsen", "Svensdatter",
				"Svensson", "Swanson", "Sweetnam", "Syberg", "Synderslev",
				"Szlenski", "Taarning", "Tack", "Talbot", "Tamm", "Tange",
				"Tapdrup", "Tarr", "Taul", "Taulov", "Teglbj�rg", "Teilmann",
				"Telling", "Terchildsdatter", "Terchildsen", "Terkelsen",
				"Terkildsen", "Termansen", "Tetzen", "Thaarup", "Thalbitzer",
				"Thau", "Theil", "Theilgaard", "Theilmann", "Thejls", "Thelin",
				"Thelin-R�nholdt", "Themsen", "Themstrup", "Therkildsen",
				"Thestrup", "Thiesen", "Thirslund", "Th�gersdatter",
				"Th�gersen", "Thomas", "Thomasdatter", "Thomasen", "Thomassen",
				"Thomesen", "Thomessen", "Thomitsdatter", "Thompson",
				"Thomsen", "Thon", "Thor", "Thorbek", "Thorlacius", "Thorne",
				"Thorning", "Thorsager", "Thorsdatter", "Thorsen", "Thorup",
				"Th�stesen", "Thott", "Thoustrup", "Thrane", "Thrugils�n",
				"Thuesdatter", "Thuresen", "Thustrup", "Thygesdatter",
				"Thygesen", "Tiedemann", "Tiedt", "Tj�rnelund", "Todd", "Toft",
				"Toldby", "Tollefsen", "Tommerup", "T�nder-Lund", "T�nnesen",
				"Topp", "Tordsdatter", "Torfing", "Torkildsen", "Torn",
				"Torn�e", "Torp", "T�rresen", "T�rrisdatter", "T�rsleff",
				"Torstensen", "Town", "Traae", "Tracy", "Trahn", "Trampenberg",
				"Tranberg", "Trautner-Nielsen", "Treschow", "Trier", "Trige",
				"Trogelsen", "Trojel", "Trommeslager", "Truelsdatter",
				"Truelsen", "Tucker", "T�rck", "Turner", "Tutein", "Tuxen",
				"Tvede", "Tyrwaldt", "U", "Udsen", "Udy", "Uf", "Uhler",
				"Uldum", "Ulfeldt", "Ulrich", "Unkersen", "Unnewehr", "Upshaw",
				"Uren", "Ursin", "Urup", "Ustri", "Vaa", "Vaillant", "Valbaum",
				"Valen", "Valentin", "Valentiner", "Valissant", "Vallis",
				"van Cernin", "Van Der Does", "van der Weel", "Vang", "Vannes",
				"van Podebusk", "Vatter", "Vaudra", "Vecchini",
				"Vedel-Petersen", "Vegge", "Veivers", "Vejnholt-M�ller",
				"Vendelbo", "Vendelboe-Hersom", "Verdelin", "Verney",
				"Vesterberg", "Vestergaard", "Vett", "Viberg", "Viif",
				"Vilhelmsborg", "Vilhelmsen", "Villadsdatter", "Villaume",
				"Villaume Graff", "Viltoft", "Vincent", "Vinghoff", "Visborg",
				"Vladimirovich", "Vognsen", "Voigt", "Volckmann", "Voldfrom",
				"V�ldike", "Volf", "Volquartz", "von Ahlefeldt",
				"von Ahlefeldt-Laurvig", "von Baggesen", "von Bretsken",
				"von der Heide", "von Dresky", "von Dresky und Merzdorf",
				"von Dreyer", "von F�nss", "von Geldern", "von Gersdorff",
				"von Gerstenberg", "von Grafenried", "von Holm",
				"von Holstein", "von Holtermann", "von Ingensberg",
				"von K�stelin", "von Linstow", "von Lohse", "von M�inichen",
				"von Podebusk", "von Pohle", "von Prangen",
				"von Rehling-Quistgaard", "von Rehling-Qvistgaard",
				"von Reutern", "von Rhaden", "von Rosenschild",
				"von Schalburg", "von Schinkel", "von Seelen",
				"von Siemianowskaja", "von Staffeldt", "von Steinmann",
				"von Stricker", "von Thomsdorff", "von W�ldike", "von W�rtzen",
				"Vosbein", "Voss", "Vrolsen", "Vuillaume", "Waagechristensen",
				"Wackerhausen", "Wade", "Wael", "Wager", "Wagner", "Wahlgren",
				"Waite", "Wales", "Walker", "Walter", "Wandal", "Wanscher",
				"Ward", "Wardinghuus", "Warmington", "Warner", "Watson",
				"Webb", "Weber", "Weedon", "Wefstsdatter", "Wefstsen",
				"Weichert", "Weidemann", "Weidichsen", "Weile", "Weiner",
				"Weis", "Wellh�fer", "Wells", "Wendel", "Wendell", "Wenstr�m",
				"Wering", "Werner", "Werner-Larsen", "Wessel", "West",
				"Westengaard", "Westenholz", "Westergaard", "Westh", "Wexels",
				"White", "Wiarda", "Wiberg", "Wibkens", "Wienberg", "Wigelsen",
				"Wildfang", "Wilhelmi", "Wilhelmsdatter", "Wilhelmsen",
				"Wilian", "Wilkens", "Willaume", "Willaume-Fabricius",
				"Willaume-Jantzen", "Willemoes-Wissing", "William", "Williams",
				"Willmark", "Willumsdatter", "Willumsen", "Wind", "Windelin",
				"Windfeld", "Windfeld-Hansen", "Winding", "Wind-Jensen",
				"Winge", "Winsl�w", "Winther", "Wisborg", "Wisbr�ker",
				"Wishar", "Wissmach", "Wistr�m", "Witt", "Witzke", "Wodstrup",
				"Woeldike", "Woldike", "W�ldike", "W�ldike", "Wolff",
				"Wolfrath", "Woller", "Woodward", "Worm", "Wors�e", "Wran�r",
				"Wright", "Wulff", "Wulff-J�rgensen", "W�rger", "W�rtzen",
				"Wynn", "Yde", "Young", "Ziegler", "Zielian", "Ziliotto",
				"Zimmerli", "Zimmermann", "�i�ka", "Zoffmann", 
				};

		String outputNavnF = "";

		Fonkod fonkod = new Fonkod("OFF");
		try {
			for (int i = 0; i < inputNavne.length; i++) {
				outputNavnF = fonkod.generateKey(inputNavne[i]);
				System.out.println(inputNavne[i] + "\t" + outputNavnF);
			}
		} catch (Exception e) {
			System.out.println("Fonkod exception: " + e.getMessage());
		}

	}
}