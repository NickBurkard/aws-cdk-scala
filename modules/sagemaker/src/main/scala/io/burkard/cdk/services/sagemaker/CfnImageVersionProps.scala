package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnImageVersionProps {

  def apply(
    baseImage: Option[String] = None,
    imageName: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnImageVersionProps =
    (new software.amazon.awscdk.services.sagemaker.CfnImageVersionProps.Builder)
      .baseImage(baseImage.orNull)
      .imageName(imageName.orNull)
      .build()
}
