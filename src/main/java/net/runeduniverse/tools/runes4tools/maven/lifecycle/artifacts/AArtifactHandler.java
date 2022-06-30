package net.runeduniverse.tools.runes4tools.maven.lifecycle.artifacts;

import org.apache.maven.artifact.handler.ArtifactHandler;

public abstract class AArtifactHandler implements ArtifactHandler {
	private String extension;

	private String type;

	private String classifier;

	private String directory;

	private String packaging;

	private String language;

	private boolean includesDependencies;

	private boolean addedToClasspath;
	
	protected AArtifactHandler(String type) {
		this(type, null, null, null, null, null, false, true);
	}

	protected AArtifactHandler(String type, String extension, String packaging, String language) {
		this(type, extension, null, null, packaging, language, false, true);
	}
	protected AArtifactHandler(String type, String extension, String classifier, String directory, String packaging,
			String language, boolean includesDependencies, boolean addedToClasspath) {
		this.type = type;
		this.extension = extension;
		this.classifier = classifier;
		this.directory = directory;
		this.packaging = packaging;
		this.language = language;
		this.includesDependencies = includesDependencies;
		this.addedToClasspath = addedToClasspath;
	}

	public String getExtension() {
		if (extension == null) {
			extension = type;
		}
		return extension;
	}

	protected void setExtension(String extension) {
		this.extension = extension;
	}

	public String getType() {
		return type;
	}

	public String getClassifier() {
		return classifier;
	}

	public String getDirectory() {
		if (directory == null) {
			directory = getPackaging() + "s";
		}
		return directory;
	}

	public String getPackaging() {
		if (packaging == null) {
			packaging = type;
		}
		return packaging;
	}

	public boolean isIncludesDependencies() {
		return includesDependencies;
	}

	protected void setIncludesDependencies(boolean includesDependencies) {
		this.includesDependencies = includesDependencies;
	}

	public String getLanguage() {
		if (language == null) {
			language = "none";
		}

		return language;
	}

	protected void setLanguage(String language) {
		this.language = language;
	}

	public boolean isAddedToClasspath() {
		return addedToClasspath;
	}

	protected void setAddedToClasspath(boolean addedToClasspath) {
		this.addedToClasspath = addedToClasspath;
	}
}
