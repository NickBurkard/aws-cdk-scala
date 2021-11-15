package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomImageProperty {

  def apply(
    appImageConfigName: Option[String] = None,
    imageName: Option[String] = None,
    imageVersionNumber: Option[Number] = None
  ): software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty.Builder)
      .appImageConfigName(appImageConfigName.orNull)
      .imageName(imageName.orNull)
      .imageVersionNumber(imageVersionNumber.orNull)
      .build()
}
