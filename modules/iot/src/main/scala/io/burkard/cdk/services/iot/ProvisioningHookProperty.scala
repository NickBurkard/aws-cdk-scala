package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProvisioningHookProperty {

  def apply(
    payloadVersion: Option[String] = None,
    targetArn: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty =
    (new software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty.Builder)
      .payloadVersion(payloadVersion.orNull)
      .targetArn(targetArn.orNull)
      .build()
}
