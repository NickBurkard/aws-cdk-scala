package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApiKey {

  def apply(
    internalResourceId: String,
    expires: Option[Number] = None,
    description: Option[String] = None,
    apiKeyId: Option[String] = None,
    apiId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appsync.CfnApiKey =
    software.amazon.awscdk.services.appsync.CfnApiKey.Builder
      .create(stackCtx, internalResourceId)
      .expires(expires.orNull)
      .description(description.orNull)
      .apiKeyId(apiKeyId.orNull)
      .apiId(apiId.orNull)
      .build()
}
