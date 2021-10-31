package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HeaderProperty {

  def apply(
    source: Option[String] = None,
    direction: Option[String] = None,
    destinationPort: Option[String] = None,
    destination: Option[String] = None,
    protocol: Option[String] = None,
    sourcePort: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty.Builder)
      .source(source.orNull)
      .direction(direction.orNull)
      .destinationPort(destinationPort.orNull)
      .destination(destination.orNull)
      .protocol(protocol.orNull)
      .sourcePort(sourcePort.orNull)
      .build()
}
