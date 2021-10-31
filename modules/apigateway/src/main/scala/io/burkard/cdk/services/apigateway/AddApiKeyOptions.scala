package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddApiKeyOptions {

  def apply(
    overrideLogicalId: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.AddApiKeyOptions =
    (new software.amazon.awscdk.services.apigateway.AddApiKeyOptions.Builder)
      .overrideLogicalId(overrideLogicalId.orNull)
      .build()
}
