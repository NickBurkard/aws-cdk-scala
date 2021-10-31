package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpAuthorizationProperty {

  def apply(
    sigv4: Option[software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty.Builder)
      .sigv4(sigv4.orNull)
      .build()
}
