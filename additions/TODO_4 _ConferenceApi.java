    public List<Conference> filterPlayground() {
        // Query<Conference> query = ofy().load().type(Conference.class).order("name");
        Query<Conference> query = ofy().load().type(Conference.class);

        /*
        // Filter on city
        query = query.filter("city =", "London");
        // query = query.filter("city =", "Default City");

        // Add a filter for topic = "Medical Innovations"
        query = query.filter("topics =", "Medical Innovations");

        // Add a filter for maxAttendees
        query = query.filter("maxAttendees >", 8);
        query = query.filter("maxAttendees <", 10).order("maxAttendees").order("name");

        // Add a filter for month {unindexed composite query}
        // Find conferences in June
        query = query.filter("month =", 6);
        */

        // multiple sort orders

        query = query.filter("city =", "Tokyo").filter("seatsAvailable <", 10).
                filter("seatsAvailable >" , 0).order("seatsAvailable").order("name").
                order("month");


        return query.list();
    }