package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublishMetricActionProperty {

  def apply(
    dimensions: List[_]
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty.Builder)
      .dimensions(dimensions.asJava)
      .build()
}
