package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ArtifactsProps {

  def apply(
    name: Option[String] = None,
    path: Option[String] = None,
    identifier: Option[String] = None,
    encryption: Option[Boolean] = None,
    includeBuildId: Option[Boolean] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    packageZip: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.S3ArtifactsProps =
    (new software.amazon.awscdk.services.codebuild.S3ArtifactsProps.Builder)
      .name(name.orNull)
      .path(path.orNull)
      .identifier(identifier.orNull)
      .encryption(encryption.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeBuildId(includeBuildId.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .bucket(bucket.orNull)
      .packageZip(packageZip.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
