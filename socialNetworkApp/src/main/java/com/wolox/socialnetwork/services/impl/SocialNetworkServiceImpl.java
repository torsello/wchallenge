package com.wolox.socialnetwork.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolox.socialnetwork.jsonplaceholder.service.impl.JsonPlaceHolderServiceImpl;
import com.wolox.socialnetwork.models.Album;
import com.wolox.socialnetwork.models.Comment;
import com.wolox.socialnetwork.models.Photo;
import com.wolox.socialnetwork.models.User;
import com.wolox.socialnetwork.services.SocialNetworkService;

@Service
public class SocialNetworkServiceImpl implements SocialNetworkService {

	@Autowired
	private JsonPlaceHolderServiceImpl jsonPlaceHolderService;

	@Override
	public List<User> getAllUsers() {
		return jsonPlaceHolderService.getAllUsers();
	}

	@Override
	public User getUserById(long userId) {
		return jsonPlaceHolderService.getUserById(userId);
	}

	@Override
	public List<Photo> getAllPhotos() {
		return jsonPlaceHolderService.getAllPhotos();
	}

	@Override
	public List<Photo> getPhotosByUser(long userId) {
		return jsonPlaceHolderService.getPhotosByUser(userId);
	}

	@Override
	public Photo getPhotoById(long photoId) {
		return jsonPlaceHolderService.getPhotoById(photoId);
	}

	@Override
	public List<Album> getAllAlbums() {
		return jsonPlaceHolderService.getAllAlbums();
	}

	@Override
	public Album getAlbumById(long albumId) {
		return jsonPlaceHolderService.getAlbumById(albumId);
	}

	@Override
	public List<Album> getAlbumsByUser(long userId) {
		return jsonPlaceHolderService.getAlbumsByUser(userId);
	}

	@Override
	public List<Comment> getAllComments(Optional<String> name) {
		List<Comment> comments = null;

		if (name.isPresent())
			comments = jsonPlaceHolderService.getCommentsByName(name.get());
		else
			comments = jsonPlaceHolderService.getAllComments();

		return comments;
	}

	@Override
	public List<Comment> getCommentsByUser(long userId) {
		return jsonPlaceHolderService.getCommentsByUser(userId);
	}
}