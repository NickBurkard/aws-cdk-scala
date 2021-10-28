package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnOutputProps {

  def apply(
    description: Option[String] = None,
    condition: Option[software.amazon.awscdk.CfnCondition] = None,
    value: Option[String] = None,
    exportName: Option[String] = None
  ): software.amazon.awscdk.CfnOutputProps =
    (new software.amazon.awscdk.CfnOutputProps.Builder)
      .description(description.orNull)
      .condition(condition.orNull)
      .value(value.orNull)
      .exportName(exportName.orNull)
      .build()
}
