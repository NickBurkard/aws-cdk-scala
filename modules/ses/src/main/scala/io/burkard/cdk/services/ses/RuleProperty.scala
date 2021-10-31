package io.burkard.cdk.services.ses

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RuleProperty {

  def apply(
    name: Option[String] = None,
    scanEnabled: Option[Boolean] = None,
    recipients: Option[List[String]] = None,
    enabled: Option[Boolean] = None,
    tlsPolicy: Option[String] = None,
    actions: Option[List[_]] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty.Builder)
      .name(name.orNull)
      .scanEnabled(scanEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .recipients(recipients.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tlsPolicy(tlsPolicy.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
