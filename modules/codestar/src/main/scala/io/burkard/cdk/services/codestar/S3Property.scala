package io.burkard.cdk.services.codestar

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3Property {

  def apply(
    key: Option[String] = None,
    bucket: Option[String] = None,
    objectVersion: Option[String] = None
  ): software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property =
    (new software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property.Builder)
      .key(key.orNull)
      .bucket(bucket.orNull)
      .objectVersion(objectVersion.orNull)
      .build()
}