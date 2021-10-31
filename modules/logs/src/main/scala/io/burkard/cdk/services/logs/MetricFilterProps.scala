package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricFilterProps {

  def apply(
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    filterPattern: Option[software.amazon.awscdk.services.logs.IFilterPattern] = None,
    metricName: Option[String] = None,
    metricNamespace: Option[String] = None,
    metricValue: Option[String] = None,
    defaultValue: Option[Number] = None
  ): software.amazon.awscdk.services.logs.MetricFilterProps =
    (new software.amazon.awscdk.services.logs.MetricFilterProps.Builder)
      .logGroup(logGroup.orNull)
      .filterPattern(filterPattern.orNull)
      .metricName(metricName.orNull)
      .metricNamespace(metricNamespace.orNull)
      .metricValue(metricValue.orNull)
      .defaultValue(defaultValue.orNull)
      .build()
}
