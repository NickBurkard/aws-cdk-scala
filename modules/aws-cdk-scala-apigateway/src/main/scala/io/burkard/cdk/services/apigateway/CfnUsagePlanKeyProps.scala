package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUsagePlanKeyProps {

  def apply(
    keyType: Option[String] = None,
    keyId: Option[String] = None,
    usagePlanId: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps =
    (new software.amazon.awscdk.services.apigateway.CfnUsagePlanKeyProps.Builder)
      .keyType(keyType.orNull)
      .keyId(keyId.orNull)
      .usagePlanId(usagePlanId.orNull)
      .build()
}
