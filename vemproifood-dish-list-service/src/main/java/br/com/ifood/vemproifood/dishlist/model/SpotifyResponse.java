package br.com.ifood.vemproifood.dishlist.model;

import java.util.List;

public class SpotifyResponse {
	
	private List<TrackSpotify> tracks;

	public List<TrackSpotify> getTracks() {
		return tracks;
	}

	public void setTracks(List<TrackSpotify> tracks) {
		this.tracks = tracks;
	}
	
}
