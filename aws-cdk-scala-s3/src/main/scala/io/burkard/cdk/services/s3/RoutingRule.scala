package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RoutingRule {

  def apply(
    httpRedirectCode: Option[String] = None,
    hostName: Option[String] = None,
    condition: Option[software.amazon.awscdk.services.s3.RoutingRuleCondition] = None,
    replaceKey: Option[software.amazon.awscdk.services.s3.ReplaceKey] = None,
    protocol: Option[software.amazon.awscdk.services.s3.RedirectProtocol] = None
  ): software.amazon.awscdk.services.s3.RoutingRule =
    (new software.amazon.awscdk.services.s3.RoutingRule.Builder)
      .httpRedirectCode(httpRedirectCode.orNull)
      .hostName(hostName.orNull)
      .condition(condition.orNull)
      .replaceKey(replaceKey.orNull)
      .protocol(protocol.orNull)
      .build()
}
