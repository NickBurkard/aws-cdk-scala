package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationVersionLifecycleConfigProperty {

  def apply(
    maxCountRule: Option[software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty] = None,
    maxAgeRule: Option[software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty.Builder)
      .maxCountRule(maxCountRule.orNull)
      .maxAgeRule(maxAgeRule.orNull)
      .build()
}
