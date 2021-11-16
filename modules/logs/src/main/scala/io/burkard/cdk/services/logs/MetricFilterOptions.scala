package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricFilterOptions {

  def apply(
    filterPattern: software.amazon.awscdk.services.logs.IFilterPattern,
    metricName: String,
    metricNamespace: String,
    metricValue: Option[String] = None,
    defaultValue: Option[Number] = None
  ): software.amazon.awscdk.services.logs.MetricFilterOptions =
    (new software.amazon.awscdk.services.logs.MetricFilterOptions.Builder)
      .filterPattern(filterPattern)
      .metricName(metricName)
      .metricNamespace(metricNamespace)
      .metricValue(metricValue.orNull)
      .defaultValue(defaultValue.orNull)
      .build()
}
