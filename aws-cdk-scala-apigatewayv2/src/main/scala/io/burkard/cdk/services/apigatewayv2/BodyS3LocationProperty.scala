package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BodyS3LocationProperty {

  def apply(
    etag: Option[String] = None,
    key: Option[String] = None,
    version: Option[String] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty.Builder)
      .etag(etag.orNull)
      .key(key.orNull)
      .version(version.orNull)
      .bucket(bucket.orNull)
      .build()
}
