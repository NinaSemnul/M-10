package Entity;

import java.time.Instant;

public class Ticket {
    private long id;
    private Instant created_at;
    private long client_id ;
    private String from_planet_id;
    private String to_planet_id;

    public Ticket(long id, Instant created_at, long client_id, String from_planet_id, String to_planet_id ){

        this.id = id;
        this.created_at = created_at;
        this.client_id = client_id;
        this.from_planet_id = from_planet_id;
        this.to_planet_id = to_planet_id;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Instant getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Instant created_at) {
        this.created_at = created_at;
    }

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }

    public String getFrom_planet_id() {
        return from_planet_id;
    }

    public void setFrom_planet_id(String from_planet_id) {
        this.from_planet_id = from_planet_id;
    }

    public String getTo_planet_id() {
        return to_planet_id;
    }

    public void setTo_planet_id(String to_planet_id) {
        this.to_planet_id = to_planet_id;
    }
}
