package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3SourceProps {

  def apply(
    path: String,
    bucket: software.amazon.awscdk.services.s3.IBucket,
    identifier: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.S3SourceProps =
    (new software.amazon.awscdk.services.codebuild.S3SourceProps.Builder)
      .path(path)
      .bucket(bucket)
      .identifier(identifier.orNull)
      .version(version.orNull)
      .build()
}
