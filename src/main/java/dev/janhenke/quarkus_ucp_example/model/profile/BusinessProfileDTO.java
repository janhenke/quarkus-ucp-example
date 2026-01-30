package dev.janhenke.quarkus_ucp_example.model.profile;

/// Model mapping the business profile schema.
///
/// @param ucp          UCP object.
/// @param signing_keys Signing keys.
///
/// @author Jan Henke
public record BusinessProfileDTO(UcpDTO ucp, SigningKeysDTO signing_keys)
{}
