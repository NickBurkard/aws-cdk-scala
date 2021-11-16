package io.burkard.cdk.services.ce

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAnomalyMonitor {

  def apply(
    internalResourceId: String,
    monitorType: String,
    monitorName: String,
    monitorDimension: Option[String] = None,
    monitorSpecification: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ce.CfnAnomalyMonitor =
    software.amazon.awscdk.services.ce.CfnAnomalyMonitor.Builder
      .create(stackCtx, internalResourceId)
      .monitorType(monitorType)
      .monitorName(monitorName)
      .monitorDimension(monitorDimension.orNull)
      .monitorSpecification(monitorSpecification.orNull)
      .build()
}
