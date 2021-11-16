package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayConfig {

  def apply(
    gatewayId: String,
    az: String
  ): software.amazon.awscdk.services.ec2.GatewayConfig =
    (new software.amazon.awscdk.services.ec2.GatewayConfig.Builder)
      .gatewayId(gatewayId)
      .az(az)
      .build()
}
