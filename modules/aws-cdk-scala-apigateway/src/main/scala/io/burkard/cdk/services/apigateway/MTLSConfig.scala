package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MTLSConfig {

  def apply(
    key: Option[String] = None,
    version: Option[String] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None
  ): software.amazon.awscdk.services.apigateway.MTLSConfig =
    (new software.amazon.awscdk.services.apigateway.MTLSConfig.Builder)
      .key(key.orNull)
      .version(version.orNull)
      .bucket(bucket.orNull)
      .build()
}
