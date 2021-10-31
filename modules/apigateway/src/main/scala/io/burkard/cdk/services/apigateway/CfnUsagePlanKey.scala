package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUsagePlanKey {

  def apply(
    internalResourceId: String,
    keyType: Option[String] = None,
    keyId: Option[String] = None,
    usagePlanId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnUsagePlanKey =
    software.amazon.awscdk.services.apigateway.CfnUsagePlanKey.Builder
      .create(stackCtx, internalResourceId)
      .keyType(keyType.orNull)
      .keyId(keyId.orNull)
      .usagePlanId(usagePlanId.orNull)
      .build()
}
