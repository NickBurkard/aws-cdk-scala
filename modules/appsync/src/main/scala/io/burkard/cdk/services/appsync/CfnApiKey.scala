package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiKey {

  def apply(
    internalResourceId: String,
    apiId: String,
    expires: Option[Number] = None,
    description: Option[String] = None,
    apiKeyId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appsync.CfnApiKey =
    software.amazon.awscdk.services.appsync.CfnApiKey.Builder
      .create(stackCtx, internalResourceId)
      .apiId(apiId)
      .expires(expires.orNull)
      .description(description.orNull)
      .apiKeyId(apiKeyId.orNull)
      .build()
}
