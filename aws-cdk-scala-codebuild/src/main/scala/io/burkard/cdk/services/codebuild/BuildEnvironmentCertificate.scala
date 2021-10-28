package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BuildEnvironmentCertificate {

  def apply(
    objectKey: Option[String] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None
  ): software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate =
    (new software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate.Builder)
      .objectKey(objectKey.orNull)
      .bucket(bucket.orNull)
      .build()
}
