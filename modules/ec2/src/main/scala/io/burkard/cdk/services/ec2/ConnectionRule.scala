package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectionRule {

  def apply(
    fromPort: Number,
    toPort: Option[Number] = None,
    description: Option[String] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.ec2.ConnectionRule =
    (new software.amazon.awscdk.services.ec2.ConnectionRule.Builder)
      .fromPort(fromPort)
      .toPort(toPort.orNull)
      .description(description.orNull)
      .protocol(protocol.orNull)
      .build()
}
