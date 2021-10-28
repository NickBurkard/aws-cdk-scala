package io.burkard.cdk.services.ce

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAnomalyMonitorProps {

  def apply(
    monitorType: Option[String] = None,
    monitorDimension: Option[String] = None,
    monitorSpecification: Option[String] = None,
    monitorName: Option[String] = None
  ): software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps =
    (new software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps.Builder)
      .monitorType(monitorType.orNull)
      .monitorDimension(monitorDimension.orNull)
      .monitorSpecification(monitorSpecification.orNull)
      .monitorName(monitorName.orNull)
      .build()
}
