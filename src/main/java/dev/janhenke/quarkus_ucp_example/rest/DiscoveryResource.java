package dev.janhenke.quarkus_ucp_example.rest;

import dev.janhenke.quarkus_ucp_example.model.Version;
import dev.janhenke.quarkus_ucp_example.model.profile.BusinessProfileDTO;
import dev.janhenke.quarkus_ucp_example.model.profile.SigningKeysDTO;
import dev.janhenke.quarkus_ucp_example.model.profile.UcpDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Map;

/// Rest resource for UCP service discovery.
///
/// @author Jan Henke
@Path("/.well-known/ucp")
@Produces(MediaType.APPLICATION_JSON)
public class DiscoveryResource
{
	@GET
	public BusinessProfileDTO getBusinessProfile()
	{
		return new BusinessProfileDTO(new UcpDTO(Version.v2026_01_23, Map.of(), Map.of(), Map.of()),
		                              new SigningKeysDTO());
	}
}
