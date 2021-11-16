package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HeaderProperty {

  def apply(
    source: String,
    direction: String,
    destinationPort: String,
    destination: String,
    protocol: String,
    sourcePort: String
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.HeaderProperty.Builder)
      .source(source)
      .direction(direction)
      .destinationPort(destinationPort)
      .destination(destination)
      .protocol(protocol)
      .sourcePort(sourcePort)
      .build()
}
