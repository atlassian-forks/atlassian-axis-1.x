/**
 * TerraServiceSoapImpl.java
 *
 * Implementation for TerraService test
 */

package test.wsdl.terra;

public class TerraServiceSoapImpl implements TerraServiceSoap {

    public String convertLonLatPtToNearestPlace(LonLatPt point) throws java.rmi.RemoteException {
        return "Boston, MA";
    }

    public UtmPt convertLonLatPtToUtmPt(LonLatPt point) throws java.rmi.RemoteException {
        UtmPt utmPt = new UtmPt();
        utmPt.setZone(19);
        utmPt.setX(325000);
        utmPt.setY(4692000);
        return utmPt;
    }

    public LonLatPt convertUtmPtToLonLatPt(UtmPt utm) throws java.rmi.RemoteException {
        LonLatPt lonLatPt = new LonLatPt();
        lonLatPt.setLon(-71.0589);
        lonLatPt.setLat(42.3601);
        return lonLatPt;
    }

    public LonLatPt convertPlaceToLonLatPt(Place place) throws java.rmi.RemoteException {
        LonLatPt lonLatPt = new LonLatPt();
        lonLatPt.setLon(-71.0589);
        lonLatPt.setLat(42.3601);
        return lonLatPt;
    }

    public int countPlacesInRect(LonLatPt upperleft, LonLatPt lowerright, PlaceType ptype) throws java.rmi.RemoteException {
        return 1;
    }

    public AreaBoundingBox getAreaFromPt(LonLatPt center, int theme, Scale scale, int displayPixWidth, int displayPixHeight) throws java.rmi.RemoteException {
        AreaBoundingBox box = new AreaBoundingBox();
        // Set minimal values to avoid null pointer exceptions
        return box;
    }

    public AreaBoundingBox getAreaFromRect(LonLatPt upperLeft, LonLatPt lowerRight, int theme, Scale scale) throws java.rmi.RemoteException {
        return new AreaBoundingBox();
    }

    public AreaBoundingBox getAreaFromTileId(TileId id, int displayPixWidth, int displayPixHeight) throws java.rmi.RemoteException {
        return new AreaBoundingBox();
    }

    public ArrayOfThemeBoundingBox getLatLonMetrics(LonLatPt point) throws java.rmi.RemoteException {
        ArrayOfThemeBoundingBox result = new ArrayOfThemeBoundingBox();
        result.setThemeBoundingBox(new ThemeBoundingBox[0]);
        return result;
    }

    public PlaceFacts getPlaceFacts(Place place) throws java.rmi.RemoteException {
        PlaceFacts facts = new PlaceFacts();
        facts.setPlace(place);
        
        LonLatPt center = new LonLatPt();
        center.setLon(-71.0589);
        center.setLat(42.3601);
        facts.setCenter(center);
        
        return facts;
    }

    public ArrayOfPlaceFacts getPlaceList(String placeName, int maxItems, boolean imagePresence) throws java.rmi.RemoteException {
        // Create a mock response for testing
        ArrayOfPlaceFacts result = new ArrayOfPlaceFacts();
        
        // Create a single place fact for testing
        PlaceFacts placeFact = new PlaceFacts();
        
        // Create place
        Place place = new Place();
        place.setCity("Boston");
        place.setState("MA");
        place.setCountry("USA");
        placeFact.setPlace(place);
        
        // Create center point
        LonLatPt center = new LonLatPt();
        center.setLon(-71.0589);
        center.setLat(42.3601);
        placeFact.setCenter(center);
        
        // Set additional properties
        placeFact.setAvailableThemeMask(1);
        placeFact.setPlaceTypeId(PlaceType.CityTown);
        placeFact.setPopulation(617594);
        
        // Add to array
        PlaceFacts[] facts = new PlaceFacts[1];
        facts[0] = placeFact;
        result.setPlaceFacts(facts);
        
        return result;
    }

    public ArrayOfPlaceFacts getPlaceListInRect(LonLatPt upperleft, LonLatPt lowerright, PlaceType ptype, int maxItems) throws java.rmi.RemoteException {
        // Return empty array for this test method
        ArrayOfPlaceFacts result = new ArrayOfPlaceFacts();
        result.setPlaceFacts(new PlaceFacts[0]);
        return result;
    }

    public ThemeInfo getTheme(int theme) throws java.rmi.RemoteException {
        return new ThemeInfo();
    }

    public TileMeta getTileMetaFromLonLatPt(LonLatPt point, int theme, Scale scale) throws java.rmi.RemoteException {
        return new TileMeta();
    }

    public TileMeta getTileMetaFromTileId(TileId id) throws java.rmi.RemoteException {
        return new TileMeta();
    }

    public byte[] getTile(TileId id) throws java.rmi.RemoteException {
        return new byte[0];
    }
}