package br.com.ifood.vemproifood.dishlist.model;

import java.util.ArrayList;
import java.util.List;

public class TrackSpotify {

	private List<NameArtist> artists;
	private String name;

	public TrackSpotify() {
		setArtists(new ArrayList<>());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<NameArtist> getArtists() {
		return artists;
	}

	public void setArtists(List<NameArtist> artists) {
		this.artists = artists;
	}	
}
