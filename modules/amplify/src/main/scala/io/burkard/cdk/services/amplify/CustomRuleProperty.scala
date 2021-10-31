package io.burkard.cdk.services.amplify

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomRuleProperty {

  def apply(
    source: Option[String] = None,
    condition: Option[String] = None,
    status: Option[String] = None,
    target: Option[String] = None
  ): software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty =
    (new software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty.Builder)
      .source(source.orNull)
      .condition(condition.orNull)
      .status(status.orNull)
      .target(target.orNull)
      .build()
}
