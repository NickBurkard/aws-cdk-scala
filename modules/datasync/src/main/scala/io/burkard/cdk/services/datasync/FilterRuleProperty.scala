package io.burkard.cdk.services.datasync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FilterRuleProperty {

  def apply(
    filterType: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty =
    (new software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty.Builder)
      .filterType(filterType.orNull)
      .value(value.orNull)
      .build()
}