package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
