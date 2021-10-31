package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LocationProperty {

  def apply(
    eTag: Option[String] = None,
    key: Option[String] = None,
    version: Option[String] = None,
    bundleType: Option[String] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty.Builder)
      .eTag(eTag.orNull)
      .key(key.orNull)
      .version(version.orNull)
      .bundleType(bundleType.orNull)
      .bucket(bucket.orNull)
      .build()
}
