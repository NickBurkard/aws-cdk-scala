package io.burkard.cdk.services.ce

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAnomalyMonitorProps {

  def apply(
    monitorType: String,
    monitorName: String,
    monitorDimension: Option[String] = None,
    monitorSpecification: Option[String] = None
  ): software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps =
    (new software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps.Builder)
      .monitorType(monitorType)
      .monitorName(monitorName)
      .monitorDimension(monitorDimension.orNull)
      .monitorSpecification(monitorSpecification.orNull)
      .build()
}
