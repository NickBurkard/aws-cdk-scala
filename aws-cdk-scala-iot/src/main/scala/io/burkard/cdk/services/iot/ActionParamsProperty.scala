package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ActionParamsProperty {

  def apply(
    publishFindingToSnsParams: Option[software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty] = None,
    updateDeviceCertificateParams: Option[software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty] = None,
    enableIoTLoggingParams: Option[software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty] = None,
    addThingsToThingGroupParams: Option[software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty] = None,
    replaceDefaultPolicyVersionParams: Option[software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty] = None,
    updateCaCertificateParams: Option[software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty] = None
  ): software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty =
    (new software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty.Builder)
      .publishFindingToSnsParams(publishFindingToSnsParams.orNull)
      .updateDeviceCertificateParams(updateDeviceCertificateParams.orNull)
      .enableIoTLoggingParams(enableIoTLoggingParams.orNull)
      .addThingsToThingGroupParams(addThingsToThingGroupParams.orNull)
      .replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams.orNull)
      .updateCaCertificateParams(updateCaCertificateParams.orNull)
      .build()
}
