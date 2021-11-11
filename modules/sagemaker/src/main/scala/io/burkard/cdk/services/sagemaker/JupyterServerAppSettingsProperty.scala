package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JupyterServerAppSettingsProperty {

  def apply(
    defaultResourceSpec: Option[software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty.Builder)
      .defaultResourceSpec(defaultResourceSpec.orNull)
      .build()
}
