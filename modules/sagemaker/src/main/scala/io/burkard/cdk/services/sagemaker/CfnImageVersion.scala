package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnImageVersion {

  def apply(
    internalResourceId: String,
    baseImage: String,
    imageName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnImageVersion =
    software.amazon.awscdk.services.sagemaker.CfnImageVersion.Builder
      .create(stackCtx, internalResourceId)
      .baseImage(baseImage)
      .imageName(imageName)
      .build()
}
