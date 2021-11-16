package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KernelSpecProperty {

  def apply(
    name: String,
    displayName: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty.Builder)
      .name(name)
      .displayName(displayName.orNull)
      .build()
}
