package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LocationProperty {

  def apply(
    key: String,
    bucket: String,
    eTag: Option[String] = None,
    version: Option[String] = None,
    bundleType: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty.Builder)
      .key(key)
      .bucket(bucket)
      .eTag(eTag.orNull)
      .version(version.orNull)
      .bundleType(bundleType.orNull)
      .build()
}
