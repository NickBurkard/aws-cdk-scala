package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArtifactsProperty {

  def apply(
    `type`: String,
    name: Option[String] = None,
    location: Option[String] = None,
    path: Option[String] = None,
    namespaceType: Option[String] = None,
    packaging: Option[String] = None,
    overrideArtifactName: Option[Boolean] = None,
    artifactIdentifier: Option[String] = None,
    encryptionDisabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder)
      .`type`(`type`)
      .name(name.orNull)
      .location(location.orNull)
      .path(path.orNull)
      .namespaceType(namespaceType.orNull)
      .packaging(packaging.orNull)
      .overrideArtifactName(overrideArtifactName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .artifactIdentifier(artifactIdentifier.orNull)
      .encryptionDisabled(encryptionDisabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
