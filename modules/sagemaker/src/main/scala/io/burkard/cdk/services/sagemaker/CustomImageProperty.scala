package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomImageProperty {

  def apply(
    appImageConfigName: Option[String] = None,
    imageName: Option[String] = None,
    imageVersionNumber: Option[Number] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDomain.CustomImageProperty.Builder)
      .appImageConfigName(appImageConfigName.orNull)
      .imageName(imageName.orNull)
      .imageVersionNumber(imageVersionNumber.orNull)
      .build()
}
