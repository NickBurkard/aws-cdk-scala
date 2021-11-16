package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GreengrassProperty {

  def apply(
    groupArn: String
  ): software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty.Builder)
      .groupArn(groupArn)
      .build()
}
