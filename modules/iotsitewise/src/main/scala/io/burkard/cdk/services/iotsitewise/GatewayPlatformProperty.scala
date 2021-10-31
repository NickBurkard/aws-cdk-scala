package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayPlatformProperty {

  def apply(
    greengrass: Option[software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty.Builder)
      .greengrass(greengrass.orNull)
      .build()
}
