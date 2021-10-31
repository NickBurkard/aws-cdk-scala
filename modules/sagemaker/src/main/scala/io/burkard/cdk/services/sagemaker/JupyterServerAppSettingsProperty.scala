package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JupyterServerAppSettingsProperty {

  def apply(
    defaultResourceSpec: Option[software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty.Builder)
      .defaultResourceSpec(defaultResourceSpec.orNull)
      .build()
}
