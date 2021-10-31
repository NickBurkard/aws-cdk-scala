package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiKeyProps {

  def apply(
    expires: Option[Number] = None,
    description: Option[String] = None,
    apiKeyId: Option[String] = None,
    apiId: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnApiKeyProps =
    (new software.amazon.awscdk.services.appsync.CfnApiKeyProps.Builder)
      .expires(expires.orNull)
      .description(description.orNull)
      .apiKeyId(apiKeyId.orNull)
      .apiId(apiId.orNull)
      .build()
}
