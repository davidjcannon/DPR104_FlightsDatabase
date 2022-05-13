import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

enum EngineType {Jet, Rocket, Electric, TurboProp, Piston};

public class Lab7 {

    public static void addFlights() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm");
        Date flight1 = dateFormat.parse("03-10-2022 06:30");
        Date flight2 = dateFormat.parse("03-10-2022 07:30");
        Date flight3 = dateFormat.parse("03-11-2022 08:30");
        Date flight4 = dateFormat.parse("03-13-2022 09:30");
        Date flight5 = dateFormat.parse("03-13-2022 11:30");

        flts.add(new Flight("1","Express", "PHL", acTypes.get(0), "JFK", flight1, flight3, "A9"));
        flts.add(new Flight("2","Fast Airlines", "LAX", acTypes.get(3), "MIA", flight1, flight2, "F5"));
        flts.add(new Flight("3","Slow Airlines", "SFO", acTypes.get(2), "AFK", flight1, flight4, "F0"));
        flts.add(new Flight("4","Flash", "APK", acTypes.get(1), "KOS", flight3, flight4, "D9"));
        flts.add(new Flight("5","NYC", "NYC", acTypes.get(6), "PAC", flight4, flight5, "D9"));
    }

    public static class Flight {
        private String flightNumber;
        private String airline;
        private String origin;
        private AircraftType aircraftType;
        private String destination;
        private Date scheduledDeparture;
        private Date scheduledArrival;
        private String gate;

        // Constructor
        public Flight(
                String flightNumber,
                String airline,
                String origin,
                AircraftType aircraftType,
                String destination,
                Date scheduledDeparture,
                Date scheduledArrival,
                String gate) {
            this.flightNumber = flightNumber;
            this.airline = airline;
            this.origin = origin;
            this.aircraftType = aircraftType;
            this.destination = destination;
            this.scheduledDeparture = scheduledDeparture;
            this.scheduledArrival = scheduledArrival;
            this.gate = gate;
        }

        public String toString() {
            return "Flight Num:" + flightNumber
                    + " Airline: " + airline
                    + " Origin: " + origin
                    + " Aircraft Type: " + aircraftType
                    + " Destination: " + destination
                    + " Est Depart: " + scheduledDeparture
                    + " Est Arrival: " + scheduledArrival
                    + " Gate: " + gate;
        }
    }

    public static class AircraftType {
        String manufacturer;
        String model;
        String typeDesignator;
        EngineType engineType;
        int numberEngines;

        // Constructor
        public AircraftType(
                String manufacturer,
                String model,
                String typeDesignator,
                EngineType engineType,
                int numberEngines) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.typeDesignator = typeDesignator;
            this.engineType = engineType;
            this.numberEngines = numberEngines;
        }

        public String toString() {
            return "Manufacturer:" + manufacturer
                    + " Model: " + model
                    + " Type: " + typeDesignator
                    + " Engine Type: " + engineType
                    + " Engine Num: " + numberEngines;
        }
    }

    public static void addAircraftTypes() {
        acTypes.add(new AircraftType("Boeing", "737-600", "B736", EngineType.Jet, 2));
        acTypes.add(new AircraftType("Boeing", "737-800", "B738", EngineType.Jet, 2));
        acTypes.add(new AircraftType("Airbus", "A-310", "A310", EngineType.Jet, 2));
        acTypes.add(new AircraftType("Airbus", "A-300B2", "A30B", EngineType.Jet, 2));
        acTypes.add(new AircraftType("Airbus", "A-340-500", "A-340-500", EngineType.Jet, 2));
        acTypes.add(new AircraftType("Embraer", "A-20", "E314", EngineType.TurboProp, 1));
        acTypes.add(new AircraftType("Embraer", "195", "E195", EngineType.Jet, 2));
    }

        public static void main(String[] args) throws ParseException {
            ArrayList<AircraftType> acTypes = new ArrayList<>();
            ArrayList<Flight> flts = new ArrayList<>();

            flts.addAircraftTypes();
            flts.addFlights();

            for (Flight flight: flights) {
                System.out.println(flight);
            }

        }
    }