package jota.dto.response;

import java.util.List;

/**
 * Response of api request 'getNewAddress'.
 **/
public class GetNewAddressResponse extends AbstractResponse {

    private List<String> addresses;
    private int index;

    /**
     * Initializes a new instance of the GetNewAddressResponse class.
     */
    public static GetNewAddressResponse create(List<String> addresses, long duration) {
        GetNewAddressResponse res = new GetNewAddressResponse();
        res.addresses = addresses;
        res.setDuration(duration);
        return res;
    }

    /**
     * Gets the addresses.
     *
     * @return The addresses.
     */
    public List<String> getAddresses() {
        return addresses;
    }

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
    
}
