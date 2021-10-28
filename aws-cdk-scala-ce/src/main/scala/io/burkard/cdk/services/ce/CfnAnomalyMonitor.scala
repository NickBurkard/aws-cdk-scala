package io.burkard.cdk.services.ce

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAnomalyMonitor {

  def apply(
    internalResourceId: String,
    monitorType: Option[String] = None,
    monitorDimension: Option[String] = None,
    monitorSpecification: Option[String] = None,
    monitorName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ce.CfnAnomalyMonitor =
    software.amazon.awscdk.services.ce.CfnAnomalyMonitor.Builder
      .create(stackCtx, internalResourceId)
      .monitorType(monitorType.orNull)
      .monitorDimension(monitorDimension.orNull)
      .monitorSpecification(monitorSpecification.orNull)
      .monitorName(monitorName.orNull)
      .build()
}
