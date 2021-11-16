package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUsagePlanKeyProps {

  def apply(
    keyType: String,
    keyId: String,
    usagePlanId: String
  ): software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps =
    (new software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps.Builder)
      .keyType(keyType)
      .keyId(keyId)
      .usagePlanId(usagePlanId)
      .build()
}
