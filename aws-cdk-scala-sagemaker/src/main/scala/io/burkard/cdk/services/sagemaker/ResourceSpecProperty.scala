package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceSpecProperty {

  def apply(
    sageMakerImageVersionArn: Option[String] = None,
    instanceType: Option[String] = None,
    sageMakerImageArn: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty.Builder)
      .sageMakerImageVersionArn(sageMakerImageVersionArn.orNull)
      .instanceType(instanceType.orNull)
      .sageMakerImageArn(sageMakerImageArn.orNull)
      .build()
}
