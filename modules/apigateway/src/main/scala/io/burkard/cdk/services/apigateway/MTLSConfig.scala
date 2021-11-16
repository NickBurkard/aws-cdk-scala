package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MTLSConfig {

  def apply(
    key: String,
    bucket: software.amazon.awscdk.services.s3.IBucket,
    version: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.MTLSConfig =
    (new software.amazon.awscdk.services.apigateway.MTLSConfig.Builder)
      .key(key)
      .bucket(bucket)
      .version(version.orNull)
      .build()
}
