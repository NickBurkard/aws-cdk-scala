package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
