package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3SourceProps {

  def apply(
    path: Option[String] = None,
    identifier: Option[String] = None,
    version: Option[String] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None
  ): software.amazon.awscdk.services.codebuild.S3SourceProps =
    (new software.amazon.awscdk.services.codebuild.S3SourceProps.Builder)
      .path(path.orNull)
      .identifier(identifier.orNull)
      .version(version.orNull)
      .bucket(bucket.orNull)
      .build()
}
