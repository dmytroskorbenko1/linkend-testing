package data;

public enum MenuItem {
    HOME("Home"),
    MY_NETWORK("My Network"),
    JOBS("Jobs"),
    MESSAGING("Messaging"),
    NOTIFICATIONS("Notifications"),
    ME("Me");

    private String name;

    MenuItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
