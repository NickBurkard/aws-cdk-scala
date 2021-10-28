package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UpdateDeviceCertificateParamsProperty {

  def apply(
    action: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty =
    (new software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty.Builder)
      .action(action.orNull)
      .build()
}
