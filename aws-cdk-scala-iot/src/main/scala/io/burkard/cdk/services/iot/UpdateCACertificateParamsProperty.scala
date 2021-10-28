package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UpdateCACertificateParamsProperty {

  def apply(
    action: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty =
    (new software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty.Builder)
      .action(action.orNull)
      .build()
}
