package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricFilterOptions {

  def apply(
    filterPattern: Option[software.amazon.awscdk.services.logs.IFilterPattern] = None,
    metricName: Option[String] = None,
    metricNamespace: Option[String] = None,
    metricValue: Option[String] = None,
    defaultValue: Option[Number] = None
  ): software.amazon.awscdk.services.logs.MetricFilterOptions =
    (new software.amazon.awscdk.services.logs.MetricFilterOptions.Builder)
      .filterPattern(filterPattern.orNull)
      .metricName(metricName.orNull)
      .metricNamespace(metricNamespace.orNull)
      .metricValue(metricValue.orNull)
      .defaultValue(defaultValue.orNull)
      .build()
}
