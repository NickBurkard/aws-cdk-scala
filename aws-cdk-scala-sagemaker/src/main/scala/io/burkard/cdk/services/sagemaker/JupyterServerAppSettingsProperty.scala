package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JupyterServerAppSettingsProperty {

  def apply(
    defaultResourceSpec: Option[software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty.Builder)
      .defaultResourceSpec(defaultResourceSpec.orNull)
      .build()
}
