package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BuildEnvironmentCertificate {

  def apply(
    objectKey: String,
    bucket: software.amazon.awscdk.services.s3.IBucket
  ): software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate =
    (new software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate.Builder)
      .objectKey(objectKey)
      .bucket(bucket)
      .build()
}
