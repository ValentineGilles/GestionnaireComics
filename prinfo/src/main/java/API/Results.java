package API;

/**
 * Classe permettant d'instancier le résultat d'une recherche
 * @author Cyril
 */
public class Results {
    private final String name;
    private final String shortDescription;
    private final String type;
    private final int id;
    private final String iconLink;

    private final String HTMLDescription;

    private final String bigIconLink;


    public Results(String name, String shortDescription, String type, int id, String iconLink, String htmlDescription, String bigIconLink) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.type = type;
        this.id = id;
        this.iconLink = iconLink;
        this.HTMLDescription = htmlDescription;
        this.bigIconLink = bigIconLink;
    }
    public Results(Results res) {
        this.name=res.getName();
        this.shortDescription=res.getShortDescription();
        this.type=res.getType();
        this.id=res.getId();
        this.iconLink=res.getIconLink();
        this.HTMLDescription=res.getHTMLDescription();
        this.bigIconLink = res.getBigIconLink();

    }
    public Results getResultVersion() {
        return this;
    }
    public String getName() {
        return this.name;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public String getType() {
        return this.type;
    }

    public int getId() {
        return this.id;
    }

    public String getIconLink() {
        return this.iconLink;
    }

    public String getBigIconLink() {
        return bigIconLink;
    }

    public String getHTMLDescription() {
        return this.HTMLDescription;
    }
}
