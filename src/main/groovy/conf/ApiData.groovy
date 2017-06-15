package conf

import com.fasterxml.jackson.annotation.JsonProperty

final class ApiData {
	final String url
	final String key

	ApiData (
		@JsonProperty(value="url", required=true)
		String url,
		@JsonProperty(value="key", required=true)
		String key
	) {
		this.url = url
		this.key = key
	}
}
