package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ArtifactsProperty {

  def apply(
    name: Option[String] = None,
    location: Option[String] = None,
    path: Option[String] = None,
    namespaceType: Option[String] = None,
    packaging: Option[String] = None,
    overrideArtifactName: Option[Boolean] = None,
    artifactIdentifier: Option[String] = None,
    `type`: Option[String] = None,
    encryptionDisabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder)
      .name(name.orNull)
      .location(location.orNull)
      .path(path.orNull)
      .namespaceType(namespaceType.orNull)
      .packaging(packaging.orNull)
      .overrideArtifactName(overrideArtifactName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .artifactIdentifier(artifactIdentifier.orNull)
      .`type`(`type`.orNull)
      .encryptionDisabled(encryptionDisabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
