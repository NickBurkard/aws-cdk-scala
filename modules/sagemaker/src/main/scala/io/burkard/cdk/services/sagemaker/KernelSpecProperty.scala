package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KernelSpecProperty {

  def apply(
    displayName: Option[String] = None,
    name: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty.Builder)
      .displayName(displayName.orNull)
      .name(name.orNull)
      .build()
}
