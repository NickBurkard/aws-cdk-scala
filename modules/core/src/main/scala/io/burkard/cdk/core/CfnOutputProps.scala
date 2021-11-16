package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOutputProps {

  def apply(
    value: String,
    description: Option[String] = None,
    condition: Option[software.amazon.awscdk.CfnCondition] = None,
    exportName: Option[String] = None
  ): software.amazon.awscdk.CfnOutputProps =
    (new software.amazon.awscdk.CfnOutputProps.Builder)
      .value(value)
      .description(description.orNull)
      .condition(condition.orNull)
      .exportName(exportName.orNull)
      .build()
}
