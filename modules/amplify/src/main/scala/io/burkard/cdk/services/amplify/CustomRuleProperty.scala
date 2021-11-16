package io.burkard.cdk.services.amplify

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomRuleProperty {

  def apply(
    source: String,
    target: String,
    condition: Option[String] = None,
    status: Option[String] = None
  ): software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty =
    (new software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty.Builder)
      .source(source)
      .target(target)
      .condition(condition.orNull)
      .status(status.orNull)
      .build()
}
