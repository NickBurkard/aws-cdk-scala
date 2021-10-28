package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RoutingRuleCondition {

  def apply(
    httpErrorCodeReturnedEquals: Option[String] = None,
    keyPrefixEquals: Option[String] = None
  ): software.amazon.awscdk.services.s3.RoutingRuleCondition =
    (new software.amazon.awscdk.services.s3.RoutingRuleCondition.Builder)
      .httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals.orNull)
      .keyPrefixEquals(keyPrefixEquals.orNull)
      .build()
}
