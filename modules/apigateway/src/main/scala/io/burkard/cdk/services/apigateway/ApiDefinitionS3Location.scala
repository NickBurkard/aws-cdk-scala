package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApiDefinitionS3Location {

  def apply(
    key: String,
    bucket: String,
    version: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location =
    (new software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location.Builder)
      .key(key)
      .bucket(bucket)
      .version(version.orNull)
      .build()
}
