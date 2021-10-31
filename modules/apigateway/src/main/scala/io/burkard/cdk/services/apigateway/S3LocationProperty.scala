package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LocationProperty {

  def apply(
    eTag: Option[String] = None,
    key: Option[String] = None,
    version: Option[String] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty =
    (new software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty.Builder)
      .eTag(eTag.orNull)
      .key(key.orNull)
      .version(version.orNull)
      .bucket(bucket.orNull)
      .build()
}
