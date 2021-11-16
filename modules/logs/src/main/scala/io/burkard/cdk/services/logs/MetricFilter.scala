package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricFilter {

  def apply(
    internalResourceId: String,
    logGroup: software.amazon.awscdk.services.logs.ILogGroup,
    filterPattern: Option[software.amazon.awscdk.services.logs.IFilterPattern] = None,
    metricName: Option[String] = None,
    metricNamespace: Option[String] = None,
    metricValue: Option[String] = None,
    defaultValue: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.MetricFilter =
    software.amazon.awscdk.services.logs.MetricFilter.Builder
      .create(stackCtx, internalResourceId)
      .logGroup(logGroup)
      .filterPattern(filterPattern.orNull)
      .metricName(metricName.orNull)
      .metricNamespace(metricNamespace.orNull)
      .metricValue(metricValue.orNull)
      .defaultValue(defaultValue.orNull)
      .build()
}
