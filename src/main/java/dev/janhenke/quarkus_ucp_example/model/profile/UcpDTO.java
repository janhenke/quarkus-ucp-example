package dev.janhenke.quarkus_ucp_example.model.profile;

import dev.janhenke.quarkus_ucp_example.model.Version;
import java.util.List;
import java.util.Map;

/// UCP object in profile schema.
///
/// @param version          UCP version.
/// @param services         UCP services.
/// @param capabilities     UCP capabilities.
/// @param payment_handlers UCP payment handlers.
///
/// @author Jan Henke
public record UcpDTO(Version version, Map<String, List<ServiceDescriptionDTO>> services,
                     Map<String, List<CapabilityDescriptionDTO>> capabilities,
                     Map<String, List<PaymentHandlerDescriptionDTO>> payment_handlers)
{}
