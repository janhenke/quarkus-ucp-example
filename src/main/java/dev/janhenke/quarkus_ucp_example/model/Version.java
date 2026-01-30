package dev.janhenke.quarkus_ucp_example.model;

import jakarta.json.bind.adapter.JsonbAdapter;
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import java.util.Arrays;

/// UCP Version.
///
/// @author Jan Henke
@JsonbTypeAdapter(Version.JsonAdapter.class)
public enum Version
{
	/// Version 2026-01-11
	v2026_01_11("2026-01-11"),
	/// Version 2026-01-23
	v2026_01_23("2026-01-23"),
	/// Unknown/not implemented version. Placeholder for future versions.
	NOT_IMPLEMENTED("");

	private final String version;

	Version(String version)
	{
		this.version = version;
	}

	public String getVersion()
	{
		return version;
	}

	/// JSON-B type adapter for Version enum
	///
	/// @author Jan Henke
	public static class JsonAdapter implements JsonbAdapter<Version, String>
	{
		@Override
		public String adaptToJson(final Version obj)
		{
			return obj.getVersion();
		}

		@Override
		public Version adaptFromJson(final String obj)
		{
			return Arrays.stream(Version.values())
			             .filter(v -> v.getVersion().equals(obj))
			             .findFirst()
			             .orElse(NOT_IMPLEMENTED);
		}
	}
}
